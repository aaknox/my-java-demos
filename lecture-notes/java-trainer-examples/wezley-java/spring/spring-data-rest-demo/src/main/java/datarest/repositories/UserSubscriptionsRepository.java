package datarest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import datarest.models.User;

@RestResource(path="subscriptions", rel="subscriptions")
public interface UserSubscriptionsRepository extends JpaRepository<User, Long>{

}
