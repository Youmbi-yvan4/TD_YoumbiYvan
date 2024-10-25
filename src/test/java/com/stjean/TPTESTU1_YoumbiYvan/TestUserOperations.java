package com.stjean.TPTESTU1_YoumbiYvan;

import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestUserOperations {
    @Test
    public void testAddUser() {
        User user = new User(1, "John", 30, "john@example.com", "1234567890", "New York", 100.0);
        user.add(user);
        assertEquals(1, User.users.size());
    }

    @Test
    public void testInvalidEmail() {
        User user = new User(2, "Jane", 25, "janeexample.com", "0987654321", "Los Angeles", 200.0);
        assertThrows(EmailInvalidException.class, () -> {
            user.add(user);
        });
    }

    @Test
    public void testDeleteUser() {
        User user = new User(1, "John", 30, "john@example.com", "1234567890", "New York", 100.0);
        user.add(user);
        user.delete(1);
        assertEquals(0, User.users.size());
    }

    @Test
    public void testDeleteNonExistentUser() {
        assertThrows(DeletionInvalidException.class, () -> {
            User user = new User(1, "John", 30, "john@example.com", "1234567890", "New York", 100.0);
            user.delete(1);
        });
    }
}

