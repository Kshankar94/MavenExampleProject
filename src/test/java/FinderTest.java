
import org.junit.Test;

import static org.junit.Assert.*;


public class FinderTest {
    Finder finder = new Finder();
    Integer[] empty = {};
    Integer[] nullArr = null;
@Test
    public void findMaxWithValidArray(){
    Integer[] arr1 = {2,-1,-4,121112,5};
    Integer expected = 121112;
    Integer actual = finder.findMax(arr1);
    assertEquals(new Long(expected), new Long(actual));
}
    @Test
    public void findMinWithValidArray(){
    Integer[] arr2 = {54,12,11,578,32,-76544,5,1321,22,-89022};
    Integer expected = -89022;
    Integer actual = finder.findMin(arr2);
    assertEquals(new Long(expected), new Long(actual));
    }
    @Test
    public void findMaxWithNullArray(){
    Integer actual = finder.findMax(nullArr);
    assertNull(actual);
    }
    @Test
    public void findMinWithNullArray(){
    Integer actual = finder.findMin(nullArr);
    assertNull(actual);
    }
    @Test
    public void findMaxWithEmptyArray(){
    Integer actual = finder.findMax(empty);
    assertNull(actual);
    }
    @Test
    public void findMinWithEmptyArray(){
    Integer actual = finder.findMin(empty);
    assertNull(actual);
    }
}
