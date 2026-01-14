package TPC4;
import java.util.Scanner;

interface PowerDevice {
    void turnOn(int voltage) throws Exception;
}

class Fan implements PowerDevice {
    public void turnOn(int voltage) throws Exception {
        if (voltage <= 0 || voltage > 240) {
            throw new Exception("Invalid voltage for Fan");
        }
    }
}

class Heater implements PowerDevice {
    public void turnOn(int voltage) throws Exception {
        if (voltage <= 0 || voltage > 2000) {
            throw new Exception("Invalid voltage for Heater");
        }
    }
}

public class SmartDevicePowerControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String dev = sc.nextLine().trim();
            int voltage = sc.nextInt();

            PowerDevice device;

            if (dev.equals("FAN")) {
                device = new Fan();
            } else if (dev.equals("HEATER")) {
                device = new Heater();
            } else {
                throw new Exception("Invalid device type");
            }

            device.turnOn(voltage);
            System.out.println("Device Turned On");

        } catch (Exception e) {
            System.out.println("Power Error");
        }

        sc.close();
    }
}
