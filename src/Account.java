import java.util.Random;

public  class Account {

    private String name;
    private long accNo;
    private long mobilNo;
    private String acc_type;
    private long balance;

    public Account() {
        this.name = name;
        this.accNo = accNo;
        this.mobilNo = mobilNo;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    public Account(String name, long accNo, long mobilNo, String acc_type, long balance) {
        this.name = name;
        this.accNo = accNo;
        this.mobilNo = mobilNo;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {

        this.accNo = accNo;
    }

    public long getMobilNo() {
        return mobilNo;
    }

    public void setMobilNo(long mobilNo) {
        this.mobilNo = mobilNo;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}