package brillio.Exam_Project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.java.agent.dao.AgentDao;
import com.java.agent.model.Agent;
import com.java.agent.model.Gender;

public class AgentDaoImpTest {
	
	@Mock
	private AgentDao agDaoMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSearchAgent() throws ClassNotFoundException, SQLException {
		Agent a1 = null;
		Agent a2 = new Agent (100,"Ash","Mysore",Gender.MALE,0,87987.88);
		when(agDaoMock.searchAgent(100)).thenReturn(a2);
		when(agDaoMock.searchAgent(-1)).thenReturn(a1);
		
		assertNull(agDaoMock.searchAgent(-1));
		assertEquals(a2, agDaoMock.searchAgent(100));
		assertNotNull(agDaoMock.searchAgent(100));
	}
	
	@Test
	public void testShowAgent() {
		List<Agent> agList =  Arrays.asList(
				new Agent(11, "Venki", "Bangalore", Gender.MALE, 0, 786896),
				new Agent(12, "Manjunath","Hassan",Gender.MALE,1,78902)
				);
	}

}
