package com.abc.appointment.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment_tbl")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="appointment_id")
	private long appointmentId;
	
	@Column(name="location")
	private String location;
	
	@Column(name="visit_type")
	private String visitType;
	
	@Column(name="preferred_services")
	private String preferredService;
	
	@Column(name="preferred_date")
	private LocalDate preferredDate;
	
	@Column(name="preferred_time")
	private LocalTime preferredTime;

	public Appointment(long appointmentId, String location, String visitType, String preferredService,
			LocalDate preferredDate, LocalTime preferredTime) {
		super();
		this.appointmentId = appointmentId;
		this.location = location;
		this.visitType = visitType;
		this.preferredService = preferredService;
		this.preferredDate = preferredDate;
		this.preferredTime = preferredTime;
	}

	public Appointment() {
		super();
		
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVisitType() {
		return visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	public String getPreferredService() {
		return preferredService;
	}

	public void setPreferredService(String preferredService) {
		this.preferredService = preferredService;
	}

	public LocalDate getPreferredDate() {
		return preferredDate;
	}

	public void setPreferredDate(LocalDate preferredDate) {
		this.preferredDate = preferredDate;
	}

	public LocalTime getPreferredTime() {
		return preferredTime;
	}

	public void setPreferredTime(LocalTime preferredTime) {
		this.preferredTime = preferredTime;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", location=" + location + ", visitType=" + visitType
				+ ", preferredService=" + preferredService + ", preferredDate=" + preferredDate + ", preferredTime="
				+ preferredTime + ", getAppointmentId()=" + getAppointmentId() + ", getLocation()=" + getLocation()
				+ ", getVisitType()=" + getVisitType() + ", getPreferredService()=" + getPreferredService()
				+ ", getPreferredDate()=" + getPreferredDate() + ", getPreferredTime()=" + getPreferredTime()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getId() {
		
		return (int) appointmentId;
	}

	
	//@ManyToOne
	//@JoinColumn(name ="customer_id")
	//private Customer customer;
	
	//@OneToOne
	//private Payment payment;
	
	//@OneToOne
	//private SalonService salonService;
	
}
