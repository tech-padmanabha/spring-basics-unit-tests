package io.pn.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public Integer add(int a, int b) {
		var sum = new Calculator<Integer>() {
			@Override
			public Integer clculate(Integer a, Integer b) {
				return a + b;
			}
		};

		return sum.clculate(a, b);
	}

	public Double sub(double a, double b) {
		var sum = new Calculator<Double>() {
			@Override
			public Double clculate(Double a, Double b) {
				if (a > b)
					return a - b;
				else
					return b - a;
			}
		};

		return sum.clculate(a, b);
	}

}
