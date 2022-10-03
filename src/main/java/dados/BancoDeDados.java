package dados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import entidades.Skate;

public class BancoDeDados {
	private static Integer geradorDeId;
	private static List<Skate> bd = new ArrayList<Skate>();
	
	public static void insert(Skate s) {
		bd.add(s);
	}
	
	public static String select(){
		String retorno = "";
		for (Skate skate : bd) {
			retorno += "<tr><td>" + skate.getTipoSkate() + "</td><td>" + skate.getMarcaSkate() + "</td></tr>";  
		}
		return retorno;
	}
}