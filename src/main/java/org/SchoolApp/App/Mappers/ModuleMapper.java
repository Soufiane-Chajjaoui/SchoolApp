package org.SchoolApp.App.Mappers;

import org.SchoolApp.App.DTOs.ModuleDTO;
import org.SchoolApp.App.Entities.Module;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" , uses = {})
public interface ModuleMapper {

    ModuleDTO ToModuleDTO(Module module);
    Module ToModuleEntity(ModuleDTO moduleDTO);

}
