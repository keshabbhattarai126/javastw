package Lesson5Task.DataStructure;
import java.util.Scanner;
public class SupermarketQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public SupermarketQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCustomer(String name) {
        if (size == capacity) {
            System.out.println("Queue is full.");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = name;
            size++;
            System.out.println(name + " joined the queue.");
        }
    }

    public void serveCustomer() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(queue[front] + " is being served.");
            front = (front + 1) % capacity;
            size--;
        }
    }

    public void displayQueue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current queue:");
            for (int i = 0; i < size; i++) {
                System.out.println(queue[(front + i) % capacity]);
            }
        }
    }

    public void queueSize() {
        System.out.println("Number of customers in queue: " + size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SupermarketQueue q = new SupermarketQueue(10);
        while (true) {
            System.out.println("\n1. Add Customer\n2. Serve Customer\n3. Display Queue\n4. Queue Size\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    q.addCustomer(sc.nextLine());
                    break;
                case 2:
                    q.serveCustomer();
                    break;
                case 3:
                    q.displayQueue();
                    break;
                case 4:
                    q.queueSize();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
