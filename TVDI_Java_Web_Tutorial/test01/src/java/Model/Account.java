package Model;

public class Account {

    private int uid;
    private String account;
    private String passWord;
    private String name;
    private String phone;
    private String address;
    private String email;

    public Account() {
    }

    public Account(int uid, String account, String passWord, String name, String phone, String address, String email) {
        this.uid = uid;
        this.account = account;
        this.passWord = passWord;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
