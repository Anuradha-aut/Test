/*
 * The programs are designed for PDC paper
 */
package PDC.E_OODesign;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quan Bai and Weihua Li
 * @Note Think about what is going to happen if the no-arg constructor is
 * removed
 */
public class E05_NoArgConstructor1 {

    public static void main(String args[]) {
        Member m1 = new Member("Quan", 30, "AUT");
        Member m2 = new Member("Leo", 30, "AUT");
        Member m3 = new Member("Yi", 30, "AUT");

        Organization org = new Organization("PDC Teaching Team", "AUT");
        org.getMemberList().add(m1);
        org.getMemberList().add(m2);
        org.getMemberList().add(m3);
    }
}

class Organization {

    private String orgName;
    private String orgAddress;
    private List<Member> memberList;

    //How about without this no-arg constructor? 
    public Organization() {
        this.orgName = "";
        this.orgAddress = "";
        this.memberList = new ArrayList<>();
    }

    public Organization(String orgName, String orgAddress) {
        //call the empty constructor, must be the first statement
        this();
        this.orgName = orgName;
        this.orgAddress = orgAddress;
    }

    /**
     * @return the orgName
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName the orgName to set
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return the orgAddress
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * @param orgAddress the orgAddress to set
     */
    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    /**
     * @return the memberList
     */
    public List<Member> getMemberList() {
        return memberList;
    }

    /**
     * @param memberList the memberList to set
     */
    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

}

class Member {

    private String memberName;
    private int memberAge;
    private String memberAddress;

    public Member() {
        this.memberAddress = "";
        this.memberAge = 0;
        this.memberName = "";
    }

    public Member(String memberName, int memberAge, String memberAddress) {
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberAddress = memberAddress;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * @return the memberAge
     */
    public int getMemberAge() {
        return memberAge;
    }

    /**
     * @param memberAge the memberAge to set
     */
    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    /**
     * @return the memberAddress
     */
    public String getMemberAddress() {
        return memberAddress;
    }

    /**
     * @param memberAddress the memberAddress to set
     */
    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }
}
