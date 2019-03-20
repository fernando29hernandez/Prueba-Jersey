/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author fernando
 */
@Path("/curso")
public class CursoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CursoResource
     */
    public CursoResource() {
    }

    /**
     * Retrieves representation of an instance of nuevo.CursoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Curso> getJson() {
        //TODO return proper representation object
        List temporal = ApplicationConfig.ListaSerial;
        return temporal;
    }

    /**
     * POST method for updating or creating an instance of CursoResource
     * @param content representation for the resource
     * @return 
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Curso postJson(Curso content){
        ApplicationConfig.ListaSerial.add(new Curso(content.cod,content.nombre));
        return new Curso(content.cod,content.nombre);
    }
}
