package com.example.ITAP.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;


@Entity
@Table(name="DR_DRILL")
public class DR {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String APPLICATION_NAME;
	private String PLANNED;
	private String APPLICATION_DEVELOPER;
	private String APPLICATION_OWNER;
	private String OWNER_DEPARTMENT;
	private String CRITICAL;
	private String INT_APP;
	private String EXT_CUST_APP;
	private String ACTIVITY;
	private String REMARKS;
	private String CUST_IMPACT;
	private String POINT_OF_CONTACT;
	private String NOTIFY_DEPT;
	private String NAME_OF_DEPT;
	private String ADDITIONAL_EMAIL;
	private String TYPE;
	private String REQUESTOR_NAME;
	private String VERIFIED_BY;
	private String STATUS;
	private String CLARIFICATION;
	private String DOWNTIMEAPP;
	private LocalDate START_DATE;
	private LocalDate END_DATE;
	private LocalDate CUST_IMPACT_START_DATE;
	private LocalDate CUST_IMPACT_END_DATE;
	private LocalDate STATUS_UPDATE_DATE;
	private LocalDate SUBMIT_DATE ;
	private LocalTime  CUST_IMPACT_END_TIME;
	private LocalTime CUST_IMPACT_START_TIME;
	private LocalTime START_TIME;
	private LocalTime END_TIME; 
	
	
	
	
}
