package threading;

public class CountDown extends Thread{

	private int count;
	private int riposo;
	
	public CountDown(int count) {
		this.count = count;
		this.riposo = 1000;
		start();
	}
	
	public CountDown(int count, int riposo) {
		this(count);
		this.riposo = riposo;
		
	}

	@Override
	public void run() {
		
		while(true) {
			System.out.println(count--);
			
			if(count<0)
				break;
			try {
				Thread.sleep(riposo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}