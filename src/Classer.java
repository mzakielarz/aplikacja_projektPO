import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

public class Classer extends JFrame {
    private JPanel JPanel1;
    private JList list1;
    private JButton btnDodaj;
    private JButton btnUsun;
    private JButton btnEdytuj;
    private JTextField txtName;
    private JTextField txtWiek;
    private JTextField txtPrzedmiot;
    private JTextField txtKwota;
    private JTextField txtTelefon;
    private JPanel marginesR;
    private JPanel marginesB;
    private JPanel marginesL;
    private JTextField txtemail;
    public static ArrayList<Student> database = new ArrayList<>();
    public static DefaultListModel demoList = new DefaultListModel();

    public static void main(String[] args) {
        Classer aplikacja = new Classer();
        aplikacja.setVisible(true);

        Student p1 = new Student("Krzysztof Fraja","12","Matematyka","50","1387 zł","kfraja@gmail.com");
        Student p2 = new Student("Jan Kowalski","16","Angielski"," 65 zł ","2312","jkowal@gmail.com");
        Student p3 = new Student("Karol Wielki","15","Matematyka","100 zł" ,"5122","kwielki@gmail.com");
        Student p4 = new Student("Karolina Myka","18","Angielski","80 zł","2123","kmyka@gmail.com");
        database.add(p1);
        database.add(p2);
        database.add(p3);
        database.add(p4);

       demoList.addElement(p1.getImie());
       demoList.addElement(p2.getImie());
       demoList.addElement(p3.getImie());
       demoList.addElement(p4.getImie());

    }
    public Classer(){
        super("APP");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,350);

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try{
                    int index = list1.getSelectedIndex();
                    txtName.setText(database.get(index).getImie());
                    txtemail.setText(database.get(index).getEmail());
                    txtTelefon.setText(database.get(index).getTelefon());
                    txtKwota.setText(database.get(index).getKwota());
                    txtPrzedmiot.setText(database.get(index).getPrzedmiot());
                    txtWiek.setText(database.get(index).getWiek());
                }
                //bez tych opcji wywala błąd
                catch (IndexOutOfBoundsException indexException){
                    list1.invalidate();
                    list1.validate();
                    list1.repaint();
                }
            }
        });
    }
}
