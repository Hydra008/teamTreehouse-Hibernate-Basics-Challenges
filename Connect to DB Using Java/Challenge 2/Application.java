// Load class "org.sqlite.JDBC"
Class.forName("org.sqlite.JDBC");

// Establish connection to database named "treehouse.db"
try(Connection c = DriverManager.getConnection("jdbc:sqlite:treehouse.db") )
{
      //create Statement
      Statement statement = c.createStatement();
      //drop table if exists
      statement.executeUpdate( "DROP TABLE IF EXISTS languages");
      //Create tab;e
      statement.executeUpdate("CREATE TABLE languages (id INTEGER PRIMARY KEY, name STRING");
      //Insert into languages
      statement.executeUpdate("INSERT INTO languages (id, name) VALUES (2, 'Java')");
} 
catch(SQLException ex) 
{
      
}
