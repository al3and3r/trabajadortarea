

public class trabajador
{
 private String nombre;
 private String vestimenta;
 private int edad ;
 private String profesion;
 
 public trabajador (String nobre,String vestimenta,int edad,String profesion ){
    
     this.nombre=nombre;
     this.vestimenta=vestimenta;
     this.edad=edad;
     this.profesion=profesion;
     }
 public trabajador (){  
   nombre="mateo";
   vestimenta= "oberon";
   edad = 25;
   profesion="plomero";  
 }
 public String saludar ( ){
    String saludo;
    saludo = "buenos dias";
    return saludo;
 }
   public void main(String args[] ){
   system.out.println( " haz instalado la ducha");
   
 }
 public String getNombre(){
    return nombre;
 }  
   public String getVestimenta(){
    return vestimenta;
 }
 public int getEdad(){
    return edad;
 } 
 public String getProfesion(){
    return profesion;
 }
 
 
 public void setNombre(String nombre){
    this.nombre=nombre;
 }
 public void setVestimenta(String vestimenta){
    this.vestimenta=vestimenta;
 }
 public void setEdad(int edad){
    this.edad;
 }
 public void setProfesion(String profesion){
    this.prodesion;
 }
 
 
 }

   
   

