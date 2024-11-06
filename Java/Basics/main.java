import java.time.LocalDate;

class Classy {
    String name;
    LocalDate DoB; // year, month, day
    int age;
    String Phnum;
    String Locat;
    char Gender;
    boolean Alive;


    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Date of Birth: "+DoB);
        System.out.println("Age: "+age);
        System.out.println("Phnum: "+Phnum);
        System.out.println("Locat: "+Locat);
        System.out.println("Gender: "+Gender);
        System.out.println("Status: "+Alive);
    }
}

public class main{
    public static void main(String[] args) {
        Classy Subash = new Classy();
        Subash.name = "Subash Kumar";
        Subash.age = 21;
        Subash.Phnum = "8148826206";
        Subash.Locat = "Coimbatore";
        Subash.Gender = 'M';
        Subash.DoB = LocalDate.of(2004,6,30);
        Subash.Alive = true;
        Subash.display();
    }
}