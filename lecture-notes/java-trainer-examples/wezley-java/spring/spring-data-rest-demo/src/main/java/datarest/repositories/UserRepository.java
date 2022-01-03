package datarest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import datarest.models.User;

@RestResource(path="users", rel="users")
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findUserByUsername(String username);
	public User findUserByEmail(String email);
	public User findUserByUsernameAndPassword(String username, String password);

}
