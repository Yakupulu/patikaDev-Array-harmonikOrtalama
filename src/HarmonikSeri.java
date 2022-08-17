import java.util.Arrays;

public class HarmonikSeri {
    public static void main(String[] args) {
        double harmonikSeri;
        double sum = 0;
        double harmonikAvarage=0.0;


        int[] list = {2,4,5,6,8,10};

        for (int i : list) {
            harmonikSeri = 1.0 / i;
            sum += harmonikSeri;
            harmonikAvarage = list.length/sum;
        }
        System.out.println("Harmonik ortalama:\t"+harmonikAvarage);
    }
}
