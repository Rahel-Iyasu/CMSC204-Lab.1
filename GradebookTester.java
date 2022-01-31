import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	GradeBook g1;
	GradeBook g2;
	@BeforeEach
	public void setUp() {
		g1 = new GradeBook(5);
		g2= new GradeBook(5);
		
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(85);
		g2.addScore(60);
	}

	@AfterEach
	public void tearDown() {
		g1=null; 
		g2 =null;
	}

	@Test
	public void testAddScore() {
		assertTrue((g1.toString()).equals("50.0 75.0 "));
		assertTrue((g2.toString()).equals("85.0 60.0 "));
		
		assertEquals(2,g1.getScoreSize(), 0.001);
		assertEquals(2,g2.getScoreSize(), 0.001);
		
	}
	@Test
	public void testSum() {
		assertEquals(125, g1.sum(), 0.0001);
		assertEquals(145, g2.sum(), 0.0001);
	}

	@Test
	public void testMinimum() {
		assertEquals (50, g1.minimum(), 0.001);
		assertEquals (60, g2.minimum(), 0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(75, g1.finalScore(), 0.001);
		assertEquals(85, g2.finalScore(), 0.001);
	}

	


}
