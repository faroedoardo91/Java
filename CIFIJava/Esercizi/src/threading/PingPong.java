package threading;

public class PingPong extends Thread {

	private String frase;
	private int riposo;
	
	public PingPong(String frase, int riposo) {
		this.frase = frase;
		this.riposo = riposo;
		start();
	}

	@Override
	public void run() {
		
		while(true) {
			System.out.println(frase);
			try {
				Thread.sleep(riposo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
