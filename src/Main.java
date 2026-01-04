public class Main {
    public static void main(String[] args) {
        float value = 25.0f;

        float invSqrt = q_rsqrt(value);

        float realInvSqrt = 1.0f / (float) Math.sqrt(value);

        System.out.println("백터 정규화 : " + invSqrt);
        System.out.println("realInvSqrt = " + realInvSqrt);
    }

    public static float q_rsqrt(float number) {
        float x2 = number * 0.5f;
        float y = number;

        int i = Float.floatToIntBits(y);

        i = 0x5f3579df - (i >> 1);
        y = Float.intBitsToFloat(i);

        y = y * (1.5f - (x2 * y * y));

        return y;
    }
}
