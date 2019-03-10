package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DatasTentando {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date data = Date.from(Instant.parse("2019-03-10T17:55:05Z"));
		 
		
		
		System.out.println(sdf.format(data));

	}

}
