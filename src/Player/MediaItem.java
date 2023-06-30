package Player;

public abstract class MediaItem {
    private String title;
    private int durata;
    private int volume;
    
    public MediaItem(String title, int durata,int volume) {
	this.title = title;
	this.durata = durata;
	this.volume = volume;
    }
    
    public String getTitle() {
	return title;
    }
    
    public int getDurata() {
	return durata;
    }
    
    public int getVolume() {
	return volume;
    }
    
    public abstract void play();

}
