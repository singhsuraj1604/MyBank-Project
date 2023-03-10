package com.MyBank.MyBank.dto;

public class UsersAccountDetails {
    private long accountno;
    private String name;
    private int age;
    private String address;

    private long mobileno;
    private String password;
    public String getName() {
        return name;
    }

    public UsersAccountDetails setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UsersAccountDetails setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UsersAccountDetails setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getMobileno() {
        return mobileno;
    }

    public UsersAccountDetails setMobileno(long mobileno) {
        this.mobileno = mobileno;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsersAccountDetails setPassword(String password) {
        this.password = password;
        return this;
    }

    public long getAccountno() {
        return accountno;
    }

    public UsersAccountDetails setAccountno(long accountno) {
        this.accountno = accountno;
        return this;
    }
}
