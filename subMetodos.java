package LaboratorioElec;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class subMetodos {
    static double G = 6.67 * (10^(-11));
    static double m1 = 0, m2 = 0; static  int r = 0;
    static double Cg = 0;

    public static void LeyGravi(){
        DecimalFormat formato = new DecimalFormat ("0.###E0");
        double Fg = 0; String notacionFg;

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

        Fg = (G * ((m1 * m2))) / (r^2);
        notacionFg = formato.format(Fg);

        try {
            JOptionPane.showInputDialog(null, "La fuerza gravitacional que actúa entre ambos cuerpos es de\n " + notacionFg + "[N]");
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }
    }

    public static void CampoGravi(){
        int opt = 0;
        DecimalFormat formato = new DecimalFormat ("0.###E0");
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
                JOptionPane.showInputDialog(null, "El valor  del campo gravitacional que actúa entre ambos cuerpos en x es de\n " + notacionFx + "[N]");
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
            }
            try {
                JOptionPane.showInputDialog(null, "El valor del campo gravitacional que actúa entre ambos cuerpos en y es de\n " + notacionFy + "[N]");
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
                JOptionPane.showInputDialog(null, "El valor absoluto del campo gravitacional que actúa entre ambos cuerpos es de\n " + notacionCg + "[N]");
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

    public static void Ley_coulomb(){
        DecimalFormat formato = new DecimalFormat ("0.###E0");
        double Ke = 9 * (10^9), MagnitudF = 0; String notacionmg;

        try {
            m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la carga 1 (MicroC)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }
       
        try {
            m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la carga 2 (MicroC)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        try {
            r = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la distancia entre ambas cargas (m)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        MagnitudF =  (Ke * ((m1) * (m2))) / (r^2) ;
        notacionmg = formato.format(MagnitudF);

        try {
            JOptionPane.showInputDialog(null, "La magnitud de la fuerza que actúa entre ambas cargas es de\n " + notacionmg + "[N]" );
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

    }

    public static void Intensi_campG(){
        DecimalFormat formato = new DecimalFormat ("0.###E0");
        double Icg ; String notacionIcg;

        try {
            m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa (kg)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        try {
            r = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la distancia entre la masa y la fuerza que la altera (m)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        Icg = G * (m1  / (r^2));
        notacionIcg = formato.format(Icg);

        try {
            JOptionPane.showInputDialog(null, "La intensidad del campo gravitacional generada en relacion a la masa es de\n " + notacionIcg + "[m/(s^2)]");
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        } 

    }

    public static void EnergiaMec(){
        DecimalFormat formato = new DecimalFormat ("0.###E0");
        double EM, h = 0, g = 9.8; String notacionEM; int v = 0;

        try {
            m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa (kg)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }
       
        try {
            v = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la velocidad (M/s)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        try {
            h = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la altura respecto el punto de referencia (m)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        EM = ((m1/2) * (v^2)) + (m1 * g * h) ;
        notacionEM = formato.format(EM);

        try {
            JOptionPane.showInputDialog(null, "El valor de la energia mecanica generada es de\n " + notacionEM + "[J]");
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }
    
    }

    public static void EnergiaPG(){
        DecimalFormat formato = new DecimalFormat ("0.###E0");
        double Epg, h = 0, g = 9.8; String notacionEpg;

        try {
            m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la masa (kg)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        try {
            h = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor de la altura/desplazamiento respecto el punto de referencia (m)"));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }

        Epg = (m1 * g * h) ;
        notacionEpg = formato.format(Epg);

        try {
            JOptionPane.showInputDialog(null, "El valor de la energia potencial gravitacional generada es de\n " + Epg + "[J]");
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" +  n.getMessage());
        }
        
    }


}