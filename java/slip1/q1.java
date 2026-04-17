class ThreadAlpha extends Thread 
{ 
public void run() 
{ 
char currentChar = 'A'; 
try  
{ 
{ 
while (currentChar <= 'Z')  
System.out.print(currentChar + " "); 
currentChar++; 
Thread.sleep(500);  
} 
}  
catch (InterruptedException e) {} 
} 
} 
class Thread4DisplayAlpha 
{ 
public static void main(String args[]) 
{ 
ThreadAlpha t=new ThreadAlpha(); 
t.start(); 
} 
} 
