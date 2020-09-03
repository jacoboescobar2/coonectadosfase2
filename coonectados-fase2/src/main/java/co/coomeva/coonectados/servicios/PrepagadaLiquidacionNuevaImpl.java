package co.coomeva.coonectados.servicios;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import co.coomeva.coonectados.modelos.UserVo;

@Service
public class PrepagadaLiquidacionNuevaImpl implements IPrepagadaLiquidacionNueva {
	
	private final static Logger LOGGER = Logger.getLogger(PrepagadaLiquidacionNuevaImpl.class);

	@Override
	public Map<String, Object> insertarPrepagadaLiquidacion(String jsonUsuario) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> resultPrepagadaLiquidacion = new HashMap<>();
		Map<String, Object> mensajetPrepagadaLiquidacion = new HashMap<>();
		mensajetPrepagadaLiquidacion.put("mensaje", "Se realizó la liquidación Exitosa");
		
		resultPrepagadaLiquidacion.put("Beneficiario", mensajetPrepagadaLiquidacion);		
		
		LOGGER.info("Liquidacion exitosa!!");
		
		return resultPrepagadaLiquidacion;
	}

}