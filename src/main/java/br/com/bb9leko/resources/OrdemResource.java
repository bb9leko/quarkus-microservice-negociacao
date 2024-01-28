package br.com.bb9leko.resources;

import java.util.List;

import br.com.bb9leko.dto.AdicionarOrdem;
import br.com.bb9leko.entities.Ordem;
import br.com.bb9leko.mappers.OrdemMapper;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;



@Path("/ordem")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrdemResource {

    @Inject
    OrdemMapper ordemMapper;

    @GET
    @Transactional
    public List<Ordem> consultar() {
        return Ordem.listAll();
    }

    @POST
    @Transactional
    public Response cadastrar(AdicionarOrdem dto) {
        Ordem ordem = ordemMapper.toOrdem(dto);
        ordem.persist();
        return Response.status(Status.CREATED).build();

    }
}  