 
import java.util.Random; 
 
class Square extends Thread { 
  
 int num; 
  
 Square(int num) { 
  this.num = num; 
 } 
 public void run() { 
   
  System.out.println("Square: "+(num*num)); 
 } 
} 
class Cube extends Thread { 
  
 int num; 
  
 Cube(int num) { 
  this.num = num; 
 } 
 public void run() { 
   
  System.out.println("Cube: "+(num*num*num)); 
 } 
} 
class GenerateNumber extends Thread { 
 Random random = new Random(); 
 public void run() { 
  // it will generate 10 random nos every 1 sec 
  for(int i =0; i<10; i++) { 
    
   int randomInt = random.nextInt(50); 
    
   System.out.println("Random No:"+ randomInt); 
    
   if(randomInt %2 == 0) { 
    Square squareObj = new Square(randomInt); 
    squareObj.start(); 
   } 
   else { 
    Cube cubeObj = new Cube(randomInt); 
    cubeObj.start(); 
   } 
    
   try { 
     
    Thread.sleep(1000); 
   } 
   catch(InterruptedException e) { 
     
   } 
  } 
 } 
} 
public class Thread5SquareCube { 
 
 public static void main(String[] args) { 
  
   
  GenerateNumber obj = new GenerateNumber(); 
   
  obj.start(); 
 } 
 
} 
 