package hibernate;
import java.io.*;

public class Binario {
    public static void main(String[] args) {

        ///CREAMOS TRES OBJETOS, UNO DE CADA CLASE////
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();
        Modulo modulo = new Modulo();

        ///LLAMADA A LAS FUNCIONES DE GUARDADO Y LECTURA EN FICHERO BINARIO. RECIBE EL NOMBRE DEL FICHERO Y EL OBJETO POR PARÁMETROS///
        fileOutputStream(new File("ficheroPAC"), alumno);
        fileReaderStream(new File("ficheroPAC"), alumno);
    }
        ///MÉTODO PARA GUARDAR EL OBJETO EN FICHERO BINARIO///
        // RECURRIMOS A LOS OBJETOS GENÉRICOS (<T>). DE ESTA MANERA, PODREMOS USAR LA FUNCIÓN CON CUALQUIER OBJETO///
        private static <T> void fileOutputStream(File fichero, T object) {

            ///BLOQUE TRY-CATCH
            try {
                ///FICHERO BINARIO DE SALIDA + OPCIÓN DE SOBREESCRITURA (append: true)////
                FileOutputStream file = new FileOutputStream(fichero, true);

                ///GUARDAMOS EL OBJETO EN EL FICHERO file Y LO "ESCRIBIMOS"///
                ObjectOutputStream objeto = new ObjectOutputStream(file);
                objeto.writeObject(object);
            }
            catch (IOException ex) {
                System.out.println("No ha sido posible escribir en el fichero");
           }
        }

        ///MÉTODO PARA LEER EL FICHERO////
        private static <T> void fileReaderStream(File fichero, T object){
            ///BLOQUE TRY-CATCH////
             try{
            ////FICHERO DE ENTRADA BINARIO DE fichero///
            FileInputStream fileIn = new FileInputStream(fichero);
            ///ENTRADA DE OBJETO Y LECTURA///
            ObjectInputStream objetcIn = new ObjectInputStream(fileIn);
            objetcIn.readObject();

            ///CIERRE DEL FLUJO DE ENTRADA E IMPRESIÓN POR PANTALLA///
            objetcIn.close();
            System.out.println(object.toString());

            }
             catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Error al leer el fichero");
            }
        }
}