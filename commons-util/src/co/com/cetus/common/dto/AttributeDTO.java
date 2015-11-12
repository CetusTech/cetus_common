package co.com.cetus.common.dto;

import java.io.Serializable;

/**
 * The Class AtributoTO.
 *
 * @author Andres Herrera - Cetus Technology
 */
public class AttributeDTO implements Serializable {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1577429341349725866L;
  
  /** The nombre. */
  private String            nombre;
  
  /** The valor. */
  private Object            valor;
  
  /**
   * <p> Instancia un nuevo atributo to. </p>
   *
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public AttributeDTO () {
  }
  
  /**
   * <p> Instancia un nuevo atributo to. </p>
   *
   * @param pNombre the p nombre
   * @param pValor the p valor
   * @author Andres Herrera - Cetus Technology
   */
  public AttributeDTO ( String pNombre, Object pValor ) {
    this.nombre = pNombre;
    this.valor = pValor;
  }
  
  /**
   * <p> Obtiene el nombre. </p>
   *
   * @return the nombre
   * @author Andres Herrera - Cetus Technology
   */
  public String getNombre () {
    return nombre;
  }
  
  /**
   * <p> Asigna el nombre. </p>
   *
   * @param nombre the new nombre
   * @author Andres Herrera - Cetus Technology
   */
  public void setNombre ( String nombre ) {
    this.nombre = nombre;
  }
  
  /**
   * <p> Obtiene el valor. </p>
   *
   * @return the valor
   * @author Andres Herrera - Cetus Technology
   */
  public Object getValor () {
    return valor;
  }
  
  /**
   * <p> Asigna el valor. </p>
   *
   * @param valor the new valor
   * @author Andres Herrera - Cetus Technology
   */
  public void setValor ( Object valor ) {
    this.valor = valor;
  }
}
