package enumeratori;

public enum MonetaEuro {
	UNCENTESIMO(0.01),DUECENTESIMI(0.02),CINQUECENTESIMI(0.05),DIECICENTESIMI(0.1),VENTICENTESIMI(0.2),CINQUANTACENTESIMI(0.5),
    UNOEURO(1),DUEEURO(2),CINQUEEURO(5),DIECIEURO(10),VENTIEURO(20),CINQUANTAEURO(50),CENTOEURO(100),DUECENTOEURO(200),CINQUECENTOEURO(500),MILLEEURO(1000);
	
	private double valore;
	
	MonetaEuro(double valore)
	{
		this.valore = valore;
	}
	
	public double getValore()
	{
		return valore;
	}
	
}
