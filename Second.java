import java.text.NumberFormat;
import java.util.Locale;

class Second {  //CLASS DECLARATION

    public static void main(String[] args) { //MAIN METHOD-Engine
        System.out.println("Java class"); //print syntax
        
        //VARIABLE
        //name = sarah

        //DATA TYPES- 2
        //PRIMITIVE & REFERENCE

        //PRIMITIVE- Boolean & Numeric
        boolean b = true;
        boolean wrong = false;
        
        // int, short, byte, long, char, FLOATING POINTS- Float, double
        int age = 23;//32 bits
        long money = 56378989;//64 bits
        short count = 3;
        // FLOATING TYPES
        double value = 6734.824334; //64 bits
        float kind = 32.5f; //32 bits
        char gender = 'M'; //singular cahracters or values

        //  REFERENCE TYPES - STRING, ARRAY, ENUMS
        String name = "Mike"; //DECLERATION & INITIALIZATION

        String fname;//DECLERATION 
        fname = "Mike 2";//INITIALIZATION

        NumberFormat nmf = NumberFormat.getCompactNumberInstance(Locale .US,
        NumberFormat.Style.SHORT);
        
            
        System.out.println(nmf.format(23000)); //23k
        System.out.println(nmf.format(45000000)); //45M
        System.out.println(nmf.format(560000000)); //560M
        System.out.println(nmf.format(45000)); //45k

        
    

    }





    
}
