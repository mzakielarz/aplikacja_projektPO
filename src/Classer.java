import javax.swing.*;

public class Classer extends JFrame {
    private JPanel JPanel1;
    private JList list1;
    private JButton DODAJUCZNIAButton;
    private JButton USUŃUCZNIAButton;
    private JButton EDYTUJDANEButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel marginesR;
    private JPanel marginesB;
    private JPanel marginesL;
    private JTextField textField6;

    public static void main(String[] args) {

        Classer aplikacja = new Classer();
        aplikacja.setVisible(true);
    }
    public Classer(){
        super("APP");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,350);

    }
}
