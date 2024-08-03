package ref;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
public class boj_9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                Stack<Character> stack = new Stack<>();
                String s = br.readLine();
                boolean flag = true;
                for (int j = 0; j < s.length(); j++){
                    if (s.charAt(j) == "(") {
                        stack.push(s.charAt(j));
                    } else if (stack.isEmpty()){
                        flag = false;                    
                        break;                                    
                    } else {
                        stack.pop();
                    }
                }
                System.out.println(flag && stack.isEmpty() ? "YES" :  "NO");
            }
        br.close();
     }
}