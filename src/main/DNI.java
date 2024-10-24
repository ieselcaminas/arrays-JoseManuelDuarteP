import java.util.Scanner;

public class DNI {
    public static char calculoLetra(int numDNI) {
        int numletra;
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

        numletra = numDNI % 23;
        return letrasDNI[numletra];

    }
    
    public static void main(String[] args) {
        int numDNI;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero (8 digitas): ");
        numDNI = sc.nextInt();

        System.out.println("Su DNI con letra es: " + numDNI + calculoLetra(numDNI));

        sc.close();
    }
}