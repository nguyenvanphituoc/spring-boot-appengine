package nguyenvanphituoc.util;

import org.springframework.data.jpa.repository.JpaRepository;

import nguyenvanphituoc.model.User;
public interface  UserRepository extends JpaRepository<User, Long> {
 
    public User findbyUserName(String email);
}
