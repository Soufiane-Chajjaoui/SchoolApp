package org.SchoolApp.App.Errors;

import org.SchoolApp.App.Exceptions.DeplcatedRecordException;
import org.SchoolApp.App.Exceptions.RecordNotFound;
import org.SchoolApp.App.Exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestHeader;

@ControllerAdvice
public class GlobalErrorHandler {


	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> handlerRecordNotFound(RecordNotFoundException e){
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND , e);
        return ResponseEntity.status(HttpStatus.NOT_FOUND ).body(apiError);
	}
    @ExceptionHandler(DeplcatedRecordException.class)
    public ResponseEntity<?> handlerDeplcatedRecord(DeplcatedRecordException e){
        ApiError apiError = new ApiError(HttpStatus.CONFLICT , e);
        return ResponseEntity.status(HttpStatus.CONFLICT ).body(apiError);
    }
}
