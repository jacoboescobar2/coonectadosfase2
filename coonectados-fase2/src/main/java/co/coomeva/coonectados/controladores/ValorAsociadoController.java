package co.coomeva.coonectados.controladores;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import co.coomeva.coonectados.servicios.IValorAsociado;

@RestController
@RequestMapping(path = "/coonectados/")
public class ValorAsociadoController {
	
	@Autowired
	private IValorAsociado valorAsociado;

	@RequestMapping(method = RequestMethod.GET, path = "valorAsociado")
	public @ResponseBody Map<String, Object> consultarValores(@RequestParam ("tipoDocumento") String tipoDocumento, @RequestParam("identificacion") String identificacion) throws Exception {
	
		//System.out.print("tipoDocumento "+tipoDocumento+"\n");
		//System.out.print("identificacion "+identificacion);
	
		
		return valorAsociado.consultarValoresAsociado(tipoDocumento, identificacion);
	}

}
