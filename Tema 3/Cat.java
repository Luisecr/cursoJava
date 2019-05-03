/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micurso.curso_java;

/**
 *
 * @author MB84608
 */

public class Cat {

String name;
String color;
int age;

public String talk () {
return "miau";
}

public static void main (String[] args) {
Cat  rayo = new Cat ();
rayo.name = args[0];
rayo.color = args[1];
rayo.age = Integer.parseInt(args[2]);
rayo.eat("Sardina");
rayo.edad(rayo);

    System.out.println(rayo.toString());
    
//System.out.println(rayo.talk ());
}
public void eat(String food){
    System.out.println("el gato va a comer "+ food);
}
@Override
 public String toString(){
    return "el nombre del gato es:"+name+" y su color es:"+ color+ " y su edad es "+ age;
 }
 
public void edad(Cat cat){
    if(cat.age < 4){
        System.out.println(cat.name + " es un bebé");
    }else if(cat.age >4 && cat.age <12){
        System.out.println(cat.name + " es un joven");
    }else{
        System.out.println(cat.name + " es un adulto");
    }
    

}


}