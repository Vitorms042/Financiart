# Financiart 

`Trabalho Interdisciplinar - Aplicacões Web`

`Ciência da Computação`

`1° Semestre`

## Participantes

> Os membros do grupo são: 
> - Vitor Manoel Silva
> - Gabriel Rezende da Silva Maia
> - Fernando Theodoro Porto de Paula Dias

## Professores Responsáveis

> - Luciana Mara Freitas Diniz
> - Rafael Glater da Cruz Machado
> - Rommel Vieira Carneiro

# Estrutura do Documento

- [Informações do Projeto](#informações-do-projeto)
  - [Participantes](#participantes)
- [Estrutura do Documento](#estrutura-do-documento)
- [Introdução](#introdução)
  - [Problema](#problema)
  - [Objetivos](#objetivos)
  - [Justificativa](#justificativa)
  - [Público-Alvo](#público-alvo)
- [Especificações do Projeto](#especificações-do-projeto)
  - [Personas, Empatia e Proposta de Valor](#personas-empatia-e-proposta-de-valor)
  - [Histórias de Usuários](#histórias-de-usuários)
  - [Requisitos](#requisitos)
    - [Requisitos Funcionais](#requisitos-funcionais)
    - [Requisitos não Funcionais](#requisitos-não-funcionais)
  - [Restrições](#restrições)
- [Projeto de Interface](#projeto-de-interface)
  - [User Flow](#user-flow)
  - [Wireframes](#wireframes)
- [Metodologia](#metodologia)
  - [Divisão de Papéis](#divisão-de-papéis)
  - [Ferramentas](#ferramentas)
  - [Controle de Versão](#controle-de-versão)
- [Projeto da Solução](#projeto-da-solução)
  - [Tecnologias Utilizadas](#tecnologias-utilizadas)
  - [Arquitetura da solução](#arquitetura-da-solução)
- [Avaliação da Aplicação](#avaliação-da-aplicação)
  - [Plano de Testes](#plano-de-testes)
  - [Ferramentas de Testes (Opcional)](#ferramentas-de-testes-opcional)
  - [Registros de Testes](#registros-de-testes)
- [Referências](#referências)


# Introdução

## Problema

A maioria da população brasileira não teve uma educação financeira ao longo da vida, e muitas mesmo já tendo ouvido falar sobre esse tema, acham que é de pouca importância e deixam ele de lado. Mas ao contrário do que a maioria dessas pessoas pensam, essa falta de educação financeira acaba prejudicando e muito a vida social, econômica e profissional dessas pessoas e consequentemente de todos aos seu redor. Além disso, é um mercado pouco inflamado pela mídia, ou seja, esse conhecimento não tende a chegar na grande parte da população, deixando a merce esse ramo fundamental da sociedade.

## Objetivos

O financiart tem o objetivo de trazer uma gestão finaceira para os usuários, com indicações de investimentos em ativos pressupostos para determinado perfil, além de indicativos de como gerir os gastos e as dívidas, projetando e alinhando os objetivos de cada usuário com sua determinada carteira. E além disso, buscamos um ensinamento educativo sobre o mercado e modos de causar interesse e curiosidade nos usuários. 

## Justificativa

As principais motivações vieram da grande negligência da sociedade em relação a adquirir conhecimento financeiro e entender como o dinheiro funciona, e do enorme potencial/impacto que essa área pode causar na vida de qualquer cidadão. É nítido que a maioria da população tem problemas com dinheiro, e geralmente nesses casos não é somente pela falta dele, mas sim da má gestão que essas pessoas fazem, deixando acumular dívidas, tendo mais despesas do que lucro, não sabendo como investir para ter umarenda extra, entre outros. Com isso, as pessoas podem escolher entre duas vertentes, fazer com que os dinheiro seja seu aliado, ou torna-lo seu maior inimigo. E é ai que nós(Financiart) entramos...     

## Público-Alvo

A maioria das pessoas possuem problemas com dinheiro, independente da classe social que ela pertence, por isso, grande parte das pessoas poderiam ser futuros usuários da nossa solução. No entanto, selecionamos um público alvo para focar e conseguir aprofundar as ideias e sugestões.

Nosso público alvo é composto de pessoas com a faixa etária de 23-35 anos que não possuem educação financeira e estão dispostas a investirem seu dinheiro visando o futuro, além de pessoas radicais que fazem má gestão do dinheiro e por fim pessoas que acham que não conseguem investir por ter um baixo salário.

# Especificações do Projeto

Nessa parte utilizamos o medo de Design Thinking para filtrar as personas utilizadas como parâmetros de proposta de valor, além de entrevistas com potenciais usuários e feedbecks interativos que ajudam a esclarecer ideias.

## Personas, Empatia e Proposta de Valor

Toda essa área está disponível e melhor explicada no ambiente miro. Para acessar é só abrir esse link no navegador:https://miro.com/app/board/uXjVMYDTJcA=/
Como falado em cima, nesse ambiente será detalhado as personas e suas proposta de valores.

1.**Maria Silva** tem 35 anos e é secretária de uma pequena empresa, ela tem dificuldades para controlar seus gastos e frequentemente gasta mais do que ganha e com isso sonha com uma vida em que não precise mais se preocupar com dívidas e possa viver de forma mais tranquila e independente. Maria gostaria de ter uma vida financeira mais estável e segura, com uma poupança para emergências e uma perspectiva de economizar para a aposentadoria. E para ela conseguir tudo isso, tem em mente que vai precisar de ajuda para dquirir conhecimento sobre gestão financeira.

2.**João da Silva** tem 32 anos e é um trabalhador autônomo que faz pequenos serviços de manutenção e reparo em residências. Ele aprendeu esse ofício com o pai, que também era autônomo, mas nunca teve uma formação técnica na área. João sempre teve dificuldades em controlar suas finanças, mesmo quando trabalhava em empregos formais.Com isso, ele e sua esposa sonham em comprar uma casa própria e ter uma reserva financeira para emergências. João também quer investir em sua empresa de manutenção residencial para poder aumentar sua renda, além de dar uma qualidade de vida melhor para seu filho.

3.**Lucas Araújo** tem 25 anos e está cursando o último período de Engenharia Civil, e por isso é estagiário em uma empresa da área. Ele é determinado, inteligente e criativo. Ele gosta de aprender coisas novas e de se desafiar. Ele também é sociável e comunicativo, mas às vezes se sente inseguro e ansioso. Ele tem como objetivo ter uma visão geral e detalhada de suas receitas e despesas, fazer um planejamento financeiro, definindo metas, orçamentos e limites de gastos, além de conseguir uma ajuda de como gerir suas dívidas. Tudo isso para no futuro realizar seu sonho de trabalhar em uma empresa reconhecida e inovadora na área de engenharia civil, como a Odebrecht ou a Camargo Corrêa e no futuro ter sua própria empresa ou consultoria de engenharia civil.

## Histórias de Usuários

|EU COMO... `PERSONA`| QUERO/PRECISO ... `FUNCIONALIDADE` |PARA ... `MOTIVO/VALOR`                 |
|--------------------|------------------------------------|----------------------------------------|
|Maria da Silva      |de gestão específica                |fazer com que meu balanço mensal seja   |
|                    |                                    |positivo e que sobre uma certa quantia  |
|                    |                                    |de dinheiro                             |
|Maria da Silva      |de conhecimento e ajuda financeira  |quitar minhas dívidas e não acumular    |
|                    |                                    |mais                                    |
|Maria da Silva      |recomendações de como guardar pelo  |investir em ativos com baixo risco      |
|                    |menos 5% da receita que recebo      |                                        |
|João da Silva       |um modelo de aprimoramento com as   |ter maior conhtrole sobre meu lucro no  |
|                    |minhas despesas                     |fim do mês                              |
|João da Silva       |um aconselhamento e conhecimento de |acabar com minhas dívidas pendentes     |
|                    |gestão                              |                                        |
|João da SIlva       |de um modelo de carteira recomendado|conseguir uma segunda renda mensal      |          
|                    |                                    |                                        |
|Lucas Araújo        |de páginas de indicações financeiras|montar minha carteira de investimentos  |
|                    |                                    |                                        | 
|Lucas Araújo        |um modelo de como abaixar minhas    |poder focar no meu futuro e não ficar   |
|                    |dívidas                             |preso ao passado                        |
|Lucas Araújo        |de um modelo de carteira de ativos  |ganhar uma renda extra e me ajudar      |
|                    |                                    |economicamente                          |     


## Requisitos

As tabelas que se seguem apresentam os requisitos funcionais e não funcionais que detalham o escopo do projeto.

### Requisitos Funcionais

|ID    | Descrição do Requisito  | Prioridade |
|------|------------------------------------------------------|----|
|RF-001| Permitir que o usuário cadastre suas informações financeiras e especifique certos tipos de dados | ALTA | 
|RF-002| Disponibilizar uma página com notícias atuais sobre o mercado econômico | ALTA |
|RF-003| Disponibilizar uma página com detalhamento sobre caa tipo de investimento e seus principais ativos | ALTA |
|RF-004| Recomendações de investimentos a partir do perfil de cada usuário | BAIXA |
|RF-005| Um espaço destinado a gestão de gastos e receita | ALTA |
|RF-006| Um sistema de monitoramento da carteira dos usuários | BAIXO |
|RF-007| Modelos de carteira pré-definidas como exemplo para o usuário | BAIXA |
|RF-008| Perfis pré-definidos de acordo com as informações de cada usuário | MÉDIA |
|RF-009| O site deve permitir que usuários façam pesquisas de ativos | MEDIA |

### Requisitos não Funcionais

|ID     | Descrição do Requisito  |Prioridade |
|-------|-------------------------|----|
|RNF-001| O sistema deve ser responsivo para rodar em todos os dispositivos | ALTA | 
|RNF-002| Deve ser acessível para que qualquer usuário possa se conectar de diversos dispositivos incluindo mais antigos | ALTA |
|RNF-003| Todo usuário deverá perceber as funcionalidades de cada página sem esforço | MÉDIA |
|RNF-004| A interface deve ser limpa e passar confiança para o usuário | ALTA |
|RNF-005| O aplicativo deve ter um padrão de linguagem e uma cor definida e marcante | MÉDIA |
|RNF-006| O site deve ser publicado em um ambiente acessível publicamente na Internet (Repl.it, GitHub Pages, Heroku) | ALTA |
|RNF-007| O site deve ser compatível com os principais navegadores do mercado | ALTA |

## Restrições

O projeto está restrito pelos itens apresentados na tabela a seguir.

|ID| Restrição                                             |
|--|-------------------------------------------------------|
|01| O projeto deverá ser entregue até o final do semestre |
|02| Não pode ser desenvolvido um módulo de backend        |
|03| O projeto não pode ser tercerizado                    |
|04| Não deve ser feito aportes financeiros no site        |

# Projeto de Interface
O projeto tem como objetivo criar uma experiência intuitiva e fácil de usar para ajudar os usuários a gerenciar suas finanças e investimentos.
A plataforma terá uma série de recursos que vão desde o cadastro das informações financeiras dos usuários até a disponibilização de notícias e detalhamento sobre os tipos de investimento. Além disso, será possível ter um espaço para gestão de gastos e receita, bem como um sistema de recomendações de investimentos baseado no perfil de cada usuário.
Para atender a essas necessidades, nossa equipe irá desenvolver uma interface moderna e intuitiva, com uma navegação clara e simples. Também será importante ter um sistema de monitoramento da carteira dos usuários e a disponibilização de modelos pré-definidos de carteiras como exemplo.
Ao final do projeto, esperamos que os usuários tenham uma plataforma confiável e eficaz para gerenciar suas finanças e investimentos de forma fácil e segura. Estamos empolgados em começar esse trabalho e oferecer uma experiência única para nossos usuários.
## User Flow
![userflow](images/userflow.png)
## Wireframes
![Tela inicial](images/tela-entrada.png)
![Tela de usuario](images/tela-user.png)
![Tela de cadastro](images/tela-cadastro.png)
![Tela de perfis](images/tela_perfis_predefinidos.png)
![Edição de perfis](images/editar.png)
![Tela de ganhos](images/tela-ganhos.png)
![Overlay botão central](images/botão-central.png)
![Tela resumo](images/tela-resumo.png)
![Tela investimentos](images/tela-investimentos.png)
![Tela despesas](images/tela-despesa.png)
![Tela de noticias](images/tela-jornal.png)
![Tela de orçamentos](images/tela-orçamento.png)
![Tela de estastistica](images/tela-estastica.png)
![Tela barra de pesquisa](images/procurar.png)

# Metodologia e divisão de papéis

Os três membros do grupo dividem as suas funções de acordo com suas habilidades e personalidades. Vitor Silva é o Scrum Master,além de idealizador do projeto,sendo responsável  por liderar o grupo,fiscalizar se os papéis estão sendo cumpridos além de um importante papel na documentação. O Product Owner é o Fernando Theodoro,que já possui  conhecimentos e experiência na área administrativa,coordena as tarefas e funções e às registram em plataformas como o Trello. Já o Desenvolvimento está sendo gerenciado pelo Gabriel Rezende,que já possui bastante experiência com programação e em plataformas como Github,colocando em prática as idéias da equipe.

https://trello.com/b/iflPTsCN/financiart

## Ferramentas

| Ambiente  | Plataforma              |Link de Acesso |
|-----------|-------------------------|---------------|
|Processo de Design Thinkgin  | Miro |  https://miro.com/app/board/uXjVMYDTJcA=/ | 
|Repositório de código | GitHub | https://github.com/ICEI-PUC-Minas-PPLCC-TI/ti-1-ppl-cc-m-20231-finaciart | 
|Hospedagem do site | Replit |  https://financiart-2.vitorsilva64.repl.co/Financiart/financiart/html/home.html | 
|Protótipo Interativo | Figma |  (https://www.figma.com/file/ZaEeyCCSmwGHb2qUdjBRHC/Wireframe-TI?node-id=0-1&t=bzBAIX5iDiGVfkHs-0) |   
> As ferramentas empregadas no projeto são:
> - Busca por imagens: Adobe e Google images
> - Editor de código: Visual code e Replit
> - Ferramentas de comunicação: Discord, trello, whatsapp
> - Ferramentas de diagramação: Figma, miro
> - Plataforma de hospedagem: Replit e GitHub
> 
>Usamos na maioria do tempo o Visual Studio Code por sua capacidade como editor de código. Ele oferece integração com várias linguagens de programação, além de recursos avançados de formatação, depuração e controle de versão.No fim do desenvolvimento passamos a utilizar o Replit, por ser a plataforma escolhida para a Hospedagem do Site.
>
>A diagramação e prototipagem ficou por conta do Figma, que é uma ferramenta de design de interface do usuário. Com recursos de colaboração em tempo real, o Figma facilita a criação de protótipos interativos e designs visualmente atraentes.
>
>Utilizamos o adobe para imagens e trello para organizar as tarefas predefinidas.
>
## Controle de Versão

 A ferramenta de controle de versão escolhida no projeto foi o
 [Git](https://git-scm.com/), sendo que o [Github](https://github.com)
 foi utilizado para hospedagem do repositório `financiart`.
 
# Projeto da Solução

## Tecnologias utilizadas
| TIPO | NOME |
|------|------|
| Linguagem de marcação | HTML |
| Linguagem de estilo | CSS |
| Linguagem de programação | JavaScript |
| Framework | Bootstrap |
| Biblioteca | jQuery/SwiperJS |
| API | News API |
| IDE | Visual Studio Code/Replit |
| Versionamento de código | Git |
| Controle de versão compartilhado | GitHub |
| Hospedagem | Replit |

## Arquitetura da solução

Assim que o usuário entra na plataforma, ele necessário que ele faça login se ja possuir, se não, é preciso fazer o cadastro inicial. O objetivo desse processo, é encaminhar o usuário para a comunidade Financiart.

Logo após isso, o usuário fica livre para escolher qual funcionalidade irá usufruir, sendo as principais delas:

Uma página de gerenciamento financeiro, onde a pessoa conseguirá manter o controle das receitas e despesas com a ajuda de um gráfico e de ua lista de resgistros que ela mesmo fará.

![UserFlow](images/gerenciamento.jpg)

Gráfico separado por categorias:

![UserFlow](images/grafico.png)

Existe a possibilidade do usuário procurar saber quanto teria de retorno em um determindado investimento, por isso temos uma calculadora que fornece o retorno de acordo com as predefinições do usuário.

![UserFlow](images/calcular.png)

Aba voltada para investimentos, onde o usuário consegue navegar por diversos setores, categorias e riscos, até encontrar o investimento ideal.

![UserFlow](images/investimentos.png)

Página de notícias para sempre atualizar o usuário:

![UserFlow](images/noticias.jpeg)

## Plano de Testes

| ID | CENÁRIO | REQUISITO RELACIONADO |
|----|---------|-----------------------|
| 1 | `Cadastrar um registro financeiro` <br><br> Passo a passo: <br> `1.` Fazer login <br> `2.` Abrir a aba acompanhar <br> `3.` Listar o item <br> `4.` Clicar no botão "Salvar registro" <br> `5.` Observar os resultados e a construção do gráfico <br> | RF-001 |
| 2 | `Ver o desempenho dos investimentos` <br><br> Passo a passo: <br> `1.` Fazer login <br> `2.` Abrir a aba investimentos <br> `3.` Buscar um investimento desejado pela barra de pesquisa <br><br> | RF-003 |

## Registros de Testes

Os testes foram fundamentais para identificar falhas no desenvolvimento e na experiência do usuário, com eles tivemos a oportunidade de refatorar algumas partes do código, deixando ele limpo e funcional.

# Referências

## Fontes utilizadas durante o projeto

> **B3**. A Descoberta da Bolsa Pelo Investidor Brasileiro https://www.b3.com.br/data/files/DE/47/57/09/B3866710D32004679C094EA8/Pesquisa%20PF_Apresentacao_final_11_12_20_.pdf

## Aplicações utilizadas como referência para o projeto
> **Investidor10**. Ações, cotações e indicadores Disponível em: https://investidor10.com.br/

> **Status Invest**. Ações, fundos imobíliarios, ... Disponível em: https://statusinvest.com.br/

> **Nuinvest**. Plataforma de investimentos Disponível em: https://www.nuinvest.com.br/
