public class calculatepowxnusingrecursion {
    public static void main(String[] args) {
        int x = 2 , n = 2;
        int pwerofn =  power(x , n);
        System.out.println(pwerofn);
    }
    public static int power(int x , int n){

        if(n == 0)
            return 1;

        return x * power(x , n-1);
    }
}
