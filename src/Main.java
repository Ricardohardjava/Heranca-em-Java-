import java.util.Date;

public class Main {

    public static void main(String[] args) {

          Vendedor v = new Vendedor();
          v.setNome("Ricardo");
          v.setSalario(5000.0f);
          v.setCpf("055.645.888-98");
          v.setDataNacimento(new Date("08/18/1984"));
          v.setComissaoPorItem(10.0f);
          v.setTotalItensVendidos(10);

        System.out.println("O nome do Vendedor é: " + v.getNome());
        System.out.println("O Salário do Vendedor é: " + v.getSalario());
        System.out.println("O CPF do Vendedor é: " + v.getCpf());
        System.out.println("A data de nascimento do Vendedor é: " + v.getDataNacimento());
        System.out.println("A comissão por item do Vendedor é: " + v.getComissaoPorItem());
        System.out.println("O salário do vendedor é: " + v.calcularSalario());

        System.out.println();

          Motorista m = new Motorista();
          m.setNome("Neymar");
          m.setSalario(3000.0f);
          m.setCpf("122.888.999-00");
          m.setDataNacimento(new Date("05/22/1979"));
          m.setComissaoPorViagem(20.0f);
          m.setTotalDeViagens(100);

        System.out.println("O nome do Motorista é: " + m.getNome());
        System.out.println("O Salário do Motorista é: " + m.getSalario());
        System.out.println("O CPF do Motorista é: " + m.getCpf());
        System.out.println("A data de nascimento do Motorista é: " + m.getDataNacimento());
        System.out.println("A comissão por Viagem do Motorista é: " + m.getComissaoPorViagem());
        System.out.println("O salário do Salário do Motorista é: " + m.calcularSalario());
    }
}
