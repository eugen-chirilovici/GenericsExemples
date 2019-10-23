package part2.generics.dan_task_s2.dao;

import part2.generics.dan_task_s2.entity.BasicUser;

public interface BasicDao<T extends BasicUser> {
    public T GetUser(int i);
}
