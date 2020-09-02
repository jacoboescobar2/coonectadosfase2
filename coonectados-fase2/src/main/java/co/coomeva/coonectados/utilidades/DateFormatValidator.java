package co.coomeva.coonectados.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.everit.json.schema.FormatValidator;

public class DateFormatValidator implements FormatValidator {

	@Override
	public Optional<String> validate(final String subject) {
		if (subject.isEmpty()) return Optional.empty();
		try {
			SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
			formatoFecha.setLenient(false);
			formatoFecha.parse(subject);
		} catch (ParseException e) {
			return Optional.of(String.format("[%s] is not a valid date format. Expected 'yyyy-MM-dd'", subject));
		}
		return Optional.empty();
	}

}
