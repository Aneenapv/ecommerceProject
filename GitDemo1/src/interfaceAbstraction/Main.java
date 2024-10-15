package interfaceAbstraction;

public class Main {

	public static void main(String[] args) {
	
		AudioCall ac = new AudioCall();
		ac.calls();
		ac.disconnect();
		ac.mute();
		
		VideoCall vc = new VideoCall();
		vc.calls();
		vc.disconnect();
		vc.mute();

	}

}
