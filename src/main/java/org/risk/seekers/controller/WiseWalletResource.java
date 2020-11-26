package org.risk.seekers.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.risk.seekers.model.User;

@Path("/wise-wallet")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WiseWalletResource {
	
	@Inject
	Validator validator;
	
	@Inject
	WiseWalletService service;


	@GET
	@Path("/users")
	public Response listUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Samuel", "Antequera", "Cabornero", 12, "samuel@protonmail.com", "6300685", 50f));
		users.add(new User(2, "Pepe", "Chocolatero",  "Cabornero", 7, "pepe@protonmail.com", "63006853", 500f));
		return Response.ok(users).build();
	}

	@GET
	@Path("/users/{user.id}")
	public Response getUser(@PathParam("user.id") String userId) {
		User samuel = new User(1, "Samuel", "Antequera", "Cabornero", 12, "samuel@protonmail.com", "6300685", 50f);
		return Response.ok(samuel).build();
	}
	
	@POST
	@Path("/users")
	public Response createUser(User user) {
		 Set<ConstraintViolation<User>> violations = validator.validate(user);
		    if (violations.isEmpty()) {
		    	User created = service.createGift(user);
		        return Response.status(Response.Status.CREATED).header("location", "/wise-wallet/users/" + created.getId()).build();
		    } else {
		        return Response.status(Response.Status.BAD_REQUEST).build();
		    }
	}
}