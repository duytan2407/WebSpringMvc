package damvc.Dao;

import org.springframework.stereotype.Repository;

import damvc.Entity.MapperUsers;
import damvc.Entity.Users;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
@Repository
public class UsersDao extends BaseDao{
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	public int AddAccount(Users user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO users ");
		sql.append("( ");
		sql.append("    full_name, ");
		sql.append("    email, ");
		sql.append("    password, ");
		sql.append("    phone, ");
		sql.append("    address, ");
		sql.append("    remember_token, ");
		sql.append("    created_at, ");
		sql.append("    updated_at ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+user.getFull_name()+"', ");
		sql.append("    '"+user.getEmail()+"', ");
		sql.append("    '"+user.getPassword()+"', ");
		sql.append("    '"+user.getPhone()+"', ");
		sql.append("    '"+user.getAddress()+"', ");
		sql.append("    '"+user.getRemember_token()+"', ");
		sql.append("    '"+sdf.format(date)+"', ");
		sql.append("    '"+sdf.format(date)+"' ");
		sql.append(")");
		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};
	
	public Users GetUserByAcc(Users user) {
		String sql = "SELECT * FROM users WHERE email = '"+user.getEmail()+"'";		
		Users result = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return result;
	};
}
