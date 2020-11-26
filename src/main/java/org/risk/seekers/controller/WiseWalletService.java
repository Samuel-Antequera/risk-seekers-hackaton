package org.risk.seekers.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.risk.seekers.model.WiseUser;

@ApplicationScoped
public class WiseWalletService {

	@Inject
	EntityManager em;

	@Transactional
	public WiseUser createWiseUser(WiseUser user) {
		em.persist(user);
		return user;
	}

}
