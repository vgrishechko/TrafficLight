/**
 * Created by GamBit on 03/06/2017.
 */
public class TrafficLight {
    private final String[] colors = {"зеленый", "желтый", "красный"};
    private int[] timing = new int[3];

    public TrafficLight(int green, int yellow, int red) {
        timing[0] = green;
        timing[1] = yellow;
        timing[2] = red;
    }

    public void start() {
        for (int i = 0; i <colors.length; i++) {
            System.out.println("Загорелся " + colors[i] + " сигнал светофора.");
            try {
                Thread.sleep(timing[i] * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
