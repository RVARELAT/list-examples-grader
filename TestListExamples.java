import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

//this error is ok for now
class NewStringChecker implements StringChecker {
  //@Override
  public boolean checkString(String h) {
    if (h.contains("H")) {
      return true;
    }
    return false;
  }

}

public class TestListExamples {

  @Test 
	public void filter() {
        //StringChecker sc = new StringChecker();
        StringChecker hsc = new NewStringChecker();
        List<String> testing = new ArrayList<>();
        List<String> result = new ArrayList<>();

        testing.add("Hello");
        result.add("Hello");

        testing.add("Hey");
        result.add("Hey");

        testing.add("Hi");
        result.add("Hi");

        testing.add("Yes");
        
        List<String> filteredList = ListExamples.filter(testing, hsc);
        assertEquals(result, filteredList);
	}

  @Test
  public void merge() {
    //lists for testing
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();

    list1.add("Hello");
    list1.add("Nice");
    list2.add("To");
    list2.add("Meet");
    list2.add("You!");

    //the result we expect
    List<String> mergedList = new ArrayList<>();

    mergedList.add("Hello");
    mergedList.add("Nice");
    mergedList.add("To");
    mergedList.add("Meet");
    mergedList.add("You!");

    List<String> actualMergedList = ListExamples.merge(list1, list2);
    assertEquals(mergedList, actualMergedList);
  }

  @Test 
	public void filterComplicated() {
        //StringChecker sc = new StringChecker();
        StringChecker hsc = new NewStringChecker();
        List<String> testing = new ArrayList<>();
        List<String> result = new ArrayList<>();

        testing.add("saraH");
        result.add("saraH");

        testing.add("oH");
        result.add("oH");

        testing.add("otHer");
        result.add("otHer");

        //dont want lowercase h
        testing.add("hi");
        
        List<String> filteredList = ListExamples.filter(testing, hsc);
        assertEquals(result, filteredList);
	}
}
