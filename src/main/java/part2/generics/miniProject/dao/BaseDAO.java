package part2.generics.miniProject.dao;


import java.util.List;

public interface BaseDAO<T> {

    T getById(Long id);
    List<T> getAll();
    void displayAll();
    void save(T t);
}

