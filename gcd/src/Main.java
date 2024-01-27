public class Main {
    public static int gcd(int x, int y) {
        if (x % y == 0){
            return x/y;
        } else if (y % x == 0) {
            return y/x;
        }else{
            if (x > y){
                return gcd(x % y, y);
            }else{
                return gcd(x, y % x);
            }
        }
    }
}