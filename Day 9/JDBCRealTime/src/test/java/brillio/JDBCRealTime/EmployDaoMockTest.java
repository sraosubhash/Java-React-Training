package brillio.JDBCRealTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.model.gender;
import com.java.jdbc.model.Employ;

public class EmployDaoMockTest {
	
	@Mock
	private EmployDao empDaoMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void testSearchEmploy() throws ClassNotFoundException, SQLException{
		Employ e1 = null;
		Employ e2 = new Employ(100,"Anoop",gender.Male, "Java","Programmer",98761.23);
		when(empDaoMock.searchEmploy(100)).thenReturn(e2);
		when(empDaoMock.searchEmploy(-1)).thenReturn(e1);
		
		assertNull(empDaoMock.searchEmploy(-1));
		assertEquals(e2, empDaoMock.searchEmploy(100));
		assertNotNull(empDaoMock.searchEmploy(100));
		
	}
	
	@Test
	public void testShowEmploy() {
		List<Employ> empList = Arrays.asList(
				new Employ(1, "Anoop", gender.Male, "Java","Programmer", 88823.44),
				new Employ(2, "Manipal", gender.Male, "Mern","Programmer", 88323.44),
				new Employ(3, "Venki", gender.Male, "Java","Programmer", 89823.44)
				);
	}
	


}
