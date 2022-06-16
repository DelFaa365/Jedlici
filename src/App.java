import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej počet jedlíků a počet chuťověk");
        int jedlici = sc.nextInt();
        int chutovky = sc.nextInt();
        String [] pole = new String [jedlici+1];
        if(jedlici > 50 && jedlici < 0){
            return;
        }
        if(chutovky > 500 && chutovky < 0){
            return;
        }

        System.out.println("Zadej jméno | kolik toho sní");

        for (int i = 0; i < pole.length; i++) {
            pole[i] = sc.nextLine();
        }

        for (int i = 1; i < pole.length; i++) {
            String [] split = pole[i].split(" ");
            chutovky -= 1;
            
            if(chutovky <= 0){
                System.out.println("Hlad má: " + split[0]);
            } else {
                System.out.println(split[0]);
            }
            if(i == pole.length-1 && chutovky == 0){
                System.out.println(
                    "Všichni se najedli"
                );
            } else if(i == pole.length-1 && chutovky > 0){
                System.out.println("Zbylo chuťovek: " + chutovky );
            }
        }


    }
}
