package damvc.Service.User;

import damvc.Entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	
	public Users CheckAccount(Users user);
}
