import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AgregarProductos {
    static Map<String,Double> productosMap = new HashMap<>();
    public static void agregar(String fichero) { //método para guardar los datos
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] productos = linea.split(";"); //Dividir cada línea

                if(productos.length==2){ //Asegurarse que el array sea de 2 espacios
                    String producto = productos[0].trim();
                    double precio = Double.parseDouble(productos[1].trim());
                    productosMap.put(producto, precio);
                }
            }
        } catch (IOException e){
            System.out.println("Error al leer el fichero --> " + e.getMessage());
        }
    }
}
