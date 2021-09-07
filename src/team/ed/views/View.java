package team.ed.views;

import java.util.Scanner;

public class View {
    public static void showHeaderPrincipal() {
        System.out.println("\t\t*************************************");
        System.out.println("\t\t* BIENVENIDO A LA CAJA REGISTRADORA *");
        System.out.println("\t\t*************************************");
    }

    public static void showMenuPrincipal() {
        System.out.println("\t\t\t 1. Comprar");
        System.out.println("\t\t\t 2. Vender");
        System.out.println("\t\t\t 3. Inventario");
        System.out.println("\t\t\t 4. Compras");
        System.out.println("\t\t\t 5. Ventas");
        System.out.println("\t\t\t 6. Salir");
    }

    public static void showGetOption() {
        System.out.print("\t\tDigite la opción: ");
    }

    public static int getOption() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}
