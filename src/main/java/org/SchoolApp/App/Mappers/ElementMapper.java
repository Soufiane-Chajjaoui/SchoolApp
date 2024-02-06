package org.SchoolApp.App.Mappers;

import org.SchoolApp.App.DTOs.ElementDTO;
import org.SchoolApp.App.Entities.Element;
import org.SchoolApp.App.Entities.Professeur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" , uses = {Professeur.class , ModuleMapper.class , EtudiantMapper.class})
public interface ElementMapper {
    ElementDTO ToElementDto(Element element);
    Element ToElementEntity(ElementDTO elementDTO) ;
}
