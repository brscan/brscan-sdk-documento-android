## [1.4.0] - 11-07-2022
- Melhoria: Retornar erros via call back (erroCallbackListener)
- Melhoria: Alterar o tamanho da imagem para envio ao type document
- Melhoria: Realizar a captura do documento com o device estabilizado
- Melhoria: Remoção de flag auto-focus do manifest

## [1.3.1] - 29-06-2022
- Correção: flag (tipoRetorno) valor default base64.

## [1.3.0] - 27-06-2022
- Melhoria: Adicionado o envio de metadados para analise e processamento.

## [1.2.10] - 31-05-2022
- Correção: Processo com delay 0 e tempo de captura do documento fixo.
- Melhoria: Modificado flag (tempoDelayMensagem) para 0ms como default
- Melhoria: Mudança flag (tempoDelayMensagem) depreciada
- Melhoria: Adicionado flag (tokenTentativa) define quantos tokens extra podem ser usados(0 default)
- Melhoria: Adicionado variáveis para obtenção de métricas.

## [1.2.9] - 10-05-2022
- Correção: Retorno para tela que chamou a tela de captura ao acionar botão de fechar.

## [1.2.8] - 05-05-2022
- Melhoria: Alteração apontamento para validar chave document.brscan.com.br/v1/.
- Melhoria: Adicionado flag (segurancaExtraEmulatorCheck) para validar se o dispositivo é um emulador.

## [1.2.7] - 29-04-2022
- Correção: Problema ao iniciar captura em dispositivos mais antigos.

## [1.2.6] - 25-04-2022
- Melhoria: Adicionado flag (tempoDelayMensagem) define o tempo de exibição entre as mensagem de processo(2000ms default).
- Melhoria: Adicionado flag (acessibilidade) que habilita recurso de acessibilidade A+
- Melhoria: Incluído customização(via xml) de cores texto e caixa de orientações na tela de captura.
- Melhoria: Incluído customização(via xml) de tamanho texto de orientações na tela de captura.
- Correção: Aumentado range para captura de imagem.

## [1.2.5] - 14-04-2022
- Correção: Remoção de meta do retorno de tipo "base64" data:image/jpeg;base64.

## [1.2.4] - 12-04-2022
- Melhoria: Otimização no uso de memória.
- Melhoria: Adicionado Label (RG, CNH ou documento) e o lado (Frente, Verso e Aberto) quando informado.

## [1.2.3] - 06-04-2022
- Correção: Redução de imagens para exibição em dispositivos com pouco recurso.

## [1.2.2] - 04-04-2022
- Correção: Erro na exibição das imagens em dispositivos com pouco recurso.
- Melhoria: Adicionado flag (scoreMinimo) para receber o valor de score mínimo aceito (0 a 100 default 60)
- Melhoria: Incluído meta do retorno de tipo "base64" data:image/jpeg;base64.
- Melhoria: No retorno com erro será retornado o Código do erro, iD da analise e a Descrição.
- Melhoria: Incluído parametrização da cor do backgroung do frame de loading
- Melhoria: Incluído parametrização da cor do botão dos frames.
- Melhoria: Incluído parametrização da cor do Check das instruções.

## [1.2.1] - 28-03-2022
- Melhoria: Adicionado flag (retornarErros) retonar todos os erros para aplicação cliente.
- Melhoria: Mudança flag (segurancaExtra) depreciada.
- Melhoria: Adicionado flag (segurancaExtraRootCheck) para validar se o dispositivo está no modo root.
- Melhoria: Adicionado flag (segurancaExtraSslPinning) para validar ssl pinning.
- Correção: Ajuste na captura para evitar desfoque.

## [1.2.0] - 17-03-2022
- Melhoria: Alteração apontamento para novo serviço document.brscan.com.br/v1/.
- Melhoria: Adicionando no objeto de retorno o id da captura.
- Melhoria: Adicionado botão de fechar na tela inicial (quando wizard for true) que possibilitar sai do sdk.
- Melhoria: Alteração no botão de fechar da tela de captura para um x da cor preta.
- Melhoria: Alteração da cor da moldura da tela de captura para cor secondary (magenta).
- Melhoria: Remoção de validação por score e Depreciação da flag (scoreMinimo).

## [1.1.5] - 09-03-2022
- Melhoria: Melhoria: Alteração de titulo tela inicial

## [1.1.4] - 23-02-2022
- Melhoria: Adicionado flag (scoreMinimo) para receber o valor de score mínimo aceito

## [1.1.3] - 16-02-2022
- Correção verificação de lado b e ab.

## [1.1.2] - 16-02-2022
- Correção label de informação de documento (tipo e lado).

## [1.1.1] - 10-02-2022
- Correção erro de documento não permitido com flag validaDocumento false.

## [1.1.0] - 09-02-2022
- Melhoria: Adicionado flag (swiper) para habilitar/desabilitar telas de instruções para captura com iconografia.
- Melhoria: Adicionado flag (telaSelecaoDocumento) para habilitar/desabilitar tela de escolha do tipo de documento.
- Melhoria: Adicionado imagem cropada na tela de confirmação do documento.
- Melhoria: Retorno de imagens em base64 em baixa resolução.
- Melhoria: Retorno de boundingbox da imagem.
- Melhoria: Adicionado flag (resolucao) para informar o tipo de resolução(low, hd e original) da imagem a ser salva.
- Melhoria: Adicionado flag (ladoDocumentoAceito) para capturar apenas um lado específico.
- Melhoria: Remoção de imagens capturadas anteriormente pela lib.
- Melhoria: Adicionado tela de erro de conexão com opções de enviar novamente ou cancelar o processo.
- Melhoria: Adicionado flag (telaPreview) para habilitar/desabilitar telas de Preview
- Melhoria: Adicionado flag (tipoRetorno) para escolher entre base64 ou path do arquivo
- Melhoria: Não salva imagem quando o tipo de retorno é base64
- Melhoria: Mudança no objeto de retorno (removendo campos path e base64 e adicionando campo imagem) 
- Melhoria: Adicionado flag (configuracaoTexto) para receber os textos de customização

## [1.0.30] - 14-01-2022
- Correção: Ajuste na função de habilitar/desabilitar verificação de luminosidade.

## [1.0.29] - 14-01-2022
- Melhoria: Adicionado flag para habilitar/desabilitar verificação de luminosidade.

## [1.0.28] - 22-11-2021
- Melhoria: Adicionado tela de preview e confirmação de captura 

## [1.0.27] - 17-11-2021
- Melhoria: Customização de fonte.
- Melhoria: Customização da tela de captura. 