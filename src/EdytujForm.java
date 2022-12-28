import javax.swing.*;

public class EdytujForm extends JFrame {
    private JPanel JPanel3;
    private JTextField txtName3;
    private JTextField txtWiek3;
    private JTextField txtPrzedmiot3;
    private JTextField txtKwota3;
    private JTextField txtTelefon3;
    private JTextField txtEmail3;
    private JButton btnZatwierdzZmiany;

    public  void main(String[] args) {
        EdytujForm app = new EdytujForm();
        app.setVisible(true);

    }

    public EdytujForm() {
        super("APP");
        this.setContentPane(this.JPanel3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 400);
    }


}
