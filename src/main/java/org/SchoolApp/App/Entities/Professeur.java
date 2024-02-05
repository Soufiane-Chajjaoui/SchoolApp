package org.SchoolApp.App.Entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Professeur extends Person{
	
	@OneToMany
	private Set<Element> elements; 
	
}
