package com.example.animalsave.Model;

public class Users {
    private String name, phone, password, image, address;
    public Users()
    {

    }

    public Users(String name, String phone, String password, String image, String address) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.image = image;
        this.address = address;
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


    public String getPassword() {
        return password;
    }

}
