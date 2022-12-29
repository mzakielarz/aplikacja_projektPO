import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2Form extends JFrame  {

    private JPanel JPanel2;
    private JTextField txtWiekGUI2;
    private JTextField txtPrzedmiotGUI2;
    private JTextField txtKwotaGUI2;
    private JTextField txtTelefonGUI2;
    private JTextField txtEmailGUI2;
    private JButton btnZatwierdz;
    private JButton cofnijButton;
    private JTextField txtNameGUI2;

    public static void main(String[] args) {
        GUI2Form oknoDodawania = new GUI2Form();
        oknoDodawania.setVisible(true);

    }

    public GUI2Form(){
        super("APP");
        this.setContentPane(this.JPanel2);
        this.setSize(400,250);
        cofnijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnZatwierdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student p = new Student();
                p.setImie(txtNameGUI2.getText());
                p.setEmail((txtEmailGUI2.getText()));
                p.setTelefon((txtTelefonGUI2.getText()));
                p.setWiek((txtWiekGUI2.getText()));
                p.setPrzedmiot((txtPrzedmiotGUI2.getText()));
                p.setKwota(txtKwotaGUI2.getText());
                Classer.database.add(p);

                txtNameGUI2.setText("");
                txtEmailGUI2.setText("");
                txtTelefonGUI2.setText("");
                txtWiekGUI2.setText("");
                txtPrzedmiotGUI2.setText("");
                txtKwotaGUI2.setText("");
                Classer.getDemoList().addElement(p.getImie());
                dispose();
            }
        });
    }

}
