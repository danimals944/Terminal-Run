package src;
import src.Guest.Hotel;
import src.Guest.People;

import java.util.List;
import java.util.Scanner;



public class Main extends TimeFormat {              // extending TimeFormat to bring in Time of Day Greeting

    private static List<Hotel> hotelList = List.of(                                             // creating list of JSON objects. 10/10 selection of Hotel names.
            new Hotel().setCompany("Hotel California").setCity("Santa Barbara").setId(1),
            new Hotel().setCompany("The Grand Budapest Hotel").setCity("Republic of Zubrowka").setId(2),
            new Hotel().setCompany("The Heartbreak Hotel").setCity("Graceland").setId(3),
            new Hotel().setCompany("The Prancing Pony").setCity("Bree").setId(4),
            new Hotel().setCompany("The Fawlty Towers").setCity("Torquay").setId(5)
    );
    private static List<People> peopleList = List.of(
            new People().setFirstName("Candy").setLastName("Pace").setRoomNumber(529).setId(1),
            new People().setFirstName("Morgan").setLastName("Porter").setRoomNumber(385).setId(2),
            new People().setFirstName("Bridgett").setLastName("Richard").setRoomNumber(141).setId(3),
            new People().setFirstName("Melisa").setLastName("Preston").setRoomNumber(417).setId(4),
            new People().setFirstName("Latoya").setLastName("Herrera").setRoomNumber(194).setId(5),
            new People().setFirstName("Hewitt").setLastName("Hopper").setRoomNumber(349).setId(6)
    );

    public static void main(String[] args) {
        Prompt();                                   // calling to begin messaging process.
    }

    private static void Prompt() {                      // User is given set predetermined prompts to select from.
        System.out.println("Please select from a template below to send to the client: ");
        System.out.println("==========================");
        System.out.println("1.) (Time of Day) (Client Name), and welcome to (Hotel Name)! Your room is now ready you. Enjoy your stay, and let us know if you need anything.");
        System.out.println("2.) (Time of Day) (Client Name), and thank you for choosing (Hotel Name) for your stay! Check in time is at 11:00 am, and check out is 12:00pm. Enjoy your stay, and please reach out with any additional needs!");
        Scanner scan = new Scanner(System.in);
        int choice = Integer.parseInt(scan.nextLine());
        switch (choice) {                               // switch/case statement to select from the options, with the default constraining to those two options. If the user selects from outside the parameters, they will be prompted to select from the available options until an accepted choice is made.
            case 1:
                selectionOne();
                break;
            case 2:
                selectionTwo();
                break;
            default:
                Prompt();
        }
    }

    private static void selectionOne() {            // First selection, begins prompts to user to fill previous parenthesis in Prompt().

        System.out.println("========================");
        System.out.println("Please Select a Client: ");
        for (int i = 1; i < peopleList.size(); i++) {
            System.out.println(i + ".) " + "Client : " + peopleList.get(i).getFirstName());       // Gets first name from personList
        }
        Scanner scan2 = new Scanner(System.in);
        String personInput = scan2.nextLine();

        System.out.println("Please select a Hotel: ");
        for (int i = 1; i < hotelList.size(); i++) {
            System.out.println(i + ".) " + "Hotel : " + hotelList.get(i).getCompany());           // Gets hotel name from hotelList
        }
        Scanner scan = new Scanner(System.in);
        String hotelInput = scan.nextLine();


        System.out.println("==========================");
        System.out.println(DisplayDateTime() + " " + personInput + ", and welcome to " + hotelInput + "! " + "Your room is now ready you. Enjoy your stay, and let us know if you need anything.");

        // Output compiles previously entered user input into the final message.
    }

    private static void selectionTwo() {                        // Same process will occur if this method is selected. The only difference will be the template to be printed.

        System.out.println("==========================");
        System.out.println("Please select a Client: ");
        for (int i = 1; i < peopleList.size(); i++) {
            System.out.println(i + ".) " + "Person : " + peopleList.get(i).getFirstName());
        }
        Scanner scan2 = new Scanner(System.in);
        String personInput = scan2.nextLine();

        System.out.println("========================");
        System.out.println("Please select a Hotel: ");

        for (int i = 1; i < hotelList.size(); i++) {
            System.out.println(i + ".) " + "Hotel : " + hotelList.get(i).getCompany());
        }
        Scanner scan = new Scanner(System.in);
        String hotelInput = scan.nextLine();


        System.out.println("==========================");
        System.out.println(DisplayDateTime() + " " + personInput + ", and thank you for choosing " + hotelInput + " for your stay! " + "Check in time is at 11:00 am, and check out is 12:00pm. Enjoy your stay, and please reach out with any additional needs!");
    }
}