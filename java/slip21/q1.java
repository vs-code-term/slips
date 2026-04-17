import java.util.*; 
class CollAss9 
{ 
public static void main(String args[]) 
{ 
Scanner sc=new Scanner(System.in); 
LinkedList<String> ll=new LinkedList<String>(); 
System.out.println("How many names you want to store "); 
int n=sc.nextInt(); 
System.out.println("Enter the students name:"); 
for(int i=0;i<n;i++) 
{ 
String sname=sc.next(); 
ll.add(sname); 
} 
ListIterator litr=ll.listIterator(); 
System.out.println("Student Names:"); 
while(litr.hasNext()) 
{ 
} 
String name=(String)litr.next(); 
System.out.println(name);
} 
} 
 
