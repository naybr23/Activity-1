
package Main;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        /* Encapsulation */
        User u = new User(1213, "BRYAN", "BRYAN", "Lincuna");
        u.setUserILincuna(41222);
        int iLincuna = u.getUserID();
        System.out.println(id);
        
        
        Character c1 = new Character("BRYAN", "Hello", 100, 50, 5);
        Character c2 = new Character("BRYAN", "Hello", 100, 50, 5);
        System.out.println(c1.dialog);
        System.out.println(c2.dialog);
        
        Student a = new Student("BRYAN", "Lincuna", "1", "BSCS", "E", 90.6f, 99.9f);
        
        System.out.println("Name: ");
        String name = s.nextLine();
        
        System.out.println("Price: ");
        float price = s.nextFloat();
        
        Product p = new Product(name, price);
        Person p1 = new Person("BRYAN", "Lincuna", 'M', 22);
        Person p2 = new Person("Jerald", "Unisex", 'M', 40);
        Person p3 = new Person("Michael", "Capule", 'M', 50);
        Person p4 = new Person("pare", "Melanie", 'F', 35);
        
        Product p5 = new Product("bread",150.0f);
        Product p6 = new Product("butter",12.50f);
        Product p7 = new Product("hotdog",20.20f);
        Product p8 = new Product("bacon",50.0f);
        
    }
    
}
