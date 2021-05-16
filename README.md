<p align="center">
  <a href="https://github.com/raul-lima/capgemini-desafio-programacao">
    <img src="https://svgshare.com/i/XKi.svg" width="1102" alt="Desafio de Programação Capgemini 2021" />
  </a>
</p>

<p align="center">Sistema de cadastro de anúncios e consulta de relatórios.</p>

<div align="center">

![GitHub top language](https://img.shields.io/github/languages/top/raul-lima/capgemini-desafio-programacao)<space><space>
![Lines of Code](https://img.shields.io/tokei/lines/github/raul-lima/capgemini-desafio-programacao)<space><space>
![GitHub repo size](https://img.shields.io/github/repo-size/raul-lima/capgemini-desafio-programacao)<space><space>
![Feito por](https://img.shields.io/badge/feito%20por-Raul%20Lima-blueviolet)

</div>

Tabela de Conteúdos
=================
<!--ts-->
   * [Introdução](#introdução)
   * [Informações Gerais](#informações-gerais)
   * [Pré-Requisitos e Configuração](#pré-requisitos-e-configuração)
      * [Instruções de Compilação e Execução](#instruções-de-compilação-e-execução)
   * [Instruções de Uso](#instruções-de-uso)
   * [Links](#links)
   * [Contato](#contato)
<!--te-->

## Introdução

Este projeto foi criado para um desafio em um processo seletivo da Capgemini. 
Trata-se de um sistema criado para uma agência fictícia "Divulga Tudo" que 
precisava de um programa para gerenciar seus anúncios online. 

## Informações Gerais

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

## Pré-Requisitos e Configuração

O projeto foi escrito em Java e foi feito utilizando Maven e Spring Boot. É possível fazer a build
no Maven com sucesso.

Para executar e trabalhar com este projeto, será necessário instalar o Java Development Kit 11:

* [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

É recomendado o uso da IDE Eclipse, que pode ser baixada gratuitamente:

* [Eclipse IDE](https://www.eclipse.org/downloads/)

### Instruções de Compilação e Execução
1. Baixe e instale o Eclipse.
2. Para abrir o projeto no Eclipse, clique em *"File -> Open Projects from file system"*... e em *"Directory..."* 
selecione a pasta do projeto.
3. Dentro do projeto, localize o arquivo *"Application.java"*, dentro do pacote br.com.capgemini.desafiocapgemini2, da pasta /src/main/java.
4. Clique com o botão direito em *"Application.java"*, depois clique em *"Run As" -> "Java application"*.
5. Siga as instruções que aparecerem no console.

## Instruções de Uso

Ao abrir o programa, o menu principal será exibido:

```bash
============= Agência Divulga Tudo =============
== O que deseja fazer? ==
* Digite 1 para cadastrar anúncios
* Digite 2 para consultar relatórios dos anúncios
* Digite 3 para encerrar o programa
```

Caso o usuário digite 1 e aperte enter, o programa dará a opção de escolher o número de anúncios a ser cadastrado:

```bash
== Sistema de cadastro de anúncios ==
Quantos anúncios deseja cadastrar?
```

Depois que o usuário inserir um número inteiro para representar o número de anúncios, o sistema colherá os dados para
cadastrar o anúncio e já fará os cálculos com base nos dados fornecidos para compor o relatório de cada anúncio.

Ao término dos cadastros, o menu principal será exibido novamente. Caso o usuário digite 2 e aperte enter, o programa
exibirá a seguinte opção:

```bash
== Como deseja filtrar os relatórios? ==
* Digite 1 para filtrar por intervalo de tempo
* Digite 2 para filtrar por cliente
```

O filtro por intervalo de tempo exibirá todos os relatórios dos anúncios cadastrados que estejam compreendidos entre
um período de tempo que o usuário fornecer. O filtro por cliente permite a busca pelo nome do cliente registrado no 
anúncio.

Depois de mostrar os resultados, o sistema exibirá novamente o menu principal. As operações acima poderão ser repetidas
indefinitivamente até que o usuário encerre o programa ao digitar 3 no menu principal.

## Links

* [Documentação](https://github.com/raul-lima/capgemini-desafio-programacao/tree/main/doc/br/com/capgemini)
* [Site da capgemini](https://capgemini.proway.com.br/)

## Contato
---

<a href="https://www.linkedin.com/in/raul-lima-adv/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/79487007?s=460&u=61b426b901b8fe02e12019b1fdb67bf0072d4f00&v=4" width="100px;" alt="Raul Lima"/>
<br />
<br />

[![Linkedin Badge](https://img.shields.io/badge/-Raul%20Lima-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/raul-lima-adv/)](https://www.linkedin.com/in/raul-lima-adv/) 
[![Gmail Badge](https://img.shields.io/badge/-raultorres.lima@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:raultorres.lima@gmail.com)](mailto:raultorres.lima@gmail.com)
