import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Suspeito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<String>();

        System.out.println("Telefonou para a vítima?");
        respostas.add(scan.next());

        System.out.println("Esteve no local do crime?");
        respostas.add(scan.next());

        System.out.println("Mora perto da vítima?");
        respostas.add(scan.next());

        System.out.println("Devia para a vítima?");
        respostas.add(scan.next());

        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scan.next());

        int count = 0;
        Iterator<String> iterator = respostas.iterator();
        while (iterator.hasNext()) {
            String resp = iterator.next();
            if (resp.contains("sim"))
                count++;
        }

        switch (count) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }

        /*
         * if (count == 2) {
         * System.out.println("Suspeita");
         * } else if (count == 3 || count == 4) {
         * System.out.println("Cúmplice");
         * } else if (count == 5) {
         * System.out.println("Assassina");
         * } else {
         * System.out.println("Inocente");
         * }
         */

    }
}
