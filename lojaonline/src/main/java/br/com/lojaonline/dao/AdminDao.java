package br.com.lojaonline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.lojaonline.models.Admin;

@Repository
public class AdminDao implements UserDetailsService{
	
	@PersistenceContext
    private EntityManager manager;

	public UserDetails loadUserByUsername(String email){

		System.out.println(email);
        List<Admin> admin = manager.createQuery("select u from Admin as u where u.email = :email", Admin.class)
        		.setParameter("email", email).getResultList();

       if (admin.isEmpty()) {
            throw new UsernameNotFoundException("O usuário " + email + " não foi encontrado");
       }else{
    	   System.out.println("Validaçãoo efetuada com SUCESSO");
       }
        System.out.println(admin);
        return admin.get(0);
    }
}
