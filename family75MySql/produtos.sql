CREATE DATABASE db_produtos;
Use db_produtos;
CREATE TABLE tb_produtos(
id BIGINT auto_increment,
nome VARCHAR(255) not null,
descricao TEXT not null,
preco DECIMAL(10,2) not null,
quantidade_estoque INT DEFAULT 0,
PRIMARY KEY (id)
);


/*INSERT INTO tb_produtos( nome, descricao, preco, quantidade_estoque)
VALUE("Vestido De Tule"," Vestido de tule com recorte na barra", 449.00, 60),
	 ("Vestido Midi"," Vestido decote V, barra em camadas e com bordado", 411.00, 30),
	 ("Vestido Feminino","Vestido Elegante e Moderno clássico ", 259.00, 20),
	 ("Vestido de Festa manga longa","Possui abertura lateral até as costas", 590.00, 80),
	 ("Vestido Edimburgo"," seu design elegante, mangas curtas levemente bufantes", 249.00, 20),
	 ("Vestido Bourdon","Longo azul sererenty, corpete bordado ombro a ombro", 700.00 , 5),
	 ("Vestido Três Maria","Alça Babados e Amarração Trançada", 150.00, 18),
	 ("Vestido Vintage","conforto vestido midi fresco estiloso" ,264.00, 25);*/
SELECT * FROM tb_produtos;

 /*SELECT * FROM tb_produtos WHERE preco > 500;*/

 
 /*SELECT * FROM tb_produtos WHERE PRECO < 500;*/

 
UPDATE tb_produtos SET nome = "Vestido de Festa" WHERE id = 4;
UPDATE tb_produtos SET descricao = "manga longa Possui abertura lateral até as costas" WHERE id = 4;
SELECT * FROM tb_produtos;
 
/*UPDATE tb_produtos SET descricao = "Mangas curtas levemente bufantes" WHERE id = 5;

UPDATE tb_produtos SET descricao = "Decote V, barra em camadas e com bordados" WHERE id = 2;

UPDATE tb_produtos SET descricao = "Longo azul, corpete bordado ombro a ombro" WHERE id = 6;
*/
 
 
 