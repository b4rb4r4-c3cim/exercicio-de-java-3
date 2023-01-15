import java.util.Scanner;
public class exer3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, eCivil;
        int idade;
        double salario;

        //nome 

        do{
            System.out.println("Entre com o nome: ");
            nome = scan.next();

            if(nome.length() >= 3){
                infoValida = true;
            } else{
                System.out.println("Nome precisa de no minimo 3 caracteres ");
            }
        } while(!infoValida);

        
        //idade

          infoValida = false;

        do{
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();

            if(idade >= 0 && idade <= 150){
                infoValida = true;
            } else{
                System.out.println("Idade precisa estar entre 0 e 150! ");
            }
        } while(!infoValida); 

        //salario

        infoValida = false;

        do{
            System.out.println("Entre com o salario: ");
            salario = scan.nextDouble();

            if(salario > 0){
                infoValida = true;
            } else{
                System.out.println("Salario precisa ser maior que zero! ");
            }
        } while(!infoValida); 

        //sexo

        infoValida = false;

        do{
            System.out.println("Entre com o sexo (f - m): ");
            sexo = scan.next();

            if( sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else{
                System.out.println("Sexo invalido, digite novamente! ");
            }
        } while(!infoValida); 

        //estado civil

        infoValida = false;

        do{
            System.out.println("Entre com o estado civil: ");
            eCivil = scan.next();

            if( eCivil.equalsIgnoreCase("s") || eCivil.equalsIgnoreCase("c") 
            || eCivil.equalsIgnoreCase("v") || eCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else{
                System.out.println("Estado civil invalido, digite novamente! ");
            }
        } while(!infoValida); 

        System.out.println("Dados do usuario: ");
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Salario : " + salario);
        System.out.println("Sexo : " + sexo);
        System.out.println("Estado civil : " + eCivil);

    }
}
