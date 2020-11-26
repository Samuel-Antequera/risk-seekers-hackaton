package org.risk.seekers.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.jboss.logging.Logger;
import org.risk.seekers.model.WiseUser;

@Path("/wise-wallet")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WiseWalletResource {
	Logger logger = Logger.getLogger(WiseWalletResource.class);

	@GET
	@Path("/users")
	public List<WiseUser> allFruits() {
		return WiseUser.listAll();
	}

	@GET
	@Path("/users/{user.id}")
	public List<WiseUser> listWiseUsers(@PathParam("user.id") String userId) {
		return WiseUser.getAllWiseUsers(userId);
	}

	@POST
	@Transactional
	@Path("/users")
	public Response saveUser(WiseUser wiseUser) {
		wiseUser.persist();
		final URI createdUri = UriBuilder.fromResource(WiseWalletResource.class).path(Long.toString(wiseUser.id))
				.build();
		return Response.created(createdUri).build();
	}
}