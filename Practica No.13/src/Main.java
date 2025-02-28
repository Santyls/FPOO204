import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        Object[] menu = { "Registrar Vehículo","Registrar Conductor", "Asignar Conductor a Vehículo",
                "Registrar Envio", "Registrar Entrega", "Actualizar Estado-entrega", "Mostrar info", "salir" };
        int op;
        Object[] estadoEntrega = { "En tránsito","Entregado"};
        Boolean salir = false;
        Vehiculo vehiculo1 = null;
        Conductor conductor1 = null;
        Envio envio1 = null;
        Entrega entrega1 = null;

        do {
            op = JOptionPane.showOptionDialog(null,"Menú","",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,menu,menu[0]);
            switch (op){
                case 0:
                    //Registrar vehiculo
                    String placa = JOptionPane.showInputDialog(null, "Ingrese las placas del vehículo");
                    String modelo = JOptionPane.showInputDialog(null,"Ingrese el modelo del vehículo");
                    double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la capacidad del vehículo"));
                    vehiculo1 = new Vehiculo(placa, modelo, capacidadCarga);
                    JOptionPane.showMessageDialog(null, "¡Vehículo registrado correctamente!", "Registro con éxito",JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 1:
                    //Registrar conductor
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor");
                    String identificación= JOptionPane.showInputDialog(null,"Ingrese la identificación del conductor");
                    String licencia = JOptionPane.showInputDialog(null,"Ingrese la licencia del conductor");

                    conductor1 = new Conductor(nombre, identificación, licencia);
                    JOptionPane.showMessageDialog(null, "¡Conductor registrado correctamente!", "Registro con éxito",JOptionPane.INFORMATION_MESSAGE);


                    break;
                case 2:
                    //Asignar conductor a vehiculo
                    vehiculo1.asignarConductor(conductor1);

                    break;
                case 3:
                    //Registrar envio
                    envio1 = Envio.crearEnvio();

                    break;
                case 4:
                    //Registrar entrega
                    String numeroGuia = JOptionPane.showInputDialog(null, "Ingrese el numero de guia");
                    entrega1 = new Entrega(numeroGuia);

                    break;
                case 5:
                    //Actualizar estado de entrega
                    op = JOptionPane.showOptionDialog(null,"Estado de entrega","Actualizar estado de entrega",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,estadoEntrega,estadoEntrega[0]);
                    entrega1.actualizarEstado(op);
                    break;
                case 6:
                    if (vehiculo1 != null && conductor1 == null && envio1 == null && entrega1 == null){
                        JOptionPane.showMessageDialog(null, "Vehículo: "+vehiculo1.getModelo()+ "\nPlaca: "+vehiculo1.getPlaca()+ "\nCapacidad de carga: "+vehiculo1.getCapacidadCarga()+"kg");

                    }if(vehiculo1 != null && conductor1 != null && envio1 == null && entrega1 == null){
                    JOptionPane.showMessageDialog(null, "Vehículo: "+vehiculo1.getModelo()+ "\nPlaca: "+vehiculo1.getPlaca()+ "\nCapacidad de carga: "+vehiculo1.getCapacidadCarga()+"kg"+
                    "\nConductor: "+conductor1.getNombre()+ "\nIdentificación: "+conductor1.getIdentificacion()+ "\nLicencia: "+conductor1.getLicencia());
                }if(vehiculo1 != null && conductor1 != null && envio1 != null && entrega1 == null){
                    JOptionPane.showMessageDialog(null, "Vehículo: "+vehiculo1.getModelo()+ "\nPlaca: "+vehiculo1.getPlaca()+ "\nCapacidad de carga: "+vehiculo1.getCapacidadCarga()+"kg"+
                            "\nConductor: "+conductor1.getNombre()+ "\nIdentificación: "+conductor1.getIdentificacion()+ "\nLicencia: "+conductor1.getLicencia()+
                            "\nCódigo de Envio: "+envio1.getCodigoEnvio()+"\nDestino: "+envio1.getDestino()+"\nPeso: "+envio1.getPeso());
                }if(vehiculo1 != null && conductor1 != null && envio1 != null && entrega1 != null){
                    JOptionPane.showMessageDialog(null, "Vehículo: "+vehiculo1.getModelo()+ "\nPlaca: "+vehiculo1.getPlaca()+ "\nCapacidad de carga: "+vehiculo1.getCapacidadCarga()+"kg"+
                            "\nConductor: "+conductor1.getNombre()+ "\nIdentificación: "+conductor1.getIdentificacion()+ "\nLicencia: "+conductor1.getLicencia()+
                            "\nCódigo de Envio: "+envio1.getCodigoEnvio()+"\nDestino: "+envio1.getDestino()+"\nPeso: "+envio1.getPeso()+
                            "\nNúmero guia: "+entrega1.getNumeroGuia()+"\nEstado: "+entrega1.getEstado()
                    );
                }
                    break;
                default:
                    salir = true;
                    break;
            }
        }while(salir == false);


    }
}//Main