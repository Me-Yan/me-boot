package com.me.inner.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Me on 2019/4/4.
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 7661719210496660100L;

    private Integer id;
    private String username;
    private String age;
    private Integer sex;
    private String address;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
