import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by GamBit on 03/06/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите время работы сигналов через пробел:");
        String[] time = reader.readLine().split(" ");
        TrafficLight tf = new TrafficLight(Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));
        tf.start();
    }
}
