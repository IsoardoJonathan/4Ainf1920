import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class FrantoioCsv {

    public static final String FILE_PATH = "C:\\Users\\inf.isoardoj1611\\Desktop\\prjct010_frantoioCsv\\db\\";
    public static final String FILE_NAME = "frantoio.txt";
    public static final String SEPARATOR = ";";

    private String linea;
    private BufferedWriter bw;
    private BufferedReader br;

    public ArrayList<Oliva> leggiFile(){

        ArrayList<Oliva> Olive = new ArrayList<Oliva>();

        try{
            br  = new BufferedReader(new FileReader(new File(FrantoioCsv.FILE_PATH + FrantoioCsv.FILE_NAME)));

            while ((linea = br.readLine()) != null){

                //codiceOliva;coloreOliva;maturazioneOliva;dataRaccolta
                String[] dati;
                dati = linea.split(SEPARATOR);

                String codiceOliva = dati[0];

                ColoreOliva coloreOliva;
                switch (dati[1]){
                    case "0":
                        coloreOliva = ColoreOliva.VERDE;
                        break;
                    case "1":
                        coloreOliva = ColoreOliva.MARRONE;
                        break;
                    case "2":
                        coloreOliva = ColoreOliva.NERO;
                        break;
                    default:
                        coloreOliva = null;
                }

                MaturazioneOliva maturazioneOliva;
                switch (dati[2]){
                    case "0":
                        maturazioneOliva = MaturazioneOliva.PICCOLA;
                        break;
                    case "1":
                        maturazioneOliva = MaturazioneOliva.ACERBA;
                        break;
                    case "2":
                        maturazioneOliva = MaturazioneOliva.MATURA;
                        break;
                    case "3":
                        maturazioneOliva = MaturazioneOliva.MARCIA;
                    default:
                        maturazioneOliva = null;
                }

                Calendar dataRaccolta = CalendarUtility.stringToCalendar(dati[3], CalendarUtility.dfDay);

                Oliva o = new Oliva(codiceOliva, coloreOliva, maturazioneOliva, dataRaccolta);
                Olive.add(o);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                br = null;
            }
        }

        return Olive;
    }

    public void scriviFile(ArrayList<Oliva> Olive){
        try{
            bw  = new BufferedWriter(new FileWriter(new File(FrantoioCsv.FILE_PATH + FrantoioCsv.FILE_NAME)));
            int index = 0;

            while (index < Olive.size()){
                //codiceOliva;coloreOliva;maturazioneOliva;dataRaccolta
                System.out.println(Olive.get(index));

                String datoUno = Olive.get(index).getCodiceOliva();

                String datoDue;
                switch (Olive.get(index).getColoreOliva()){
                    case VERDE:
                        datoDue = "0";
                        break;
                    case MARRONE:
                        datoDue = "1";
                        break;
                    case NERO:
                        datoDue = "2";
                        break;
                    default:
                        datoDue = " ";
                }

                String datoTre;
                switch (Olive.get(index).getMaturazioneOliva()){
                    case PICCOLA:
                        datoTre = "0";
                        break;
                    case ACERBA:
                        datoTre = "1";
                        break;
                    case MATURA:
                        datoTre = "2";
                        break;
                    case MARCIA:
                        datoTre = "3";
                    default:
                        datoTre = null;
                }

                String datoQuattro = CalendarUtility.calendarToString(Olive.get(index).getDataRaccolta(), CalendarUtility.dfDay);

                linea = datoUno + SEPARATOR + datoDue + SEPARATOR + datoTre + SEPARATOR + datoQuattro + "\n";
                System.out.println("linea: " + linea);

                bw.write(linea);
                index += 1;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
