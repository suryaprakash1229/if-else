import java.util.Scanner;
public class checknum {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.print("positive number");
        }else if(a<0){
            System.out.print("negative number");
        }else{
            System.out.print("zero");
        }
        sc.close();
    }
}
