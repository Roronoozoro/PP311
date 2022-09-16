package web.pp311.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.pp311.dao.UserDAO;
import web.pp311.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDAO userDAO;
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Transactional
    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }
@Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }
@Transactional
    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }
@Transactional
    @Override
    public User getById(Long id) {
        return userDAO.getById(id);
    }
}