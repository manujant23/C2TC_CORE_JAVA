package Access_Modifier;



class Data {
    // private variable
    private String name;
}

public class Private_Access_Modifiers 
{
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz";//THIS ERROR IS BECAUSE name is declared as private in Data Class
    }
}
