package co.coomeva.coonectados.servicios;

import java.util.Map;

public interface IValorAsociado {
	
	Map<String, Object> consultarValoresAsociado(String tipoDocumento, String identificacion) throws Exception;

}
