package my.own.company.prova0;
import java.util.Scanner;

public class Primo {
	
	public static void main(String[] args) {
		
		String operazioni = String.join(" ", args);
		calcolaRisultato(operazioni);
	}
	
	static void calcolaRisultato(String operazioni){
		String operazioniCorretto = correggiOperazione(operazioni);
		Scanner s = new Scanner(String.join(" ", operazioniCorretto));
		double amount = 0;
		if(s.hasNext()){
			double firstElement = s.nextDouble();
			amount = firstElement;
		}
		while(s.hasNext()){
			String a = s.next("[+-]"); //regular expression
			double value = s.nextDouble();
			
			if(a.equals("+"))
				amount += value;
			else
				amount -= value;
			
			System.out.println("operatore :" + a);
			System.out.println("value :" + value);
			System.out.println("amount :" + amount);
		}
		s.close();
		
		System.out.println("amount :" + amount);
		
	}

	// Funzione per Correggere gli spazi 
	private static String correggiOperazione(String operazioni) {
		String res = "";
		for(int i = 0; i < operazioni.length(); i++){
			String v = operazioni.substring(i, i+2);
			//System.err.println("char at " + i + " [" + v + "]");
			if("+".equals(v) | "-" .equals(v))
				res += " " + v + " ";
			else
				res += v;
		}
		return null;
	}
	
}