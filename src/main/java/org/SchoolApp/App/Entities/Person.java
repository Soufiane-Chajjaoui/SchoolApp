package org.SchoolApp.App.Entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.SchoolApp.App.Enum.Sex;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 2 , discriminatorType = DiscriminatorType.STRING , name = "role")
@Data @AllArgsConstructor @NoArgsConstructor
public abstract class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String firstName;
	private String lastName;
	private Sex sex;
	private Date bod;
	private String email;
	private String tele;
	private String password;

}
