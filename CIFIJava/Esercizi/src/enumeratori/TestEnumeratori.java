package enumeratori;

public class TestEnumeratori {

	public static void main(String[] args) {
		
		System.out.println("Etichetta : " + MonetaEuro.CINQUANTAEURO);
		System.out.println("Valore :" + MonetaEuro.CINQUANTAEURO.getValore());;

		MonetaEuro[] monete = MonetaEuro.values();
		
		for(MonetaEuro m : monete)
		System.out.println(m + " valore " + m.getValore());
	}

}
