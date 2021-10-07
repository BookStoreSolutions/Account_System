package za.ac.nwu.ac.domain.persistance;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "ACCOUNT_TRANSACTION")

public class AccountTransaction implements Serializable {
    @Id

    private Long id;

    @Column(name = "TRANSACTIONID")
    private long transactionID;
    @Column(name = "ACCOUNT_TYPE_ID")
    private long accountTypeId;
    @Column(name = "MEMBERSHIP_ID")
    private int membership_ID;
    @Column(name = "AMOUNT")
    private long amount;
    @Column(name = "TRANSACTIONDATE")
    private LocalDate transactionDate;

    @Column(name = "ACCOUNT_TYPE_NAME")
    private AccountType accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

public AccountTransaction() {
    }

    public AccountTransaction(AccountType accountType) {
        this.transactionID = transactionID;
        this.accountTypeId = accountTypeId;
        this.membership_ID = membership_ID;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return transactionID == that.transactionID && accountTypeId == that.accountTypeId && membership_ID == that.membership_ID && amount == that.amount && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID, accountTypeId, membership_ID, amount, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionID=" + transactionID +
                ", accountTypeId=" + accountTypeId +
                ", membership_ID=" + membership_ID +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public int getMembership_ID() {
        return membership_ID;
    }

    public void setMembership_ID(int membership_ID) {
        this.membership_ID = membership_ID;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public long calAddMiles(Long amount)
    {
        amount =+ getAmount();

        return amount;
    }

    public long calMinusMiles(long amount)
    {
        amount =- getAmount();

        return amount;
    }
}
