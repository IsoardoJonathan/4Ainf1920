import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class FormPrenotazione extends JFrame implements ActionListener  {

    JButton pulsante1;
    JButton pulsante2;
    JButton pulsante3;
    JButton pulsante4;

    JLabel labelNome;
    JLabel labelCognome;
    JLabel labelTelefono;
    JLabel labelCitta;
    JLabel labelDestinazione;
    JLabel labelData;

    JTextField fieldNome;
    JTextField fieldCognome;
    JTextField fieldTelefono;
    JTextField fieldCitta;
    JTextField fieldDestinazione;
    JTextField fieldData;

    public FormPrenotazione()
    {
        setTitle("Prenotazione");
        initComponets();
        setSize(400,400);
        setVisible(true);
    }

    private void initComponets(){
        Container container = this.getContentPane();

        JPanel panel = new JPanel();

        labelNome = new JLabel("Nome: ");
        fieldNome = new JTextField(25);

        labelCognome = new JLabel("Cognome: ");
        fieldCognome = new JTextField(25);

        labelTelefono = new JLabel("Telefono: ");
        fieldTelefono = new JTextField(25);

        labelCitta = new JLabel("Città di partenza: ");
        fieldCitta = new JTextField(20);

        labelDestinazione = new JLabel("Città di destinazione: ");
        fieldDestinazione = new JTextField(20);

        labelData = new JLabel("Data: ");
        fieldData = new JTextField(25);

        panel.add(labelNome);
        panel.add(fieldNome);

        panel.add(labelCognome);
        panel.add(fieldCognome);

        panel.add(labelTelefono);
        panel.add(fieldTelefono);

        panel.add(labelCitta);
        panel.add(fieldCitta);

        panel.add(labelDestinazione);
        panel.add(fieldDestinazione);

        panel.add(labelData);
        panel.add(fieldData);

        container.add(panel);

        JPanel spanel = new JPanel();

        pulsante1 = new JButton("Conferma");
        pulsante2 = new JButton("Annulla");
        pulsante3 = new JButton("Stampa");
        pulsante4 = new JButton("Salva");

        spanel.add(pulsante1);
        spanel.add(pulsante2);
        spanel.add(pulsante3);
        spanel.add(pulsante4);

        container.add(spanel, BorderLayout.SOUTH);

        pulsante1.addActionListener(this);
        pulsante2.addActionListener(this);
        pulsante3.addActionListener(this);
        pulsante4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Prenotazione a = new Prenotazione();
        if (e.getSource() == pulsante1){
            JOptionPane.showMessageDialog(this, "Prenotazione avvenuta con successo\nGrazie " + this.fieldNome.getText());
            a.salvaSuArray(this);
            pulsante2.setEnabled(false);
        } else if(e.getSource() == pulsante2){
            JOptionPane.showMessageDialog(this, "Prenotazione annullata");
            svuota();
        }else if(e.getSource() == pulsante3){
            a.salvaSuArray(this);
            JOptionPane.showMessageDialog(this, Arrays.toString(a.array));
        }else if(e.getSource() == pulsante4){
            a.salvaSuArray(this);
            JOptionPane.showMessageDialog(this, "Stamapto su file CSV");
            a.salvaCsv(this);
            svuota();
            pulsante2.setEnabled(true);
        }
    }

    private void svuota() {
        fieldDestinazione.setText("");
        fieldCitta.setText("");
        fieldTelefono.setText("");
        fieldNome.setText("");
        fieldData.setText("");
        fieldCognome.setText("");
    }

    public static void main(String[] args) {
        FormPrenotazione formPrenotazione = new FormPrenotazione();
    }
}