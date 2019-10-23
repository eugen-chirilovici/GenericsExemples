package part2.generics.dan_task_s2.service;

import part2.generics.dan_task_s2.dao.UserDao;
import part2.generics.dan_task_s2.entity.BasicUser;

public class InternHandle<T extends BasicUser> implements UserHandle{
    UserDao<T> localUser = new UserDao<>();
    @Override
    public void Action() {
        System.out.println("does something on intern");
    }

    public void addFromIH(T user) {
        localUser.add(user);
    }

    public void remove(int i) {
        localUser.remove(i);
    }
    public void show(int i) {
        localUser.params(i);
    }
}
