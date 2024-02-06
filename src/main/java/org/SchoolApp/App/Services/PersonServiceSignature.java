package org.SchoolApp.App.Services;

import org.SchoolApp.App.DTOs.PersonDTO;
import org.SchoolApp.App.Exceptions.DeplcatedRecordException;
import org.SchoolApp.App.Exceptions.RecordNotFoundException;
import org.springframework.http.ResponseEntity;

public interface PersonServiceSignature {

    public PersonDTO LogIn(String email , String password) throws RecordNotFoundException;

    public PersonDTO SignUp(PersonDTO personDTO) throws DeplcatedRecordException;

    public ResponseEntity LogOut() ;
}
