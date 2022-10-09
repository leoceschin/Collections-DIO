import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {

        List<Integer> temperaturas = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int count = 0;

        while(count<6){
            System.out.println("Insira uma temperatura: ");
            temperaturas.add(scan.nextInt());
            count++;
        }
       
        Iterator<Integer> iterator = temperaturas.iterator();
        int soma = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            soma += next;
        }

        int media = soma / temperaturas.size();
        
        for (Integer temp : temperaturas) {
            if (temp > media) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp);
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp);
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARCO: " + temp);
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp);
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp);
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp);
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
