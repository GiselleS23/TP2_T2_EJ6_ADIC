
/*6) ejercicio de fecha correcta o no 
Sacchetti, Maria Giselle C2*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dd, mm, aaaa;

    System.out.print("Ingrese el dia: ");
    dd = scanner.nextInt();
    System.out.print("Ingrese el mes: ");
    mm = scanner.nextInt();
    System.out.print("Ingrese el año: ");
    aaaa = scanner.nextInt();

    if (mm >= 1 && mm <= 12) {
      switch (mm) {
        case 1:
          if (dd >= 1 && dd <= 31)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 2:
          if ((aaaa % 4 == 0 && aaaa % 100 != 0) || aaaa % 400 == 0) {
            if (dd >= 1 && dd <= 29)
              System.out.println("La fecha es correcta");
            else
              System.out.println("La fecha es incorrecta");
          } else {
            if (dd >= 1 && dd <= 28)
              System.out.println("La fecha es correcta");
            else
              System.out.println("La fecha es incorrecta");
          }
          break;
          
        case 3:
          if (dd >= 1 && dd <= 31)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 4:
          if (dd >= 1 && dd <= 30)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 5:
          if (dd >= 1 && dd <= 31)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 6:
          if (dd >= 1 && dd <= 30)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 7:
          if (dd >= 1 && dd <= 31)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 8:
          if (dd >= 1 && dd <= 31)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;

        case 9:
          if (dd >= 1 && dd <= 30)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 10:
          if (dd >= 1 && dd <= 31)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;

        case 11:
          if (dd >= 1 && dd <= 30)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        case 12:
          if (dd >= 1 && dd <= 31)
            System.out.println("La fecha es correcta");
          else
            System.out.println("La fecha es incorrecta");
          break;
          
        default: 
          System.out.println("El mes ingresado no es valido");
      }
    } else {
      System.out.println("La fecha es incorrecta");
    }
    scanner.close();
  }
}
