package bootdemo.services;

import java.util.List;

import bootdemo.models.User;

public interface UserService {
	
	List<User> findAllUsers();
	User findUserById(int id) throws Exception;
	User findUserByUsername(String username);
	User findUserByEmail(String email);
	User addUser(User newUser);
	User updateUserById(User u);
	int deleteUser(int id);
	User loginUser(User u);

}
