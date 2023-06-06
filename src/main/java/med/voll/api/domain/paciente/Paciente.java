package med.voll.api.domain.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String alergia;

    public Paciente(DadosCadastroPaciente dadosCadastroPaciente){
        this.nome = dadosCadastroPaciente.nome();
        this.idade = dadosCadastroPaciente.idade();
        this.alergia = dadosCadastroPaciente.alergia();
    }

}
