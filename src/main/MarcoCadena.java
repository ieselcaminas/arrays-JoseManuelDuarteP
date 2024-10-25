import java.util.Scanner;

public class MarcoCadena {
    public static int palabraMasLarga(String[] palabros) {
        int max = 0;

        for (int i = 0 ; i < palabros.length ; i++) {

            if (palabros[i].length() > max) {
                max = palabros[i].length();
            }

        }
        return max;
    }

    public static String asteriscos(int max) {
        String asteriscos = "";

        for (int i = 0 ; i <= max + 3 ; i++) {

                asteriscos += "*";

        }
        return asteriscos;

    }

    public static String cuadro(int max, String[] palabros, String asteriscos) {
        String cuadro = asteriscos;

        for (int i = 0 ; i < palabros.length ; i++) {
            cuadro += "\n";
            cuadro = (cuadro + "* " + palabros[i]);
            int espaciosRestantes = max - palabros[i].length();

            for (int j = 0 ; j <= espaciosRestantes ; j++) {
                cuadro += " ";
            }

            cuadro += "*";

        }

        cuadro = cuadro + "\n" + asteriscos;
        return cuadro;

    }

    public static void main(String[] args) {
        String[] palabros = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 cadenas de texto:");

        for (int i = 0; i < palabros.length; i++){
            palabros[i] = sc.next();
        }

        int max = palabraMasLarga(palabros);
        String asteriscos = asteriscos(max);

        System.out.println(cuadro(max, palabros, asteriscos));



        sc.close();
    }
}

// Por acabar