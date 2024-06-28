CREATE DATABASE bd_escola;
USE bd_escola;

CREATE TABLE estudantes(
id BIGINT auto_increment,
nome_completo VARCHAR(255) not null,
ano_nascimento DATE,
matricula VARCHAR(25) UNIQUE,
serie_ano VARCHAR(25),
email VARCHAR(100) not null UNIQUE,
PRIMARY KEY (id)
);
SELECT * FROM estudantes;


/*ALTER TABLE  estudantes CHANGE notas nota DECIMAL not null;*/


/*INSERT INTO estudantes (nome_completo, ano_nascimento, matricula, serie_ano, email, nota)
VALUE("Horislene ", "2006-03-15", 7626159, "7º ano", "horislene@example.com", 8.5),
	 ("zaualy", "2005-09-22", 7626268, "8º ano", "zaualy@example.com", 7.0),
	 ("Benjamin", "2003-12-10", 7626345, "10º ano", "benjamin@example.com", 6.3),
	 ("James", "2004-05-18", 7626432, "9º ano", "james@example.com", 9.2 ),
	 ("Antonio", "2002-08-30", 7626580, "11º ano", "antonio@example.com", 8.0 ),
	 ("senhorinha", "2007-06-04","7626691", "6º ano", "senhorinha@example.com", 7.5),
	 ("Hugo", "2008-02-20", "7626773",  "5º ano", "hugo@example.com", 9.5);
     */
     SELECT * FROM estudantes;
     
    /* SELECT * FROM estudantes WHERE nota > 7.0; */
     
	/*SELECT * FROM estudantes WHERE nota < 7.0; */

     
     UPDATE estudantes SET matricula = 2024003 WHERE id = 3;
        SELECT * FROM estudantes;
     
     