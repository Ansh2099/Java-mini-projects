import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args){
         
    // New Empty array created
 
        ArrayList<String> Playlist = new ArrayList<>();

        // Songs to be added

        String Song1 = "a" ;
        String Song2 = "b" ;
        String Song3 = "c" ;
        String Song4 = "d" ;
        String Song5 = "e" ;
        String Song6 = "f" ;

        // Array Commands

        Playlist.add(Song1);
        Playlist.add(Song2);
        Playlist.add(Song3);
        Playlist.add(Song4);
        Playlist.add(Song5);
        Playlist.remove(Song2);
        Playlist.set(2,Song6);

    // Print Commands

        System.out.println(Playlist);
        System.out.println(Playlist.size()); 
        
    }
    
}
