package devoxx;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceTest {

  private NullPointerDereference underTest = new NullPointerDereference();

  @Test
  public void shouldGetDogPaws() {
    assertEquals(underTest.getNumberOfPawsPlusOne("dog", "basset"), 4);
  }

  @Test(expected = NullPointerException.class)
  public void ignoredTestThatWouldCoverBug() {
    underTest.getNumberOfPawsPlusOne("", "");
  }
}
