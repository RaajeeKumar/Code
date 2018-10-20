package com.lambda;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(1983, 11, 30);
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(1983, Month.NOVEMBER, 30);
		System.out.println(d2);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		
		for(String z:ZoneId.getAvailableZoneIds())
		{
			System.out.println(z);
		}
		LocalTime t1 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t1);
		
		Instant i = Instant.now();
		System.out.println(i);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

	}

}
