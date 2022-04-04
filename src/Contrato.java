import java.time.LocalDate;

public class Contrato {
    private Cliente cliente;
    private static int NUMERO_GERAL;
    private int numero;
    private LocalDate data;

    public Contrato(Cliente cliente){
        this.cliente = cliente;
        NUMERO_GERAL++;
        numero += NUMERO_GERAL;
        data = LocalDate.now();
        cliente.adiciona(this);
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "cliente= " + cliente.getNome() +
                ", numero= " + numero +
                ", Data= " + data +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getNumeroGeral() {
        return NUMERO_GERAL;
    }


    public int getNumero() {
        return numero;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
