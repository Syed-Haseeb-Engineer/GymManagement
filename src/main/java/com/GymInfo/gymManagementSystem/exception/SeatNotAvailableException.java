package com.GymInfo.gymManagementSystem.exception;

public class SeatNotAvailableException extends RuntimeException{
	private static final long serialVersionUID=1L;
	public SeatNotAvailableException(String message) {
        super(message);
    }
}