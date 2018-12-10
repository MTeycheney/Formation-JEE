package tpjava.tpjava51;

import org.junit.*;
import org.mockito.Mockito;

public class TestMain 
{
	
	private HttpDataService http;
	
	@Before
	public void before()
	{
		http = Mockito.mock(HttpDataService.class);
		Mockito.when(http.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Pro abortion is pro life and pro rights\"}");
				
	}
	
	@Test
	public void kapoueVrai()
	{
		
		MyIpService monip = new MyIpService(http);
		
		String varip =  monip.getMyIp();
		
		Assert.assertEquals("92.154.66.22", varip);  //   1/2 5/2  98/2  0.595229854982982
	}
	
	@Test
	public void kapoueFaux()
	{
		
		MyIpService monip = new MyIpService(http);
		
		String varip =  monip.getMyIp();
		
		Assert.assertNotEquals("92.154.66.23", varip); // Pour vérifier qu'ubn test renvoit une mauvaise valeur, on met NOT Equals.
	}
}
