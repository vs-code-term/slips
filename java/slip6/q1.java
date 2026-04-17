import java.util.*; 
import java.util.Collections; 
class CollAss5 
{ 
public static void main(String args[]) { 
Scanner sc=new Scanner(System.in); 
HashSet<Integer> hs=new HashSet<Integer>(); 
System.out.println("How many number you want to store:"); 
int n=sc.nextInt(); 
System.out.println("Enter the Numbers- "); 
for(int i=0;i<n;i++) 
{ 
Integer num=sc.nextInt(); 
hs.add(num); 
} 
TreeSet<Integer> t=new TreeSet<Integer>(hs); 
System.out.println(t); 
ArrayList<Integer> a=new ArrayList<Integer>(t); 
System.out.println("Enter the element you want to search:"); 
int num=sc.nextInt(); 
int index=Collections.binarySearch(a,num); 
System.out.println("The number present at index "+index); 
//System.out.println("The "+num+" present at index "+index); 
} 
} 
