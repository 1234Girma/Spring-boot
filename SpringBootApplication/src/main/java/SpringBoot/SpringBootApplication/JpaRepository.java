package SpringBoot.SpringBootApplication;

import SpringBoot.entity.Account;

public interface JpaRepository<T1, T2> {
	Account save(Account account);
}
