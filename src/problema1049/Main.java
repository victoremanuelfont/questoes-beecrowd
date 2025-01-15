package problema1049;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome01 = sc.nextLine();
        String nome02 = sc.nextLine();
        String nome03 = sc.nextLine();

        if (nome01.equals("vertebrado")) {
            if (nome02.equals("ave")) {
                if (nome03.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (nome03.equals("onivoro")) {
                    System.out.println("pomba");
                }

            } else if (nome02.equals("mamifero")) {
                if (nome03.equals("onivoro")) {
                    System.out.println("homem");
                } else if (nome03.equals("herbivoro")) {
                    System.out.println("vaca");
                }

            }

        } else if (nome01.equals("invertebrado")) {
            if (nome02.equals("inseto")) {
                if (nome03.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (nome03.equals("herbivoro")) {
                    System.out.println("lagarta");
                }

            } else if (nome02.equals("anelideo")) {
                if (nome03.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (nome03.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }


        }

    }
}