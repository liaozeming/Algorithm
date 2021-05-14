package Group7;

public class Test8 {
    public static void main(String[] args) {
        int M = 7;
        int N = 2;
        Test8 test8 = new Test8();
        String solve = test8.solve(M, N);
        System.out.println(solve);
    }

    public String solve(int M, int N) {
        if (M == 0) return "0";
        if (M < 0) return solve(-M, N);

        // write code here
        int temp = M;
        int size = 0;
        while (temp > N) {
            temp /= N;
            size++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int pow = (int) Math.pow(N, size);
        while (M > 0) {
            int a = M / pow;
            stringBuffer.append(a);
            M %= pow;
            pow /= N;
        }
        return stringBuffer.toString();
    }
}
