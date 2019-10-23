package part2.generics.miniProject.dao;

import part2.generics.miniProject.db.MyDataBase;
import part2.generics.miniProject.entity.BaseUser;
import part2.generics.miniProject.entity.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InternDAOImpl<T extends BaseUser> implements InternDAO<T> {

    MyDataBase<T> myDataBase = new MyDataBase<>();

    @Override
    public void saveIntern(T intern) {
        myDataBase.addUser(intern);
    }

    @Override
    public List<T> getInterns() {
//        List<T> interns = new ArrayList<>();
//        for (BaseUser user : myDataBase.getUsers()) {
//            if (user instanceof Intern) {
//                interns.add((T) user);
//            }
//        }
        return myDataBase.getUsers().stream().filter(t -> t.getClass() == Intern.class).collect(Collectors.toList());
    }


    @Override
    public T getById(Long id) {
        for (BaseUser baseUser : myDataBase.getUsers()) {
            if (baseUser.getId().equals(id))
                return (T) baseUser;
        }
        return null;
    }

    @Override
    public T getByName(String val) {

        for (BaseUser baseuser : myDataBase.getUsers()) {
            if (baseuser.getFirstName().equals(val))
                return (T) baseuser;
        }

        return null;
    }
}
