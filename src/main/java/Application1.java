public class Application1 {
    public static void main(String[] args) {
        try{
            //EntierNaturel entierNaturel = new EntierNaturel(-4);
            EntierNaturel entierNaturel1 = new EntierNaturel(0);
            entierNaturel1.decrement();
        }catch(NombreNegatifException n){
            System.out.println(n.getMessage());
            System.out.println(n.getVal());
        }

    }


}
