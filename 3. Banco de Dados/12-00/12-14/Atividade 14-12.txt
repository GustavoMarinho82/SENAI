#TABELAS

CREATE TABLE cliente (
  id INT,
  PRIMARY KEY (id)
);


CREATE TABLE PessoaFisica (
  pfid INT,
  Nome VARCHAR(255),
  Sobrenome VARCHAR(255),
  CPF INT(12),
  RG INT(20),
  DataDeNascimento DATE,
  PRIMARY KEY (pfid),
  cliente_id INT
);


CREATE TABLE PessoaJuridica (
  cliente_id INT
);


CREATE TABLE Contatos (
  cid INT,
  Nome VARCHAR(255),
  Campo VARCHAR(255),
  Obs TEXT,
  PRIMARY KEY (cid),
  TipoContatos_tcid INT,
  cliente_id INT
);


CREATE TABLE TipoContatos (
  tcid INT,
  Nome VARCHAR(255),
  PRIMARY KEY (tcid)
);

DROP TABLE demo;


#CHAVES ESTRANGEIRAS

ALTER TABLE PessoaFisica ADD CONSTRAINT fk_cliente_PessoaFisica 
FOREIGN KEY (cliente_id) REFERENCES cliente(id);

ALTER TABLE PessoaJuridica ADD CONSTRAINT fk_cliente_PessoaJuridica 
FOREIGN KEY (cliente_id) REFERENCES cliente(id);

ALTER TABLE Contatos ADD CONSTRAINT fk_Contatos_TipoContatos 
FOREIGN KEY (TipoContatos_tcid) REFERENCES TipoContatos(tcid);

ALTER TABLE Contatos ADD CONSTRAINT fk_cliente_Contatos 
FOREIGN KEY (cliente_id) REFERENCES cliente(id);