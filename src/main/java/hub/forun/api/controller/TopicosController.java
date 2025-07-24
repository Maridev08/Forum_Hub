package hub.forun.api.controller;

import hub.forun.api.domain.topicos.DadosCadastroTopicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicosController {

    @PostMapping
    public void cadastrarTopico(@RequestBody DadosCadastroTopicos dados){
        System.out.println(dados);
    }
}
