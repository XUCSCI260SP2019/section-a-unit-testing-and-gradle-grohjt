public class Calculator{
    public static void main(String[] args){
    }
    public static int add(int ... numbers){
        int sum = 0;
        for (int i: numbers){
            sum = sum + i;
        }
        return sum;
    }
}
