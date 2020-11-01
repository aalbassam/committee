package committeeDeliveryMechanism.view;

public class MemberDTO {

    private Long id;
    private Long memberNationalID;
    private Long formationNo;
    private Long roleId;
    private String joinDate;
    private String endDate;

    public MemberDTO(Long id, Long memberNationalID, Long formationNo, Long roleId, String joinDate, String endDate) {
        this.id = id;
        this.memberNationalID = memberNationalID;
        this.formationNo = formationNo;
        this.roleId = roleId;
        this.joinDate = joinDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberNationalID() {
        return memberNationalID;
    }

    public void setMemberNationalID(Long memberNationalID) {
        this.memberNationalID = memberNationalID;
    }

    public Long getFormationNo() {
        return formationNo;
    }

    public void setFormationNo(Long formationNo) {
        this.formationNo = formationNo;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
