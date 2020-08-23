package cn.first9.web.pipe.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TestVO {
    private String name;
    @JsonIgnore
    private String address;

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
