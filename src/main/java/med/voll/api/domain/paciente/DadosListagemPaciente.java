package med.voll.api.domain.paciente;

public record DadosListagemPaciente(String nome, int idade, String alergia) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getIdade(), paciente.getAlergia());
    }
}
