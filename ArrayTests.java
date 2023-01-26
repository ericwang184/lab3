import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 1, 2, 3 };
    int[] input2 = {2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1, 3 }, input1);
    assertArrayEquals(new int[] {2}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {2};
    int[] input3 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[] {2}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[] {4, 3, 2, 1}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { };
    double[] input2 = {2};
    double[] input3 = {1, 2, 3, 4};
    double[] input4 = {4, 3, 2, 1};
    double[] input5 = {9, 5, 7, 3};
    double[] input6 = {1, 2, 1, 3, 1, 4, 1, 5};
    double[] input7 = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2), 0.0001);
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input3), 0.0001);
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input4), 0.0001);
    assertEquals(7.0, ArrayExamples.averageWithoutLowest(input5), 0.0001);
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input6), 0.0001);
    assertEquals(7.0, ArrayExamples.averageWithoutLowest(input7), 0.0001);
  }
}
