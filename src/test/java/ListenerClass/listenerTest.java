package ListenerClass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.listener.class)

public class listenerTest {
  @Test
  public void test() {
		System.out.println("This is the Test() method");
	}
	@Test
	public void test1() {
		System.out.println("This is the Test1() method");
	}
}
