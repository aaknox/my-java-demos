package bootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bootdemo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findUserByUsername(String username);
	public User findUserByEmail(String email);
	public User findUserByUsernameAndPassword(String username, String password);

}
