CREATE DATABASE db_quitanda;
USE db_quitanda;

CREATE TABLE tb_produtos(
id BIGINT auto_increment,
nome VARCHAR(255) not null,
quantidade  int,
datavalidade DATE,
preco DECIMAL(6,2) not null,
PRIMARY KEY (id)
);

 /* mostrar os itens da tabela*/
       SELECT * FROM tb_produtos;
       
INSERT INTO tb_produtos(nome, quantidade,datavalidade, preco)
VALUES("tomate", 100, "2024-06-30", 8.00),
	  ("maçã", 50, "2024-07-10", 11.00),
      ("laraja", 50, "2024-07-10", 8.50),
      ("banana", 100, "2024-07-15", 12.50),
      ("uva", 1200, "2024-06-30", 30.00),
      ("pêra", 500, "2024-07-04", 5.99);
      
       SELECT nome, preco FROM tb_produtos;
       
       SELECT * FROM tb_produtos WHERE id = 1;
       
       SELECT * FROM tb_produtos WHERE preco > 5.00;
       
       SELECT * FROM tb_produtos WHERE preco > 5.0 AND quantidade < 100;
       
       SELECT * FROM tb_produtos WHERE id = 6;
       
       SELECT * FROM tb_produtos;
       
       ALTER TABLE tb_produtos ADD descricao VARCHAR (255);
       
       SELECT * FROM tb_produtos;
       
       /* desbilita o modo seguro de modificar todos os regidtros da tabela*/
       SET SQL_SAFE_UPDATES = 0;
       /* Habilita o modo seguro de modificar todos os regidtros da tabela*/
       SET SQL_SAFE_UPDATES = 1;
       
       /* alterndo o atributo preco do id..*/
       UPDATE tb_produtos SET preco = 6.99 WHERE  id = 6;
       
       UPDATE tb_produtos SET descricao = "Tomate Italiano" WHERE id = 1;
	   UPDATE tb_produtos SET descricao = "Maçã Verde" WHERE id = 2;
	   UPDATE tb_produtos SET descricao = "Laranja Lima" WHERE id = 3;
	   UPDATE tb_produtos SET descricao = "Banana Prata" WHERE id = 4;
	   UPDATE tb_produtos SET descricao = "Uva Italiana" WHERE id = 5;
	   UPDATE tb_produtos SET descricao = "Pêra Williams" WHERE id = 6;
       
       SELECT * FROM tb_produtos;
       /* tentativa de auteração do atributo mas o modo seguro do update esta ativo isso impede a auteração */
       UPDATE tb_produtos SET preco = 8.50;
       
       /* desbilitando o update*/
       SET SQL_SAFE_UPDATES = 0;
       
       /* nova tentativa de execução da query; e todos os precos passarao a ser 8.50*/
       UPDATE tb_produtos SET preco = 8.50;
       SELECT * FROM tb_produtos;
       
       SET SQL_SAFE_UPDATES = 1;
       
       ALTER TABLE tb_produtos DROP descricao;
       SELECT * FROM tb_produtos;
       
       /* deletaado o item 2 da tabela em seguida e verificado a exclusao*/
       DELETE FROM tb_produtos WHERE id = 2;
       SELECT * FROM tb_produtos WHERE id =2; 
       SELECT * FROM tb_produtos;
       
       /* tentativa de deletar  a tabela com o modo de seguranca ativo*/
       DELETE  FROM tb_produtos; 
       
       /*desativando o modo de segurança*/
       SET SQL_SAFE_UPDATES = 0;
       /*  nova tentativa para deletar lembrando que toda a tabela produtos 
       criada anteriomente será apagada com este comando sem a 
       possibilidade de recuperação: comando DELETE  FROM tb_produtos; */
       
       /* alterando o nome de um dos campos da tabela*/
       ALTER TABLE tb_produtos  CHANGE nome nomeproduto VARCHAR(255);
       SELECT * FROM tb_produtos;
       
       /* modificar a estrutura da tabela*/
       ALTER TABLE tb_produtos ADD PRIMARY KEY (id);
       
       /* mostrar os itens da tabela*/
       SELECT * FROM tb_produtos;
       
   
       
       
            
       
       