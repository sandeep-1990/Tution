package co.in.bean;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class UserVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @SerializedName(value = "name")
    public String name;
    @SerializedName(value = "address")
    public String address;



    public UserVo(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


}