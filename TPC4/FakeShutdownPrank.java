import javax.swing.*;

public class FakeShutdownPrank {

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("System Alert");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JLabel label = new JLabel("System will shut down in 10 seconds!", SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(16f));
        frame.add(label);

        frame.setVisible(true);

        for (int i = 10; i >= 1; i--) {
            label.setText("System will shut down in " + i + " seconds!");
            Thread.sleep(1000);
        }

        label.setText("😄 Relax! It's just a prank!");
    }
}
