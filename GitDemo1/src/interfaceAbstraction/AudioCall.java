package interfaceAbstraction;

public class AudioCall implements WhatsAppCalls {

	@Override
	public void calls() {
		
		System.out.println("Audio call from calls");
	}

	@Override
	public void mute() {
	
		System.out.println("Audio call from mute");
	}

	@Override
	public void disconnect() {
	
		System.out.println("Audio call from disconnect");	
	}
	
	

}
