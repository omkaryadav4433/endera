package com.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReservationType {
	
	AC(1200),NONAC(900),SLEEPER(600),GENERAL(400);
	
	
   private double rate;
   

}
