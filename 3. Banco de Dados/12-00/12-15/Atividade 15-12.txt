#TABELAS

Create table Curso (
  CodC INT AUTO_INCREMENT,
  NomeC VARCHAR (255),
  DuracaoC INT,
  MensC INT,
  PRIMARY KEY (CodC)
);


Create table Disciplina (
  CodD INT AUTO_INCREMENT,
  NomeD VARCHAR (255),
  CargaD INT,
  AreaD VARCHAR (255),
  PreReqD INT,
  PRIMARY KEY (CodD)
);


Create table Professor (
  CodP INT AUTO_INCREMENT,
  NomeP VARCHAR (255),
  CidadeP VARCHAR (255),
  TituloP VARCHAR (255),
  PRIMARY KEY (CodP)
);


Create table Grade (
  CodC Int,
  CodD INT,
  CodP INT,
  Sala INT,
  FOREIGN KEY (CodC) REFERENCES Curso (CodC),
  FOREIGN KEY (CodD) REFERENCES Disciplina (CodD),
  FOREIGN KEY (CodP) REFERENCES Professor (CodP)
);


DROP TABLE demo;


#DADOS

INSERT INTO Curso (NomeC, DuracaoC, MensC) VALUES ('Analise Sist', 4, 400);
INSERT INTO Curso (NomeC, DuracaoC, MensC) VALUES ('Eng Mecatronica', 5, 600);
INSERT INTO Curso (NomeC, DuracaoC, MensC) VALUES ('Ciencia Comp', 4, 450);
INSERT INTO Curso (NomeC, DuracaoC, MensC) VALUES ('Eng Eletrica', 4, 600);
INSERT INTO Curso (NomeC, DuracaoC, MensC) VALUES ('Turismo', 3, 350);

INSERT INTO Disciplina (NomeD, CargaD, AreaD, PreReqD) VALUES ('TLP1', 2, 'Computacao', 2);
INSERT INTO Disciplina (NomeD, CargaD, AreaD) VALUES ('Calculo1', 4, 'Matematica');
INSERT INTO Disciplina (NomeD, CargaD, AreaD) VALUES ('Ingles', 2, 'Humanas');
INSERT INTO Disciplina (NomeD, CargaD, AreaD) VALUES ('Ed Fisica', 3, ' Saude');
INSERT INTO Disciplina (NomeD, CargaD, AreaD, PreReqD) VALUES ('G Analitica', 5, 'Matematica', 2);
INSERT INTO Disciplina (NomeD, CargaD, PreReqD) VALUES ('Projeto Final', 6, 1);

INSERT INTO Professor (NomeP, CidadeP, TituloP) VALUES ('Joaquim', 'Rib Preto', 'Mestre');
INSERT INTO Professor (NomeP, CidadeP, TituloP) VALUES ('Paulo', 'Batatais', 'Espec');
INSERT INTO Professor (NomeP, CidadeP, TituloP) VALUES ('Andre', 'Rib Preto', 'Doutor');
INSERT INTO Professor (NomeP, CidadeP, TituloP) VALUES ('Gil', 'S Carlos', 'Doutor');
INSERT INTO Professor (NomeP, CidadeP, TituloP) VALUES ('Juliana', 'S Carlos', 'Pos Doc');

INSERT INTO Grade (CodC, CodD, CodP, Sala) VALUES (1, 6, 1, 305);
INSERT INTO Grade (CodC, CodD, CodP, Sala) VALUES (2, 2, 2, 305);
INSERT INTO Grade (CodC, CodD, CodP, Sala) VALUES (3, 2, 2, 305);
INSERT INTO Grade (CodC, CodD, CodP, Sala) VALUES (4, 1, 5, 201);
INSERT INTO Grade (CodC, CodD, CodP, Sala) VALUES (4, 3, 3, 204);
INSERT INTO Grade (CodC, CodD, CodP, Sala) VALUES (5, 4, 3, 204);
INSERT INTO Grade (CodC, CodD, CodP, Sala) VALUES (5, 4, 4, 207);


#VISUALIZACAO

SELECT * FROM Curso;
SELECT * FROM Disciplina;
SELECT * FROM Professor;
SELECT * FROM Grade;