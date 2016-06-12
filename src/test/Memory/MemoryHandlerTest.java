package test.Memory;

import static org.junit.Assert.*;

import main.Memory.*;

import org.junit.Before;
import org.junit.Test;

public class MemoryHandlerTest {
	
	public static void main(String[] args) {
		System.out.println(I1.C.i);
	}

	@Before
	public void setUp() throws Exception {
		MemoryHandler memHandle;
	}

	@Test
	public final void testFreeMemory() {
		
			System.out.println(MemoryHandler.freeMemory());
			assertTrue(1024000000>MemoryHandler.freeMemory());
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testTotalMemory() {
		System.out.println(MemoryHandler.totalMemory());// TODO
	}

	@Test
	public final void testToLog() {
		System.gc();
		System.out.println(MemoryHandler.toLog());
		System.out.println(Runtime.getRuntime().maxMemory());
	}

}
