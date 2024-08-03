package ref;

import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(system.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            int M = Integer.parseInt(st.nextToken());
            switch (M){
                case '1' :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case '2' : 
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case '3' : 
                    sb.append(stack.size()).append("\n");
                    break;
                case '4' : 
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n"); 
                    break;
                case '5' : 
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;

                default: break;
            }
        }
        br.close();
        system.out.parseln(sb);
    }
}
