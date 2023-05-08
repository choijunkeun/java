package etc;

class SliceStr {
    public static String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()/n];
//18 4
        StringBuilder sb = new StringBuilder(my_str);

        int i = 0;
        while(true) {
            System.out.println(my_str.length());
            System.out.println(n);
            System.out.println( (int)Math.ceil((float) my_str.length() / n) );
            if(sb.length() < n) break;

            answer[i] = sb.substring(0, n);

            sb.delete(0,n);
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.print(SliceStr.solution("asdf124124", 4).toString());
    }
}