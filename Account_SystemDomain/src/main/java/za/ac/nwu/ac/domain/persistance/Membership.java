package za.ac.nwu.ac.domain.persistance;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "MEMBERSHIP")

public class Membership implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "MEMBERSHIP_ID")
    private long membership_ID;
    @Column(name = "NAME_")
    private String name_;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "DOB")
    private String DOB;
    @Column(name = "INSURANCE_PLAN")
    private String Insurance_Plan;
    @Column(name = "PHONE_NUMBER")
    private String Phone_number;
    @Column(name = "REWARDS_COUNT")
    private int rewards_Count;
    @Column(name = "DISCOVERY_MILES")
    private int discovery_Miles;

    @ManyToOne
    @JoinColumn(name = "account_type_id")
    private Membership membership;

    public Membership(long membership_id, String name_, String surname) {
    }

    public Membership(Long id, long membership_ID, String name_, String surname, String DOB, String insurance_Plan, String phone_number, int rewards_Count, int discovery_Miles) {
        this.id = id;
        this.membership_ID = membership_ID;
        this.name_ = name_;
        this.surname = surname;
        this.DOB = DOB;
        Insurance_Plan = insurance_Plan;
        Phone_number = phone_number;
        this.rewards_Count = rewards_Count;
        this.discovery_Miles = discovery_Miles;
    }

    public Membership(long membership_id, String name_, String surname, String dob, String insurance_plan, String phone_number, int rewards_count) {
    }

    public long getMembership_ID() {
        return membership_ID;
    }

    public void setMembership_ID(long membership_ID) {
        this.membership_ID = membership_ID;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getInsurance_Plan() {
        return Insurance_Plan;
    }

    public void setInsurance_Plan(String insurance_Plan) {
        Insurance_Plan = insurance_Plan;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public int getRewards_Count() {
        return rewards_Count;
    }

    public void setRewards_Count(int rewards_Count) {
        this.rewards_Count = rewards_Count;
    }

    public int getDiscovery_Miles() {
        return discovery_Miles;
    }

    public void setDiscovery_Miles(int discovery_Miles) {
        this.discovery_Miles = discovery_Miles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membership that = (Membership) o;
        return membership_ID == that.membership_ID && rewards_Count == that.rewards_Count && discovery_Miles == that.discovery_Miles && Objects.equals(id, that.id) && Objects.equals(name_, that.name_) && Objects.equals(surname, that.surname) && Objects.equals(DOB, that.DOB) && Objects.equals(Insurance_Plan, that.Insurance_Plan) && Objects.equals(Phone_number, that.Phone_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, membership_ID, name_, surname, DOB, Insurance_Plan, Phone_number, rewards_Count, discovery_Miles);
    }

    @Override
    public String toString() {
        return "Membership{" +
                "id=" + id +
                ", membership_ID=" + membership_ID +
                ", name_='" + name_ + '\'' +
                ", surname='" + surname + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Insurance_Plan='" + Insurance_Plan + '\'' +
                ", Phone_number='" + Phone_number + '\'' +
                ", rewards_Count=" + rewards_Count +
                ", discovery_Miles=" + discovery_Miles +
                '}';
    }
}
