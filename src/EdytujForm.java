import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EdytujForm extends JFrame {
    private JPanel JPanel3;
    private  JTextField txtName3;
    private JTextField txtWiek3;
    private JTextField txtPrzedmiot3;
    private JTextField txtKwota3;
    private JTextField txtTelefon3;
    private JTextField txtEmail3;
    private JButton btnZatwierdzZmiany;
    private JButton btnPowrot;

    public  static  void main(String[] args) {
        EdytujForm app = new EdytujForm();
        app.setVisible(true);

    }

    public EdytujForm() {
        super("APP");
        this.setContentPane(this.JPanel3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 400);

        try {
            txtName3.setText(Classer.database.get(Classer.index).getImie());
            txtWiek3.setText(Classer.database.get(Classer.index).getWiek());
            txtPrzedmiot3.setText(Classer.database.get(Classer.index).getPrzedmiot());
            txtKwota3.setText(Classer.database.get(Classer.index).getKwota());
            txtTelefon3.setText(Classer.database.get(Classer.index).getTelefon());
            txtEmail3.setText(Classer.database.get(Classer.index).getEmail());
        }
        catch (IndexOutOfBoundsException e){
            invalidate();
            validate();
            repaint();
        }

        btnPowrot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        btnZatwierdzZmiany.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pobranie danej zaznaczonej pozycji
                int selectedItem =  Classer.getIndex();
                Student p = new Student();
                p.setImie(txtName3.getText());
                p.setTelefon((txtTelefon3.getText()));
                p.setWiek((txtWiek3.getText()));
                p.setPrzedmiot((txtPrzedmiot3.getText()));
                p.setKwota(txtKwota3.getText());
                p.setEmail(txtEmail3.getText());

                Classer.database.set(selectedItem,p);
                Classer.getDemoList().set(selectedItem,p.getImie());


                dispose();
            }
        });
    }


}
