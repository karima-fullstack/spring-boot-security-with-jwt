package web.karima.springsecuritywithjwt.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.karima.springsecuritywithjwt.Entities.Token;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    Optional<Token> findByToken(String token);
}
