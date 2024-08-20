package media;

public class Media {
    public static void main(String args[]){

        System.out.println(media(7.5, 8.0, 9.0,8,12,32));        

    }
    
    public static double media(double... nums){
        double result = 0;

       for (double num : nums) {
              result += num;
       }

        return result/nums.length;
    }
    
}
