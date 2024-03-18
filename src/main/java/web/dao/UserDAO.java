package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public interface UserDAO {
    List<User> getAllUsers();
    void addUser(User user);

    void updateUser(int id, User userUpdate);

    void deleteUser(int userid);

    User getUser(int userid);
}
