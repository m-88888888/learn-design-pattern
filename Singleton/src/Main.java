public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("equal obj1 to obj2.");
        } else {
            System.out.println("not equal obj1 to obj2.");
        }
        System.out.println("End.");

        // 5-1
        TicketMaker ticket1 = TicketMaker.getInstance();
        TicketMaker ticket2 = TicketMaker.getInstance();
        System.out.println(ticket1.getNextTicketNumber());
        System.out.println(ticket2.getNextTicketNumber());
        if (ticket1 == ticket2) {
            System.out.println("equal obj1 to obj2.");
        } else {
            System.out.println("not equal obj1 to obj2.");
        }
    }
}