package day23_interface수업3;

public class Tmain {

	public static void main(String[] args) {
		
		WebCam wc = new WebCam();
		
		wc.initMic();
		wc.initCam();
		wc.TurnOFF_Cam();
		wc.TurnON_Mic();
		
		Mic mic = new WebCam();
		
		Cam cc = new WebCam();
		
		SimpleUse su = new WebCam();
		
		su.init();
		
		
	}

}
