import java.io.*;



class Odd extends Thread{
    public void run(){
        for(int i = 1 ; i <= 20 ; i = i +  2){
            System.out.println("Odd Thread : "+i);
        }
    }
    
}

class Even extends Thread{
    public void run(){
        for(int i = 2 ; i <= 20 ; i = i + 2){
            System.out.println("Even Thread : "+i);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Odd t1 = new Odd();
        Even t2 = new Even();
        
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
        t1.start();
        }
        
        
        
        
        
        
    }
}
