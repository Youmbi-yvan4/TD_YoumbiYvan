package com.stjean.TPTESTU1_YoumbiYvan;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;
    private double balancePersonnel;
    public static ArrayList<User> users = new ArrayList<>();


    public User(int id, String name, int age, String email, String phone, String city, double balancePersonnel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.balancePersonnel = balancePersonnel;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBalancePersonnel() {
        return balancePersonnel;
    }

    public void setBalancePersonnel(double balancePersonnel) {
        this.balancePersonnel = balancePersonnel;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        User.users = users;
    }

    public void add(User user) {
        if (!validateEmail(user.email)) {
            throw new EmailInvalidException("Invalid email");
        }
        users.add(user);
    }

    public void delete(int id) {
        User user = users.stream().filter(u -> u.id == id).findFirst().orElse(null);
        if (user == null) {
            throw new DeletionInvalidException("User not found");
        }
        users.remove(user);
    }
    public double analyseSoldeGeneral() throws NegativeGeneralBalanceException {
        double generalBalance = users.stream().mapToDouble(User::getBalancePersonnel).sum();
        if (generalBalance < 0) {
            throw new NegativeGeneralBalanceException("Negative general balance");
        }
        return generalBalance;
    }

    public User richestUser() {
        return users.stream().max(Comparator.comparingDouble(User::getBalancePersonnel)).orElse(null);
    }


    public ArrayList<User> list() {
        return users;
    }

    public User display(int id) {
        return users.stream().filter(u -> u.id == id).findFirst().orElse(null);
    }

    private boolean validateEmail(String email) {
        return email.contains("@");
    }

    class NegativeGeneralBalanceException extends RuntimeException {
        public NegativeGeneralBalanceException(String message) {
            super(message);
        }
    }

}