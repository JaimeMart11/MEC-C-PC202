public class TurnosMedicamentos{
    private static int menu(){
        System.out.print("FARMACIAS CRUZ VERDE\nSolicitud de Medicamentos\n\n"
        + " 1. Gestionar farmacias\n 2. Gestionar usuarios\n"
        + " 3. Generar citas\n 4. Gestionar meidicamentos\n"
        + " 5. Gestionar turnos\n 6. Salir\n\nDigite su opcion [1-6]: "  );
        return Lectura.nextInt("");
    }
    public static void main(String[] args){
        int opc = 0;
        do {
            opc = menu();
            switch(opc){
                case 1: Farmacia.gestionFarmacias(); break; 
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
            }
        }while (opc != 6);
        
    }
}