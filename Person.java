public class Person {

    private Person next;
    private String name;
    private String  surname;
    private String work;
    private String cell;
    private String home;
    private String address;
    private long id;

    public Person(Person next,String name ,String surname ,String cell,String home,String work,String address,long id){

        this.cell=cell;
        this.next = next;
        this.name = name;
        this.surname = surname;
        this.work = work;
        this.home = home;
        this.address = address;
        this.id = id;


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person getNext() {
        return next;
    }

    public String getCell() {
        return cell;
    }

    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }

    public String getAddress() {
        return address;
    }

    public long getId() {
        return id;
    }
}
