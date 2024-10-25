package com.stjean.TPTESTU1_YoumbiYvan;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;
    private double balancePersonnel;
    public static List<User> users = new ArrayList<>();

    public User(int id, String name, int age, String email, String phone, String city, double balancePersonnel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.balancePersonnel = balancePersonnel;
    }

    public void add(User user) {
        if (!validateEmail(user.email)) {
            throw new EmailInvalidException("Invalid email");
        }
        users.add(user);
    }

    // Revised delete method
    public void delete(int id) {
        User userToDelete = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
        if (userToDelete == null) {
            throw new DeletionInvalidException("User not found");
        }
        users.remove(userToDelete);
    }

    public List<User> list() {
        return users;
    }

    public User display(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    private boolean validateEmail(String email) {
        return email.contains("@");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public double getBalancePersonnel() { return balancePersonnel; }
    public void setBalancePersonnel(double balancePersonnel) { this.balancePersonnel = balancePersonnel; }

    public static List<User> getUsers() { return users; }
    public static void setUsers(List<User> users) { User.users = users; }
}
