// Clase que será utilizada para devolver los tokens
/** 
#   Clase LPPToken
#   Contiene los métodos para la gestión básica de tokens
#
# @author       Jose Alvarez Morales
# @version      v2.2
# @Date         20200522
# IMPLEMENTED:  si es token COMENTARIO, no muestra el lexema (contenido del comentario)(lin.36&37)
#
**/
public class LPPToken {
 
  String _token;
  String _lexema;
 
  public String getLexema(){
    return this._lexema;
  }
 
  public String getToken(){
    return this._token;
  }
 
  LPPToken (String lexema, String token){
    this._lexema = lexema;
    this._token = token;
  }
 
  public String toString(){
    if (this._token == "ERROR LEXICO")
      return this._token + " " + "\"" + this._lexema + "\"";
    else if (this._token == "PALABRA RESERVADA")
      return "Encontrado " +this._token + " " + "\"" + this._lexema.toUpperCase() + "\"";
      //return "Encontrado " +this._token + " " + "\"" + this._lexema + "\"";
    else if (this._token == "COMENTARIO")
      return "Encontrado " +this._token;
    else
      return "Encontrado " +this._token + " " + "\"" + this._lexema + "\"";
  }
}