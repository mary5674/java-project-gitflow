public class Saludo{
    public String generaSaludo(String nombre){
        if(nombre == null || nombre.isEmpty()){
            return "Hola, invitado!"
        }
        
        return "Hola, " + nombre + "!";
    }
}