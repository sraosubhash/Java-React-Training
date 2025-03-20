package brillio.Exam_Project;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.java.agent.dao.AgentDao;
import com.java.agent.dao.AgentDaoImp;

public class AgentDaoTest {
	
	AgentDao agDao;
	
	@Before
	public void setUp() {
		agDao = new AgentDaoImp();
	}
	
	@Test
	public void testShowAgent () throws ClassNotFoundException, SQLException {
		assertEquals(5, agDao.showAgent().size());
	}
	
	@Test
	public void testSearchAgent() throws ClassNotFoundException, SQLException {
		assertEquals(2, agDao.searchAgent(2).getAgentid());
	}
		

}
