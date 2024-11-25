package br.com.alurafood.pedidos.amqp;

import br.com.alurafood.pedidos.dto.PagamentoDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {

    @RabbitListener(queues = "pagamentos.detalhes-pedidos")
    public void recebeMensagem(PagamentoDto pagamentoDto) {

        String mensagem = """
                Dados do pagamento:  %s
                Nome do cliente:  %s
                Número do pagamento:  %s
                Valor R$: %s
                Status: %s
                """.formatted(
                pagamentoDto.getId(),
                pagamentoDto.getNome(),
                pagamentoDto.getValor(),
                pagamentoDto.getValor(),
                pagamentoDto.getStatus());

        System.out.println("Recebi a mensagem\n " + mensagem);
    }
}
