package part2.generics.miniProject.dao;

import java.util.List;

public interface UserDAO<T> extends BaseDAO<T> {

    void saveUser(T t);

    List<T> getUsers();
}
