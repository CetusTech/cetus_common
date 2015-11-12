package co.com.cetus.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * The Class DateUtility.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (7/07/2015)
 */
public class DateUtility {
  
  /**
   * </p> Conver date to xml gregorian calendar. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param pFecha the p fecha
   * @return el XML gregorian calendar
   * @throws DatatypeConfigurationException the datatype configuration exception
   * @since commons-util (7/07/2015)
   */
  public static XMLGregorianCalendar converDateToXMLGregorianCalendar ( Date pFecha ) throws DatatypeConfigurationException {
    GregorianCalendar c = null;
    XMLGregorianCalendar xmlGregorianCalendar = null;
    
    try {
      c = new GregorianCalendar();
      c.setTime( pFecha );
      xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar( c );
    } catch ( DatatypeConfigurationException e ) {
      throw e;
    }
    return xmlGregorianCalendar;
  }
  
  /**
   * </p> Format date pattern. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param date the date
   * @param pattern the pattern
   * @return el string
   * @since commons-util (7/07/2015)
   */
  public static String formatDatePattern ( Date date, String pattern ) throws Exception {
    try {
      SimpleDateFormat formatter = new SimpleDateFormat( pattern );
      String formattedDate = formatter.format( date );
      return formattedDate;
    } catch ( Exception e ) {
      throw e;
    }
  }
  
  /**
   * </p> Format date pattern. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param dateStr the date str
   * @param pattern the pattern
   * @return el date
   * @throws Exception the exception
   * @since commons-util (8/07/2015)
   */
  public static Date parseDatePattern ( String dateStr, String pattern ) throws Exception {
    try {
      SimpleDateFormat formatter = new SimpleDateFormat( pattern );
      Date date = formatter.parse(dateStr);
      return date;
    } catch ( Exception e ) {
      throw e;
    }
  }
  
}
