package LaboratorioElec;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class subMetodos {
    static double G = (6.674)*(10^(-11));
    static double m1 = 0, m2 = 0; static  int r = 0;
    static double Cg = 0;

    public static void LeyGravi(){
        DecimalFormat formato = new DecimalFormat ("0.00E0");
        double Fg ; String notacionFg;

        try {
            m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa 1 (kg)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }
       
        try {
            m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa 2 (kg)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        try {
            r = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la distancia entre sus centros (m)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        Fg = G * ((m1 * m2) / (r^2));
        notacionFg = formato.format(Fg);

        try {
            JOptionPane.showInputDialog(null, "La fuerza gravitacional que actúa entre ambos cuerpos es de\n " + notacionFg);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }
    }

    public static void CampoGravi(){
        int opt = 0;
        DecimalFormat formato = new DecimalFormat ("0.00E0");
        double Modulo; String notacionCg, notacionFx, notacionFy;


        try {
           opt = Integer.parseInt(JOptionPane.showInputDialog(null, "¿el campo gravitacional que desea calcular merece descomposición vectorial?\n1. sí\n2. no "));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        if (opt == 1) {
            double angulo = 0; 
            double fx, fy;
            try {
                m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa 1 (kg)"));
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }
        
            try {
                m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa 2 (kg)"));
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }
            
            try {
                angulo = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor del angulo"));
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }

            try {
                r = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la distancia entre las masas (m)"));
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }

            Modulo = G * ((m1 * m2) / (r^2));
            fx = Modulo * Math.cos(angulo);
            fy = Modulo * Math.sin(angulo);
            notacionFx = formato.format(fx);
            notacionFy = formato.format(fy);

            try {
                JOptionPane.showInputDialog(null, "El valor  del campo gravitacional que actúa entre ambos cuerpos en x es de\n " + notacionFx);
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }
            try {
                JOptionPane.showInputDialog(null, "El valor del campo gravitacional que actúa entre ambos cuerpos en y es de\n " + notacionFy);
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }
            

        }else if (opt == 2) {
            
            try {
                m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa 1 (kg)"));
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }
        
            try {
                m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa 2 (kg)"));
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }

            try {
                r = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la distancia entre las masas (m)"));
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }

            Cg = G * ((m1 * m2) / (r^2));
            notacionCg = formato.format(Cg);

            try {
                JOptionPane.showInputDialog(null, "El valor absoluto del campo gravitacional que actúa entre ambos cuerpos es de\n " + notacionCg);
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }

                }else{
                    try {
                        JOptionPane.showMessageDialog(null,"Opcion inexistente ");
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
                    }
                }

    }


}
