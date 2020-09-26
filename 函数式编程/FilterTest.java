package com.indi.function.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FilterTest {

	public static void main(String[] args) {
	    Stream.generate(new LocalDateSupplier())
        .limit(31)
        .filter(ldt -> ldt.getDayOfWeek() == DayOfWeek.SATURDAY || ldt.getDayOfWeek() == DayOfWeek.SUNDAY)
        .forEach(System.out::println);
	}
}

class LocalDateSupplier implements Supplier<LocalDate> {
	LocalDate start = LocalDate.of(2020, 1, 1);
	int n = -1;
	public LocalDate get() {
		n++;
		return start.plusDays(n);
	}
}