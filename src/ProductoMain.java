public class ProductoMain {
    public static void main(String[] args) {
        String fichero = "productos.txt";
        AgregarProductos.agregar(fichero);
        LeerProductos.leer();
    }
}
