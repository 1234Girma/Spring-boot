package SpringBoot.SpringBootApplication;
import java.util.Optional;

import SpringBoot.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
   // Optional<Account> findByAccountUsername(String username);

	Account save(Account account);
	
}