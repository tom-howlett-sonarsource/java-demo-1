package demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class NullPointerDereferenceTest {

  private NullPointerDereference underTest = new NullPointerDereference();

  @Test
  public void shouldGetDogPaws() {
    assertEquals(underTest.getNumberOfPawsPlusOne("dog"), 4);
  }

  @Test(expected = NullPointerException.class)
  public void ignoredTestThatWouldCoverBug() {
    underTest.getNumberOfPawsPlusOne("");
  }
}
