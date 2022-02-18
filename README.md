# DesafiodeProgramacaoCapgemini

Este projeto é um desafio de programação da empresa academia Capgemini com parceria com a ProWay. O desafio é composto por 3 questões que devem gerar um algoritmo com a resposta para a situação proposta.

### Requisitos:

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 8: Necessário para executar o projeto Java](https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html)
- [Maven 3.8.4: Necessário para realizar o build do projeto Java](https://dlcdn.apache.org/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.zip)
- [Eclipse: Para verificação do código do projeto](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/oxygen3a)

### Classes:

Cada classe criada é responsavel por resolver um problema proposto:

Questao1

Problema:

Escreva um algoritmo que mostre na tela uma escada de tamanho ***n*** utilizando o caractere *****
e espaços. A base e altura da escada devem ser iguais ao valor de ***n***. A última linha não deve conter nenhum espaço.

Resposta:

A classe Questao1 recebe um valor numérico e através de um loop principal do tipo *for* e dois loops auxiliares do mesmo tipo faz o desenho de uma escada no console.



Questao2

Problema:

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A
página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

● Possui no mínimo 6 caracteres.
● Contém no mínimo 1 digito.
● Contém no mínimo 1 letra em minúsculo.
● Contém no mínimo 1 letra em maiúsculo.
● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Resposta:

A classe Questao2 recebe uma string e através de condiciões *if* se a sequencia de caracteres digitados atende os requisitos para uma senha forte. Ao fim da validação o console mostra se a senha é valida, ou se não é mostra o que falta para atender as condições.



Questao3

Problema:

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.

A classe Questao3 recebe uma sequencia de caracteres *string* e chama o método que calcula os anagramas pares das *substrings*  criadas a partir da string recebida mostrando a quantidade de anagramas encontrados.

<u>TesteCapgemini</u>

Esta classe tem como objetivo criar um arquivo executavel com a extensão .jar para que os testes possam ser feitos também sem uma IDE.

### Testes Unitarios:

O Projeto contem 3 arquivos onde são feitos os testes unitários para cada classe são eles:

- Questao1Test
- Questao2Test
- Questao3Test

### Arquivo Jar: teste_capgemini.jar

 O Arquivo Jar tem como objetivo possibilitar que os testes possam ser feitos também sem uma IDE.

Para executar o mesmo em computadores com sistema Windows é necessario abrir o prompt de comando (cmd.exe) no diretorio onde está o arquivo teste_capgemini.jar, digitar "java -jar teste_capgemini.jar" após isso basta seguir as instruções na tela.

Em computadores Linux é necessario utilizar o terminal/shell no diretorio onde está o arquivo teste_capgemini.jar, digitar "java -jar teste_capgemini.jar" após isso basta seguir as instruções na tela.

### Documentação:

A documentação do projeto pode ser encontrada no endereço:
https://altieres-moreira.github.io/DesafiodeProgramacaoCapgemini/

ou na pasta docs do projeto atraves do arquivo: index.html



