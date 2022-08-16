package threading;

public class TestPingPong {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		PingPong ping = new PingPong("Ping",1000);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		@SuppressWarnings("unused")
		PingPong pong = new PingPong("Pong",1000);
	}
}
