package com.comicvine.manager.resource;

import com.comicvine.manager.business.ComicCharacterBean;
import com.comicvine.manager.entity.ComicCharacter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("character")
@RequestScoped
public class ComicCharacterResource {
    @Inject
    ComicCharacterBean characterBean;

    @GET
    @Path(("{id}"))
    @Produces(MediaType.APPLICATION_JSON)
    public ComicCharacter getCharacter(@PathParam("id") int id) {
        return characterBean.getById(id);
    }
}
