import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class NewStringChecker implements StringChecker {
  @Override
  public boolean CheckString(String s) {
    if (s.contains("H")) {
      return true;
    }
    return false;
  }

}

public class TestListExamples {

  @Test 
	public void filter() {
        //StringChecker sc = new StringChecker();
        List<String> result = new ArrayList<>();
        List<String> testing = new ArrayList<>();

        testing.add("Hello");
        result.add("Hello");
        testing.add("Hey");
        result.add("Hey");
        testing.add("Hi");
        result.add("Hi");
        testing.add("Yes");
	}
}
