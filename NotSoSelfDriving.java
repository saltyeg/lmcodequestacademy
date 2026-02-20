import java.util.Scanner;
public class NotSoSelfDriving {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {
                String line = input.nextLine();
                double v = Double.parseDouble(line.split(":")[0]);
                double x = Double.parseDouble(line.split(":")[1]);
                if (v >= x) {
                    System.out.println("SWERVE");
                    continue;
                }
                else if (v*5 >= x) {
                    System.out.println("BRAKE");
                    continue;
                }
                else {
                    System.out.println("SAFE");
                    continue;
                }
            }
        }
    }
}