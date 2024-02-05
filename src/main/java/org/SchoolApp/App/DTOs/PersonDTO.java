package org.SchoolApp.App.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public abstract class PersonDTO {

	private Long id ;
	private String firstName;
	private String lastName;
	private Date bod;
	private String email;
	private String tele;
	private String password;

}
