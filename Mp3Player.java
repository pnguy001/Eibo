import de.hsrm.mi.eibo.simpleplayer.SimpleAudioPlayer;
import de.hsrm.mi.eibo.simpleplayer.SimpleMinim;

public class Mp3Player {
	
	SimpleMinim minim;
    SimpleAudioPlayer audioPlayer;
	

	
	public Mp3Player(){
		
		minim = new SimpleMinim();
		
		
	}
	
	public void play(String filename ) {
		
		audioPlayer = minim.loadMP3File( filename);
		
		audioPlayer.play();
	}
	
	public void play(){
		
		
	}
	
	
	
	public void pause(){
		
	}
	
	public void stop(){
		
	}
	
	public void volume(float value ){
		
	}
		
		
		}


