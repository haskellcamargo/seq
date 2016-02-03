
import lambda.Action;
import lambda.Function;

public class SeqTest {
  public static void main(String[] args) {
    Seq<Boolean> names = new Seq<>(true, true, false, null)
        .compact();
    
    System.out.println(names.toArrayList());
  }
}
