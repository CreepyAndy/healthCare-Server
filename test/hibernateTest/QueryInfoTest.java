package hibernateTest;

import java.util.List;

import org.junit.Test;

import com.xia.model.*;
import com.xia.services.QueryInfoImpl;
import com.xia.services.VerifyInterfaceImpl;

public class QueryInfoTest {
	@Test
	public void testQueryPersonalInfoById(){
		QueryInfoImpl qInfo = new QueryInfoImpl();
		List<Employee> e = qInfo.queryPersonalInfoById();
		for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i).getName().toString());			
		}
	}
	
	
}
