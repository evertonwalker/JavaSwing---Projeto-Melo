--CREATE DATABASE controle;

--USE controle;


--######CRIAÇÃO TABELA DE CLIENTE PESSOA FÍSICA#######

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


--######CRIAÇÃO TABELA DE CLIENTE PESSOA JURÍDICA#######

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



--#########CRIAÇÃO TABELA DE MECANICOS############

--CREATE TABLE MECANICO (
 
--cpf VARCHAR(14) PRIMARY KEY,

--nome VARCHAR(150) NOT NULL)

--################################################


--########CRIAÇÃO TABELA DE USUÁRIOS#############

--CREATE TABLE USUARIO (id INT Identity Primary Key,
 
--nome VARCHAR(60) NOT NULL,

--senha VARCHAR(60) NOT NULL)

--###############################################


--###############################################

--CREATE TABLE VEÍCULO_PF (
--Vei_Placa VARCHAR(8) PRIMARY KEY,
--Vei_Fabricante VARCHAR(50) NOT NULL,
--Vei_Modelo VARCHAR(50) NOT NULL,
--Vei_Ano INTEGER NOT NULL,
--Cli_Cpf VARCHAR(14) NOT NULL,
--FOREIGN KEY(Cli_Cpf) REFERENCES CLIENTE_FISICO (cpf)
--)

--CREATE TABLE VEÍCULO_PJ (
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

SELECT * FROM CLIENTE;