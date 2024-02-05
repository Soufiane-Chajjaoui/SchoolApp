package org.SchoolApp.App.DTOs;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

public class NoteDTO {

	private Long id;
	
	private EtudiantDTO etudiant;
	
	private ElementDTO element;
	
	private int note;
}
