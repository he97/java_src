package test;
import java.util.Scanner;
public class test0_2{
    public static void main(string []args){
        Scanner sc=new Scanner(system.in);
        int time=0;
        while(sc.hasNext()){
            char c=sc.nextChar();
            if(c==" "){
                time=0;
                }
               else time++;
        }
        system.out.println(time);
    }
}