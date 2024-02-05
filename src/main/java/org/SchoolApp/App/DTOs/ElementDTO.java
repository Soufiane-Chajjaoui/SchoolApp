package org.SchoolApp.App.DTOs;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ElementDTO {
	

	private Long id;
	
	private String titre;
	
 	private ModuleDTO module;
}
