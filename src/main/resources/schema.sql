CREATE TABLE "Automoveis" (
  id varchar(50) primary key,
  marca varchar(50) not null,
  modelo varchar(50) not null,
  valor decimal(10,2) not null,
  dataCadastro DATE
);