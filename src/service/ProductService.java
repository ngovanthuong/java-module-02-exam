package service;

import model.Product;

public interface ProductService extends GeneralService<Product> {
    Product search(String name);
}
