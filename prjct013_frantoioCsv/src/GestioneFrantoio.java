import java.util.ArrayList;
import java.util.Calendar;

public class GestioneFrantoio {
    public static void main(String[] args) {
        FrantoioCsv gestioneFile = new FrantoioCsv();

        String data = "16/11/2002";
        Calendar calendar = CalendarUtility.stringToCalendar(data, CalendarUtility.dfDay);


        Oliva o = new Oliva("oliva1" , ColoreOliva.VERDE , MaturazioneOliva.MATURA, calendar);
        ArrayList<Oliva> Olive = new ArrayList<>();
        Olive.add(o);
        gestioneFile.scriviFile(Olive);
    }
}
