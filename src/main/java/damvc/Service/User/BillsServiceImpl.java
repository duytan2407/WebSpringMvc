//package damvc.Service.User;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import damvc.Dao.BillsDao;
//import damvc.Entity.BillDetail;
//import damvc.Entity.Bills;
//
//@Service
//public class BillsServiceImpl {
//	@Autowired
//	private BillsDao billsDao;
//	
//	public int AddBills(Bills bill) {
//		return billsDao.AddBills(bill);
//	}
//	public void AddBillsDetail(HashMap<Long, CartDto> carts) {
//		long idBills = billsDao.GetIDLastBills();
//		
//		for(Map.Entry<Long, CartDto> itemCart : carts.entrySet()) {
//			BillDetail billDetail = new BillDetail();
//			billDetail.setId(idBills);
//			billDetail.setId_product(itemCart.getValue().getProduct().getId_product());
//			billDetail.setQuantity(itemCart.getValue().getQuantity);
//			billDetail.setTotal(itemCart.getValue().getTotalPrice());
//			billsDao.AddBillsDetail(billDetail);
//		}
//	}
//}
