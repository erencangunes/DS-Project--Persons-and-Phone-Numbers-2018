import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    private static String name;
    private static String surname;
    private static String work;
    private static String home;
    private static String cell;
    private static String address;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Phonebook p1 = new Phonebook();

        boolean bool = true;


        while(bool) {

            System.out.print("Search a person 1\n" +
                    "Search a phone number 2\n" +
                    "Create new person 3\n" +
                    "List all4\n" +
                    "Exit5\n-->");


                String number;
                number = scan.next();
                switch (number) {

                    case "1":
                        System.out.print("Enter the name of person:");
                        p1.search(scan.next());
                        break;
                    case "2":
                        System.out.print("Enter a number:");
                        String s = scan.next();
                        p1.searchPhoneNumber(s);
                        break;
                    case "3":
                        System.out.print("Enter name:");
                        name = scan.next();
                        System.out.print("\nEnter surname:");
                        surname = scan.next();
                        System.out.print("\nEnter cell number:");
                        cell = scan.next();
                        System.out.print("\nEnter home number:");
                        home = scan.next();
                        System.out.print("\nEnter work:");
                        work = scan.next();
                        System.out.print("\nEnter address:");
                        address = scan.next();
                        System.out.println("\n");

                        p1.createPerson(new Person(null, name, surname, cell, home, work, address, System.currentTimeMillis()));
                        break;
                    case "4":
                        p1.listAllPeople();
                        break;

                    case "5":
                        bool = false;
                        break;
                        default:
                            bool = true;
                            break;

                }
            }




    }
    }


