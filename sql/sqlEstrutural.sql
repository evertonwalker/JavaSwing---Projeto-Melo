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


--###############################################

--CREATE TABLE VE�CULO_PF (
--Vei_Placa VARCHAR(8) PRIMARY KEY,
--Vei_Fabricante VARCHAR(50) NOT NULL,
--Vei_Modelo VARCHAR(50) NOT NULL,
--Vei_Ano INTEGER NOT NULL,
--Cli_Cpf VARCHAR(14) NOT NULL,
--FOREIGN KEY(Cli_Cpf) REFERENCES CLIENTE_FISICO (cpf)
--)

--CREATE TABLE VE�CULO_PJ (
--Vei_Placa VARCHAR(8) PRIMARY KEY,
--Vei_Fabricante VARCHAR(50) NOT NULL,
--Vei_Modelo VARCHAR(50) NOT NULL,
--Vei_Ano INTEGER NOT NULL,
--Cli_Cnpj VARCHAR(20) NOT NULL,
--FOREIGN KEY(Cli_Cnpj) REFERENCES CLIENTE_JURIDICO (cnpj)
--)

--###################################################



--CREATE TABLE CLIENTE (codigo INTEGER PRIMARY KEY IDENTITY,
--						cpf VARCHAR(14),
--						nome VARCHAR(150),
--						cnpj VARCHAR(20), 
--						nomeFantasia VARCHAR(150),
--						razaoSocial VARCHAR(150),
--						email varchar(60)not null,
--						telefonePrinc varchar(30) not null,
--						telefoneOpc varchar(30),
--						cep VARCHAR(9) not null,
--						logradouro VARCHAR(90) not null,
--						estado varchar(40) not null,	
--						cidade varchar(40) not null,
--						bairro varchar(40) not null,
--						numero varchar(20) not null,
--						tipo INT)

--INSERT INTO CLIENTE (cpf, nome, email, telefonePrinc, telefoneOpc, cep, logradouro, estado, cidade, bairro, numero, tipo)
--			VALUES ('1111','NOME TESTE','fhen@fhen','9999999','888888','51020-021','Rua Dhalia','pe','recife','boa viagem','25', 0)



create table FORNECEDOR( cnpj varchar(20) primary key,
						 nomeFantasia varchar(100) not null,
						 razaoSocial varchar(100) not null,
						 nomeResponsaveis varchar(100),
						 cep varchar(9) not null,
						 logradouro varchar(150) not null,
						 estado varchar(50) not null,
						 cidade varchar(50) not null,
						 bairro varchar(40) not null,
						 email varchar(40) not null,
						 telefonePrinc varchar(15) not null,
						 telefoneOpc varchar(15));

						 select * from fornecedor;

Create table PRODUTO ( id int identity primary key, 
						referencia varchar(30) not null,
						Fornecedor_cnpj varchar(20) REFERENCES FORNECEDOR(cnpj),
						descricao varchar(40) not null,
						unidadeVolume varchar(40) not null,
						precoCusto float not null,
						margemLucro float not null,
						estoqueAtual int not null,
						estoqueMinimo int not null,
						aplicacao varchar(1500));







SELECT * FROM CLIENTE;