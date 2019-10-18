package view;

import controller.ProductController;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Chuong trinh quan ly san pham");
        ProductController productController = new ProductController();
        int choice;
        do{
            menu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    List<Product> productList =productController.getProduct();
                    for(Product product:productList){
                        System.out.println(" id: " + product.getId() +
                                " , name: " + product.getName() +
                                " , price: " + product.getPrice());
                    }
                    break;

                case 2:
                    System.out.println("Add product: ");
                    Product productObject = inputProduct();
                    productController.addProduct(productObject);
                    break;

                case 3:
                    System.out.println("Edit product: ");
                    System.out.println("Nhap index: ");
                    Scanner input = new Scanner(System.in);
                    int index =input.nextInt();
                    Product productObject2 = inputProduct();
                    productController.editProduct(index,productObject2);
                    break;

                case 4:
                    System.out.println("Delete product: ");
                    System.out.println("Nhap index: ");
                    Scanner input1 = new Scanner(System.in);
                    int index1= input1.nextInt();
                    productController.deleteProduct(index1);
                    break;

                case 5:
                    System.out.println("Search product: ");
                    System.out.println("Nhap name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Product: "+ productController.searchProduct(name));
                    break;
            }


        }while (choice!=0);
    }
    private static Product inputProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("nhap name: ");
        String name = input.nextLine();
        System.out.println(" nhap price: ");
        Double price= input.nextDouble();
        Product product = new Product(id,name,price);
        return product;
    }

    private static void menu() {
        System.out.println("1: Hien thi danh sach san pham");
        System.out.println("2: Them moi san pham ");
        System.out.println("3: Chinh sua san pham ");
        System.out.println("4: Xoa san pham");
        System.out.println("5: Tim kiem san pham");
        System.out.println("0: Thoat");
        System.out.println(" Chon chuc nang: ");
    }
}
