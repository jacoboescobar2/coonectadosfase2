package co.coomeva.coonectados.servicios;

import java.util.Map;

import co.coomeva.coonectados.modelos.UserVo;

public interface IPrepagadaLiquidacionNueva {
	
	Map<String, Object> insertarPrepagadaLiquidacion(String JsonUsuario) throws Exception;

}
