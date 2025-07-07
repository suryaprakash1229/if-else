import java.util.Scanner;
public class alpha {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char v1=sc.next().charAt(0);
        char v2=sc.next().charAt(0);
        if(v1>v2){
            System.out.print(v2+","+v1);
        }else{
            System.out.print(v1+","+v2);
        }
    }
}
