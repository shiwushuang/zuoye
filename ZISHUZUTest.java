package cl;
import static org.junit.Assert.*;
import org.junit.Test;
public class ZISHUZUTest {
	@Test
	public void a() {
		int[]a= {-1,-2,-3,-4};
		assertEquals(0,ZISHUZU.Max(a,a.length));
	}
	@Test
	public void b() {
		int[]a= {4,-3,1,3};
		assertEquals(5,ZISHUZU.Max(a,a.length));
	}
	@Test
	public void c() {
		int[]a= {1,2,3,4};
		assertEquals(10,ZISHUZU.Max(a, a.length));
	}
	@Test
	public void d() {
		int[]a= {-4,2,1,-1};
		assertEquals(3,ZISHUZU.Max(a,a.length));
	}
}