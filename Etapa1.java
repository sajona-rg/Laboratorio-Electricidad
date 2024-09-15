package LaboratorioElec;

import javax.swing.JOptionPane;

public class Etapa1 {
    
    public static void main(String[] args) 
    {   	
            int opcion = 0;

        do{
            try{opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ley gravitacional\n2. Campo gravitacional\n"
            + "3. ley de coulomb\n4. Intensidad de campo gravitacional\n5. Energia mecanica\n6. Energia potencial gravitacional\n7. salir"));//falta potencial electrico
            switch (opcion) {
                case 1:
                    subMetodos.LeyGravi();
                    break;

                case 2:
                    subMetodos.CampoGravi();
                    break;  
                case 3 :
                    subMetodos.Ley_coulomb();
                    break;
                case 4:
                    subMetodos.Intensi_campG();
                    break;
                case 5:
                    subMetodos.EnergiaMec();
                    break;  
                
                case 6:
                    subMetodos.EnergiaPG();
                    break;
                
                case 7:
                     
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "opción incorrecta");
                    break;
            }
          
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage()); 
            }
        }while(opcion!=6);

    }
  

}