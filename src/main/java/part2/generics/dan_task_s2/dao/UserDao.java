package part2.generics.dan_task_s2.dao;

import part2.generics.dan_task_s2.database.AppDataBase;
import part2.generics.dan_task_s2.entity.BasicUser;

public class UserDao<T extends BasicUser> implements BasicDao {
    private AppDataBase<T> localDB = new AppDataBase<>();

    @Override
    public BasicUser GetUser(int i) {
        return localDB.getUser(i);
    }

    public void add(T user) {
        localDB.addUser(user);
    }

    public void remove(int i) {
        localDB.removeUser(i);
    }

    public void params(int i) {
        System.out.println(localDB.allUsers().get(i).getName());
    }
}
