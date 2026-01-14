public class Main {
    public static void main(String[] args) {
        // {시전시간, 초당 회복량, 추가 회복량}
        int[] bandage = {5, 1, 5};
        // 최대 체력
        int health = 30;
        // {{공격시간, 피해량}}
        int[][] attacks = {{2, 1}, {9, 15}, {10, 5}, {11, 5}};

        for (int i = 0; i < attacks.length; i++) {
            health = health - attacks[i][1];
        }

        System.out.println(health);
    }
}
