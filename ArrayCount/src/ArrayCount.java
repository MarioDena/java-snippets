public class ArrayCount {

    public static void main(String[] args){

    }

    public int ArrayCount1(int[] ar){
        int sumOfArray = 0;
        for (int i = 0; i < ar.length; i++){
            sumOfArray += ar[i];
        }
        return 0;
    }

    public int ArrayCount2(int[] ar){
        int sumOfArray = 0;

        for(int num : ar){
            sumOfArray += num;
        }

        return sumOfArray;
    }
}
