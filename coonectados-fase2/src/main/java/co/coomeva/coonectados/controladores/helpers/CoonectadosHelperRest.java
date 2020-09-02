package co.coomeva.coonectados.controladores.helpers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.coomeva.coonectados.utilidades.ErrorResponse;

public class CoonectadosHelperRest {

	
	public static ResponseEntity<ErrorResponse> createErrorEntity(HttpStatus httpStatus, String message) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(message);
		errorResponse.setReasonPhrase(httpStatus.getReasonPhrase());
		errorResponse.setStatusCode(String.valueOf(httpStatus.value()));
		errorResponse.setCode(String.valueOf(httpStatus.value()));
		errorResponse.setCreateDate(new Date());
		return ResponseEntity.status(httpStatus).body(errorResponse);
	}
}
