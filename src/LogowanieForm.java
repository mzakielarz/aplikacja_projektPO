import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogowanieForm extends JFrame {
    private javax.swing.JPanel JPanel1;
    private JTextField txtLogin;
    private JButton zalogujButton;
    private JPasswordField passField;
    static String truelogin = "login";
    static String truehaslo = "haslo";

    public static void main(String[] args) {
        LogowanieForm log = new LogowanieForm();
        log.setVisible(true);
    }
    public LogowanieForm(){
        super("APP");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,250);
        zalogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = txtLogin.getText();
                String haslo =  new String(passField.getPassword());

                if (login.equals(truelogin)&& haslo.equals(truehaslo)){
                    Classer aplikacja = new Classer();
                    aplikacja.setVisible(true);
                    dispose();
                    Student p1 = new Student("Krzysztof Fraja","12","Matematyka","50 zł","1387 ","kfraja@gmail.com");
                    Student p2 = new Student("Jan Kowalski","16","Angielski"," 65 zł ","2312","jkowal@gmail.com");
                    Student p3 = new Student("Karol Wielki","15","Matematyka","100 zł" ,"5122","kwielki@gmail.com");
                    Student p4 = new Student("Karolina Myka","18","Angielski","80 zł","2123","kmyka@gmail.com");
                    Classer.database.add(p1);
                    Classer.database.add(p2);
                    Classer.database.add(p3);

                    Classer.database.add(p4);

                    Classer.demoList.addElement(p1.getImie());
                    Classer.demoList.addElement(p2.getImie());
                    Classer.demoList.addElement(p3.getImie());
                    Classer.demoList.addElement(p4.getImie());
                }
                else if (login.equals("login") && !haslo.equals(truehaslo))
                    JOptionPane.showMessageDialog(LogowanieForm.this, "Złe hasło");
                else if (!login.equals("login") && haslo.equals(truehaslo))
                    JOptionPane.showMessageDialog(LogowanieForm.this, "Zły login");

            }
        });
    }
}
