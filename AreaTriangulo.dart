import 'dart:io';
void main(){
  //Defenir Variables y otros
  print('Ejercicio 01:Area triangulo');
  //Datos de Entrada
  print("Ingrese Base: ");
  var b=int.parse(stdin.readLineSync());
  print("Ingrese Altura: ");
  var h=int.parse(stdin.readLineSync());
  //Proceso
  var area=(b*h)/2;
  //Datos de salida
  print("El Area de Triangulo es: $area");
}