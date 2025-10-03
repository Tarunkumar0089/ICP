package day_06;
import java.util.*;
public class Combinations {
    public static void main(String[] args) {

        int n=4,k=2;
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),1,n,k);
        System.out.println(ans);
    }
    static void backtrack(List<List<Integer>> ans,List<Integer> temp,int start,int n,int k){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            backtrack(ans,temp,i+1,n,k);
            temp.remove(temp.size()-1);
        }
    }
}
