package sa.gov.sfd.committee.core.shared;

import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.chrono.HijrahEra;
import java.time.format.DateTimeFormatter;

public class BinaryDate {

    private final String hijri;
    private final LocalDate gregorian;

    public BinaryDate(String hijri, LocalDate gregorian) {

        this.hijri = hijri;
        this.gregorian = gregorian;
    }

    public BinaryDate(String hijri) {
        this.hijri = hijri; // "1440-10-17";

        HijrahDate dateResult;
        String[] array = hijri.split("-");

        int day = Integer.parseInt(array[2]);
        int month = Integer.parseInt(array[1]);
        int year = Integer.parseInt(array[0]);

        dateResult = HijrahChronology.INSTANCE.date(HijrahEra.AH, year, month, day); // لتحويل من هجري إلى ميلادي*

        this.gregorian = LocalDate.from(dateResult);

    }

    public BinaryDate(LocalDate gregorian) {
        this.gregorian = gregorian;

        HijrahDate hijriDate = HijrahDate.from(gregorian);

        this.hijri = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(hijriDate);
    }


    public String getHijri() {
        return hijri;
    }

    public LocalDate getGregorian() {
        return gregorian;
    }
}
