package stirling.software.enterprise.security.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stirling.software.enterprise.security.model.PersistentLogin;

@Repository
public interface PersistentLoginRepository extends JpaRepository<PersistentLogin, String> {
    void deleteByUsername(String username);
}
