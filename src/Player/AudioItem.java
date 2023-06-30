package Player;
import Player.MediaItem;
import Player.Play;

public class AudioItem extends MediaItem implements Play, Luminosità{
    private int durata;
    private int volume;
    private int luminosità;

    public AudioItem(String title,int durata, int volume) {
	super(title, durata, volume);
	this.durata = durata;
	this.volume = volume;
    }
    
    @Override
    public void play() {
	System.out.println("Riproduzione" + getTitle());
	for (int i = 0; i < durata; i++) {
	    System.out.println("!".repeat(volume));
	} 
    }
    

    @Override 
    public int getVolume() {
	return volume;
    }
    
    @Override 
    public int getDurata() {
        return durata;
    }
    
    
}

