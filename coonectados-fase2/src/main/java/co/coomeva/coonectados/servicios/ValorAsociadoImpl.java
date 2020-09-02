package co.coomeva.coonectados.servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import co.coomeva.coonectados.modelos.ValorAsociadoVo;

@Service
public class ValorAsociadoImpl implements IValorAsociado {

	private final static Logger LOGGER = Logger.getLogger(ValorAsociadoImpl.class);
	
	@Override
	public Map<String, Object> consultarValoresAsociado(String tipoDocumento, String identificacion) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> loadAsociado = new HashMap<>();
		ValorAsociadoVo voValorAsociado = new ValorAsociadoVo();
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String formattedDate = myDateObj.format(myFormatObj);
	    
			voValorAsociado.setCedula(identificacion);
			voValorAsociado.setEsAsociado("SI");
			voValorAsociado.setValorCon1("111111");
			voValorAsociado.setDescripcionValorCon1("Concepto1");
			voValorAsociado.setValorCon2("222222");
			voValorAsociado.setDescripcionValorCon2("Concepto2");
			voValorAsociado.setValorCon3("333333");
			voValorAsociado.setDescripcionValorCon3("Concepto3");
			voValorAsociado.setValorCon4("444444");
			voValorAsociado.setDescripcionValor4("Concepto4");
			voValorAsociado.setValorCon5("555555");
			voValorAsociado.setDescripcionValorCon5("Concepto5");
			voValorAsociado.setValor("66666666");
			voValorAsociado.setFechaRegistro(formattedDate);		
			
			loadAsociado.put("Asociado", voValorAsociado);		
		
		return loadAsociado;
	}
	
	

}
