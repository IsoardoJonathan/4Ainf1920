import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListNomi extends JFrame implements ActionListener {

    JLabel labelCognome, labelNome;
    JTextField textCognome, textNome;
    JButton buttonAggiungi;

    JList<String> listPersone;
    DefaultListModel<String> defaultListModelPersone;

    JComboBox<String> comboBoxPersone;
    DefaultComboBoxModel<String> defaultComboBoxModelPersone;

    ArrayList<String> arrayListPersone;


    public ListNomi() {
        arrayListPersone = new ArrayList<>();
        setTitle("Lista persone");
        initComponents();
        setSize(500,350);
        setMinimumSize(new Dimension(500,350));
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void initComponents() {

        Container container = this.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        JPanel panelNome = new JPanel();
        panelNome.setLayout(new FlowLayout());
        labelNome = new JLabel("Nome");
        textNome = new JTextField(20);
        panelNome.add(labelNome);
        panelNome.add(textNome);
        container.add(panelNome);

        JPanel panelCognome = new JPanel();
        panelCognome.setLayout(new FlowLayout());
        labelCognome = new JLabel("Cognome");
        textCognome = new JTextField(20);
        panelCognome.add(labelCognome);
        panelCognome.add(textCognome);
        container.add(panelCognome);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        defaultListModelPersone = new DefaultListModel<>();
        listPersone = new JList<>(defaultListModelPersone);
        JScrollPane scrollList = new JScrollPane(listPersone);
        panel.add(scrollList);

        defaultComboBoxModelPersone = new DefaultComboBoxModel<>();
        comboBoxPersone = new JComboBox<>(defaultComboBoxModelPersone);
        comboBoxPersone.setPrototypeDisplayValue("                                          ");
        JScrollPane scrollComboBox = new JScrollPane(comboBoxPersone);
        panel.add(scrollComboBox);

        container.add(panel);

        JPanel panelAggiungi = new JPanel();
        panelAggiungi.setLayout(new FlowLayout());
        buttonAggiungi = new JButton("Aggiungi");
        buttonAggiungi.addActionListener(this);
        buttonAggiungi.setAlignmentX(CENTER_ALIGNMENT);
        panelAggiungi.add(buttonAggiungi);
        container.add(panelAggiungi);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonAggiungi) aggiungi();
    }

    public void aggiungi() {
        arrayListPersone.add(arrayListPersone.size(), textCognome.getText() + " " + textNome.getText());
        defaultListModelPersone.add(defaultListModelPersone.getSize(), textCognome.getText() + " " + textNome.getText());
        defaultComboBoxModelPersone.addElement(textCognome.getText() + " " + textNome.getText());
        textCognome.setText("");
        textNome.setText("");

    }

    public static void main(String[] args) {
        new ListNomi();
    }
}