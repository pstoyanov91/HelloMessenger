package org.restful.messages.HelloThere.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	private String errorMessage;
	private int errorCode;
	private String documentataion;
	
	public ErrorMessage(){
		
	}
	
	public ErrorMessage(String errorMessage, int errorCode, String documentataion) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.documentataion = documentataion;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getDocumentataion() {
		return documentataion;
	}
	public void setDocumentataion(String documentataion) {
		this.documentataion = documentataion;
	}
	
	
}
