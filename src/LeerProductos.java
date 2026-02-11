public class LeerProductos {
    public static void leer(){ //Método para leer el array
        System.out.println("---Productos---");
        for (String key : AgregarProductos.productosMap.keySet()) { //mencionar al map, desde la otra clase
            System.out.println( key + " - " + AgregarProductos.productosMap.get(key) + "€.");
        }
    }
}
