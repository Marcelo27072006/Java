public class processarDadosAnimais {
        public static void main(String[] args) {
        animal animal = new animal ("jobson", "coelho", 5);

   animal.dadosAnimais();
   animal.mudarIdade(6);
   System.out.println("Atualização conforme a idade do animal");
   animal.dadosAnimais();
    }
}
