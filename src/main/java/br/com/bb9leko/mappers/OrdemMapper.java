package br.com.bb9leko.mappers;

import org.mapstruct.Mapper;


import br.com.bb9leko.dto.AdicionarOrdem;
import br.com.bb9leko.entities.Ordem;

@Mapper(componentModel = "cdi")
public interface OrdemMapper {

    public Ordem toOrdem(AdicionarOrdem dto);
    
}
