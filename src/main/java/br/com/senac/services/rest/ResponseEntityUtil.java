package br.com.senac.services.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityUtil {
	
	public static ResponseEntity<ApiResponse> okResponseEntity(String message){
		return new ResponseEntity<ApiResponse>(new ApiResponse(message), HttpStatus.OK);
	}

	public static ResponseEntity<ApiResponse> okResponseEntity(String message, Object data){
		return new ResponseEntity<ApiResponse>(new ApiResponse(message, data), HttpStatus.OK);
	}
	
	public static ResponseEntity<ApiResponse> unprocessableResponseEntity(String message, Object data){
		return new ResponseEntity<ApiResponse>(new ApiResponse(message, data), HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	public static ResponseEntity<ApiResponse> 
	notFoundResponseEntity(String message, Object data){
		return new ResponseEntity<ApiResponse>
		(new ApiResponse(message,data),
				HttpStatus.NOT_FOUND);
	}
}
