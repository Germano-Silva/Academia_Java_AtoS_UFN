<h2 align="center"> 
    🛠  Projeto em construção   🛠 
</h2>
<h1 align="center"> Surfistinha </h1>
<p>Loja cujo objetivo é vender produtos eróticos de diferentes tipos, desde óleos para massagens até réplicas de órgãos sexuais.</p>


<h2 align="center">Resumo do projeto</h2>

<p>Utilizando as API e Frameworks (Spring Boot, JPA e REST) implemente o back-end, de uma aplicação com a seguinte estrutura:</p>

<p>Um cliente está solicitando um sistema web para manter os registros de seus produtos. A manutenção destes produtos inclui os processos de: cadastrar, visualizar produtos cadastrados, excluir cadastro de produtos indesejados e realizar alterações em produtos já cadastrados. Os registros dos produtos devem conter informações como: código do produto, nome do produto, categoria,  valor do produto e quantidade. </p>

<h2 align="center">Informações sobre os produtos a serem mantidos:</h2> 

 - Seu código tem um valor único (representa o código de barra do produto) e é obrigatório seu preenchimento para o cadastro. 

- Os nomes dos produtos assim como código tem é obrigatório seu preenchimento para o cadastro. 

- Nem todo o produto cadastrado possui uma categoria. 

- O valor do produto é um número fracionário com máximo. Também sendo este um campo de preenchimento obrigatório no seu cadastro. 

- A quantidade de produtos é um número inteiro e de preenchimento obrigatório no cadastro. 

<h2 align="center">Os mapeamentos deverão atender requisições da seguinte forma:</h2>

- `Funcionalidade 1`:
<p>/produtos/cadastrar - Cadastro de novos produtos (atenderá somente a requisições POST);</p>
 

- `Funcionalidade 2`:
<p>/produtos/alterar - Alteração de produtos previamente cadastros. Deverá ser informado via mapeamento o id do produto a ser alterado (atenderá somente a requisições do tipo PUT)</p>
Ex; Alterar o produto com id=5 (/produtos/alterar/5);

 
- `Funcionalidade 3`:
<p>/produtos/excluir - Exclusão de produtos via id (atenderá somente a requisições do tipo DELETE);</p>
Ex; Excluir o produto com id=5 (/produtos/excluir/5); 
 

- `Funcionalidade 4`:
<p>/produtos - Lista todos os produtos cadastrados no banco de dados (Atenderá somente a requisições do tipo GET);</p>
 

- `Funcionalidade 5`:
<p>/produtos/5 - Lista o produto cujo id=5.</p> 
 

Os cadastros deverão ser feitos através do POSTMAN, utilizando formato JSON.

Utilizar o banco de dados H2 para esta atividade. 

Utilizar os pacotes do projeto, como apresentado na aula do dia 27/06/2022 
