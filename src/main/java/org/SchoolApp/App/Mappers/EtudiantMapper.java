package org.SchoolApp.App.Mappers;

import org.SchoolApp.App.DTOs.EtudiantDTO;
import org.SchoolApp.App.Entities.Etudiant;
import org.mapstruct.Mapper;

@Mapper(componentModel =  "spring" ,uses = {ElementMapper.class})
public interface EtudiantMapper {
    EtudiantDTO ToEtudiantDTO(Etudiant etudiant);
    Etudiant ToEtudiantEntity(EtudiantDTO etudiantDTO);
}
