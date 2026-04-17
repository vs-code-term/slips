import java.util.*; 
import java.util.Collections; 
class CollAss10 
{ 
public static void main(String args[]) { 
Scanner sc=new Scanner(System.in); 
LinkedList<String> l1=new LinkedList<String>(); 
for(int i=0;i<args.length;i++) 
{ 
String name=args[i]; 
l1.add(name); 
} 
System.out.println("Link list elements using list iterator :"); 
ListIterator li=l1.listIterator(); 
while(li.hasNext()) { 
String elt=(String)li.next(); 
System.out.println(elt); 
} 
System.out.println("Link list elements using Iterator :"); 
Iterator i=l1.iterator(); 
while(i.hasNext()) { 
String elt=(String)i.next(); 
System.out.println(elt); 
} 
} 
}