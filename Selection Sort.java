
public class Main{
    public static void main(String[] args) {
        int[] a = {10, 50, 60, 30, 40, 70};
        int min;

        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
       
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
