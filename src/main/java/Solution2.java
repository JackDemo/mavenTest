import java.util.Stack;

public class Solution2 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> data = new Stack<Integer>();
        int pushA_length = pushA.length;
        int popA_length = popA.length;
        int i=0;
        int j=0;
        while(i<pushA_length){
            data.push(pushA[i]);
            if(pushA[i]== popA[j]){
                data.pop();
                j++;
            }
            i++;

        }
        boolean flag = true;
        while(!data.isEmpty()){
            if(data.pop()==popA[j]){
                j++;
            }else{
                flag = false;
            }
        }
        return flag;
    }
    static String x="1";
    static int y=1;
    public static void main(String[] args) {
            //System.out.println(new Solution2().IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{2, 1, 3, 4, 5}));
        String str1 = "droid";
        String str4 = new String("droid").intern();
        System.out.println(str4==str1);


        int z=2;
        System.out.println(x+y+z);
    }
}