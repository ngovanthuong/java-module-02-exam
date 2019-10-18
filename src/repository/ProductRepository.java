package repository;

import model.Product;

import java.util.List;

public interface ProductRepository extends GeneralRepository<Product> {
    void add(Product product);
    void edit(int id,Product product);
    void delete(int id);
    Product search(String name);

}
