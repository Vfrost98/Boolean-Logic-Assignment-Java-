import java.util.Scanner;
class Main {

  public static boolean calBool(boolean c, boolean b, boolean a){

    boolean dummy1 = c || a && !b;
    boolean dummy2 = dummy1;

    return dummy2; 
  }
  
  public static void main(String[] args) {
    
    //header
    System.out.println();
    System.out.println("TRUTH TABLE");
    System.out.println("--------------------------------------------");
    System.out.println("C \t\t\tB \t\t\tA \t\t\tF");
    System.out.println("--------------------------------------------");

    boolean c = false;
    boolean b = false;
    boolean a = false;
    boolean F;
    
    //set true or false
    for(int c1 = 0; c1<=1;c1++){
      for(int b1 = 0; b1 <= 1;b1++){
        for(int a1 = 0;a1 <=1; a1++){
          if(c1 == 1){
            c = true;
          } else {
            c = false;
          }
          if (b1 == 1){
            b = true;
          } else{
            b = false;
          }
          if(a1 == 1){
            a = true;
          } else {
            a = false;
          }

          F = calBool(c, b, a); //preforms calcuations

          System.out.println(c + "\t\t" + b + "\t\t" + a + "\t\t" + F);
        }
      }
    }



    

  }
}