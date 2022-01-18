import java.awt.List;
import java.text.Collator;
import java.util.*;

public class Phonebook {

    private Person root;
    private Person contacts[];


    public Phonebook(){

        root = new Person(null,null,null,null,null,null,null,0);
        root = null;


    }


    public void search(String name){

        if(root != null) {
            Person current = root;

            contacts = new Person[10];
            int a = 0;
            while (current != null && a<10) {

            if (current.getName().equals(name) ) {

                contacts[a] = current;
                a++;

            }
            else{
                System.out.println("bulunamadı");
            }


        current = current.getNext();
    }
    for (int i = 0; i < a; i++) {

        System.out.println(i + 1 + "." + contacts[i].getName() + " " + contacts[i].getSurname());
    }

    Scanner scan = new Scanner(System.in);
    int number;

    try {


        System.out.print("(Back 11 )Choose:");
        number = scan.nextInt();
        switch (number) {

            case 1:
                searchList(contacts, 0);
                break;
            case 2:
                searchList(contacts, 1);
                break;
            case 3:
                searchList(contacts, 2);
                break;
            case 4:
                searchList(contacts, 3);
                break;
            case 5:
                searchList(contacts, 4);
                break;
            case 6:
                searchList(contacts, 5);
                break;
            case 7:
                searchList(contacts, 6);
                break;
            case 8:
                searchList(contacts, 7);
                break;
            case 9:
                searchList(contacts, 8);
                break;
            case 10:
                searchList(contacts, 9);
                break;
            case 11:
                break;
        }
    }catch (InputMismatchException e){

        System.err.println("\nPlease enter a number");
    }

}
else{
    System.err.println("\nPhone Book is empty");
            System.out.println("\n");
}



    }

    public void searchList(Person p[],int number){
        Scanner scan = new Scanner(System.in);
        int control;

        writeScreen(p[number]);

        System.out.print("For update 1\n" +
                "For delete 2\n" +
                "Back 0"+
                "--->");
        System.out.println("\n");
        control = scan.nextInt();
        if(control == 1){
            updatePerson(number);
        }
        else if(control==2){

            deletePerson(p[number]);
        }

    }

    public void searchPhoneNumber(String number){
    if(root !=null) {
        Person current = root;
        while (current != null) {

            if (current.getWork().equals(number) || current.getCell().equals(number)
                    || current.getHome().equals(number)) {

                writeScreen(current);
            }

            current = current.getNext();
        }
    }
    else{
        System.err.println("Not found!!");
        System.out.println("\n");
    }
    }



    public void updatePerson(int n){

        Scanner scan = new Scanner(System.in);
        String work;
        String home;
        String cell;
        String address;
        int control;

        System.out.print("For cell 1:\n" +
                "For home 2:\n" +
                "For work 3:\n"+
                "For address 4\n"+
                "--->");
       try {
           control = scan.nextInt();
           switch (control) {
               case 1:
                   System.out.println("Cell:");
                   cell = scan.next();
                   contacts[n].setCell(cell);
                   break;
               case 2:
                   System.out.println("Home:");
                   home = scan.next();
                   contacts[n].setHome(home);
                   break;
               case 3:
                   System.out.println("Work:");
                   work = scan.next();
                   contacts[n].setWork(work);
                   break;
               case 4:
                   System.out.println("Address:");
                   address = scan.next();
                   contacts[n].setAddress(address);
           }
       }
       catch (InputMismatchException e){

           System.err.println("Please enter a number!!");
       }

        }





    public void deletePerson(Person p){


        if(p == root){

            root = root.getNext();



        }

        else {
            Person current = root;

            while (current.getNext().getId() != p.getId()) {

                current = current.getNext();


            }


            Person p1 = current.getNext().getNext();
            current.setNext(p1);


        }
    }

    public  void createPerson(Person person){

        if(root == null){

            root = person;

        }
        else if(root.getName()==null){

            root = person;
        }
        else{

            Person current = root;

            while(current.getNext() != null){


                current = current.getNext();


            }



            current.setNext(person);



        }

    }



    public void writeScreen(Person p){
        System.out.println("\n");
        System.out.println("-->"+p.getName()+"<--\n" +
                "NAME: "+p.getName()+"\n" +
                "SURNAME: "+p.getSurname()+"\n" +
                "1.CELL: "+p.getCell()+"\n" +
                "2.HOME: "+p.getHome()+"\n"+
                "3.WORK: "+p.getWork()+"\n"+
                "4.ADDRESS: "+p.getAddress()+"\n"

        );
    }

    public void listAllPeople(){

        ArrayList<String> a = new ArrayList<>();


        int i = 1;
        Person current = root;

        while(current != null){

            a.add(current.getName()+" "+current.getSurname());
            current = current.getNext();

            
        }
        a.sort(String::compareTo);

        System.out.println("-------Phone Book-------");


       for (String p:a
             ) {

            System.out.println("      " +i+"."+p);
            i++;
        }

        System.out.println("\n");
    }

}
