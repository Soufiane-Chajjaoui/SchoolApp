package org.SchoolApp.App.DTOs;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
public class ModuleDTO {

	private Long id;
	private String titre;
	private Set<EtudiantDTO> etudiants;
	
	private Set<ElementDTO> elements;

}
