package TDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveCharacterTest {
	@Test
	public void test1() {
		RemoveCharacter rc=new RemoveCharacter();
		assertEquals("BCD",rc.RCString("ABCD"));
	}
	@Test
	public void test2() {
		RemoveCharacter rc=new RemoveCharacter();
		assertEquals("CD",rc.RCString("AACD"));
	}
	@Test
	public void test3() {
		RemoveCharacter rc=new RemoveCharacter();
		assertEquals("BCD",rc.RCString("BACD"));
	}
	@Test
	public void test4() {
		RemoveCharacter rc=new RemoveCharacter();
		assertEquals("BBAA",rc.RCString("BBAA"));
	}
	@Test
	public void test5() {
		RemoveCharacter rc=new RemoveCharacter();
		assertEquals("BAA",rc.RCString("AABAA"));
	}
	@Test
	public void test6() {
		RemoveCharacter rc=new RemoveCharacter();
		assertEquals("AAA",rc.RCString("AAAAA"));
	}
}
