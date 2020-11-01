package sa.gov.sfd.committee.core.shared;

public class RowStatus {

    private final char status;

    public RowStatus(char status) {
        /*
            A: active row
            D: deleted row
        */
        if (String.valueOf(status).charAt(0) != 'A' || String.valueOf(status).charAt(0) != 'D') {
            throw new IllegalArgumentException("This is not a row status! ");
        }

        this.status = status;

    }

    public RowStatus() {
        this.status = ' ';
    }

    public char getStatus() {
        return status;
    }
}
