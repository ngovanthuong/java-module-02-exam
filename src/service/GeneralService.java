package service;

import model.Product;

import java.util.List;

public interface GeneralService<E> {

    List<E> findAllHaveBusiness();
    void addHaveBusiness(Product product);

    void editHaveBusiness(int id,Product product);
    void deleteHaveBusiness(int id);




}
