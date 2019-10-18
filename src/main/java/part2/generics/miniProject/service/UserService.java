package part2.generics.miniProject.service;

import part2.generics.miniProject.entity.BaseUser;

import java.util.List;

public interface UserService {
    void saveUsers(List<BaseUser> listOfUsers);

    List<BaseUser> getListOfUsers();

    BaseUser getUserById(long l);
}
