package com.javatpoint.rest;
import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import com.genius.negocios.Lamp;
 
@Path("/actions")
public class Resources {
	static Lamp threadButtons;
	
	static{
		threadButtons = new Lamp();
	}
		
	@POST
	@Path("/acender")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response doAcender(String index) throws IOException, InterruptedException {	
		JSONObject json = new JSONObject();		
		GenericEntity< String> entity;

        threadButtons.acender();
        json.put("status", "aceso");
		
        entity  = new GenericEntity< String >( json.toString()){};
		return Response.ok( entity ).build();
	}
	
	@POST
	@Path("/apagar")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response doApagar(String index) throws IOException, InterruptedException {	
		JSONObject json = new JSONObject();		
		GenericEntity< String> entity;

		threadButtons.apagar();
		json.put("status", "apagado");        
        entity  = new GenericEntity< String >( json.toString()){};
		return Response.ok( entity ).build();
	}
 }