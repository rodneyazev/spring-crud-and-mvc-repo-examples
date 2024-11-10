package com.main.app.outros;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="position")
@SequenceGenerator(name = "position_seq", sequenceName="next_val")
public class Position {
	private Integer id;
	private String name;
}
