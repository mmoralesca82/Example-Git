package POO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class MainUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean estado = true;

        while (estado) {
            System.out.println("1 seguir, 2 salir");
            System.out.print("Ingrese opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.print("Ingresa nombre: ");
                    String name = sc.nextLine();
                    System.out.println("Hola "+name);
                    break;
                case 2:
                    estado=false;
                    break;
            }

        }

        System.out.printf("Fin del proceso");
        sc.close();

    }

}


    /*    int id;
        String name = "";
        byte edad = 0;
        String direccion = "";
        long documentoDni = 0;
        String nickRol="";
        int idUser = 1;
        int idAdm=1;


        ArrayList<User> user = new ArrayList<User>();
        ArrayList<Administrator> administrator = new ArrayList<Administrator>();


        while (true){
            System.out.println(
                    "  1. Registrar usuario\n" +
                    "  2. Registrar administrador\n" +
                    "  3. Buscar usuario\n" +
                    "  4. Listar administrador");
            System.out.print("Ingrese opción: ");
            int opcion = sc.nextInt();

            if(opcion==1 || opcion==2){
                System.out.print("Ingrese nombre: ");
                name = sc.nextLine();
                System.out.print("Ingrese edad: ");
                edad = sc.nextByte();
                System.out.print("Ingrese número de documento: ");
                documentoDni = sc.nextLong();


                try{
                    sc.reset();
                    System.out.print("¿Desea ingresar dirección? Ingrese si o no: ");
                    String select = sc.next();

                    if (select.equals("si") || select.equals("SI") || select.equals("Si") || select.equals("sI")) {
                        sc.nextLine(); //Para que limpie el buffer y tome todos los datos del buffer (El enter)
                        System.out.print("Ingrese dirección: ");
                        direccion = sc.nextLine();
                    }else {
                        direccion="";
                    }

                }
                catch(Exception e){
                    System.out.println("No se registrará dirección.");
                    direccion="";
                }
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nickname:");
                    nickRol = sc.next();
                    user.add(new User((int) idUser, name, (byte) edad, documentoDni, direccion, nickRol));
                    idAdm++;
                    break;
                case 2:
                    System.out.print("Ingrese rol:");
                    nickRol = sc.nextLine();
                    administrator.add(new Administrator((int) idAdm, name, (byte) edad, documentoDni, direccion, nickRol));
                    idAdm++;
                    break;
            }
            sc.close();
            }


        }







    }*/

