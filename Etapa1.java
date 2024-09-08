package LaboratorioElec;

import javax.swing.JOptionPane;

public class Etapa1 {
    
    public static void main(String[] args) 
    {   	
            int opcion = 0;

        do{
            try{opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ley gravitacional\n2. Campo gravitacional\n"
            + "3. ley de coulomb\n4. Intensidad de campo gravitacional\n5. Energia mecanica\n6. salir"));//falta potencial electrico
            switch (opcion) {
                case 1:
                    subMetodos.LeyGravi();
                    break;

                case 2:
                    subMetodos.CampoGravi();
                    break;  
                case 3 :
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;  
                
                case 6:
                    
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