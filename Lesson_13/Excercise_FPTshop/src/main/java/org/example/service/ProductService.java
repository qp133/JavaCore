package org.example.service;

import org.example.model.Category;
import org.example.model.Product;

import java.util.ArrayList;

public class ProductService{
    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Galaxy S22", "ssglxs22", 20000000, 20, 10,
                "Samsung", new Category[]{Category.PHONE}));
        list.add(new Product("Iphone 13", "ip13", 23000000, 30, 15,
                "Iphone", new Category[]{Category.PHONE}));
        list.add(new Product("Iphone 12", "ip12", 20000000, 15, 10,
                "Iphone", new Category[]{Category.PHONE}));
        list.add(new Product("P30", "hwp30", 16000000, 10, 5,
                "Huawei", new Category[]{Category.PHONE}));
        list.add(new Product("Note 20", "ssn20", 18000000, 50, 45,
                "Samsung", new Category[]{Category.PHONE}));

        list.add(new Product("Macbook Pro", "aMP", 35000000, 100, 30,
                "Apple", new Category[]{Category.LAPTOP}));
        list.add(new Product("Macbook Air", "aMA", 25000000, 70, 50,
                "Apple", new Category[]{Category.LAPTOP}));
        list.add(new Product("M4600", "dM4600", 18000000, 40, 25,
                "Dell", new Category[]{Category.LAPTOP}));
        list.add(new Product("Vivobook 15", "aV15", 15000000, 20, 10,
                "Asus", new Category[]{Category.LAPTOP}));
        list.add(new Product("XPS", "dXPS", 35000000, 200, 160,
                "Dell", new Category[]{Category.LAPTOP}));

        list.add(new Product("Tai nghe", "tainghe", 500000, 30, 15,
                "Apple", new Category[]{Category.ACCESSORIES}));
        list.add(new Product("Loa XBoomGo", "xboomgo", 1000000, 60, 45,
                "LG", new Category[]{Category.ACCESSORIES}));
        list.add(new Product("G102", "LG102", 500000, 200, 150,
                "Logitech", new Category[]{Category.ACCESSORIES}));
        list.add(new Product("Loa Marshall", "marshall", 20000000, 40, 10,
                "Marshall", new Category[]{Category.ACCESSORIES}));
        list.add(new Product("Bàn phím cơ", "banphimco", 1000000, 70, 60,
                "AKKO", new Category[]{Category.ACCESSORIES}));

        return list;
    }

    public void show(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p.getId() + " - " + p.getName() + " - " + printCategory(p.getCategories()));
        }
    }

    public String printCategory(Category[] categories) {
        for (Category c : categories) {
            return c.getValue();
        }
        return null;
    }

    public void showProductByCategory(ArrayList<Product> list, Category[] categories, Product product) {
        product.getCategories();
    }


}
