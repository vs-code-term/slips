import java.util.LinkedList; 
import java.util.ListIterator; 
import java.util.Scanner; 
class CollAss2 
{ 
public static void main(String args[]) 
{ 
LinkedList<String> LL=new LinkedList<String>(); 
Scanner sc = new Scanner(System.in); 
int ch; 
System.out.println("How many friend name u want to accept :"); 
int n=sc.nextInt(); 
System.out.println("Enter Friend Name:"); 
for(int i=0;i<n;i++) 
{ 
} 
String name=sc.next(); 
LL.add(name); 
System.out.println("The list is :"+LL); 
do 
{ 
System.out.println("1:Add element at end of list :"); 
System.out.println("2:Delete first element of list :"); 
System.out.println("3:Display element in reverse order :"); 
System.out.println("4:Exit:"); 
 System.out.println("Enter your choice :"); 
 ch=sc.nextInt(); 
 switch(ch) 
 { 
 case 1: 
  System.out.println("Enter element :"); 
  String name=sc.next(); 
  LL.addLast(name); 
  System.out.println("The list is :"+LL);  
  break; 
 
 case 2: 
  LL.removeFirst(); 
  System.out.println("The list is :"+LL); 
  break; 
 case 3: 
  ListIterator li=LL.listIterator(); 
  System.out.println("List elements in forward order:");   
  while(li.hasNext()) 
   System.out.println(li.next()); 
  System.out.println("List elements in reverse order:"); 
  while(li.hasPrevious()) 
   System.out.println(li.previous()); 
 
 } 
 }while(ch<4);  
} 
}