package Lesson5Task.DataStructure;
import java.util.Scanner;
public class CallCenterQueue {
    private String[] calls;
    private int front, rear, size, capacity;

    public CallCenterQueue(int capacity) {
        this.capacity = capacity;
        calls = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCall(String caller) {
        if (size == capacity) {
            System.out.println("Call queue is full.");
        } else {
            rear = (rear + 1) % capacity;
            calls[rear] = caller;
            size++;
            System.out.println("Incoming call from " + caller + " added to queue.");
        }
    }

    public void handleCall() {
        if (size == 0) {
            System.out.println("No calls to handle.");
        } else {
            System.out.println("Handling call from " + calls[front]);
            front = (front + 1) % capacity;
            size--;
        }
    }

    public void displayCalls() {
        if (size == 0) {
            System.out.println("No pending calls.");
        } else {
            System.out.println("Current call queue:");
            for (int i = 0; i < size; i++) {
                System.out.println(calls[(front + i) % capacity]);
            }
        }
    }

    public void pendingCalls() {
        System.out.println("Number of pending calls: " + size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterQueue q = new CallCenterQueue(10);
        while (true) {
            System.out.println("\n1. Add Call\n2. Handle Call\n3. Display Calls\n4. Pending Calls\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter caller name: ");
                    q.addCall(sc.nextLine());
                    break;
                case 2:
                    q.handleCall();
                    break;
                case 3:
                    q.displayCalls();
                    break;
                case 4:
                    q.pendingCalls();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
