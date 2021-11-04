public class Test {
    public static void main(String [] args){

        Account a = new Account(0);
        Customer c = new Customer("Brian","Segura", a);

        Account a2 = new Account(0);
        Customer c2 = new Customer("Luis", "Pérez", a2);

        a.deposit(1500);
        a.withdraw(1200);

        a2.deposit(1500);
        a2.withdraw(1700);

        System.out.println("Mi nombre es: " + c.getFirstName() + " " + c.getLastName());
        System.out.println("Mi balance es: "+ a.getBalance());

        System.out.println("\nMi nombre es: " + c2.getFirstName() + " " + c2.getLastName());
        System.out.println("Mi balance es: "+ a2.getBalance());
    }
}
