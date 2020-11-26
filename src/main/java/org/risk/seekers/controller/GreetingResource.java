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
public class GreetingResource {
	
	@Inject
	Validator validator;


	@GET
	@Path("/users")
	public Response listUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User());
		users.add(new User());
		return Response.ok(users).build();
	}

	@GET
	@Path("/users/{user.id}")
	public Response getUser(@PathParam("user.id") String userId) {
		return Response.ok(new User()).build();
	}
	
	@POST
	@Path("/users")
	public Response createUser(User user) {
		 Set<ConstraintViolation<User>> violations = validator.validate(user);
		    if (violations.isEmpty()) {
		        return Response.status(Response.Status.CREATED).header("location", user).build();
		    } else {
		        return Response.status(Response.Status.BAD_REQUEST).build();
		    }
	}
}