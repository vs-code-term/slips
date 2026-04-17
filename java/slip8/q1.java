class NewThread2 extends Thread 
{
String name;   
int i,cnt; 
NewThread2(String threadname,int cnt)  
{  
name = threadname; 
this.cnt = cnt; 
} 
public void run() 
{ 
try 
{ 
 
for(i = 1; i <= cnt; i++) 
{  
System.out.println("\t"+name + " : "+i);  
Thread.sleep(800);  
}
}
catch (InterruptedException e) {} 
System.out.println(" *** "+name + " exiting. ***");  
}
}
class Thread1Covid 
{ 
public static void main(String args[]) 
{ 
NewThread2 t1 = new NewThread2("COVID 19",10); 
NewThread2 t2 = new NewThread2("LOCKDOWN 2020",20);  
NewThread2 t3 = new NewThread2("VACCINATED 2021",30);  
t1.start(); 
t2.start(); 
t3.start(); 
System.out.println("*** Main thread exiting. ***");
}  
} 
