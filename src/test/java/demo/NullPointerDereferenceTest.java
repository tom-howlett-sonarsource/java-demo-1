package demo;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceTest {

  private NullPointerDereference underTest = new NullPointerDereference();

  @Test
  public void shouldGetDogPaws() {
    assertEquals(4, underTest.getNumberOfLegsPlusOne("dog"));
  }

  @Test
  public void shouldGetPirateLegs() {
    assertEquals(1, underTest.getNumberOfLegsPlusOne("pirate"));
  }

  @Test(expected = NullPointerException.class)
  public void ignoredTestThatWouldCoverBug() {
    underTest.getNumberOfLegsPlusOne("");
  }
}
