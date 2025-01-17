package academia.kayky.maratonajava.introducao;

public class EstruturaCondicionais {
    public static void main(String[] args) {
        if(true){
            System.out.println("dentro do if");
        }
        System.out.println("fora do if");

        int idade= 15;
        if(idade >= 18){
            System.out.println("autorizado");
        }
        boolean isAutorizado= idade >= 18;
        if (isAutorizado){
            System.out.println("autorizado 2");
        }

        //if(isAutorizado == false)
        if(!isAutorizado){
            System.out.println("naoautorizado");
        }

    }
}
