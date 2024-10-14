import java.util.Scanner;
public class slidingwindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of packets:");
        int numPackets = scanner.nextInt();
        System.out.println("Enter the window size:");
        int windowSize = scanner.nextInt();
        int[] packets = new int[numPackets];      
        for (int i = 0; i < numPackets; i++) {
            packets[i] = i + 1;
        }
        int ack = 0;
        for (int i = 0; i < packets.length; i += windowSize) {
            // Send packets in the current window
            for (int j = i; j < Math.min(i + windowSize, packets.length); j++) {
                System.out.println("Sending packet " + packets[j]);
            }
            // Receive ACK
            System.out.println("Enter ACK (0 to " + (windowSize - 1) + "):");
            ack = scanner.nextInt();
            // Move the window forward
            System.out.println("Received ACK " + ack);
        }
        scanner.close();
    }
}
