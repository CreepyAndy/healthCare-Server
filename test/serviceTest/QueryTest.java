package serviceTest;

import org.junit.Test;

import com.xia.model.BasicIndex;
import com.xia.model.Employee;
import com.xia.services.QueryInfoImpl;

public class QueryTest {
	@Test
	public void testUpdateBasicInfoById(){
		QueryInfoImpl qService = new QueryInfoImpl();
		//System.out.println(qService.updateBasicIndexById("1","85","172","97","69"));
		qService.updateBasicIndexById("105","90","182","95","65");
	}
	@Test
	public void testQueryBasicIndexById(){
		QueryInfoImpl qService = new QueryInfoImpl();
		BasicIndex b = qService.queryBasicIndexById("1");
		System.out.println(b.getHeartRate());
	}
	
}
