# Desafio de programação da Capgemini 2021  
Sistema de cadastro de anúncios e consulta de relatórios.

## Introdução

Este projeto foi criado para um desafio em um processo seletivo da Capgemini. 
Trata-se de um sistema criado para uma agência fictícia "Divulga Tudo" que 
precisava de um programa para gerenciar seus anúncios online. 

## Informações gerais

O programa permite o cadastro de anúncios com os seguintes dados:

* nome do anúncio
* cliente
* data de início
* data de término
* investimento por dia

Cada anúncio tem um relatório com os seguintes dados:

* valor total investido
* quantidade máxima de visualizações
* quantidade máxima de cliques
* quantidade máxima de compartilhamentos

Por fim, é possível filtrar os relatórios por dois critérios:

* Por intervalo de tempo
* Por cliente

Para fazer os cálculos, são considerados os seguintes critérios fictícios:

•	a cada 100 pessoas que visualizam o anúncio 12 clicam nele.
•	a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.
•	cada compartilhamento nas redes sociais gera 40 novas visualizações. 
•	30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido. 
•	o mesmo anúncio é compartilhado no máximo 4 vezes em sequência 
(1ª pessoa -> compartilha -> 2ª pessoa -> compartilha - > 3ª pessoa -> compartilha -> 4ª pessoa) 

## Setup

O projeto foi escrito em Java e foi feito utilizando Maven e Spring Boot. É possível fazer a build
no Maven com sucesso.

Para executar e trabalhar com este projeto, será necessário instalar o Java Development Kit 11:

* [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

É recomendado o uso da IDE Eclipse, que pode ser baixada gratuitamente:

* [Eclipse IDE](https://www.eclipse.org/downloads/)

### Instruções de compilação e execução
1. Baixe e instale o Eclipse.
2. Para abrir o projeto no Eclipse, clique em *"File -> Open Projects from file system"*... e em *"Directory..."* 
selecione a pasta do projeto.
3. Dentro do projeto, localize o arquivo *"Application.java"*, dentro do pacote br.com.capgemini.desafiocapgemini2, da pasta /src/main/java.
4. Clique com o botão direito em *"Application.java"*, depois clique em *"Run As" -> "Java application"*.
5. Siga as instruções que aparecerem no console.

## Instruções de uso

Ao abrir o programa, o menu principal será exibido:

============= Agência Divulga Tudo =============
== O que deseja fazer? ==
* Digite 1 para cadastrar anúncios
* Digite 2 para consultar relatórios dos anúncios
* Digite 3 para encerrar o programa

Caso o usuário digite 1 e aperte enter, o programa dará a opção de escolher o número de anúncios a ser cadastrado:

== Sistema de cadastro de anúncios ==
Quantos anúncios deseja cadastrar?

Depois que o usuário inserir um número inteiro para representar o número de anúncios, o sistema colherá os dados para
cadastrar o anúncio e já fará os cálculos com base nos dados fornecidos para compor o relatório de cada anúncio.

Ao término dos cadastros, o menu principal será exibido novamente. Caso o usuário digite 2 e aperte enter, o programa
exibirá a seguinte opção:

== Como deseja filtrar os relatórios? ==
* Digite 1 para filtrar por intervalo de tempo
* Digite 2 para filtrar por cliente

O filtro por intervalo de tempo exibirá todos os relatórios dos anúncios cadastrados que estejam compreendidos entre
um período de tempo que o usuário fornecer. O filtro por cliente permite a busca pelo nome do cliente registrado no 
anúncio.

Depois de mostrar os resultados, o sistema exibirá novamente o menu principal. As operações acima poderão ser repetidas
indefinitivamente até que o usuário encerre o programa ao digitar 3 no menu principal.

## Links

* [Documentação](https://github.com/raul-lima/capgemini-desafio-programacao/tree/main/doc/br/com/capgemini)
* [Site da capgemini](https://capgemini.proway.com.br/)

## Contato

raultorres.lima@gmail.com
