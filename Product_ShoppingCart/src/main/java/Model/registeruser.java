package Model;

import java.util.Objects;

public class registeruser {
    private  String name;
    private String mobile;
    private  String password;
    private String email;
    private  address address;
    private int id=1;

    public registeruser(String name, String mobile, String password, String email, Model.address address) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.email = email;
        this.address = address;
        this.id=id++;
    }

    public registeruser() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof registeruser)) return false;
        registeruser that = (registeruser) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getMobile(), that.getMobile()) &&
                Objects.equals(getPassword(), that.getPassword()) &&
                Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getAddress(), that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMobile(), getPassword(), getEmail(), getAddress(), getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Model.address getAddress() {
        return address;
    }

    public void setAddress(Model.address address) {
        this.address = address;
    }
}
