public class Main {
    public static void main (String[] args) {
       Produto p1 = new Produto ("Arroz", 30.45, 150);
       Produto p2 = new Produto ("Feijão", 10.45, 50);
       Produto p3 = new Produto ("Carne", 60.787890, 30);

       p1.adicionarEstoque(1);
       System.out.println(p1.getQuantidade());
       p1.removerEstoque(3);
       System.out.println(p1.getQuantidade());

       System.out.println(p1 + "\n" + p2 + "\n" + p3);
    }
}