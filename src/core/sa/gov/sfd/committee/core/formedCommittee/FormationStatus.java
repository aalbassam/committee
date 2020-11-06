package sa.gov.sfd.committee.core.formedCommittee;

public class FormationStatus {

    private enum Status {

        INITIAL("IN"),
        PROGRESS("PR"),
        APPROVED("AP"),
        DECLINED("DE");

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private final Status formedCommitteeStatus;

    public FormationStatus(String status) {

        switch (status) {

            case "PR":
                this.formedCommitteeStatus = Status.PROGRESS;
                break;

            case "AP":
                this.formedCommitteeStatus = Status.APPROVED;
                break;

            case "DE":
                this.formedCommitteeStatus = Status.DECLINED;
                break;

            default:
                this.formedCommitteeStatus = Status.INITIAL;
        }
    }

    public Status getFormedCommitteeStatus() {
        return formedCommitteeStatus;
    }

    public String getValue() {
        return formedCommitteeStatus.getValue();
    }
}
