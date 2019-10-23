package part2.generics.dan_task_s2.service;

import part2.generics.dan_task_s2.entity.BasicUser;

import java.util.ArrayList;

public interface UserHandle<T extends BasicUser> {
    public void Action();
    public void remove(int i);
    public void show(int i);
}
