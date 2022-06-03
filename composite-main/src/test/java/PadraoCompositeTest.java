import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PadraoCompositeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testarNovosNomes() {
        Funcionarios CEO = new Funcionarios("João", "CEO", 30000);
        Funcionarios diretor = new Funcionarios("Roberto", "diretor", 20000);
        Funcionarios Marketing = new Funcionarios("Michel", "Marketing", 20000);
        CEO.add(diretor);
        CEO.add(Marketing);
        for (Funcionarios empregadoChefe : CEO.getSubordinados()) {
            System.out.println(empregadoChefe);

            for (Funcionarios funcionarios : empregadoChefe.getSubordinados()) {
                System.out.println(funcionarios);
            }

        }
    }
}