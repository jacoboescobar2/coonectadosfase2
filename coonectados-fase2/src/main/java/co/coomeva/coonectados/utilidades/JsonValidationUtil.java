package co.coomeva.coonectados.utilidades;

import java.io.IOException;
import java.io.InputStream;

import org.everit.json.schema.*;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.databind.node.JsonNodeType;

public class JsonValidationUtil {

	public void validarJSON(String nombreEsquema, String json, JsonNodeType tipo) throws ValidationException {
		
		String rutaEsquema = "/esquemasjson/" + nombreEsquema + "Esquema.json";

		try (InputStream inputStream = getClass().getResourceAsStream(rutaEsquema)) {
			
			JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
			SchemaLoader schemaLoader = SchemaLoader.builder()
				.schemaJson(rawSchema) // rawSchema is the JSON representation of the schema utilizing the "date-custom" non-standard format
				.addFormatValidator("date-custom", new DateFormatValidator()) // the EvenCharNumValidator gets bound to the "date-custom" keyword
				.build();
			Schema schema = schemaLoader.load().build(); // the schema is created using the above created configuration
			if (tipo == JsonNodeType.OBJECT) {
				schema.validate(new JSONObject(json));  // the document validation happens here
			}
			else {
				schema.validate(new JSONArray(json));  // the document validation happens here
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
