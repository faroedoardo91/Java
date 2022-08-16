package threading;

public class PingPong2 implements Runnable{

	private String frase;
	private int riposo;
	
	public PingPong2(String frase, int riposo) {
		this.frase = frase;
		this.riposo = riposo;
		Thread t = new Thread(this);
		t.start();
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