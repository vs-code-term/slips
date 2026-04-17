import java.util.*; 
class CollAss1 
{ 
} 
public static void main(String args[]) 
{ 
Scanner sc=new Scanner(System.in); 
HashSet<String> hs=new HashSet<String>(); 
System.out.println("How Many Elements u Want:"); 
int n=sc.nextInt(); 
System.out.println("Enter friends name:"); 
for(int i=0; i<n; i++) 
{ 
} 
String name=sc.next(); 
hs.add(name); 
TreeSet<String> t=new TreeSet<String>(hs); 
System.out.println(t); 
}