package org.risk.seekers.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/wise-wallet")
public class GreetingResource {


	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/users")
	public String greeting() {
		return "listado de usuarios";
	}

	@GET
	@Path("/users/{user.id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(@PathParam("user.id") String userId) {
		return "usuario";
	}
}