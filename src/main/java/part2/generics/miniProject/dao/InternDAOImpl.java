package part2.generics.miniProject.dao;

import part2.generics.miniProject.db.MyDataBase;
import part2.generics.miniProject.entity.BaseUser;
import part2.generics.miniProject.entity.Employee;
import part2.generics.miniProject.entity.Intern;

import java.util.List;
import java.util.stream.Collectors;

public class InternDAOImpl<T extends BaseUser> implements InternDAO<T> {

    MyDataBase<T> myDataBase = new MyDataBase<>();

    @Override
    public void saveIntern(T t) {
        myDataBase.addUser(t);
    }

    @Override
    public List<T> getInterns() {
        return myDataBase.getUsers().stream()
                .filter(t -> t.getClass() == Intern.class)
                .collect(Collectors.toList());
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

    //get all Interns
    @Override
    public List<T> getAll() {
        return myDataBase.getUsers().stream()
                .filter(t -> t.getClass() == Intern.class)
                .collect(Collectors.toList());
    }

    //display all interns
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
