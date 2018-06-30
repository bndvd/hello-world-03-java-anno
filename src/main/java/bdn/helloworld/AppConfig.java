package bdn.helloworld;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"bdn.helloworld"})
public class AppConfig {

	/*@Bean(name = "accountRepository")
	public AccountRepository getAccountRepository() {
		return new AccountRepositoryImpl();
	}
	
	@Bean(name = "accountService")
	public AccountService getAccountService() {
		AccountService _svc = new AccountServiceImpl(getAccountRepository());
		return _svc;
	}*/
	
}
