import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] people = {13, 13, 13, 13};
//        for (int i = 0; i < people.length; i++) {
//            people[i] = new Random().nextInt(100);
//        }

double sum = 0;

for (int i = 0; i < people.length; i++) {
    sum += people[i];
}
        System.out.println("Средний возраст: " + sum / people.length );

    }
}