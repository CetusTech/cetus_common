package co.com.cetus.common.dto;

import java.io.Serializable;


public class ResponseWSDTO implements Serializable {
  private static final long serialVersionUID = 1L;
  private String   status;
  private String   code;
  private String   message;
  private String   type;
  protected String dataResponseXML;
  
  public String getStatus () {
    return status;
  }
  
  public void setStatus ( String status ) {
    this.status = status;
  }
  
  public String getCode () {
    return code;
  }
  
  public void setCode ( String code ) {
    this.code = code;
  }
  
  public String getMessage () {
    return message;
  }
  
  public void setMessage ( String message ) {
    this.message = message;
  }
  
  public String getType () {
    return type;
  }
  
  public void setType ( String type ) {
    this.type = type;
  }
  
  public String getDataResponseXML () {
    return dataResponseXML;
  }
  
  public void setDataResponseXML ( String dataResponseXML ) {
    this.dataResponseXML = dataResponseXML;
  }
  
  @Override
  public String toString () {
    return "ResponseWSDTO [status=" + status + ", code=" + code + ", message=" + message + ", type=" + type + ", dataResponseXML=" + dataResponseXML + "]";
  }
  
}
