import java.util.*; 
class VThread extends Thread 
{ 
 String str; 
 VThread(String str) 
 { 
 this.str=str; 
 } 
 public void run() 
 { 
 try 
 { 
  
 for(int i=0; i<str.length(); i++)  
 { 
        if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
str.charAt(i) == 'u')  
 { 
            System.out.println("Given string contains "+str.charAt(i)); 
     sleep(3000); 
 } 
 } 
 } 
 catch(Exception e) 
 { 
 System.out.println(e); 
 } 
 } 
} 
 
class Thread6VowelsDemo 
{ 
 public static void main(String args[]) 
 { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter String"); 
 String str=sc.next(); 
 VThread v=new VThread(str); 
 v.start(); 
 } 
} 
  
 
 
 
 
