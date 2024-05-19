package ma.fsm.hopital.security.repo;

import ma.fsm.hopital.security.entities.AppRole;
import ma.fsm.hopital.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
