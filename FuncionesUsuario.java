
public class FuncionesUsuario {

    public int calculoImpuestos(int edad, int cantidadDeHijos) {
        int impuesto;

        if (edad < 18) {
            impuesto = 0;
        } else {
            if (edad <= 30 || edad > 65) {
                impuesto = 2000;
            } else {
                impuesto = 7000;
            }
            if (cantidadDeHijos >= 1) {
                int porcentaje = ((3 * impuesto) / 100 )* cantidadDeHijos;
                if (porcentaje * 2 <= impuesto) {
                    impuesto = impuesto - porcentaje;
                } else {
                    impuesto = impuesto / 2;
                }
            }
        }
        return impuesto;
    }
 
    public int cobroDeSueldo(int saldo, int cantidadServiciosLaborales){
        int sueldo= saldo + cantidadServiciosLaborales;
        return sueldo;
    }
}
