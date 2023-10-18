package homework_nr_13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(countDivisibleBy7Numbers(101, 100));
        } catch (InvalidRangeException e) {
            System.out.println("InferiorLimit is bigger than the superiorLimit");
        }
    }
    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException{
        int numbers = 0;
        if (inferiorLimit > superiorLimit)
            throw new InvalidRangeException("InferiorLimit is bigger than the superiorLimit");
        for (int i = inferiorLimit; i < superiorLimit; i++){
            if (i % 7 == 0){
                System.out.println(i);
                numbers++;
            }
        }
        return numbers;
    }
}
