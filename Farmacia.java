import java.util.ArrayList;
class Farmacia{
    static ArrayList<String> listNomb;
    static ArrayList<Farmacia> listFmc;
    String nombre;
    String dirección;
    String telefono;
    ArrayList <Cita> citas;
    
    public static void gestionFarmacias(){
        if (listNomb == null)
        listNomb = new ArrayList<String>();
        String nombreFmc = Lectura.nextString("Nombre farmacia: ");
        if (listNomb.contains(nombreFmc.toLowerCase().replaceAll(" ",""))) {
            System.out.println("Farmacia ya existe!!");
            crud(nombreFmc);
        } else {
            System.out.println("Farmacia nueva!!");
            listNomb.add(nombreFmc.toLowerCase().replaceAll(" ",""));
        }
    }
    
    public static void crud(String drogueria){
        int sel = Lectura.nextInt("\n1. Consultar 2. Modificar 3. Borra\n"
                    + " ==>");
        switch(sel){
        case 1: DAO.consultar(); break; //Llama a consutar en la clase DAO
        case 2: DAO.modificar(); break; //Llama a modificar en la clase DAO
        case 3: DAO.borrar(); break; //Llama a borrar en la clase DAO
        }
    }
}