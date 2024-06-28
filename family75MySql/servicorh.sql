CREATE DATABASE db_servicosrh;
USE db_servicosrh;

CREATE TABLE tb_colaboradores(
id BIGINT auto_increment,
nome_completo VARCHAR(255) not null,
cargo VARCHAR(255),
departamento VARCHAR(255),
salario DECIMAL (10,2) not null,
data_admissao DATE,
PRIMARY KEY (id)
);
SELECT * FROM tb_colaboradores;

INSERT INTO tb_colaboradores( nome_completo, cargo, departamento, salario, data_admissao)
VALUES("jurema miranda","analista de Marketing","Marketing", 3574.00, "2024-07-04"),
 ("João de Belo", "Analista de RH", "Recursos Humanos", 3900.00, "2024-03-15"),
 ("Amado Amoroso", "Desenvolvedor junior", "Tecnologia da informação", 1700.00, "2022-07-12"),
 ("Antonio Manso", "Assistente Administrativo"," Administração", 1821.00, "2022-05-01"),
 ("Primorosa Santos", "Gestora" , "Gerente de TI",2650.00, "2018-06-15");
 
  SELECT * FROM tb_colaboradores;
  
  SELECT * FROM tb_colaboradores WHERE salario > 2000;
  SELECT * FROM tb_colaboradores;
  
   SELECT * FROM tb_colaboradores WHERE salario < 2000;
   SELECT * FROM tb_colaboradores;
   
   UPDATE db_colaboradores SET salario = 6000.00 WHERE id = 1;
   SELECT * FROM tb_colaboradores;