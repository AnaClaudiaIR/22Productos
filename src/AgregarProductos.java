import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LeerProductos {
    public static void leer(String fichero) {
        Map<String,Double> productosMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] productos = linea.split(";");

                if(productos.length==2){
                    String producto = productos[0].trim();
                    double precio = Double.parseDouble(productos[1].trim());
                }
                productosMap.put(productos[0].trim(),productosMap.get(productos[0].trim()));
            }
        } catch (IOException e){
            System.out.println("Error al leer el fichero --> " + e.getMessage());
        }
    }
}
