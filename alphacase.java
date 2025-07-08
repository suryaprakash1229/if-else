import java.util.Scanner;
public class alphaupper {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input:");
        char m=sc.next().charAt(0);
        if(Character.isLowerCase(m)){
           m= Character.toUpperCase(m);
            System.out.println("output:"+ m);
        }else if(Character.isUpperCase(m)){
            m=Character.toLowerCase(m);
             System.out.println("output:"+ m);
        }
    }
}
