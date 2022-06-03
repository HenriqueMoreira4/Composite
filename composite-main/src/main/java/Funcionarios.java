import java.util.ArrayList;
import java.util.List;

public class Funcionarios {
    private String nome;
    private String dept;
    private int salario;
    private List<Funcionarios> subordinados;

    // constructor
    public Funcionarios(String nome, String dept, int sal) {
        this.nome = nome;
        this.dept = dept;
        this.salario = sal;
        subordinados = new ArrayList<Funcionarios>();
    }

    public void add(Funcionarios e) {
        subordinados.add(e);
    }

    public void remove(Funcionarios e) {
        subordinados.remove(e);
    }

    public List<Funcionarios> getSubordinados(){
        return subordinados;
    }

    public String toString(){
        return ("Funcionarios : Nome : " + nome + ", dept : " + dept + ", salário :" + salario +" ");
    }
}
