

class Queue 
{ 
 String[] data = new String[10]; 
 int front, rear; 
 Queue() 
 {  
   front=rear=0; 
    } 
 public synchronized void addQ(String greeting) 
  { 
  data[rear]=greeting; rear++; 
 } 
 public synchronized String removeQ() 
    { 
    String greeting=data[front];front++; 
    return greeting; 
  } 
} 
class Producer extends Thread 
{ 
    String greeting;Queue q; int count;  
  Producer (String greeting,Queue q,int count) 
  { 
   this.greeting=greeting; 
   this.q=q; 
   this.count=count; 
  } 
   public void run() 
   { 
  try 
  { 
    for(int i=1;i<=count;i++) 
    { 
      q.addQ(greeting + i); 
         Thread.sleep(2000); 
    } 
  } 
    catch(InterruptedException ie) 
    { 
    } 
   } 
} 
class Consumer extends Thread 
{ 
  Queue q; int count; 
  Consumer (Queue q, int count) 
  { 
     this.q=q;this.count=count; 
  } 
  public void run() 
  { 
try{ 
  for(int i=0;i<count;i++) 
  { 
                System.out.println(q.removeQ()); 
              Thread.sleep(3000); 
         }  
}  
catch(InterruptedException ie) 
    { 
    }  
  } 
} 
class Thread8ProdConsumer 
{ 
 public static void main(String[] args) 
  { 
  Queue q = new Queue(); 
  Producer p1=new Producer("Hello",q,3); 
  Consumer c1=new Consumer(q,6); 
  p1.start(); 
  c1.start(); 
 } 
} 