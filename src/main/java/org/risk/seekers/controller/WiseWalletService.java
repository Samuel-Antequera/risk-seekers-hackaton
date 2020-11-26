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
	public User createGift(User user) {
		em.getTransaction().begin();
		em.persist(user); // em.merge(u); for updates
		em.getTransaction().commit();
		em.close();
		return user;
	}

}
