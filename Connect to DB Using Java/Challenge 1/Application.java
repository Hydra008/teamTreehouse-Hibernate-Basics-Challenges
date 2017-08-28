// Load class "org.sqlite.JDBC"
Class.forName("org.sqlite.JDBC");
// Establish connection to database named "treehouse.db"
try(Connection c = DriverManager.getConnection("jdbc:sqlite:treehouse.db")) {
  
      
} catch(SQLException ex) {
      
}
