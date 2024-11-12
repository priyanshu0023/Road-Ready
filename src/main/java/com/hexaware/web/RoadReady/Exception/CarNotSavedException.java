package com.hexaware.web.RoadReady.Exception;

public class CarNotSavedException extends RuntimeException{
	String msg;
	
	public CarNotSavedException(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
}
