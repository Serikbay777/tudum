import java.util.Scanner;
import java.util.ArrayList;

public class TicketSystem {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInfo[] users = new UserInfo[10];
        int pnt = 0;
        while(true) {
            System.out.println("Enter the needed option by its index.");
            System.out.println("1.To add movie.\n" + "2.To show all available movies.\n" + "3.To add a new user.\n" +
                    "4.To buy a ticket\n5.To cancel a purchase of the ticket\n6.exit");
            short choice = sc.nextShort();
            switch (choice) {
                case 1:
                    AddMovie newmovie = new AddMovie();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the movie name");
                    String name = scanner.nextLine();
                    System.out.println("Enter the movie genre");
                    String genre = scanner.nextLine();
                    System.out.println("Enter the restrictions");
                    int restriction = scanner.nextInt();
                    newmovie.addmovie(name, genre, restriction);
                    break;
                case 2:
                    ArrayList<String> moviename = AddMovie.getname();
                    ArrayList<String> moviegenre = AddMovie.getgenre();
                    ArrayList<Integer> movier = AddMovie.getr();
                    int sz = Math.max(Math.max(movier.size(), moviegenre.size()), moviename.size());
                    System.out.println(sz);
                    for (int i = 0; i < sz; ++ i) {
                        System.out.print(moviename.get(i));
                        System.out.print(" ");
                        System.out.print(moviegenre.get(i));
                        System.out.print(" ");
                        System.out.print(movier.get(i));
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    Scanner scannerr = new Scanner(System.in);
                    System.out.println("Enter your name");
                    String newname = scannerr.nextLine();
                    System.out.println("Enter your age");
                    int newnage = scannerr.nextInt();
                    System.out.println("Enter your balance");
                    int newbalance = scannerr.nextInt();
                    users[pnt] = new UserInfo();
                    users[pnt].adduser(newname, newnage, newbalance);
                    pnt++;
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("Enter the name of the movie you want to go");
                    String ticketscan = scanner.nextLine();
                    System.out.println("Enter your id");
                    int id = scanner.nextInt();
                    users[id].addorder(ticketscan);
                    break;
                case 5:
                    scanner = new Scanner(System.in);
                    System.out.println("Enter your id");
                    int idper = scanner.nextInt();
                    System.out.println("Enter id of the order");
                    id = scanner.nextInt();
                    users[idper].del(id);
                    break;
                case 6:
                    return;
            }
        }

    }

}