public class PadraoComposite {
    public void padrao() {

        Funcionarios CEO = new Funcionarios("João", "CEO", 30000);
        Funcionarios diretor = new Funcionarios("Roberto", "diretor", 20000);
        Funcionarios Marketing = new Funcionarios("Michel", "Marketing", 20000);

        Funcionarios ck1 = new Funcionarios("Laura", "Marketing", 10000);
        Funcionarios ck2 = new Funcionarios("Carlos", "Marketing", 10000);

        Funcionarios sec = new Funcionarios("Ricardo", "Vendas", 10000);
        Funcionarios sec2 = new Funcionarios("Roberto", "Vendas", 10000);

        CEO.add(diretor);
        CEO.add(Marketing);

        diretor.add(sec);
        diretor.add(sec2);

        Marketing.add(ck1);
        Marketing.add(ck2);




    }
}