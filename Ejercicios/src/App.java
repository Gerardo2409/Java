public class App {
    public static void main(String[] args) throws Exception {
        String nombre= "Gerardo";
        System.out.println("hola "+nombre);
        int a = 6;
        int b = 8;
        int suma = a+b;
        System.out.println("la suma de a+b= "+suma);
        Ejercicio1 obj = new Ejercicio1();
        String msj=obj.saludar("hola", nombre);
        System.out.println(msj);
        System.out.println(Ejercicio1.saludar2("Hola", nombre));
        System.out.println(suma);
        
        
    } 


    
}
