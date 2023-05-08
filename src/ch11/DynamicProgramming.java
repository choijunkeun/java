package ch11;

class DynamicProgramming {

    static int[] d = new int[100];



    static int dp(int x) {
        if (x == 1) return 1;
        if (x == 2) return 1;
        if(d[x] != 0) return d[x];

        return d[x] =  (dp(x - 1) + dp(x - 2));
    }


    public static void main(String args[]) {
        System.out.println(dp(30));
    }

}
