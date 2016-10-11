/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.MatriculaDAM;

/**
 *
 * @author IES
 */

class CustomException extends Exception
{
  public CustomException(String message)
  {
    super(message);
  }
}
public class ComprobaMatricula {

    public String comprobaMatricula(String input ) throws Exception {
        int uf = 0;
        int preu = 0;
        String error = "";
        try {
            uf = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            error = "El nombre d'Uf's a de ser numeric";
        }
        //comprovem que l'anterior NO ha donat error.
        if ("".equals(error)) {
            //tenim un valor numeric d'UF, comprobem que no sigui negatiu o zero
            if (uf < 1) {
                error = "T'has de matricular com a minim a una UF";
            } else if (uf < 12) {//si es matricula de menys de 12 UF la matricula val uf *30
                preu = uf * 30;
            } else {//Mes de 12 UF = 360
                preu = 360;
            }
        }
        //comprovem que no s'hagi generat cap error. Si hi ha, Llancem un error.
        if (!"".equals(error)) {
            throw new Exception(error);
            //return error;
        } else {//Tot ha anat bé, i tenim un import de matricula per mostrar.
            String preuString = String.valueOf(preu) + " €";
            return preuString;
        }
    }
}
