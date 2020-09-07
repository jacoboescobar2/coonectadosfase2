package co.coomeva.coonectados.servicios;

import java.util.Map;

public interface IPrepagadaLiquidacionNueva {
	
	Map<String, Object> insertarPrepagadaLiquidacion(String JsonUsuario) throws Exception;

}
