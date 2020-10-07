package committeeDeliveryMechanism.view;

public class CommitteeInfoDTO {

    private  long committeeId;
    private  String committeeNameAr;
    private  String committeeNameEn;



    public CommitteeInfoDTO(long committeeId, String committeeNameAr, String committeeNameEn) {
        this.committeeId = committeeId;
        this.committeeNameAr = committeeNameAr;
        this.committeeNameEn = committeeNameEn;

    }

    public CommitteeInfoDTO() {
        this.committeeId = 0;
        this.committeeNameAr = null;
        this.committeeNameEn = null;
    }

    // Settings and gettings
    public String getCommitteeNameAr() {
        return committeeNameAr;
    }

    public String getCommitteeNameEn() {
        return committeeNameEn;
    }

    public long getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(long committeeId)
    {
        this.committeeId = committeeId;
    }

    public void setCommitteeNameAr(String committeeNameAr)
    {
        this.committeeNameAr = committeeNameAr;
    }

    public void setCommitteeNameEn(String committeeNameEn)
    {
        this.committeeNameEn = committeeNameEn;
    }   

    @Override
    public String toString() {
        return "ModuleInfoDTO [committeeId="+ committeeId + ",committeeNameAr="
                + committeeNameAr + ", committeeNameEn=" + committeeNameEn + "]";
    }


}
