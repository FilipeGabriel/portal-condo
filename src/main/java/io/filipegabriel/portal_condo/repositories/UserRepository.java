package io.filipegabriel.portal_condo.repositories;

import io.filipegabriel.portal_condo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
