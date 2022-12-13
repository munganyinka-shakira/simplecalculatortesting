package com.simpleCalculator.simpleCalculator;

import jdk.jfr.DataAmount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCalculatorApplication.class, args);
	}
@Overide
	public double doMath(double operand1,double operand2, String operation) throws InvalidOpearationException{
		if("/".equals(operation) && operand2 == (double) 0){
			throw new InvalidOperationException("Cannot divide by 0");
		}
		switch(operation){
			case "*":
				return operand1 * operand2;
			case "/":
				return operand1 / operand2;

			case "+":
				return operand1 + operand2;
			case "-":
				return operand1 - operand2;
			case "**":
				return Math.pow(operand1,operand2);
			case "log":
				return operand1* Math.log10(operand2);
			case "ln":
				return operand1 * Math.log(operand2);
			default:
				throw new RuntimeException("Unknown operation");
		}
}
public class InvalidOperationException extends Exception{
		public InvalidOperationException(String message){
			super(message);
		}
}

}
