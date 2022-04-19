package damvc.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import damvc.Dto.ProductsDto;
import damvc.Dto.ProductsDtoMapper;

@Repository
public class productsDao extends BaseDao {

	private StringBuffer sqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT p.id as id ");
		sql.append(",p.name ");
		sql.append(",p.id_type ");
		sql.append(",p.description ");
		sql.append(",p.unit_price ");
		sql.append(",p.promotion_price ");
		sql.append(",p.image ");
		sql.append(",p.unit ");
		sql.append(",p.neww ");
<<<<<<< HEAD:src/main/java/damvc/Dao/productsDao.java
		sql.append(",p.created_at ");
		sql.append(",P.updated_at ");
		sql.append("FROM products AS p ");
//		sql.append("LIMIT 9");
		return sql;
	}
	private String SqlProductsByID(int id) {
		StringBuffer sql = sqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id_type = " + id + " ");
=======
		sql.append("FROM products AS p");
>>>>>>> remotes/origin/cuong:src/main/java/damvc/Dao/ProductsDao.java
		return sql.toString();
	}
	
	

	public List<ProductsDto> getDataProducts() {
		String sql = sqlString().toString();
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}
	public List<ProductsDto> GetAllProductsByID(int id) {
		String sql = SqlProductsByID(id).toString();
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}
	private String SqlProductByID(int id) {
		StringBuffer sql = sqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = " + id + " ");
		
		return sql.toString();
	}
	public List<ProductsDto> GetProductByID(int id) {
		String sql = SqlProductByID(id);
		List<ProductsDto> listProduct = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProduct;
	}
	public ProductsDto FindProductByID(String id) {
		String sql = SqlProductByID(Integer.parseInt(id));
		ProductsDto Product = _jdbcTemplate.queryForObject(sql, new ProductsDtoMapper());
		return Product;
	}
}
