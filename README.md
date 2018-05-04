# Compilador JRXML

## Descrição

Aplicação rústica que utiliza a biblioteca [Dynamic Reports](http://dynamicreports.org/) para a compilação de arquivos .jrxml
Projeto criado utilizando a IDE [Spring Tool Suite](https://spring.io/tools).

## Utilização

Compile e execute a aplicação utilizando Eclipse ou alguma derivação do mesmo, selecione o arquivo desejado a partir do JFileChooser e a aplicação irá gerar a compilação em .jasper no mesmo diretório e com o mesmo nome (os dados anteriores não serão perdidos).

Para a compilação utilizando NetBeans, um possível erro pode ser apresentado pela classe main possuir *throws JRException*, podendo ser resolvido tratando da exceção. 

## Licença

Código aberto para alteração e melhorias sob a licença MIT.
