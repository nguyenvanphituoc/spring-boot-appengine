package nguyenvanphituoc.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import nguyenvanphituoc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(final String username);

}
