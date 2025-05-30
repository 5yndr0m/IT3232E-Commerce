package com.vau.app.model;

public class ErrorResponse {

	private int statusCCose;
	private String errorMessage;
	
	public ErrorResponse() {
	}

	public int getStatusCCose() {
		return statusCCose;
	}

	public void setStatusCCose(int statusCCose) {
		this.statusCCose = statusCCose;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ErrorResponse(int statusCCose, String errorMessage) {
		super();
		this.statusCCose = statusCCose;
		this.errorMessage = errorMessage;
	}

}
