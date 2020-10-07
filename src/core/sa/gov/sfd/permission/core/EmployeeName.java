package sa.gov.sfd.permission.core;

public class EmployeeName {
    private final String arabicName;
    private final String englishName;
    private final String samAccount;

    public String getArabicName() {
        return arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getSamAccount() {
        return samAccount;
    }

    public EmployeeName(String arabicName, String englishName, String samAccount) {
        this.arabicName = arabicName;
        this.englishName = englishName;
        this.samAccount = samAccount;
    }

    
}