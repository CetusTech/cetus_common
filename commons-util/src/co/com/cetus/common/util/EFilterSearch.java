package co.com.cetus.common.util;

/**
 * The Enum EFilterSearch.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (14/05/2016)
 */
public enum EFilterSearch {
  
  FILTER1 ( "filter1" ),
  FILTER2 ( "filter2" ),
  FILTER3 ( "filter3" ),
  FILTER4 ( "filter4" ),
  FILTER5 ( "filter5" ),
  FILTER6 ( "filter6" ),
  FILTER7 ( "filter7" ),
  FILTER8 ( "filter8" ),
  FILTER9 ( "filter9" ),
  FILTER10 ( "filter10" );
  
  private String value;
  
  EFilterSearch ( String value ) {
    this.value = value;
  }
  
  /**
   * </p> Gets the filter search. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param value the value
   * @return el e filter search
   * @throws Exception the exception
   * @since commons-util (14/05/2016)
   */
  public static EFilterSearch getFilterSearch ( String value ) throws Exception {
    try {
      for ( EFilterSearch filter: EFilterSearch.values() ) {
        if ( filter.getValue().equals( value ) ) {
          return filter;
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return null;
  }
  
  public String getValue () {
    return value;
  }
  
  public void setValue ( String value ) {
    this.value = value;
  }
  
}
