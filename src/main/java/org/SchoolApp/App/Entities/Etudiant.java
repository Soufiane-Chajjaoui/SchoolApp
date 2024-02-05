package org.SchoolApp.App.Entities;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("ET")
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant extends Person{

	@OneToMany(mappedBy = "etudiant")
	private Set<Note> notes;
	
	@ManyToMany(mappedBy = "etudiants")
	private Set<Module> modules;
}
