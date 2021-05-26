import scala.io.StdIn.readLine
object AreaTSC {
    def main(args: Array[String]) = {
      //Declaracion de variables y otros
        println("Ejercicio 01:Area triangulo")
      //Datos de entrada
      println("Ingrese Base:")
      val b = readLine().toInt
      println("Ingrese Altura:")
      val h = readLine().toInt
      //proceso
      val area=(b*h)/2
      //Datos de salida
      println("El area del triangulo es:"+area)
    }
}