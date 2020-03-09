import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FormPrenotazioni extends JFrame implements ActionListener {

    private ArrayList<Prenotazione> vPrenotazioni;
    public final static String FILE_PATH = "prenotazioni.csv";

    JLabel labelNome;
    JLabel labelCognome;
    JLabel labelTelefono;
    JLabel labelCittaPartenza;
    JLabel labelCittaDestinazione;
    JLabel labelData;

    JTextField textFieldNome;
    JTextField textFieldCognome;
    JTextField textFieldTelefono;
    JTextField textFieldPartenza;
    JTextField textFieldDestinazione;
    JTextField textFieldData;

    JButton buttonConferma;
    JButton buttonAnnulla;
    JButton buttonStampa;
    JButton buttonSalva;

    public FormPrenotazioni() {

        vPrenotazioni = new ArrayList<>();
        initWindow();
        initCompontents();
        verificaPuslanti();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initWindow() {
        setSize(600, 400);
        setLocation(800, 300);
        setTitle("Prenotazioni");
    }

    private void initCompontents() {

        Container container = getContentPane();

        JPanel panelInput = new JPanel();
        panelInput.setLayout(new BoxLayout(panelInput, BoxLayout.Y_AXIS));

        JPanel panelNome = new JPanel();
        panelNome.setLayout(new FlowLayout());
        labelNome = new JLabel("Nome:");
        textFieldNome = new JTextField(20);

        JPanel panelCognome = new JPanel();
        panelCognome.setLayout(new FlowLayout());
        labelCognome = new JLabel("Cognome:");
        textFieldCognome = new JTextField(20);

        JPanel panelTelefono = new JPanel();
        panelCognome.setLayout(new FlowLayout());
        labelTelefono = new JLabel("Numero di cellulare:");
        textFieldTelefono = new JTextField(20);

        JPanel panelCittaPartenza = new JPanel();
        panelCittaPartenza.setLayout(new FlowLayout());
        labelCittaPartenza = new JLabel("Città di partenza:");
        textFieldPartenza = new JTextField(20);

        JPanel panelCittaDestinazione = new JPanel();
        panelCittaDestinazione.setLayout(new FlowLayout());
        labelCittaDestinazione = new JLabel("Città di destinazione:");
        textFieldDestinazione = new JTextField(20);

        JPanel panelData = new JPanel();
        panelData.setLayout(new FlowLayout());
        labelData = new JLabel("Data di partenza:");
        textFieldData = new JTextField(20);

        panelNome.add(labelNome);
        panelNome.add(textFieldNome);
        panelInput.add(panelNome, Component.CENTER_ALIGNMENT);

        panelCognome.add(labelCognome);
        panelCognome.add(textFieldCognome);
        panelInput.add(panelCognome, Component.CENTER_ALIGNMENT);

        panelTelefono.add(labelTelefono);
        panelTelefono.add(textFieldTelefono);
        panelInput.add(panelTelefono, Component.CENTER_ALIGNMENT);

        panelCittaPartenza.add(labelCittaPartenza);
        panelCittaPartenza.add(textFieldPartenza);
        panelInput.add(panelCittaPartenza, Component.CENTER_ALIGNMENT);

        panelCittaDestinazione.add(labelCittaDestinazione);
        panelCittaDestinazione.add(textFieldDestinazione);
        panelInput.add(panelCittaDestinazione, Component.CENTER_ALIGNMENT);

        panelData.add(labelData);
        panelData.add(textFieldData);
        panelInput.add(panelData, Component.CENTER_ALIGNMENT);

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new FlowLayout());

        buttonConferma = new JButton("Conferma");
        panelButtons.add(buttonConferma);

        buttonAnnulla = new JButton("Annulla");
        panelButtons.add(buttonAnnulla);

        buttonStampa = new JButton("Stampa");
        panelButtons.add(buttonStampa);

        buttonSalva = new JButton("Salva");
        panelButtons.add(buttonSalva);

        container.add(panelInput, BorderLayout.CENTER);
        container.add(panelButtons, BorderLayout.SOUTH);

    }

    private void verificaPuslanti() {
        buttonConferma.addActionListener(this);
        buttonAnnulla.addActionListener(this);
        buttonStampa.addActionListener(this);
        buttonSalva.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()== buttonConferma) {
            Prenotazione prenotazione = new Prenotazione();

            prenotazione.setNome(textFieldNome.getText());
            prenotazione.setCognome(textFieldCognome.getText());
            prenotazione.setTelefono(Long.parseLong(textFieldTelefono.getText()));
            prenotazione.setCittaPartenza(textFieldPartenza.getText());
            prenotazione.setCittaDestinazione(textFieldDestinazione.getText());
            prenotazione.setData(textFieldData.getText());

            vPrenotazioni.add(prenotazione);

            JOptionPane.showMessageDialog(null, "Hai inserito correttamente la prenotazione!");
            svuotaCampi();
        }

        if(ae.getSource()== buttonAnnulla) {
            JOptionPane.showMessageDialog(null, "Prenotazione annullata");
            svuotaCampi();
        }

        if(ae.getSource()== buttonStampa) {
            JOptionPane.showMessageDialog(null, vPrenotazioni.toString());
        }

        if(ae.getSource()== buttonSalva) {
            salvaCsv();
            JOptionPane.showMessageDialog(null, "Prenotazioni salvate correttamente!");
        }
    }

    public void svuotaCampi() {
        textFieldNome.setText("");
        textFieldCognome.setText("");
        textFieldTelefono.setText("");
        textFieldPartenza.setText("");
        textFieldDestinazione.setText("");
        textFieldData.setText("");
    }

    public void salvaCsv() {

        File file = new File(FILE_PATH);
        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter(file));

            for(Prenotazione prenotazione : vPrenotazioni) {
                bw.write(prenotazione.toRowCsv());
            }

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        FormPrenotazioni formPrenotazioni = new FormPrenotazioni();
    }
}