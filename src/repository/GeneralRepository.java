package repository;

import model.Product;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();



}
