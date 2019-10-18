package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl  implements ProductService {
    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAllHaveBusiness() {
        return productRepository.findAll();
    }

    @Override
    public void addHaveBusiness(Product product) {
        productRepository.add(product);

    }

    @Override
    public void editHaveBusiness(int id, Product product) {
        productRepository.edit(id, product);

    }

    @Override
    public void deleteHaveBusiness(int id) {
        productRepository.delete(id);

    }


    @Override
    public Product search(String  name) {
        return productRepository.search(name);
    }
}
