import java.util.ArrayList;
public class AddMovie {
    private String name;
    private String genre;
    private int restriction, size;
    private static ArrayList<String> moviesname, moviesgenre;
    private static ArrayList<Integer> moviesr;
    public AddMovie () {
        this.name = name;
        this.genre = genre;
        this.restriction = restriction;
        moviesgenre = new ArrayList<>();
        moviesname = new ArrayList<>();
        moviesr = new ArrayList<>();
    }
    public void addmovie (String name, String genre, int restriction) {
        moviesname.add(name);
        moviesgenre.add(genre);
        moviesr.add(restriction);
        size ++;
    }

    public static ArrayList<String> getname() {
        return moviesname;

    }
    public static ArrayList<String> getgenre() {
        return moviesgenre;
    }
    public static ArrayList<Integer> getr() {
        return moviesr;
    }
}
