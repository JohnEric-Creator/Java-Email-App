package emailapp;

public class Main {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());

//        em1.setAlternateEmail("js@gmail.com");
//        System.out.println("Your alternate email is : " + em1.getAlternateEmail());
    }
}