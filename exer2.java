import java.util.Scanner;
public class exer2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;

        do{
            System.out.println("Insira o nome do usuario: ");
            String nomeUser = scan.next();
            
            System.out.println("Insira a senha: ");
            String senha = scan.next();

            if(nomeUser.equalsIgnoreCase(senha)){
                infoValidas = false;

                System.out.println("Senha igual a Usuario! Digite novamente: ");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuario validos.");
            }

        } while(!infoValidas);
    }
}
