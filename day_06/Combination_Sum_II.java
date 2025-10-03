package day_06;
import java.util.*;
public class Combination_Sum_II {
    public static void main(String[] args) {

        int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),candidates,target,0);
        System.out.println(ans);
    }
    static void backtrack(List<List<Integer>> ans,List<Integer> temp,int[] candidates,int target,int start){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            temp.add(candidates[i]);
            backtrack(ans,temp,candidates,target-candidates[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}
