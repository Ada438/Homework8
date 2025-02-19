import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] mass1 = new int[3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;
        double[] mass2 = {1.57, 7.654, 9.986};
        int[] mass3 = {35, 23, 57, 44, 12};
        System.out.println("Задача 2");
        for (int i = 0; i < mass1.length; i++) {
            if (i != mass1.length - 1) {
                System.out.print(mass1[i] + ", ");
            } else {
                System.out.println(mass1[i]);
            }
        }
        for (int i = 0; i < mass2.length; i++) {
            if (i != mass2.length - 1) {
                System.out.print(mass2[i] + ", ");
            } else {
                System.out.println(mass2[i]);
            }
        }
        for (int i = 0; i < mass3.length; i++) {
            if (i != mass3.length - 1) {
                System.out.print(mass3[i] + ", ");
            } else {
                System.out.println(mass3[i]);

            }
        }
        System.out.println("Задача 3");

        for (int i = mass1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(mass1[i] + ", ");
            } else {
                System.out.println(mass1[i]);
            }
        }

        for (int i = mass2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(mass2[i] + ", ");
            } else {
                System.out.println(mass2[i]);
            }
        }


        for (int i = mass3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(mass3[i] + ", ");
            } else {
                System.out.println(mass3[i]);
            }
        }
        System.out.println("Задача 4");
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 != 0) {
                mass1[i] = mass1[i] + 1;
            }
        }

        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i] + " ");

        }
    }
}



