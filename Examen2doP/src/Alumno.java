import java.util.*;
public class Alumno {

    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String aNacimiento;
    private String carrera;
    private String matricula;
    private String aCursoActual;


    public Alumno(String nombre, String apellidoP, String apellidoM, String aNacimiento, String carrera, String aCursoActual) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.aNacimiento = aNacimiento;
        this.carrera = carrera;
        this.aCursoActual = aCursoActual;
    }

    public String generarMatricula(){
        String IIdANacimiento = aNacimiento.substring(2,4);//8IvanGuerraLopez025si
        String IlNombre = nombre.substring(0,1);
        String IIdapellidoP = apellidoP.substring(0,1);
        String IIdapellidoM = apellidoM.substring(0,1);
        String digitosAleatorios = "";
        for (int i = 0;i<3;i++){
            Random R = new Random();
            int j = R.nextInt((9));
            digitosAleatorios += String.valueOf(j);
        }
        String IIIdcarrera = carrera.substring(0,3);
        String IIdACurso = aCursoActual.substring(2,4);
        matricula = IIdACurso + IIdANacimiento + IlNombre + IIdapellidoP + IIdapellidoM + digitosAleatorios + IIIdcarrera;
        return matricula;
    }

    //        System.out.println(cadenas.length()); //nos ayuda a ver la cantidad de caracteres de una cadena
//
//        System.out.println(cadenas.substring(2,5));
//        System.out.println(cadenas.substring(2));
//        System.out.println(cadenas.substring(0,5));
//    System.out.println("Hola, Santiago Lugo");
//    String cadenas = "santiago" + "lugo" + "sánchez";
//        System.out.println(cadenas);


}
