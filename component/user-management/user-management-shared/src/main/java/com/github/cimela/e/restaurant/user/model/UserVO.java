package com.github.cimela.e.restaurant.user.model;

import com.github.cimela.e.restaurant.base.model.GenericModelVO;

public class UserVO extends GenericModelVO<User> {

    private String username;
    private String firstName;
    private String lastName;

    public UserVO() {
        super(User.class);
    }

    public UserVO(User sample, String... excludeAttrs) {
        super(sample, User.class, excludeAttrs);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
