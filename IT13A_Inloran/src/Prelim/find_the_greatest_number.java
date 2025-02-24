package Prelim;
import java.util.Scanner;
public class find_the_greatest_number {
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Input the first number");
    int dd = scan.nextInt(); 
    
    System.out.println("Input the second number");
    int ff = scan.nextInt(); 
    
    System.out.println("Input the third number");
    int gg = scan.nextInt(); 
       
    if(dd >ff && dd>gg){System.out.println("the greatest number is : "+dd);
    
    }else if(ff >dd && ff>gg){System.out.println("the greatest number is : "+ff);
    
    }else if(gg>ff && gg>dd){ System.out.println("the greatest number is : "+gg);
    
    }else{System.out.println("kjasbdksadk");}
    
    }
}
