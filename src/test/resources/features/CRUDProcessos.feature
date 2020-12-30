#language: pt

Funcionalidade: CRUD de Processo Judicial.

  Contexto:
    Dado que o usuário está na página inicial
    E que o usuário clica no menu processos
    E o usuário clica no botão Novo Processo
    E o usuário preenche o campo "vara" com o valor "Vara de São Caetano" no cadastro de processos
    E o usuário preenche o campo "número processo" com o valor "0000198794" no cadastro de processos
    E o usuário preenche o campo "natureza" com o valor "Criminal" no cadastro de processos
    E o usuário preenche o campo "partes" com o valor "Ana Paula" no cadastro de processos
    E o usuário preenche o campo "urgente" com o valor "Sim" no cadastro de processos
    E o usuário preenche o campo "arbitramento" com o valor "Não" no cadastro de processos
    E o usuário preenche o campo "assistente social" com o valor "Tais Borges" no cadastro de processos
    E o usuário preenche o campo "data entrada" com o valor "28/12/2020" no cadastro de processos
    E o usuário preenche o campo "status" com o valor "Em andamento" no cadastro de processos

  @validarProcessos
  Cenário: Adicionar um novo Processo - Create.
    Quando o usuário clicar no botão salvar no cadastro de processos
    Então o usuário deveria ver a mensagem "Processo foi criado com sucesso." no cadastro de processos

  @validarProcessos
  Cenário: Mostrar um novo processo - Read.
    E o usuário clicar no botão salvar no cadastro de processos
    E o usuário clicar no botão voltar no cadastro de processos
    Quando o usuário clica no botão mostrar do processo cadastrado
    Então o usuário deverá ver o valor "Vara de São Caetano" no campo "vara" na parte de exibição do processo
    E o usuário deverá ver o valor "0000198794" no campo "numero" na parte de exibição do processo
    E o usuário deverá ver o valor "Criminal" no campo "natureza" na parte de exibição do processo
    E o usuário deverá ver o valor "Ana Paula" no campo "partes" na parte de exibição do processo
    E o usuário deverá ver o valor "S" no campo "urgente" na parte de exibição do processo
    E o usuário deverá ver o valor "N" no campo "arbitramento" na parte de exibição do processo
    E o usuário deverá ver o valor "Tais Borges" no campo "as_social" na parte de exibição do processo
    E o usuário deverá ver o valor "2020-12-28" no campo "dt_entrada" na parte de exibição do processo
    E o usuário deverá ver o valor "Em andamento" no campo "status" na parte de exibição do processo

  @validarProcessos
  Cenário: Editar um novo processo - Update.
    E o usuário clicar no botão salvar no cadastro de processos
    E o usuário clicar no botão voltar no cadastro de processos
    E o usuário clicar no botão editar do processo cadastrado
    E o usuário preenche o campo "assistente social" com o valor "Daniela Antunes" na tela de edição de processos
    Quando o usuário clicar no botão salvar na tela de edição de processos
    Então o usuário deverá ver o valor "Daniela Antunes" no campo "as_social" na parte de exibição do processo

  @validarProcessos
  Cenário: Deletar um processo - Delete.
    E o usuário clicar no botão salvar no cadastro de processos
    E o usuário clicar no botão voltar no cadastro de processos
    Quando o usuário clicar no botão apagar do processo cadastrado
    E o usuário confirmar a deleção do processo
    Então o botão apagar não pode mais existir para o usuário cadastrar o processo

  @validarProcessos
  Esquema do Cenário: Adicionar um processo com Esquema de Cenário. Vara = <Vara>
    Dado que o usuário está na página inicial
    E que o usuário clica no menu processos
    E o usuário clica no botão Novo Processo
    E o usuário preenche o campo "vara" com o valor "<Vara>" no cadastro de processos
    E o usuário preenche o campo "número processo" com o valor "<Numero_Processo>" no cadastro de processos
    E o usuário preenche o campo "natureza" com o valor "<Natureza>" no cadastro de processos
    E o usuário preenche o campo "partes" com o valor "<Partes>" no cadastro de processos
    E o usuário preenche o campo "urgente" com o valor "<Urgente>" no cadastro de processos
    E o usuário preenche o campo "arbitramento" com o valor "<Arbitramento>" no cadastro de processos
    E o usuário preenche o campo "assistente social" com o valor "<Assistente_Social>" no cadastro de processos
    E o usuário preenche o campo "data entrada" com o valor "<Data_Entrada>" no cadastro de processos
    E o usuário preenche o campo "status" com o valor "<Status>" no cadastro de processos
    Quando o usuário clicar no botão salvar no cadastro de processos
    Então o usuário deveria ver a mensagem "<Mensagem>" no cadastro de processos

    Exemplos:
      | Vara                         | Numero_Processo | Natureza   | Partes             | Urgente | Arbitramento | Assistente_Social | Data_Entrada | Status       | Mensagem                         |
      | Vara de São Caetano          | 00001435299     | Criminal   | Amanda de Oliveira | Sim     | Não          | Karla Cintra      | 01/03/2020   | Em andamento | Processo foi criado com sucesso. |
      | Vara de São José Paulista 11 | 00008971295     | Tributario | Guilherme Pereira  | Sim     | Não          | Juliana Amaral    | 05/03/2020   | Encerrado    | Processo foi criado com sucesso. |









