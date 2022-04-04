import java.util.*;

public class Main {
    public static void main(String[] args) {
        CadastroClientes cadastroClientes = new CadastroClientes();
        Cliente c1 = new Cliente("Wender", "090.250.839-35");
        Cliente c2 = new Cliente("Izabela", "561.641.584-45");
        Cliente c3 = new Cliente("Avilton", "676.545.500-06");

        cadastroClientes.cadastra(c1);
        cadastroClientes.cadastra(c2);
        cadastroClientes.cadastra(c3);

        System.out.println(cadastroClientes.buscaClientes("Avilton"));






    }


}
