--CREATE DATABASE controle;

--USE controle;


--######CRIA��O TABELA DE CLIENTE PESSOA F�SICA#######

--CREATE TABLE CLIENTE_FISICO (
 
--cpf VARCHAR(14) PRIMARY KEY,

--nome VARCHAR(150) NOT NULL,

--email varchar(60)not null,

--telefonePrinc varchar(30) not null,

--telefoneOpc varchar(30),

--cep VARCHAR(9) not null,

--logradouro VARCHAR(90) not null,

--estado varchar(40) not null,	

--cidade varchar(40) not null,

--bairro varchar(40) not null,

--numero varchar(20) not null

--)

--################################################


--######CRIA��O TABELA DE CLIENTE PESSOA JUR�DICA#######

--CREATE TABLE CLIENTE_JURIDICO ( 

--cnpj VARCHAR(20) PRIMARY KEY,

--nomeFantasia VARCHAR(150) NOT NULL,

--razaoSocial VARCHAR(150) NOT NULL,

--email varchar(60)not null,

--telefonePrinc varchar(30) not null,

--telefoneOpc varchar(30),

--cep VARCHAR(9) not null,

--logradouro VARCHAR(90) not null,

--estado varchar(40) not null,	

--cidade varchar(40) not null,

--bairro varchar(40) not null,

--numero varchar(20) not null

--)

--#############################################



--#########CRIA��O TABELA DE MECANICOS############

--CREATE TABLE MECANICO (
 
--cpf VARCHAR(14) PRIMARY KEY,

--nome VARCHAR(150) NOT NULL)

--################################################


--########CRIA��O TABELA DE USU�RIOS#############

--CREATE TABLE USUARIO (id INT Identity Primary Key,
 
--nome VARCHAR(60) NOT NULL,

--senha VARCHAR(60) NOT NULL)

--###############################################

SELECT * FROM MECANICO;