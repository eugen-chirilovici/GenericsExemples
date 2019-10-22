package part2.generics.miniProject.service;

import part2.generics.miniProject.dao.BaseDAO;
import part2.generics.miniProject.dao.UserDAO;
import part2.generics.miniProject.dao.UserDAOImpl;
import part2.generics.miniProject.entity.BaseUser;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDAO<BaseUser> userDAO = new UserDAOImpl();

    @Override
    public void saveUsers(List<BaseUser> listOfUsers) {
        for (BaseUser user : listOfUsers) {
            userDAO.save(user);
        }
    }

    @Override
    public List<BaseUser> getListOfUsers() {
        return userDAO.getUsers();
    }

    @Override
    public BaseUser getUserById(long l) {
        return userDAO.getById(l);
    }
}
