package com.example.ecommerce.Model;

public class Users
{
    private String name, phone, password, Image, address;

    public Users()
    {

    }

    public Users(String name, String phone, String password, String image, String address) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.Image = image;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
