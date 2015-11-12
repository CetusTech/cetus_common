package co.com.cetus.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class CuentaUsuarioPortalDTO.
 *
 * @author Jose David Salcedo Mandon - Cetus Technology
 * @version common-util (11/03/2012)
 */
public class AccountUserPortalDTO implements Serializable {
  
  private static final long serialVersionUID = 1L;
  private String            id;
  private Date              fechaCreacion;
  private String            usuarioCreacion;
  private String            usuarioPortal;
  private String            descripcionUsuaPortal;
  private String            estadoUsuaPortal;
  private String            cuentaUsuario;
  private String            descripcionCuenUsua;
  private String            estadoCuenUsua;
  private String            usuarioGeneral;
  private String            nombreUsuaGeneral;
  private String            descripcionUsuaGeneral;
  private String            estadoUsuaGeneral;
  
  public String getId ()
  {
    return this.id;
  }
  
  public void setId ( String id ) {
    this.id = id;
  }
  
  public Date getFechaCreacion () {
    return this.fechaCreacion;
  }
  
  public void setFechaCreacion ( Date fechaCreacion ) {
    this.fechaCreacion = fechaCreacion;
  }
  
  public String getUsuarioCreacion () {
    return this.usuarioCreacion;
  }
  
  public void setUsuarioCreacion ( String usuarioCreacion ) {
    this.usuarioCreacion = usuarioCreacion;
  }
  
  public String getUsuarioPortal () {
    return this.usuarioPortal;
  }
  
  public void setUsuarioPortal ( String usuarioPortal ) {
    this.usuarioPortal = usuarioPortal;
  }
  
  public String getDescripcionUsuaPortal () {
    return this.descripcionUsuaPortal;
  }
  
  public void setDescripcionUsuaPortal ( String descripcionUsuaPortal ) {
    this.descripcionUsuaPortal = descripcionUsuaPortal;
  }
  
  public String getEstadoUsuaPortal () {
    return this.estadoUsuaPortal;
  }
  
  public void setEstadoUsuaPortal ( String estadoUsuaPortal ) {
    this.estadoUsuaPortal = estadoUsuaPortal;
  }
  
  public String getCuentaUsuario () {
    return this.cuentaUsuario;
  }
  
  public void setCuentaUsuario ( String cuentaUsuario ) {
    this.cuentaUsuario = cuentaUsuario;
  }
  
  public String getDescripcionCuenUsua () {
    return this.descripcionCuenUsua;
  }
  
  public void setDescripcionCuenUsua ( String descripcionCuenUsua ) {
    this.descripcionCuenUsua = descripcionCuenUsua;
  }
  
  public String getEstadoCuenUsua () {
    return this.estadoCuenUsua;
  }
  
  public void setEstadoCuenUsua ( String estadoCuenUsua ) {
    this.estadoCuenUsua = estadoCuenUsua;
  }
  
  public String getUsuarioGeneral () {
    return this.usuarioGeneral;
  }
  
  public void setUsuarioGeneral ( String usuarioGeneral ) {
    this.usuarioGeneral = usuarioGeneral;
  }
  
  public String getNombreUsuaGeneral () {
    return this.nombreUsuaGeneral;
  }
  
  public void setNombreUsuaGeneral ( String nombreUsuaGeneral ) {
    this.nombreUsuaGeneral = nombreUsuaGeneral;
  }
  
  public String getDescripcionUsuaGeneral () {
    return this.descripcionUsuaGeneral;
  }
  
  public void setDescripcionUsuaGeneral ( String descripcionUsuaGeneral ) {
    this.descripcionUsuaGeneral = descripcionUsuaGeneral;
  }
  
  public String getEstadoUsuaGeneral () {
    return this.estadoUsuaGeneral;
  }
  
  public void setEstadoUsuaGeneral ( String estadoUsuaGeneral ) {
    this.estadoUsuaGeneral = estadoUsuaGeneral;
  }
}