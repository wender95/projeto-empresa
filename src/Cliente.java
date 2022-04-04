import java.util.*;

public class Cliente implements Comparable <Cliente> {
    private String nome;
    private String cpf;
    private Set<Contrato> contratos = new HashSet<>();


    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;

    }

    public void adiciona(Contrato contrato){
        contratos.add(contrato);
    }

    public Collection<Contrato> getContratos() {
        return  Collections.unmodifiableSet(contratos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) && Objects.equals(contratos, cliente.contratos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, contratos);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cliente outroCliente) {
        return this.nome.compareToIgnoreCase(outroCliente.nome);
    }
}





