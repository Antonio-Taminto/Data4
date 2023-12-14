import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import static java.util.Locale.ITALY;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataAggiornata = data.plusYears(1).minusMonths(1).plusDays(7);

        String dataString = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.SHORT).localizedBy(ITALY));
        String dataAggiornataString = dataAggiornata.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.SHORT).localizedBy(ITALY));

        System.out.println(dataString);
        System.out.println(dataAggiornataString);

    }
}