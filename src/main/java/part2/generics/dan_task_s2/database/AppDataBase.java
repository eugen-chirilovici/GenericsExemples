package part2.generics.dan_task_s2.database;

import part2.generics.dan_task_s2.entity.BasicUser;
import part2.generics.dan_task_s2.entity.Intern;

import java.util.ArrayList;

public class AppDataBase<T extends BasicUser> {
    private ArrayList<T> data = new ArrayList<>();

    public void addUser(T user) {
        data.add(user);
    }

    public Integer findUser(T user) {
        for (int i = 0; i < data.size(); i++) {
            if (user.equals(user)) {
                return i;
            }
        }
        return -1;
    }

    public void removeUser(int index) {
        data.remove(index);
    }

    public T getUser(int i) {
        return data.get(i);
    }

    public ArrayList<T> allUsers() {
        return data;
    }
}
