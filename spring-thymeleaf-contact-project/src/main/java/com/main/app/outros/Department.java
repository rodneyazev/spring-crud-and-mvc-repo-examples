package com.main.app.outros;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="department")
@SequenceGenerator(name = "department_seq", sequenceName="next_val")
public class Department {
	private Integer id;
	private String name;
}
