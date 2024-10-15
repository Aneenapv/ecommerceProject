package interfaceAbstraction;

public class VideoCall implements WhatsAppCalls {

	@Override
	public void calls() {
		
		System.out.println("video call from calls");
	}

	@Override
	public void mute() {
		
		System.out.println("video call from mute");	
	}

	@Override
	public void disconnect() {
		
		System.out.println("video call from disconnect");
	}

}
