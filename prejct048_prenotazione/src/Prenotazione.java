import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prenotazione {
    public static final String PATH_FILE_CSV ="db\\prenotazioni.csv";
    public static final String SEPARATOR =";";
    public String[] array = new String[6];

    public void salvaSuArray(FormPrenotazione formPrenotazione){
        array[0] = "Nome: " + formPrenotazione.fieldNome.getText();
        array[1] = "\n" +"Cognome: " + formPrenotazione.fieldCognome.getText();
        array[2] = "\n" +"Telefono: " + formPrenotazione.fieldTelefono.getText();
        array[3] = "\n" +"Città di partenza: " + formPrenotazione.fieldCitta.getText();
        array[4] = "\n" +"Città di destinazione" + formPrenotazione.fieldDestinazione.getText();
        array[5] = "\n" + "Data: " + formPrenotazione.fieldData.getText();
    }

    public void salvaCsv(FormPrenotazione formPrenotazione){
        File file = new File(PATH_FILE_CSV);
        BufferedWriter bw;
        try{
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(this.toRowCsv(formPrenotazione));
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String toRowCsv(FormPrenotazione fp){
        return "Prenotazione:" + "\n" + array[0] + SEPARATOR + "\n" + array[1] + SEPARATOR + "\n" + array[2] + SEPARATOR + "\n" + array[3] + SEPARATOR + "\n" + array[4] + SEPARATOR + "\n" + array[5] + "\n\n";
    }
}