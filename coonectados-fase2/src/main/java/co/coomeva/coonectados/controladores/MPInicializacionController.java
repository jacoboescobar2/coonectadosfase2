package co.coomeva.coonectados.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.coomeva.coonectados.utilidades.JsonValidationUtil;

@RestController
@RequestMapping("/Beneficiario")
public class MPInicializacionController {

	
	@PostMapping
	public ResponseEntity<String> getInicializacion(@RequestBody String jsonInicializacion) throws Exception {
		JsonValidationUtil jsonValidate = new JsonValidationUtil();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode nodoRaiz = mapper.readValue(jsonInicializacion, JsonNode.class);
		try {
			
			jsonValidate.validarJSON("MedicinaPrepagadaInicializacionEsquema", jsonInicializacion, nodoRaiz.getNodeType());
			
		}catch (Exception e){
			
		}
		
		
		return ResponseEntity.ok().build();
	}
	
}
