package model;

public class CarteDiDebito extends ContoCorrente {


	public CarteDiDebito(int numeroCC, int pin, double plafond, String datiIntestatario, double costoApertura,
			double totaleSpeseSostenuteMese, double speseGestione, int transazione)
	{
		super(numeroCC, pin, plafond, datiIntestatario, costoApertura, totaleSpeseSostenuteMese, speseGestione, transazione);
	}
	
	
}
