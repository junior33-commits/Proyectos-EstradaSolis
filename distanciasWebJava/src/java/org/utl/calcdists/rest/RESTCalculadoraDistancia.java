package org.utl.calcdists.rest;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.QueryParam;      
import jakarta.ws.rs.DefaultValue;
import org.utl.calcdists.controller.CalculadoraDistancia;
import org.utl.calcdists.model.Punto;

/**
 *
 * @author DELL
 */
@Path("distancia")
public class RESTCalculadoraDistancia {
    @Path("euclidiana")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response calcularDistanciaEuclidiana(@DefaultValue("0") @QueryParam("x1") double x1,  
                                                @DefaultValue("0") @QueryParam("y1") double y1,
                                                @DefaultValue("0") @QueryParam("x2") double x2,
                                                @DefaultValue("0") @QueryParam("y2") double y2)
    {
       String out = """
                    {"result" : %f}
                    """; 
       Punto punto1 = new Punto(x1, y1);
       Punto punto2 = new Punto(x2, y2);
       CalculadoraDistancia cd = new CalculadoraDistancia();
       double dist = cd.calcularDistanciaEuclidiana(punto1, punto2);
       
       out = String.format(out, dist);
       
       return Response.status(Response.Status.OK).entity(out).build();
    }
    
    @Path("manhattan")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response calcularDistanciaManhattan(@DefaultValue("0") @QueryParam("x1") double x1,  
                                                @DefaultValue("0") @QueryParam("y1") double y1,
                                                @DefaultValue("0") @QueryParam("x2") double x2,
                                                @DefaultValue("0") @QueryParam("y2") double y2)
    {
       String out = """
                    {"result" : %f}
                    """; 
       Punto punto1 = new Punto(x1, y1);
       Punto punto2 = new Punto(x2, y2);
       CalculadoraDistancia cd = new CalculadoraDistancia();
       double dist = cd.calcularDistanciaManhattan(punto1, punto2);
       
       out = String.format(out, dist);
       
       return Response.status(Response.Status.OK).entity(out).build();
    }
}
