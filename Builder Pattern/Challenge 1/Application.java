import com.teamtreehouse.builder.Connection;
import com.teamtreehouse.builder.Connection.ConnectionBuilder;

public class Application {
  public static void main(String[] args) {
    // TODO: User the builder here instead
    Connection c = new ConnectionBuilder
      .withJdbcVendor("sqlite")
      .withDb("languages")
      .withUser("th_user","mysuperlongpassword")
      .build();
  }
}
