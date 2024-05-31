import javax.swing.JOptionPane;
 public class Programa1Final
 {
 public static void main(String arg[])
 {
  //1. Calcular el salario promedio de los empleados
  double salario[];//Declaración del arreglo de Salarios
  double sumSalario=0,salarioPromedio;
  int totalEmpleados, cantEmplSalSuperior=0; 
  
  totalEmpleados=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad de empleados"));
  salario= new double[totalEmpleados];//Creación del arreglo de Salarios
  
  for(int i=0;i<totalEmpleados;i++)
  {
   //Lectura de cada posición (i) del arreglo (en cada posición se almacena un salario diferente
   salario[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese salario del empleado"));
   sumSalario=sumSalario+salario[i];
  }
  salarioPromedio=sumSalario/totalEmpleados;
  JOptionPane.showMessageDialog(null, "El salario promedio es "+salarioPromedio);
  
  //2. Determinar cuántos empleados ganan un salario superior al promedio
  for(int i=0;i<totalEmpleados;i++)
  {
   //Uso del arreglo de salarios, previamente cargado en la línea 18
   if(salario[i] > salarioPromedio)
   {
    cantEmplSalSuperior++;
   }
  }
  JOptionPane.showMessageDialog(null, "El numero de empleados con salario superior al promedio 
                                 es "+cantEmplSalSuperior);
 
    
}
