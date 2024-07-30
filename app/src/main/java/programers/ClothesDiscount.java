package programers;

public class ClothesDiscount {
    public static void main(String[] args) {
       solution(100010); 
    }
    public static int solution(int price) {
        int answer = 0;
        double a = price;
        if ((300000 > a) && a >= 100000) {
          a = a - a / 20;
          price = (int) Math.floor(a);
    
        } else if ((500000 > price) && price >= 300000) {
          a = a - a / 10;
          price = (int) Math.floor(a);
        } else if (a >= 500000) {
          a = (int) (a - a / 5);
          price = (int) Math.floor(a);
        }
    
        answer = price;
        return answer;
      }
}
