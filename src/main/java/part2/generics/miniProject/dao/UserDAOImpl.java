package part2.generics.miniProject.dao;

import part2.generics.miniProject.db.MyDataBase;
import part2.generics.miniProject.entity.BaseUser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    //get all BaseUsers
    @Override
    public List<T> getAll() {
        return myDataBase.getUsers().stream()
                .filter(t -> t.getClass() == BaseUser.class)
                .collect(Collectors.toList());
    }

    //display all BaseUsers
    @Override
    public void displayAll() {
        List<T> allInterns = getAll();
        for (T intern : allInterns) {
            intern.toString();
        }
    }

    @Override
    public void save(T t) {
        myDataBase.addUser(t);
    }
}
