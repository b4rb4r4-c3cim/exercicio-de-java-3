public class exer4 {
    public static void main(String[] args){

        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while(popA < popB){
            popA += (popA /100)*3;
            popA += (popB /100)*1.5;
            cont ++;
            
        }
        System.out.println("Populacao A: "+ popA);
        System.out.println("Populacao B: "+ popB);
        System.out.println("Quantidade de anos:    "+ cont);

    }
}
