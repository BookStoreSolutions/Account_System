package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistance.Membership;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "Membership", description = "A DTO represents the Membership")
public class MembershipDto implements Serializable {

    public MembershipDto() {
    }

    public MembershipDto(long membership_ID, String name_, String surname, int discovery_Miles) {
        this.membership_ID = membership_ID;
        this.name_ = name_;
        this.surname = surname;
        this.discovery_Miles = discovery_Miles;
    }

    public MembershipDto(Membership membership) {
        this.setMembership_ID(membership.getMembership_ID());
        this.setName_(membership.getName_());
        this.setSurname(membership.getSurname());
    }

    @ApiModelProperty(position = 1,
            value = "Account Type Mnemonic",
            name = "Mnemonic",
            notes = "Uniquely identifies the account type",
            dataType = "java.lang.String",
            example = "MILES",
            required = true)

    public long getMembership_ID() {return membership_ID;}

    public String getName_() {
        return name_;
    }

    public String getSurname() {
        return surname;
    }

    @ApiModelProperty(position = 2,
            value = "AccountType Name",
            name = "Name",
            notes = "Account Type Name:",
            dataType = "java.lang.String",
            example = "MILES",
            required = true)

    public void setMembership_ID(long membership_ID) {
        this.membership_ID = membership_ID;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @ApiModelProperty (position = 3,
            value = "AccountType Creation Date",
            name = "CreationDate",
            notes = "Creation Date of the Account type",
            dataType = "java.lang.String",
            example = "2021-09-01",
            allowableValues = "true")

    @JsonIgnore
    public Membership getDiscovery_Miles() {
        return new Membership(getMembership_ID(),getName_(),getSurname());
    }

    private long membership_ID;
    private String name_;
    private String surname;
    private int discovery_Miles;

}

