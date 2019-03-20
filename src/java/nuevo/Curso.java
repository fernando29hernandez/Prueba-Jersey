/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fernando
 */
@XmlRootElement
public class Curso {
    public String cod;
    public String nombre;
    public Curso(){
        this.cod = "";
        this.nombre = "";
    }
    public Curso(String cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }


    
}
