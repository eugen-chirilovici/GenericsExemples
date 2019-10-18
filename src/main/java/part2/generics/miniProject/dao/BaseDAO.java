package part2.generics.miniProject.dao;


public interface BaseDAO<T> {

    T getById(Long id);

}

