public class Main {
    public static void main(String[] args) {
        double sum=0;
        double avarage=0.0;

        int[] list={1,2,3,4};

        for (int i:list){
            sum+=i;
            avarage=sum/list.length;
        }
        System.out.println("ortalama:"+avarage);


    }
}
