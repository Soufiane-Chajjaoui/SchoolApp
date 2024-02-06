package org.SchoolApp.App.Services;

import org.SchoolApp.App.DTOs.PersonDTO;
import org.SchoolApp.App.Exceptions.DeplcatedRecordException;
import org.SchoolApp.App.Exceptions.RecordNotFoundException;
import org.springframework.http.ResponseEntity;

public class PersonService implements PersonServiceSignature{


    @Override
    public PersonDTO LogIn(String email, String password) throws RecordNotFoundException {
        return null;
    }

    @Override
    public PersonDTO SignUp(PersonDTO personDTO) throws DeplcatedRecordException {
        return null;
    }

    @Override
    public ResponseEntity LogOut() {
        return null;
    }
}
