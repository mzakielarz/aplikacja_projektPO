import javax.swing.*;

public class GUI2Form extends JFrame {

    private JPanel JPanel2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton zatwierdźButton;
    private JButton cofnijButton;

    public static void main(String[] args) {
        GUI2Form oknoDodawania = new GUI2Form();
        oknoDodawania.setVisible(true);

    }
    public GUI2Form(){
        super("APP");
        this.setContentPane(this.JPanel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,250);
    }
}
