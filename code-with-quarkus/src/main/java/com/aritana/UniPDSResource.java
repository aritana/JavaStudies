package com.aritana;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name = "UniPDS", description = "Endpoints UniPDS")
@Path("/unipds")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UniPDSResource {

    private int i = 0;

    @GET
    @Operation(summary = "Retorna o valor atual de i")
    @APIResponse(
            responseCode = "200",
            description = "Valor inteiro de i",
            content = @Content(schema = @Schema(implementation = Integer.class))
    )
    @Produces(MediaType.APPLICATION_JSON)
    public int getI(){
        return i;
    }
}
