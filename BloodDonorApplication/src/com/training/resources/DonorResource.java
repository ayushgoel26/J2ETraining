package com.training.resources;

import java.net.URI;
import java.sql.SQLException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.training.beans.BloodDonor;

import com.training.utils.DonorManager;

@Path("/donor")
public class DonorResource {

	private DonorManager donorDao;

	public DonorResource() {
		super();
		this.donorDao = new DonorManager();
	}

	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addDonor(BloodDonor donor) {

		String status = "Not Added";
		int result = 0;
		try {
			result = donorDao.addDonor(donor);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (result > 0) {
			status = result + " Added";
		}
		return status;
	}

	@GET
	@Path("srchByLoc/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchDonorByLoc(@PathParam("location") String loc) {
		Response result = null;
		try {
			result = Response.status(200).entity(donorDao.searchDonorByLocation(loc)).build();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@GET
	@Path("srchByLocAndID/{location}/{bloodGroup}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchDonorByLocAndId(@PathParam("location") String loc,
			@PathParam("bloodGroup") String bloodGroup) {
		
		Response result = null;
		try {
			result = Response.status(200).entity(donorDao.searchDonorByLocationAndGroup(loc, bloodGroup)).build();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@PUT
	@Path("updateDonor/{donorId}/{property}/{newValue}")
	public Response updateDonorDetail(@PathParam("donorId") long donorId, @PathParam("property") String property,
			@PathParam("newValue") String newValue) {
		
		Response result = null;
		try {
			result = Response.status(200).entity(donorDao.updateDonationDetails(donorId, property, newValue)).build();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	
//	URI link = UriBuilder.fromPath("srchByLoc").fragment("Bangalore").build();
//	String val = "<a href = " + link.toString() +">Click</a>";
//	return val;
	@GET
	@Path("getLoc")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLocations(){
		Response result = null;
		try {
			result = Response.status(200).entity(donorDao.getDistinctLocations()).build();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	

	@GET
	@Path("getBloodGroups")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBloodGroups(){
		Response result = null;
		try {
			result = Response.status(200).entity(donorDao.getDistinctBloodGroups()).build();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
