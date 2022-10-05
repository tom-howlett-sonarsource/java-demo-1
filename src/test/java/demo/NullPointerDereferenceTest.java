package demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class NullPointerDereferenceTest {

  private NullPointerDereference underTest = new NullPointerDereference();

  @Test
  @Disabled
  public void shouldGetDogPaws() {
    assertEquals(underTest.getNumberOfPawsPlusOne("dog"), 5);
  }

  @Test
  @Disabled
  public void ignoredTestThatWouldCoverBug() {
    underTest.getNumberOfPawsPlusOne("");
  }
}
