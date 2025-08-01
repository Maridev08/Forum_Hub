package hub.forun.api.domain.topicos;



import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao());
    }
}
