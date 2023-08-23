import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {

        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);

        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);  

        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
    } 

    /**
     *  Function name - printTicketNumbers
     *  @param ticket (int[])
     * 
     *  Inside the function:
     *      1. Use a loop to print out the numbers in one line.
     *      2. After the loop print two new lines
     */
    public static int[] printTicketNumbers(int[] ticket) {

        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.print("\n\n");

        return ticket;
    }    
}