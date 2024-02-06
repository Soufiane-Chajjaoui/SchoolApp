package org.SchoolApp.App.Mappers;

import org.SchoolApp.App.DTOs.ProfesseurDTO;
import org.SchoolApp.App.Entities.Professeur;
import org.mapstruct.Mapper;

@Mapper
public interface ProfesseurMapper {
    ProfesseurDTO ToProfesseurDTO(Professeur professeur);
    Professeur ToProfesseurEntity(ProfesseurDTO professeurDTO);
}
