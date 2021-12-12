package com.abc.appointment.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGlobalException(Exception e){
		return new ResponseEntity<>("Some exception is there",HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NoSuchAppointmentException.class)
	public ResponseEntity<String> handleNoSuchAppointmentException(Exception e){
		return new ResponseEntity<>("No Such Appointment Present",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(Exception e){
		return new ResponseEntity<>("IIlegal Argument Found",HttpStatus.NOT_FOUND);
	}
	
}
