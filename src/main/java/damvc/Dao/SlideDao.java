package damvc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import damvc.Entity.MapperSlide;
import damvc.Entity.Slide;

@Repository
public class SlideDao extends BaseDao {

	public List<Slide> getDataSlide() {
		List<Slide> list = new ArrayList<Slide>();
		String sql = "SELECT * FROM slide";
		list = _jdbcTemplate.query(sql, new MapperSlide());
		return list;
	}

}
