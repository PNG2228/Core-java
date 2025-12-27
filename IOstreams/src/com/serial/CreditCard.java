package com.serial;

import java.io.Serializable;

public class CreditCard implements Serializable{
	private String cardNumber;
	private int cvv;
	transient private int pin;
	public CreditCard(String cardNumber, int cvv, int pin) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cvv=" + cvv + ", pin=" + pin + "]";
	}
	
	

}