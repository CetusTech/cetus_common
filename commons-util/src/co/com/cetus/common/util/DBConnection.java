package co.com.cetus.common.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.jdbc.Work;

/**
 * The Class DBConnection.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (16/03/2016)
 */
public class DBConnection implements Work {
  
  private Connection conn;
  
  @Override
  public void execute ( Connection arg0 ) throws SQLException {
    this.conn = arg0;
  }
  
  public Connection getConnection () {
    return conn;
  }
  
}
