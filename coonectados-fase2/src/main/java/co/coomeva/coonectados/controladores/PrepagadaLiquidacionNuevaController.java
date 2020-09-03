package co.coomeva.coonectados.controladores;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.coomeva.coonectados.modelos.UserVo;
import co.coomeva.coonectados.servicios.IPrepagadaLiquidacionNueva;
import co.coomeva.coonectados.servicios.ValorAsociadoImpl;
import co.coomeva.coonectados.utilidades.JsonValidationUtil;

@RestController
@RequestMapping(path = "/coonectados/")
public class PrepagadaLiquidacionNuevaController {
	
	@Autowired
	private IPrepagadaLiquidacionNueva prepagadaLiquiNueva;
	
	ObjectMapper mapper = new ObjectMapper();
	JsonValidationUtil jsonValidate = new JsonValidationUtil();
	
	private final static Logger LOGGER = Logger.getLogger(PrepagadaLiquidacionNuevaController.class);

	@RequestMapping(method = RequestMethod.POST, path = "prepagadaLiquidacionNueva", consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<String, Object> consultarValores(@RequestBody String jsonUsuario) throws Exception {
		
		Map<String, Object> validateJson = new HashMap<>();
		
		try {
			//Se valida la estructura general del JSON
			JsonNode nodoRaiz = mapper.readValue(jsonUsuario, JsonNode.class);
			jsonValidate.validarJSON("EmpleadoEstructura", nodoRaiz.toString(), nodoRaiz.getNodeType());	
			
		} catch (Exception e) {
			// TODO: handle exception
			 LOGGER.error("Error al validar el JSON "+e);
			 validateJson.put("Error al validar los parametros de entrada", e.getMessage());
			 return validateJson;
		}
		
		return prepagadaLiquiNueva.insertarPrepagadaLiquidacion(jsonUsuario);

	}

}
