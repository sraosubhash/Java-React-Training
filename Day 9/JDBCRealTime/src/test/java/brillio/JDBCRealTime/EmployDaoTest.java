package brillio.JDBCRealTime;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImp;

public class EmployDaoTest {
	
	EmployDao empDao;
	
	@Before
	public void setUp() {
		empDao = new EmployDaoImp();
	}
	
	@Test
	public void testShowEmploy () throws ClassNotFoundException, SQLException {
		assertEquals(8, empDao.showEmploy().size());
	}

}
