package demo;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceTest {

  private NullPointerDereference underTest = new NullPointerDereference();

  @Test
  public void shouldGetDogPaws() {
    assertEquals(4, underTest.getNumberOfLegs("dog"));
  }

  @Test
  public void shouldGetFidoPaws() {
    assertEquals(3, underTest.getNumberOfLegs("Fido"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void ignoredTestThatWouldCoverBug() {
    underTest.getNumberOfLegs("");
  }
}
