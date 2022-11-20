import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        Solution obj = new Solution();
        obj.printKPC(str);
    }
}

class Solution {
        static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        public static ArrayList<String> getKPC(String ques){
            if(ques.length()==0) {
                ArrayList<String> ba = new ArrayList<>();
                ba.add("");
                return ba;
            }
            char first_char = ques.charAt(0);
            String ss = ques.substring(1);
            ArrayList<String> sAns = getKPC(ss);
            int idx = first_char - '0';
            String str = arr[idx];
            ArrayList<String> ans = new ArrayList<>();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                for(int j=0;j<sAns.size();j++){
                    ans.add(ch+sAns.get(j));
                }
            }
            return ans;
        }
        public static void printKPC(String ques) {
            // Your code here, Print output
                
                ArrayList<String> ans = getKPC(ques); 
            //System.out.println(ans);
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }
                
        }
}     