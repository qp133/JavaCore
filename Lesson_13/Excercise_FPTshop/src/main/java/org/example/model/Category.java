package org.example.model;

public enum Category {
    PHONE("Điện thoại"),
    LAPTOP("Laptop"),
    APPLE("Apple"),
    ACCESSORIES("Phụ kiện");

    private String value;

    Category(String value) {
        this.value = value;
    }

    Category() {
    }

    //Dùng để lấy ra giá trị đặc biệt (value)
    public String getValue() {
        return value;
    }
}
