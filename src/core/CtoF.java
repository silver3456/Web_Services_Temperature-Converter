package core;

import java.text.DecimalFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/temp/xml/c=>f")

public class CtoF {

	@GET

	@Path("{input}")

	@Produces("application/xml")

	public String convertCtoFfromInput(@PathParam("input") Double input) {

		DecimalFormat df = new DecimalFormat("####0.00");

		Double celsius = input;

		Double fahrenheit = ((celsius * 9) / 5) + 32;

		String f = df.format(fahrenheit).toString();

		String c = df.format(celsius).toString();

		return "<calc>" + "<celsius>" + c + "</celsius>" + "<fahrenheit>" + f + "</fahrenheit>" + "</calc>";

	}

}