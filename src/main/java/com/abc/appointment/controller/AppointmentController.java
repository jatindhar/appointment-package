package com.abc.appointment.controller;


import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.appointment.entity.Appointment;
import com.abc.appointment.services.AppointmentService;



@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	
	//add Appointment
	@PostMapping("/save")
	public ResponseEntity<Appointment> saveAppointment( @RequestBody Appointment appointment) 
	{
	Appointment newAppointment=	appointmentService.addAppointment(appointment);
	
	ResponseEntity<Appointment> responseEntity = new ResponseEntity<>(newAppointment,HttpStatus.CREATED);
	
	return responseEntity;
		
	}
	
	
	//Delete Appointment
	@DeleteMapping("/{del}")
	public  ResponseEntity<Appointment> deleteAppointment(@PathVariable("del") long id)
	{
		appointmentService.removeAppointment(id);
	ResponseEntity<Appointment> responseEntity = new ResponseEntity<>(HttpStatus.OK);
	
	return responseEntity;
		
	}
	

	//Update Appointment
	@GetMapping("/update/{id}")
	public ResponseEntity<Appointment> updateAndAppointment( Appointment appointment) throws Throwable
	{
	Appointment updateAppoint=	appointmentService.updateAppointment( appointment);
	ResponseEntity<Appointment> responseEntity= new ResponseEntity<>(updateAppoint,HttpStatus.OK);
	
	return responseEntity;
		
	}
	
	//get Appointment
	@GetMapping("/{id}")
	public ResponseEntity<Appointment> showAppointment(@PathVariable("id") long id)
	{
	Appointment showAppoint=	appointmentService.getAppointment(id);
	ResponseEntity<Appointment> responseEntity = new ResponseEntity<>(showAppoint,HttpStatus.OK);
	
	return responseEntity;
	
	}
	
	
	//get all Appointment
	@GetMapping("/getAll")
	public ResponseEntity<List<Appointment>> showAllAppointment(){
		List<Appointment> lsAppoint=	appointmentService.getAllAppointments();
		
		ResponseEntity<List<Appointment>> responseEntity = new ResponseEntity<>(lsAppoint,HttpStatus.OK);
		
		return responseEntity;
	}
	
	
	
}
