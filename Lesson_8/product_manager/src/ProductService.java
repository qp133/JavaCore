import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1,"Bánh","Bánh ngọt",60,70000,"cái"));
        list.add(new Product(2,"Kẹo","Kẹo dẻo",2,10000,"cái"));
        list.add(new Product(3,"Sữa","Sữa tươi",4,60000,"hộp"));
        list.add(new Product(4,"Mỳ","Mỳ ăn liền",100,120000,"gói"));
        list.add(new Product(5,"Bút","Thiên Long",40,40000,"cái"));
        return list;
    }

    public void show(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public Product getProductByName(ArrayList<Product> list, String fName) {
        Product p = null;
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(fName.toLowerCase())) {
                p = product ;
            }
        }
        return p;
    }

    public Product getProductByID(ArrayList<Product> list, int id) {
        Product p = null;
        for (Product product : list) {
            if (product.getId() == id) {
                p = product;
            }
        }
        return p;
    }

    public void deleteProduct(ArrayList<Product> list, Product product) {
        if(list.remove(product)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    public void updateAmountProduct(Product product, int newAmount) {
        product.setAmount(newAmount);
    }

    public void getProductByAmount(ArrayList<Product> list, int amount) {
        for (Product p : list) {
            if(p.getAmount() < amount) {
                System.out.println(p);
            }
        }
    }

    public void getProductByPrice(ArrayList<Product> list, long minPrice, long maxPrice) {
        for (Product p : list) {
            if(p.getPrice() > minPrice && p.getPrice() <= maxPrice) {
                System.out.println(p);
            }
        }
    }
}
