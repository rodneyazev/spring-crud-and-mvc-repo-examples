package com.main.app.outros;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="sector")
@SequenceGenerator(name = "sector_seq", sequenceName="next_val")
public class Sector {
	private Integer id;
	private String name;
}
