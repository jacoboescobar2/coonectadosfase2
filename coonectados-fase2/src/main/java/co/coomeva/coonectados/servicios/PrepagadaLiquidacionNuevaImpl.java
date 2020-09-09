package co.coomeva.coonectados.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import co.coomeva.coonectados.afilmed.modelos.MedicinaPrepagadaXXMPBW;
import co.coomeva.coonectados.afilmed.repositorios.XXMPBWRepository;
import co.coomeva.coonectados.bitacora.modelos.BitacoraServicio;

@Service
public class PrepagadaLiquidacionNuevaImpl implements IPrepagadaLiquidacionNueva {
	
	private final static Logger LOGGER = Logger.getLogger(PrepagadaLiquidacionNuevaImpl.class);

	@Autowired
	private XXMPBWRepository xxmpbwrepo;
	
	@Override
	public Map<String, Object> insertarPrepagadaLiquidacion(String jsonUsuario) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> resultPrepagadaLiquidacion = new HashMap<>();
		Map<String, Object> mensajetPrepagadaLiquidacion = new HashMap<>();
		mensajetPrepagadaLiquidacion.put("mensaje", "Se realizó la liquidación Exitosa");
		
		MedicinaPrepagadaXXMPBW medi = new MedicinaPrepagadaXXMPBW();
		medi.setId(Long.parseLong("1"));
		medi.setIdentificacion(Integer.parseInt("1143939625"));
		medi.setNombre("Jhon Torres");
			
		xxmpbwrepo.save(medi);
		
		xxmpbwrepo.findAll().forEach(System.out::println);
		
		resultPrepagadaLiquidacion.put("Beneficiario", mensajetPrepagadaLiquidacion);		
		
		LOGGER.info("Liquidacion exitosa!!");
		
		return resultPrepagadaLiquidacion;
	}

}