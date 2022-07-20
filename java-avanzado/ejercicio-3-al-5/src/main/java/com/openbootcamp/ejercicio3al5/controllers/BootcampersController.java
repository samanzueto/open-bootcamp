package com.openbootcamp.ejercicio3al5.controllers;

import com.openbootcamp.ejercicio3al5.models.Bootcamper;
import com.openbootcamp.ejercicio3al5.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private BootcamperService bootcamperService;

    //public BootcampersController() {}

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Uno"));
        this.bootcamperService.add(new Bootcamper("Dos"));
        this.bootcamperService.add(new Bootcamper("Tres"));
        this.bootcamperService.add(new Bootcamper("Cuatro"));
        this.bootcamperService.add(new Bootcamper("Cinco"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response agregarBootCamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }


    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper mostrarBootcamper(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }


}
