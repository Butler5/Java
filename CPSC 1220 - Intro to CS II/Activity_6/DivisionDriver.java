import javax.swing.JOptionPane;
/**
 * Program for Division.
 *
 * Activity_06 - DivisionD.java
 * Adam Butler - CPSC 1220 - AO1
 * 11-17-22
 */
public class DivisionDriver {
    /**
     * Static main method.
     * @param args for args
     */
   public static void main(String[] args) {
      
      String numInput = JOptionPane.showInputDialog("Enter the numerator");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator");
   
   
      try { 
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n" 
            + Division.intDivide(num, denom) 
            + "\n\nFloating point division: \n" 
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result", 
            JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer values only.", "Error",
            JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, "Error",
             JOptionPane.ERROR_MESSAGE);
      }
   } 
}