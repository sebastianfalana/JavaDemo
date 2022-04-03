package Class3;

public class Salary {
    public static void main(String[] args) {
        int[] tab = {2, 55, 61, 2, -9};
        int sum = 0;
        float ave = 0.00f;
        int min = tab[0];
        int max = tab[0];
        int num = 0;

        for (int i = 0; i < tab.length; i++) {
            num = tab[i];
            sum += tab[i];
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }

        }
        ave = sum / tab.length;
        System.out.println("Suma to: " + sum);
        System.out.println("Average: " + ave);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
