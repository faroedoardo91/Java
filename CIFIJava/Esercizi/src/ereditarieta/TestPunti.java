package ereditarieta;

public class TestPunti {

	public static void main(String[] args) {
		
		Punto2D p2d = new Punto2D("P",2,-3);
		System.out.println(p2d);
		
		Punto3D q3d = new Punto3D("Q",3,-2,-1);
		System.out.println(q3d);
		
		Punto3D r3d = new Punto3D("R",-3,2,-1);
		System.out.println(r3d);
		
		System.out.println("QR (punti 3D): " + q3d.distanza(r3d));
		System.out.println("RQ (punti 3D): " + r3d.distanza(q3d));
		
	}

}
