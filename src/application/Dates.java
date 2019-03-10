package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Dates {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");//Instanciação do objeto SimpleDateFormat
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); //Hora atual
		Date x2 = new Date(System.currentTimeMillis()); //Outro forma de hora atual
		Date x3 = new Date(0L); //Tbm é possivel passar a quantidade de Milisegundos
		Date x4 = new Date(1000L * 60L * 60L * 5); //5 horas da manha de 1970
		
		Date y1 = sdf1.parse("18/06/1997"); //Parse recebe um dado String respeitando a regra e converte pra data
		Date y2 = sdf2.parse("18/06/1997 18:00:00");
		Date y3 = Date.from(Instant.parse("2019-03-10T17:00:00Z")); //Formato ISO 8601 Padrão UTC
		
		System.out.println("----------------");
		System.out.println("Y1: " + sdf2.format(y1));
		System.out.println("Y2: " + sdf2.format(y2)); //O .format serve para exibir a data exatamente da forma que foi definida.
		System.out.println("Y3: " + sdf3.format(y3));
		System.out.println("X1: " + sdf2.format(x1));
		System.out.println("X2: " + sdf2.format(x2));
		System.out.println("X3: " + sdf2.format(x3));
		System.out.println("X4: " + sdf2.format(x4));
		
		System.out.println("----------------");
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2)); //O .format serve para exibir a data exatamente da forma que foi definida.
		System.out.println("Y3: " + sdf3.format(y3));
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X4: " + sdf3.format(x4));
		
		System.out.println("----------------");
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2); //O .format serve para exibir a data exatamente da forma que foi definida.
		System.out.println("Y3: " + y3);
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		System.out.println("X3: " + x3);
		System.out.println("X4: " + x4);
		
		
		
	}

}
