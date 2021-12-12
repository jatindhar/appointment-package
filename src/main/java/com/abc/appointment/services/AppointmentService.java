package com.abc.appointment.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.appointment.entity.Appointment;

//@Service
public interface AppointmentService {
	
	public Appointment addAppointment(Appointment appointment);
	
	public void removeAppointment(long id);
	
	
	public Appointment updateAppointment(Appointment appointment);
	
	public Appointment getAppointment(long id);
	

	List<Appointment> getAllAppointments();
}
