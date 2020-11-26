package org.risk.seekers.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.risk.seekers.model.User;

@ApplicationScoped
public class WiseWalletService {
	
	@Inject
    EntityManager em; 

    @Transactional 
    public void createGift(User user) {
        em.persist(user);
    }

}
