import java.io.*;

class Simple1 extends Thread {
    public void run() {
        System.out.println("Task One");
    }
}

class Simple2 extends Thread {
    public void run() {
        System.out.println("Task Two");
    }
}

class MultiTask {
    public static void main(String[] args) {
        Simple1 s1 = new Simple1();
        Simple2 s2 = new Simple2();
        
        s1.start();
        s2.start();
    }   
}
