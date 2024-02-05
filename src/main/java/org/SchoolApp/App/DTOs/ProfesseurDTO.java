package org.SchoolApp.App.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
public class ProfesseurDTO extends PersonDTO {
	
	private Set<ElementDTO> elements;
	
}
