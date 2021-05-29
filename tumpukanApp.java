
package stack;
public class tumpukanApp {
    public static void main (String [] args){
    tumpukan tumpukan= new tumpukan(10);
    tumpukan.push(50);
    tumpukan.baca();
    System.out.println(" ");
    tumpukan.push(100);
    tumpukan.baca();
     System.out.println(" ");
    tumpukan.pop();
    tumpukan.baca();
    
    System.out.println(" ");
    tumpukan.push(60);
    tumpukan.baca();
    System.out.println(" ");
    tumpukan.push(80);
    tumpukan.baca();
   
    tumpukan.pop();
     System.out.println(" ");
    tumpukan.baca();
     System.out.println(" ");
    
    long nilai=tumpukan.peek();
    System.out.println("nilai top = "+ nilai );
    
    
    }    
}
