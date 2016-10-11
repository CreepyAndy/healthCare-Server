package hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InitTest {
	private static SessionFactory sessionFactory;
	private Session s;
	@Test
	public void testSchemaExport(){
		new SchemaExport(new AnnotationConfiguration().configure()).create(false, true);	
	}
	
	
}
