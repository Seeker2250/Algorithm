package programers;

public class ReplacePart {

    public static void main(String[] args) {
        solution("1234567890",2, 4);
    }
    public static String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] al = new char[my_string.length()];
        al = my_string.toCharArray();
        for (int i = 0; i < s; i++) {
          sb.append(al[i]);
        }
        for (int i = e; i >= s; i--) {
          sb.append(al[i]);
        }
        for (int i = e+1; i < my_string.length(); i++) {
          sb.append(al[i]);
        }
    
        answer= String.valueOf(sb);
        System.out.println(answer);
        return answer;
    }
}
