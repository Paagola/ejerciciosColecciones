import java.util.HashMap;
public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Moneda> lista = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            lista.put(i + 1, new Moneda(new Randomizador().getValor(), 
                                new Randomizador().getTipo(), new Randomizador().getCara()));
        }

  
        for (int i = 0; i < lista.size(); i++) {

            Moneda valorAct = lista.get(i+1);
                  int valor = 0;
        String tipo = "";
        boolean cara = false;;

            if (i == 0){
                System.out.println(valorAct.getValor() + " " + valorAct.getTipo() + " - " + (valorAct.getCara()?"Cara":"Cruz"));
            } else {
                int num = (int)(Math.random()*2)+1;
                
                switch (num) {
                    case 1:
                        tipo = lista.get(i).getTipo();
                        valor = lista.get(i).getValor();
                        break;
                    case 2:
                        cara = lista.get(i).getCara();
                        break;
                }
                System.out.println((valor == 0? valorAct.getValor(): valor) + 
                                        " " + (tipo.equals("")? valorAct.getTipo(): tipo) 
                                                    + " - " + 
                                                    ((!(cara == valorAct.getCara()) && num==2? cara: valorAct.getCara())?"Cara":"Cruz"));

            }
        }
    }
}



// Cada vez que se pulsa un boton generar una moneda.
// Segun la moneda anterior generada puede concidir en centimos y euros o en cara y cruz
// Simular programa que imprima 6 monedas aleatoriamente
// Cada moneda deber pertenecer a la instancia moneda
// Se deben ir alamcenando en una lista las monedas
