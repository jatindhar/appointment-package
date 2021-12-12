package com.abc.appointment.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.appointment.entity.Appointment;



public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
//	public Appointment addAppointment(Appointment appointment);
//	public Appointment removeAppointment(long id); 
//	public Appointment updateAppointment(long id, Appointment appointment);
//	public Appointment getAppointment(long id);
//	public List<Appointment> getAllAppointments(); 
//	public List<Appointment> getOpenAppointments();

}
