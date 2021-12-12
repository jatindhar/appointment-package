package com.abc.appointment.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.abc.appointment.dao.AppointmentRepository;
import com.abc.appointment.entity.Appointment;
import com.abc.appointment.exception.DublicateAppointmentException;
import com.abc.appointment.exception.NoSuchAppointmentException;
import com.abc.appointment.exception.ResourceNotFoundException;


@Service
public class AppointmentServiceimpl implements AppointmentService{
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	
	//add Appointment
	@Override
	public Appointment addAppointment(Appointment appointment) {
		Optional<Appointment> appo=appointmentRepository.findById(appointment.getAppointmentId());
		
		
		if(appo.isEmpty())
		{
			throw new DublicateAppointmentException("no appointment");
		}
		
			Appointment appointment1=appointmentRepository.save(appointment);
		
		return appointment1;
		}


//Remove Appointment
@Override
public void removeAppointment(long id) {
	if(id !=0)
	{
		appointmentRepository.deleteById((long) id);
		
	}
	else
	{
		throw new NoSuchAppointmentException("Appointment is not there in database");
	}
}

@Override
public Appointment updateAppointment(Appointment appointment)  {
	Optional<Appointment> optionalAppointment=appointmentRepository.findById(appointment.getAppointmentId());
	if(optionalAppointment.isEmpty())
	{
		throw new NoSuchAppointmentException("Appointment is not exciting with id :");
	}
	Appointment newAppointment=appointmentRepository.save(appointment);
	return newAppointment;
	}

//get Appointment by Id
@Override
public Appointment getAppointment(long id) throws ResourceNotFoundException {
Optional<Appointment> optionalAppointment=appointmentRepository.findById(id);
if(optionalAppointment.isEmpty()) {
	
	throw new ResourceNotFoundException("Appointment not existing with id:"+id);
	
}

Appointment appointment = optionalAppointment.get();

return appointment;
}


	//get all appointments
	@Override
	public List<Appointment>getAllAppointments() {
		List<Appointment> appointment= appointmentRepository.findAll();
		return appointment;
}
	
	


	
	
}
