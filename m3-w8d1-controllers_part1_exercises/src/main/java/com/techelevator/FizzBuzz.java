package com.techelevator;

public class FizzBuzz {
	private Integer divis1;
	private Integer divis2;
	private String fizz;
	private String buzz;
	private Integer number1;
	private Integer number2;
	private Integer number3;
	private Integer number4;
	private Integer number5;
	
	public String viewNumber (Integer number) {
		if (number % (divis1*divis2) == 0) {
			return fizz+buzz;
		}
		if (number % divis1 == 0) {
			return fizz;
		}
		if (number % divis2 == 0) {
			return buzz;
		}
		return number.toString();
	}
	
	public int getDivis1() {
		return divis1;
	}
	public void setDivis1(int divis1) {
		this.divis1 = divis1;
	}
	public int getDivis2() {
		return divis2;
	}
	public void setDivis2(int divis2) {
		this.divis2 = divis2;
	}
	public String getFizz() {
		return fizz;
	}
	public void setFizz(String fizz) {
		this.fizz = fizz;
	}
	public String getBuzz() {
		return buzz;
	}
	public void setBuzz(String buzz) {
		this.buzz = buzz;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	public int getNumber4() {
		return number4;
	}
	public void setNumber4(int number4) {
		this.number4 = number4;
	}
	public int getNumber5() {
		return number5;
	}
	public void setNumber5(int number5) {
		this.number5 = number5;
	}
}
