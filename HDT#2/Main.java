//----------------------------------------------------------
//Hoja de Trabajo #2
//Creada por Esteban Aldana Guerra 20591 
//Algoritmos y Estructura de Datos
//Ultima modificación: 05/02/2021
//----------------------------------------------------------
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Calculadora calc = new Calculadora();
                
                //Mandar a llamar el archivo donde se tiene la operacion a realizar
                try {
                    Scanner input = new Scanner(new File("E:\\Esteban\\Tercer Semestre\\Estructura de datos\\HDT#2\\HDT2.txt"));
                    while (input.hasNextLine()) {
                        //Lee el archivo
                        String expresion = input.nextLine();
                        System.out.println(expresion);
                        //Manda la expresion a la calculadora
                        String lines = calc.calculo(expresion);
                        System.out.println(lines);
                    }
                    input.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }   
            }
        }

    

