package hub.forun.api.domain.repostas;

import hub.forun.api.domain.topicos.Topico;
import hub.forun.api.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DadosResposta(
        String mensagem,
        Topico topico,
        LocalDateTime dataCriacao,
        Usuario autor,
        String solucao
) {
}
