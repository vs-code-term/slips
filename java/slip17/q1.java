import java.util.*; 
class CollAss7 
{ 
public static void main(String args[]) 
{ 
Scanner sc=new Scanner(System.in); 
HashSet<Integer> hs=new HashSet<Integer>(); 
System.out.println("How many number you want to store- "); 
int n=sc.nextInt(); 
System.out.println("Enter the Numbers- "); 
for(int i=0;i<n;i++) 
{ 
Integer num=sc.nextInt(); 
hs.add(num); 
} 
TreeSet<Integer> t=new TreeSet<Integer>(hs); 
System.out.println(t); 
} 
}
