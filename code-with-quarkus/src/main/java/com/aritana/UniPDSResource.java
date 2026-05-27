package com.aritana;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.time.LocalDateTime;

@Tag(name = "UniPDS", description = "Endpoints UniPDS")
@Path("/unipds")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UniPDSResource {

    private final int i = 0;


    @Operation(summary = "Retorna o valor atual de i")
    @APIResponse(
            responseCode = "200",
            description = "Valor inteiro de i",
            content = @Content(schema = @Schema(implementation = Integer.class))
    )

    @GET
    public int getI(){
        return i;
    }

    @GET
    @Path("getLocalDateTime")
    public LocalDateTime data(){
        return LocalDateTime.now();
    }

    @POST
    public void addI(){

    }

    @DELETE
    public void remove(){

    }

    @PUT
    public void setI(){

    }

}
