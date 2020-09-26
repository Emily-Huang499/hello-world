package com.indi.function.test;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest {

	public static void main(String[] args) {
		Stream<Integer> natual = Stream.generate(new NatualSupplier());
        natual.limit(20).forEach(System.out::println);
    }
}

class NatualSupplier implements Supplier<Integer> {
    int n = 0;
    public Integer get() {
        n++;
        return n;
    }
}