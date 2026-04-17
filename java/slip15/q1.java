class Thread3Priority 
{ 
public static void main(String args[]) 
{ 
String s; 
int p; 
Thread t=Thread.currentThread(); 
s=t.getName(); 
System.out.println("Current Thread Name="+s); 
p=t.getPriority(); 
System.out.println("Current Thread Priority="+p); 
t.setName("My Thread"); 
s=t.getName(); 
System.out.println("Changed Thread Name="+s); 
} 
}