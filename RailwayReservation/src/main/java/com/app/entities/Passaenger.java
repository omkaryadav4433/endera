package com.app.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="passen")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@JsonIgnoreType

public class Passaenger extends BaseEntity {
	@Column(length=20)
	private String fname;
	
	@Column(length=20)
	private String lname;
	
	@Column(length=20)
	private String email;
	
	@Column(length=20)
	private String password;
	
	
	private LocalDate bookdate;
	
	@Enumerated(EnumType.STRING)
	private ReservationType type;
	
	@Column(length=20)
	private String spoint;
	
	@Column(length=20)
	private String lpoint;
	

}
