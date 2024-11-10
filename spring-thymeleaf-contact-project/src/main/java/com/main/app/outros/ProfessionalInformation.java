package com.main.app.outros;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="professional_information")
@SequenceGenerator(name = "professional_information_seq", sequenceName="next_val")
public class ProfessionalInformation{
	private Integer employee_id;
	private String 	position;
	
	private String 	team;
	private String 	team_leader;
	
	private String 	department;
	private String 	sector;
	
	private String 	email_professional;
	private String 	email_group;
	
	private String 	professional_phone_number;	
}
