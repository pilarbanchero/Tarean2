public class usuario{
    
    private String nombre;
    private String cedula;
    private String contrase�a;
    private int edad;
    private int cantidadDeHijos;
    private int saldo;
           
           
    public String getNombre(){
            return nombre;
        }
        
        public void setNombre(String unNombre){
            nombre=unNombre;
        }
        
        public String getCedula(){
            return cedula;
        }
        
        public void setCedula(String unaCedula){
           cedula=unaCedula;
        }
        
        public String getContrase�a(){
            return contrase�a;
        }
        
        public void setContrase�a(String unaContrase�a){
            contrase�a=unaContrase�a;
        }
        
        
        public int edad(){
            return edad;
        }
        
        public void setEdad(int unaEdad){
            edad=unaEdad;
        }

        public int cantidadDeHijos(){
            return cantidadDeHijos;
        }
        
        public void setCantidadDeHijos(int unaCantidadDeHijos){
            cantidadDeHijos=unaCantidadDeHijos;
        }
        
         public int saldo(){
            return saldo;
        }
        
        public void setSaldo(int unSaldo){
            saldo=unSaldo;
        }

        public usuario(String unNombre, String unaCedula, String unaContrase�a, int unaEdad,int unaCantidadDeHijos,int unSaldo ) {
          this.setNombre(unNombre);
          this.setCedula(unaCedula);
          this.setContrase�a(unaContrase�a);
          this.setEdad(unaEdad);
          this.setCantidadDeHijos(unaCantidadDeHijos);
          this.setSaldo(unSaldo);
          
        } 
   
}