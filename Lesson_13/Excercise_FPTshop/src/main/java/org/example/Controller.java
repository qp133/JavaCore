package org.example;

import org.example.model.Category;
import org.example.model.Product;
import org.example.service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.model.Category.PHONE;

public class Controller {
    ProductService service;
    ArrayList<Product> listProduct;
    Scanner sc;

    public Controller() {
        service = new ProductService();
        listProduct = service.getAllProduct();
        sc = new Scanner(System.in);
    }

    public void main() {
        while (true) {
            Util.menu();
            System.out.println("Lựa chọn của bạn là:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    categorySubMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void categorySubMenu() {
        Util.categorySubMenu();
        int categoryChoose = Integer.parseInt(sc.nextLine());
        switch (categoryChoose) {
            case 1:
                showProductByCategory(listProduct, new Category[]{PHONE});
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

    // In thông tin: duyệt toàn bộ mảng => sout(đối tượng)
    // Danh mục: duyệt mảng category => sout(đối tượng)
    public void showProductByCategory(ArrayList<Product> list, Category[] categories) {
        for (Product p : list) {
            for (Category c : p.getCategories()) {
                System.out.println(p);
            }
        }
    }
}
