import java.util.Random; 
class ThreadLifecycle extends Thread { 
public ThreadLifecycle(String name) { 
super(name); 
} 
public void run() { 
System.out.println("Thread " + getName() + " created."); 
try { 
// Generating a random sleep time between 0 to 4999 milliseconds 
Random rand = new Random(); 
int sleepTime = rand.nextInt(5000); 
// Generates a random integer between 0 to 4999 
System.out.println("Thread " + getName() + " will sleep for " + sleepTime + " milliseconds."); 
Thread.sleep(sleepTime); 
} catch (InterruptedException e) { 
System.out.println("Thread " + getName() + " interrupted."); 
return; 
} 
System.out.println("Thread " + getName() + " dead."); 
} 
} 
public class Thread2LifeCycle { 
public static void main(String[] args) { 
ThreadLifecycle thread1 = new ThreadLifecycle("Thread1"); 
ThreadLifecycle thread2 = new ThreadLifecycle("Thread2"); 
ThreadLifecycle thread3 = new ThreadLifecycle("Thread3"); 
// Starting threads 
thread1.start(); 
thread2.start(); 
thread3.start(); 
} 
}