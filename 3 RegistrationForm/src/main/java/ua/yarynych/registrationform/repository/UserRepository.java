package ua.yarynych.registrationform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yarynych.registrationform.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
