package org.SchoolApp.App.Entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Etudiant extends Person{
	
	
	@OneToMany(mappedBy = "etudiant")
	private Set<Note> notes;
	
	@ManyToMany(mappedBy = "etudiants")
	private Set<Module> modules;
}
