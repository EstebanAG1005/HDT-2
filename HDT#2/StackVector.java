//----------------------------------------------------------
//Hoja de Trabajo #2
//Creada por Esteban Aldana Guerra 20591 
//Algoritmos y Estructura de Datos
//Ultima modificación: 05/02/2021
//----------------------------------------------------------

import java.util.Vector;
import java.util.Stack;

public class StackVector<T> implements Stack<T> {

    private Vector<T> vector;

    public StackVector(){
        this.vector = new Vector<T>();
    }

    //Ingresa Valor al Stack
    @Override
    public void push(T vector) {

        vector.push(vector);
    }

    //Saca elemento del Stack
    @Override
    public T pop() {
        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(vector.isEmpty())
        {
            return null;
        }
        else
        {
            return vector.pop();
        }
    }

    //Ultimo elemento del Stack
    @Override
    public T peek() {

        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(vector.empty())
        {
            return null;
        }
        else{
            return vector.peek();
        }
    }

    //Ver si esta vacio el Stack o no
    @Override
    public boolean empty() {

        return vector.empty();
    }

    //Tamaño del Stack
    @Override
    public int size() {

        return vector.size();
    }
}
