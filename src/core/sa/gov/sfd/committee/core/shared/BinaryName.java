package sa.gov.sfd.committee.core.shared;

public class BinaryName {

    private final String arabicName;
    private final String englishName;

    public BinaryName(String arabicName, String englishName) {
        this.arabicName = arabicName;
        this.englishName = englishName;
    }

    public String getArabicName() {
        return arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }
}
