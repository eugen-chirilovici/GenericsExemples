package part2.generics.dan_task_s2.service;

import part2.generics.dan_task_s2.dao.UserDao;
import part2.generics.dan_task_s2.entity.BasicUser;

public class EmployeeHandle<T extends BasicUser> implements UserHandle{
    UserDao<T> localUserDao = new UserDao<>();
    public void Action() {
        System.out.println("does something with employee");
    }

    public void addFromEH(T user) {
        localUserDao.add(user);
    }

    public void remove(int i) {
        localUserDao.remove(i);
    }

    public void show(int i) {
        localUserDao.params(i);
    }
}
