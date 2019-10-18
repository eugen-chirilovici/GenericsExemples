package part2.generics.miniProject.dao;

import part2.generics.miniProject.db.MyDataBase;
import part2.generics.miniProject.entity.BaseUser;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl<T extends BaseUser> implements UserDAO<T> {

    MyDataBase<T> myDataBase = new MyDataBase<>();

    @Override
    public void saveUser(T t) {
        myDataBase.addUser(t);
    }

    @Override
    public List<T> getUsers() {
        return new ArrayList<>(myDataBase.getUsers());
    }

    @Override
    public T getById(Long id) {
        for (BaseUser baseUser : myDataBase.getUsers()) {
            if (baseUser.getId().equals(id)) {
                return (T) baseUser;
            }
        }
        return null;
    }
}
