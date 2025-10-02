package day_05;
import java.util.*;
public class lemonade_Change {
    public static void main(String[] args) {
        int[] bills={5,5,5,10,20};
         int ten=0;
        int five=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                if(five==0) {
                    System.out.println(false);
                    return;
                }
                else {
                    five--;
                    ten++;
                }
            }else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    System.out.println(false);
                    return;
                }

                
            }
        }
        System.out.println(true);
    }
}
