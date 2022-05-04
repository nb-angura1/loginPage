import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myDisplay = new GUI(600,400);
        frame.add(myDisplay);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
