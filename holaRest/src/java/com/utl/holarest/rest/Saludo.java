/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utl.holarest.rest;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.QueryParam;      
import jakarta.ws.rs.DefaultValue;

/**
 *
 * @author DELL
 */
@Path("saludo")
public class Saludo {
    
    @GET
    @Path("saludar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response saludar(){
        String out ="""
                    {"result" : "Hola mundo desde REST"}
                    """;
        return Response.status(Response.Status.OK).entity(out).build();
    }
    @GET
    @Path("saludarPorNombre")
    @Produces(MediaType.APPLICATION_JSON)
    public Response saludarPorNombre(@QueryParam("nombreUsuario")@DefaultValue("Anonimo")String nombre){
        String out = """
                     {"result" : "Hola %s"}
                     """;
        out = String.format(out, nombre);
        return Response.status(Response.Status.OK).entity(out).build();
    }
}

