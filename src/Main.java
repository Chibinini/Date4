import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data =OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime aggiungiAnno = data.plusYears(1);
        OffsetDateTime sottraiUnMese = data.minusMonths(1);
        OffsetDateTime aggiungiSetteGiorni = data.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.ITALIAN);

        String risultatoAggiungiAnno = aggiungiAnno.format(formatter);
        String risultatoSottraiUnMese = sottraiUnMese.format(formatter);
        String risultatoAggiungiSetteGiorni = aggiungiSetteGiorni.format(formatter);


        System.out.println("Data : "+ data.format(formatter));
        System.out.println("Data più 1 anno :" + risultatoAggiungiAnno );
        System.out.println("Data meno 1 mese : " + risultatoSottraiUnMese);
        System.out.println("Data più sette giorni : " + risultatoAggiungiSetteGiorni);
    }
}


//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia