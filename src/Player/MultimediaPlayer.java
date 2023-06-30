package Player;

import java.util.Scanner;

public class MultimediaPlayer {

    

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner scanner = new Scanner(System.in);
	MediaItem[] mediaItems = new MediaItem[5];
	
	//Creo gli oggetti MediaItem
	
	//mediaItems[0] = new ImageItem("Immagine 1",5);
	//mediaItems[1] = new ImageItem("Immagine 2",4);
	//mediaItems[2] = new VideoItem("Video 1", 8, 2, 4);
	//mediaItems[3] = new AudioItem("Audio 1", 7, 3);
	//mediaItems[4] = new AudioItem("Audio 2", 6, 5);
	
        for (int i = 0; i < mediaItems.length; i++) {
            
            System.out.println("Scegli il tuo titolo");
            String title = scanner.nextLine();
            System.out.println("Scegli l'elemento multimediale da eseguire: 1 per immagine,2 per video,3 per audio");
            int type = Integer.parseInt(scanner.nextLine());
        
        
        switch (type) {
        case 1: 
            System.out.println("Luminosità:");
            int luminositaImmagine = Integer.parseInt(scanner.nextLine());
            mediaItems[i] = new ImageItem(title, luminositaImmagine);
            break;
        case 2:
            System.out.println("Volume:");
            int volumeVideo = Integer.parseInt(scanner.nextLine());
            System.out.println("Durata:");
            int durataVideo = Integer.parseInt(scanner.nextLine());
            System.out.println("Luminosità:");
            int luminositaVideo = Integer.parseInt(scanner.nextLine());
            mediaItems[i] = new VideoItem(title, volumeVideo, durataVideo, luminositaVideo);
            break;
        case 3:
            System.out.println("Inserisci il volume:");
            int volumeAudio = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci la durata:");
            int durataAudio = Integer.parseInt(scanner.nextLine());
            mediaItems[i] = new AudioItem(title, volumeAudio, durataAudio);
            break;
        default:
            System.out.println("Opzione non valida. Riprova.");
            i--; 
            break;
            
           }
        }
        
        
        
        
	//while (true) {
	//System.out.println("Scegli l'elemento multimediale da eseguire: 0-1 per immagine,2 per video,3-4 per audio");
	//int choice = Integer.parseInt(scanner.nextLine());
	
	//if (choice >= 0 && choice <= 5) {
	  //  MediaItem mediaItem = mediaItems[choice];
	  //  mediaItem.play();
	//}else {
	//    System.out.println("Il contenuto selezionato non è disponibile. Riprova.");
	//}
	//}
	
	scanner.close();

    }

}
