package repository;
import model.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    List<Product> productList = new ArrayList<>();

    {
        Product product1 = new Product(1, "sam sung", 100d);
        Product product2 = new Product(2, "apple", 200d);
        Product product3 = new Product(3, "nokia", 200d);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        productList.set(id, product);
    }

    @Override
    public void delete(int id) {
        productList.remove(id);
    }

    @Override
    public Product search(String name) {
      for (Product product : productList){
          boolean check=product.getName().equals(name);
          if (check){
              return product;
          }
      }
        return null;
    }



    @Override
    public List<Product> findAll() {
        return productList;
    }
}
