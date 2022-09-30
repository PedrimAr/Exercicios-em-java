package br.com.Astronomo;
import java.util.*;
public class Utils {
	public  static boolean existe(Collection<CorpoCeleste> x, CorpoCeleste y) {
		return x.contains(y);
	}
	
	public static void ordena(List<CorpoCeleste> x) {
		for(int i = 0; i + 1 < x.size(); i++) {
			if(x.get(i).getDistancia() > x.get(i + 1).getDistancia()) {
				CorpoCeleste auxiliar;
				auxiliar = x.get(i);
				x.set(i, x.get(i + 1));
				x.set(i + 1, auxiliar);
			}
		}
	}
	
	public static Map<String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) {
		Map<String, CorpoCeleste> m = new HashMap<String, CorpoCeleste>();
		Iterator<String> it =  conjuntoCorpos.iterator();
		while(it.hasNext()) {
			String[] s = it.next().split("#");
			String id = s[0];
			CorpoCeleste c;
			if(s[3].equals("P")) {
				c = new Planeta(id);
				c.setDistancia(Double.parseDouble(s[2]));
				c.setNome(s[1]);
			}
			else {
				c = new Estrela(id);
				c.setDistancia(Double.parseDouble(s[2]));
				c.setNome(s[1]);
			}
			m.put(id, c);
		}
		return m;
	}
}
