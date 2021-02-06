//----------------------------------------------------------
//Hoja de Trabajo #2
//Creada por Esteban Aldana Guerra 20591 
//Algoritmos y Estructura de Datos
//Ultima modificación: 05/02/2021
//----------------------------------------------------------

public interface Stack<T> {

    //Ingresa Valor al Stack
    void push(T data);

    //Saca elemento del Stack
    T pop();

    //Ultimo elemento del Stack
    T peek();

    //Ver si esta vacio el Stack o no
    boolean empty();

    //Tamaño del Stack
    int size();
}
