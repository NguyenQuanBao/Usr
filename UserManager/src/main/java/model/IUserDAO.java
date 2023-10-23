package model;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    void insertUser(User user) throws SQLException;
    User seletUser(int id);
    List<User> selectAllUser();
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;

}
