import java.util.*;

public class CadastroClientes {

   private Set<Cliente> clientes = new HashSet<>();
   private Map<String, Cliente> nomeParaCliente = new HashMap<>();


    public void cadastra(Cliente cliente){
        this.clientes.add(cliente);
        this.nomeParaCliente.put(cliente.getNome(), cliente);

    }

    public Cliente buscaClientes(String nome){
        return nomeParaCliente.get(nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CadastroClientes that = (CadastroClientes) o;
        return Objects.equals(clientes, that.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientes);
    }

    @Override
    public String toString() {
        return "CadastroClientes{" +
                "clientes=" + clientes +
                ", nomeParaCliente=" + nomeParaCliente +
                '}';
    }
}
