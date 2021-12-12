package bootdemo.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="userId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	
	@Column(name="firstname")
	@NotNull
	private String firstname;
	
	@Column(name="lastname")
	@NotNull
	private String lastname;
	
	@Column(name="email")
	@NotNull
	private String email;
	
	@Column(name="username")
	@NotNull
	@Size(min=4, max=16)
	private String username;
	
	@Column(name="password")
	private String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="user_subscriptions",
		joinColumns=@JoinColumn(name="user1_id"),
		inverseJoinColumns=@JoinColumn(name="user2_id")
	)
	@JsonIgnore
	private Set<User> userSubscriptions;
	
	public User() {
		super();
	}

	public User(Integer userId, String firstname, String lastname, String email, String username, String password,
			Set<User> userSubscriptions) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.userSubscriptions = userSubscriptions;
	}
	
	public User(Integer userId, String firstname, String lastname, String email, String username, String password) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<User> getUserSubscriptions() {
		return userSubscriptions;
	}

	public void setUserSubscriptions(Set<User> userSubscriptions) {
		this.userSubscriptions = userSubscriptions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userSubscriptions == null) ? 0 : userSubscriptions.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userSubscriptions == null) {
			if (other.userSubscriptions != null)
				return false;
		} else if (!userSubscriptions.equals(other.userSubscriptions))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", userSubscriptions=" + userSubscriptions
				+ "]";
	}
	
	

}
