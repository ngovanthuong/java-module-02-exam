package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductServiceImpl();

    public List<Product> getProduct(){
        List<Product> ProductList = productService.findAllHaveBusiness();
        if(ProductList.size()<=0){
            System.out.println(" khong co san pham nao");
        }
        return ProductList;
    }

    public void addProduct(Product product){
        productService.addHaveBusiness(product);
    }
    public  void editProduct(int id,Product product){
        productService.editHaveBusiness(id, product);
    }
    public void deleteProduct(int id){
        productService.deleteHaveBusiness(id);
    }
    public Product searchProduct(String name){
      return productService.search(name);
    }

}
