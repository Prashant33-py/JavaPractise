package org.practise;

public record UserRecord(String id ,String name, String password) {
    public UserRecord() {
        this("1", "1", "1234");
    }
}
