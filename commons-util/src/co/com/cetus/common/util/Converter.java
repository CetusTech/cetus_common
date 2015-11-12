package co.com.cetus.common.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class Converter.
 * 
 * @author Jose David Salcedo Mandon - Cetus Technology
 * @version ManagementQuipusEJB (18/08/2012)
 */
public class Converter {
  
  /** The Constant PEFIX_METHOD_GETTER. */
  private final static String PEFIX_METHOD_GETTER    = "get";
  
  /** The Constant PEFIX_METHOD_SETTER. */
  private final static String PEFIX_METHOD_SETTER    = "set";
  
  /** The Constant PEFIX_METHOD_GETTER_IS. */
  private final static String PEFIX_METHOD_GETTER_IS = "is";
  
  /** The Constant RETURN_VOID. */
  private final static String RETURN_VOID            = "void";
  
  /** The TYP e_ dat a_ java. */
  private static String[]     TYPE_DATA_JAVA         = null;
  
  /** The Constant TYPE_DATA_LIST. */
  private final static String TYPE_DATA_LIST         = "java.util.List";
  
  /** The Constant STRING_DTO. */
  private final static String STRING_DTO             = "DTO";
  
  /** The Constant PACKAGE_CLASS_DTO. */
  private static String       PACKAGE_CLASS_DTO      = null;
  
  /** The Constant PACKAGE_CLASS_ENTITY. */
  private static String       PACKAGE_CLASS_ENTITY   = null;
  
  static {
    TYPE_DATA_JAVA = new String[]{ "java.lang.String", "java.lang.Double",
      "java.lang.Boolean", "java.lang.Byte", "java.lang.Float",
      "java.lang.Integer", "java.util.Date", "java.util.List",
      "java.util.ArrayList", "java.util.Calendar", "int", "double",
      "float", "byte", "boolean", "long", "short", "[B", "[C", "I", "java.math.BigDecimal" };
  }
  
  /**
   * </p> Instancia un nuevo converter. </p>
   *
   * @param pACKAGE_CLASS_DTO the p ackag e_ clas s_ dto
   * @param pACKAGE_CLASS_ENTITY the p ackag e_ clas s_ entity
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (24/01/2013)
   */
  public Converter ( String pACKAGE_CLASS_DTO, String pACKAGE_CLASS_ENTITY ) {
    PACKAGE_CLASS_DTO = pACKAGE_CLASS_DTO;
    PACKAGE_CLASS_ENTITY = pACKAGE_CLASS_ENTITY;
  }
  
  /**
   * </p> Convert dto to entity. </p>
   *
   * @param <T> the generic type
   * @param dto the dto
   * @param entity the entity
   * @param pEntityT the p entity t
   * @throws Exception the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (18/08/2012)
   */
  private < T > void convertDtoToEntity ( T dto, T entity, T pEntityT ) throws Exception {
    Method[] methodsDto = null;
    Method[] methodsEntity = null;
    String nameAttribute = null;
    Object value = null;
    Class< ? > classEntity = null;
    Object entityAux = null;
    List< T > list = null;
    String nameEntT = null;
    String nameEnt = null;
    boolean convert = false;
    try {
      if ( dto != null && entity != null ) {
        methodsDto = dto.getClass().getDeclaredMethods();
        methodsEntity = entity.getClass().getDeclaredMethods();
        
        if ( methodsDto != null && methodsEntity != null ) {
          for ( Method metDto: methodsDto ) {
            if ( isMethodGetter( metDto ) ) {
              nameAttribute = getNameAttribute( metDto.getName() );
              for ( Method metEntity: methodsEntity ) {
                if ( metEntity.getName().equals( PEFIX_METHOD_SETTER + nameAttribute ) ) {
                  if ( isObjetDTO( metDto ) ) {
                    value = metDto.invoke( dto, new Object[]{} );
                    if ( value != null ) {
                      convert = false;
                      if ( pEntityT == null ) {
                    	  convert = true;
                      } else {
                        nameEntT = PACKAGE_CLASS_DTO + pEntityT.getClass().getSimpleName() + STRING_DTO;
                        nameEnt = ( String ) metDto.getReturnType().getCanonicalName();
                        if ( nameEnt.equals( nameEntT ) ) {
                          metEntity.invoke( entity, pEntityT );
                        }else{
                        	convert = true;
                        }
                      }
                      if( convert ){
                    	  classEntity = metEntity.getParameterTypes()[0];
                          entityAux = classEntity.newInstance();
                          convertDtoToEntity( value, entityAux, entity );
                          metEntity.invoke( entity, entityAux );
                      }
                    }
                  } else {
                    if ( metDto.getReturnType().getName().equals( TYPE_DATA_LIST ) ) {
                      list = convertListDTOToEntity( metDto.invoke( dto, new Object[]{} ), entity );
                      metEntity.invoke( entity, list );
                    } else {
                      value = metDto.invoke( dto, new Object[]{} );
                      metEntity.invoke( entity, value );
                    }
                  }
                  break;
                }
              }
            }
            
          }
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
  }
  
  /**
   * </p> Convert dto to entity. </p>
   *
   * @param <T> the generic type
   * @param dto the dto
   * @param entity the entity
   * @throws Exception the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (22/01/2013)
   */
  public < T > void convertDtoToEntity ( T dto, T entity ) throws Exception {
    this.convertDtoToEntity( dto, entity, null );
  }
  
  /**
   * </p> Convert entity to dto. </p>
   *
   * @param <T> the generic type
   * @param entity the entity
   * @param dto the dto
   * @param pDtoT the p dto t
   * @param fetchTypeEager the fetch type eager
   * @throws Exception the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (18/08/2012)
   */
  private < T > void convertEntityToDto ( T entity, T dto, T pDtoT, boolean fetchTypeEager  ) throws Exception {
    Method[] methodsDto = null;
    Method[] methodsEntity = null;
    String nameAttribute = null;
    Object value = null;
    Class< ? > classDto = null;
    Object dtoAux = null;
//    List< T > list = null;
    String nameDtoT = null;
    String nameDto = null;
    boolean convert = false;
    try {
      if ( dto != null && entity != null ) {
        methodsDto = dto.getClass().getDeclaredMethods();
        methodsEntity = entity.getClass().getDeclaredMethods();
        if ( methodsDto != null && methodsEntity != null ) {
          for ( Method metEntity: methodsEntity ) {
            if ( isMethodGetter( metEntity ) ) {
              nameAttribute = getNameAttribute( metEntity.getName() );
              for ( Method metDto: methodsDto ) {
                if ( metDto.getName().equals( PEFIX_METHOD_SETTER + nameAttribute ) ) {
                  if ( isObjetJava( metEntity ) ) {
                    if ( metEntity.getReturnType().getName().equals( TYPE_DATA_LIST ) ) {
                      if(fetchTypeEager){
//                        list = convertListEntityToDTO( metEntity.invoke( entity, new Object[]{} ), dto, fetchTypeEager );
//                        metDto.invoke( dto, list );
                      }
                    } else {
                      value = metEntity.invoke( entity, new Object[]{} );
                      metDto.invoke( dto, value );
                    }
                  } else {
                    value = metEntity.invoke( entity, new Object[]{} );
                    if ( value != null ) {
                      convert = false;
                      if ( pDtoT == null ) {
                        convert = true;
                      } else {
                        nameDtoT = PACKAGE_CLASS_ENTITY + pDtoT.getClass().getSimpleName().substring( 0, pDtoT.getClass().getSimpleName().indexOf( STRING_DTO ) );
                        nameDto = ( String ) metEntity.getReturnType().getCanonicalName();
                        if ( nameDto.equals( nameDtoT ) ) {
                          metDto.invoke( dto, pDtoT );
                        }else{
                          convert = true;
                        }
                      }
                      
                      if( convert ){
                        classDto = metDto.getParameterTypes()[0];
                        dtoAux = classDto.newInstance();
                        convertEntityToDto( value, dtoAux, dto, fetchTypeEager );
                        metDto.invoke( dto, dtoAux );
                      }
                    }
                  }
                  break;
                }
              }
            }
            
          }
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
  }
  
  /**
   * </p> Convert entity to dto. </p>
   *
   * @param <T> the generic type
   * @param entity the entity
   * @param dto the dto
   * @param fetchTypeEager the fetch type eager
   * @throws Exception the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (24/01/2013)
   */
  public < T > void convertEntityToDto ( T entity, T dto, boolean fetchTypeEager ) throws Exception {
    this.convertEntityToDto( entity, dto, null, fetchTypeEager );
  }
  
  /**
   * </p> Verifica si es method getter. </p>
   * 
   * @param method
   *            the method
   * @return true, if is method getter
   * @throws Exception
   *             the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (18/08/2012)
   */
  private static boolean isMethodGetter ( Method method ) throws Exception {
    String nameMethod = null;
    try {
      if ( method != null ) {
        nameMethod = method.getName();
        if ( nameMethod.startsWith( PEFIX_METHOD_GETTER )
             || nameMethod.startsWith( PEFIX_METHOD_GETTER_IS ) ) {
          if ( !method.getGenericReturnType().equals( RETURN_VOID )
               && method.getParameterTypes().length == 0
               && method.getModifiers() == 1 ) {
            return true;
          }
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return false;
  }
  
  /**
   * </p> Obtiene el name attribute. </p>
   * 
   * @param nameMethod
   *            the name method
   * @return the name attribute
   * @throws Exception
   *             the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (18/08/2012)
   */
  private static String getNameAttribute ( String nameMethod ) throws Exception {
    try {
      if ( nameMethod != null && !nameMethod.isEmpty() ) {
        if ( nameMethod.startsWith( PEFIX_METHOD_GETTER ) ) {
          return nameMethod.substring( 3, nameMethod.length() );
        } else if ( nameMethod.startsWith( PEFIX_METHOD_GETTER_IS ) ) {
          return nameMethod.substring( 2, nameMethod.length() );
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return null;
  }
  
  /**
   * </p> Verifica si es objet dto. </p>
   * 
   * @param metDto
   *            the met dto
   * @return true, if is objet dto
   * @throws Exception
   *             the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (18/08/2012)
   */
  private static boolean isObjetDTO ( Method metDto ) throws Exception {
    try {
      if ( metDto != null ) {
        if ( metDto.getReturnType() != null
             && metDto.getReturnType().getSimpleName() != null
             && metDto.getReturnType().getSimpleName().endsWith( STRING_DTO ) ) {
          return true;
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return false;
  }
  
  /**
   * </p> Verifica si es objet java. </p>
   * 
   * @param method
   *            the method
   * @return true, if is objet java
   * @throws Exception
   *             the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (18/08/2012)
   */
  private static boolean isObjetJava ( Method method ) throws Exception {
    try {
      if ( method != null ) {
        if ( method.getReturnType() != null
             && method.getReturnType().getName() != null ) {
          for ( String string: TYPE_DATA_JAVA ) {
            if ( method.getReturnType().getName().equals( string ) ) return true;
          }
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return false;
  }
  
  /**
   * </p> Convert list entity to dto. </p>
   *
   * @param <T> the generic type
   * @param listEntity the list entity
   * @param pDtoT the p dto t
   * @param fetchTypeEager the fetch type eager
   * @return el list
   * @throws Exception the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (28/08/2012)
   */
  @SuppressWarnings ( { "unchecked", "unused" } )
  private < T > List< T > convertListEntityToDTO ( Object listEntity, T pDtoT, boolean fetchTypeEager ) throws Exception {
    List< T > listDTO = null;
    Class< ? > dto = null;
    T dtoT = null;
    try {
      if ( listEntity != null ) {
        listDTO = new ArrayList< T >();
        for ( Object object: ( List< ? > ) listEntity ) {
          if ( isObjetJava( object ) ) {
            return ( List< T > ) listEntity;
          } else {
            dto = Class.forName( PACKAGE_CLASS_DTO + object.getClass().getSimpleName() + STRING_DTO );
            dtoT = ( T ) dto.newInstance();
            convertEntityToDto( object, dtoT, pDtoT, fetchTypeEager );
            listDTO.add( ( T ) dtoT );
          }
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return listDTO;
  }
  
  /**
   * </p> Verifica si es objet java. </p>
   * 
   * @param object
   *            the object
   * @return true, if is objet java
   * @throws Exception
   *             the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (28/08/2012)
   */
  private static boolean isObjetJava ( Object object ) throws Exception {
    try {
      if ( object != null ) {
        for ( String string: TYPE_DATA_JAVA ) {
          if ( object.getClass().getName().equals( string ) ) return true;
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return false;
  }
  
  /**
   * </p> Convert list dto to entity. </p>
   *
   * @param <T> the generic type
   * @param listDto the list dto
   * @param pEntityT the p entity t
   * @return el list
   * @throws Exception the exception
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since ManagementQuipusEJB (28/08/2012)
   */
  @SuppressWarnings ( "unchecked" )
  private < T > List< T > convertListDTOToEntity ( Object listDto, T pEntityT ) throws Exception {
    List< T > listEntity = null;
    Class< ? > entity = null;
    String nameEntity = null;
    T entityT = null;
    try {
      if ( listDto != null ) {
        listEntity = new ArrayList< T >();
        for ( Object object: ( List< ? > ) listDto ) {
          if ( isObjetJava( object ) ) {
            return ( List< T > ) listDto;
          } else {
            nameEntity = object.getClass().getSimpleName().substring( 0, object.getClass().getSimpleName().indexOf( STRING_DTO ) );
            entity = Class.forName( PACKAGE_CLASS_ENTITY + nameEntity );
            entityT = ( T ) entity.newInstance();
            convertDtoToEntity( object, entityT, pEntityT );
            listEntity.add( ( T ) entityT );
          }
        }
      }
    } catch ( Exception e ) {
      throw e;
    }
    return listEntity;
  }
  
}
