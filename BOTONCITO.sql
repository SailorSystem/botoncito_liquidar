/*==============================================================*/
/* Table: BONIFICACIONES                                        */
/*==============================================================*/
CREATE TABLE BONIFICACIONES (
   BONCODIGO            CHAR(5)              not null,
   BONDESCRIPCION       CHAR(30)             not null,
   BONVALOR             NUMERIC(7,2)          not null,
   CONSTRAINT PK_BONIFICACIONES PRIMARY KEY (BONCODIGO)
);

/*==============================================================*/
/* Table: BXN                                                   */
/*==============================================================*/
CREATE TABLE BXN (
   BONCODIGO            CHAR(5)              not null,
   NOMCODIGO            CHAR(7)              not null,
   BXNVALOR             NUMERIC(7,2)          not null,
   BXNSTATUS            CHAR(3)              not null,
   CONSTRAINT PK_BXN PRIMARY KEY (BONCODIGO, NOMCODIGO)
);

/*==============================================================*/
/* Table: NOMINAS                                               */
/*==============================================================*/
create table NOMINAS (
   NOMCODIGO            CHAR(7)              not null,
   EMPCODIGO            INT              not null,
   NOMANIO              CHAR(4)              not null,
   NOMMES               CHAR(2)              not null,
   NOMFECHAEMISION	    DATE                 not null,
   NOMSTATUS            CHAR(3)              not null,
   constraint PK_NOMINAS primary key (NOMCODIGO)
);

/*==============================================================*/
/* Table: DESCUENTOS                                            */
/*==============================================================*/
CREATE TABLE DESCUENTOS (
   DESCODIGO            CHAR(5)              not null,
   DESDESCRIPCION       CHAR(30)             not null,
   DESVALOR             NUMERIC(7,2)          not null,
   CONSTRAINT PK_DESCUENTOS PRIMARY KEY (DESCODIGO)
);

/*==============================================================*/
/* Table: DXN                                                   */
/*==============================================================*/
CREATE TABLE DXN (
   NOMCODIGO            CHAR(7)              not null,
   DESCODIGO            CHAR(5)              not null,
   DXNVALOR             NUMERIC(7,2)          not null,
   DXNSTATUS            CHAR(3)              not null,
   CONSTRAINT PK_DXN PRIMARY KEY (NOMCODIGO, DESCODIGO)
);


CREATE TABLE EMPLEADOS (
   EMPCODIGO            int               PRIMARY KEY,
   EMPAPELLIDO1         CHAR(30)             NOT NULL,
   EMPAPELLIDO2         CHAR(30),
   EMPNOMBRE1           CHAR(30)             NOT NULL,
   EMPNOMBRE2           CHAR(30),
   EMPFECHANACIMIENTO   DATE                 NOT NULL,
   EMPSEXO              CHAR(1)              NOT NULL,
   EMPEMAIL             CHAR(60)             NOT NULL,
   EMPDIRECCION         CHAR(60)             NOT NULL,
   EMPTIPOSANGRE        CHAR(3)              NOT NULL,
   EMPSUELDO            NUMERIC(7,2)         NOT NULL,
   EMPBANCO             CHAR(30)             NOT NULL,
	EMPFECHAINGRESO    	DATE                          ,
	EMPFECHASALIDA	    DATE    					,
   EMPCUENTA            CHAR(10)             NOT NULL,
   EMPSTATUS            CHAR(4)              NOT NULL,

   CONSTRAINT CK_EMPPRIMER_APELLIDO CHECK (EMPAPELLIDO1 ~ '^[a-zA-Z ]+$'),
   CONSTRAINT CK_EMPSEGUNDO_APELLIDO CHECK (EMPAPELLIDO2 IS NULL OR EMPAPELLIDO2 ~ '^[a-zA-Z ]+$'),
   CONSTRAINT CK_EMPPRIMER_NOMBRE CHECK (EMPNOMBRE1 ~ '^[a-zA-Z ]+$'),
   CONSTRAINT CK_EMPSEGUNDO_NOMBRE CHECK (EMPNOMBRE2 IS NULL OR EMPNOMBRE2 ~ '^[a-zA-Z ]+$'),
   CONSTRAINT CK_EMPFECHA_NACIMIENTO CHECK (EMPFECHANACIMIENTO <= '2006-06-14'), -- La fecha debe ser anterior al 14 de junio de 2006 para cumplir la condición de tener al menos 18 años.
	CONSTRAINT CK_EMPSEXO CHECK (EMPSEXO='M'OR 'F'),
   CONSTRAINT CK_EMPEMAIL_ARROBA CHECK (POSITION('@' IN EMPEMAIL) > 0),
   CONSTRAINT CK_EMPSUELDO_POSITIVO CHECK (EMPSUELDO >= 0),
   CONSTRAINT CK_EMPBANCO_VALIDO CHECK (UPPER(EMPBANCO) IN ('BANCO DEL PACÍFICO', 'BANCO PICHINCHA', 'BANCO GUAYAQUIL', 'BANCO DE LOJA', 'BANCO DEL AUSTRO', 'BANCO INTERNACIONAL', 'BANCO BOLIVARIANO', 'BANCO PRODUBANCO', 'BANCO DE MACHALA', 'BANCO SOLIDARIO', 'BANCO DE FOMENTO', 'BANCO PROCREDIT', 'BANCO AMAZONAS', 'BANCO DEL LITORAL')),
   CONSTRAINT CK_EMPCUENTA_CARACTERES CHECK (EMPCUENTA ~ '^[0-9]{10}$'), -- Solo permite valores numéricos de exactamente 10 dígitos
   CONSTRAINT CK_EMPTIPOSANGRE_VALIDO CHECK (EMPTIPOSANGRE IN ('A+', 'A-', 'B+', 'B-', 'AB+', 'AB-', 'O+', 'O-')), -- Tipos de sangre válidos
   CONSTRAINT CK_EMPSTATUS_VALIDO CHECK (EMPSTATUS IN ('INAC', 'ACTI','DESP', 'MUER'))
);

CREATE TABLE Liquidaciones (
    LIQCODIGO    CHAR(7)     NOT NULL,
    EMPCODIGO    INT   NOT NULL,
	LIQINGRESOS NUMERIC(7,2)  NOT NULL,
	LIQSUELDOXDIA NUMERIC(7,2) NOT NULL,
	LIQDIASLABORABLESXMESACTUAL NUMERIC(7,2) NOT NULL,
	LIQTIPO     CHAR(60)       NOT NULL, 
	LIQVALORXTIPO   NUMERIC(7,2)   NOT NULL,
    LIQTOTAL    NUMERIC(7,2)    NOT NULL,
    CONSTRAINT fk_empCodigo FOREIGN KEY (EMPCODIGO) REFERENCES Empleados(EMPCODIGO)
);

ALTER TABLE LIQUIDACIONES
ADD CONSTRAINT CK_LIQTIPO CHECK (UPPER(LIQTIPO) IN ('ACUERDO DE LAS PARTES', 'DESPIDO INTEMPESTIVO', 'INCAPACIDAD PERMANENTE O MUERTE', 'PREVIO VISTO BUENO'));



alter table BXN
   add constraint FK_BXN_BXN_NOMINAS foreign key (NOMCODIGO)
      references NOMINAS (NOMCODIGO)
      on delete restrict on update restrict;

alter table BXN
   add constraint FK_BXN_BXN2_BONIFICA foreign key (BONCODIGO)
      references BONIFICACIONES (BONCODIGO)
      on delete restrict on update restrict;
	  
alter table DXN
   add constraint FK_DXN_DXN_DESCUENT foreign key (DESCODIGO)
      references DESCUENTOS (DESCODIGO)
      on delete restrict on update restrict;

alter table DXN
   add constraint FK_DXN_DXN2_NOMINAS foreign key (NOMCODIGO)
      references NOMINAS (NOMCODIGO)
      on delete restrict on update restrict;

alter table NOMINAS
   add constraint FK_NOMINAS_MANTIENE_EMPLEADO foreign key (EMPCODIGO)
      references EMPLEADOS (EMPCODIGO)
      on delete restrict on update restrict;
	  
create  index MANTIENE_FK on NOMINAS (EMPCODIGO);
create  index BXN2_FK on BXN (BONCODIGO);
create  index BXN_FK on BXN (NOMCODIGO);	  
create  index DXN2_FK on DXN (NOMCODIGO);
create  index DXN_FK on DXN (DESCODIGO);


CREATE USER gerente WITH PASSWORD 'gerenteguapo123';
CREATE USER contratista WITH PASSWORD 'contratista123';


GRANT CONNECT ON DATABASE botoncito TO gerente;
GRANT USAGE ON SCHEMA public TO gerente;
GRANT SELECT ON ALL TABLES IN SCHEMA public TO gerente;

GRANT CONNECT ON DATABASE botoncito TO contratista;
GRANT USAGE ON SCHEMA public TO contratista;
GRANT SELECT, INSERT ON ALL TABLES IN SCHEMA public TO contratista;
GRANT DELETE ON ALL TABLES IN SCHEMA public TO contratista;
GRANT UPDATE ON ALL TABLES IN SCHEMA public TO contratista;

INSERT INTO EMPLEADOS (
   EMPCODIGO, EMPAPELLIDO1, EMPAPELLIDO2, EMPNOMBRE1, EMPNOMBRE2, EMPFECHANACIMIENTO, EMPSEXO, EMPEMAIL, EMPDIRECCION, EMPTIPOSANGRE, EMPSUELDO, EMPBANCO, EMPFECHAINGRESO, EMPFECHASALIDA, EMPCUENTA, EMPSTATUS
) VALUES
(1, 'Gomez', 'Perez', 'Carlos', 'Andres', '1985-03-15', 'M', 'carlos.gomez@example.com', '123 Main St', 'O+', 2500.00, 'BANCO DEL PACÍFICO', '2010-05-20', NULL, '1234567890', 'ACTI'),

(2, 'Martinez', 'Lopez', 'Ana', 'Maria', '1990-07-22', 'F', 'ana.martinez@example.com', '456 Elm St', 'A-', 3000.00, 'BANCO PICHINCHA', '2015-08-15', NULL, '2345678901', 'ACTI'),

(3, 'Rodriguez', 'Gomez', 'Juan', NULL, '1978-11-30', 'M', 'juan.rodriguez@example.com', '789 Oak St', 'B+', 3500.00, 'BANCO GUAYAQUIL', '2008-03-10', NULL, '3456789012', 'ACTI'),

(4, 'Fernandez', NULL, 'Laura', 'Isabel', '1995-02-10', 'F', 'laura.fernandez@example.com', '101 Pine St', 'AB-', 2800.00, 'BANCO DE LOJA', '2020-11-01', NULL, '4567890123', 'ACTI'),

(5, 'Garcia', 'Vega', 'Luis', 'Alberto', '1980-12-25', 'M', 'luis.garcia@example.com', '202 Maple St', 'A+', 3200.00, 'BANCO INTERNACIONAL', '2012-01-12', '2024-05-15', '5678901234', 'DESP'),

(6, 'Torres', 'Ramos', 'Miguel', NULL, '1988-09-18', 'M', 'miguel.torres@example.com', '303 Cedar St', 'O-', 2700.00, 'BANCO BOLIVARIANO', '2018-07-23', NULL, '6789012345', 'ACTI'),

(7, 'Vargas', 'Mendoza', 'Sofia', 'Alejandra', '1992-04-05', 'F', 'sofia.vargas@example.com', '404 Birch St', 'B-', 2900.00, 'BANCO PRODUBANCO', '2019-09-17', NULL, '7890123456', 'ACTI'),

(8, 'Rojas', 'Perez', 'Andres', NULL, '1994-06-20', 'M', 'andres.rojas@example.com', '505 Spruce St', 'AB+', 3100.00, 'BANCO DE MACHALA', '2021-02-25', NULL, '8901234567', 'ACTI'),

(9, 'Flores', NULL, 'Diana', 'Carolina', '1983-01-15', 'F', 'diana.flores@example.com', '606 Willow St', 'A-', 2600.00, 'BANCO SOLIDARIO', '2013-06-12', NULL, '9012345678', 'ACTI'),

(10, 'Hernandez', 'Castro', 'Ricardo', 'Jose', '1987-10-10', 'M', 'ricardo.hernandez@example.com', '707 Poplar St', 'O+', 3400.00, 'BANCO DE FOMENTO', '2016-04-30', NULL, '0123456789', 'ACTI');


INSERT INTO NOMINAS VALUES ('NOM0001', 1, '4', '2', '1-1-1', '1017-9-6', '0');
INSERT INTO NOMINAS VALUES('NOM0002', 2, '3', '3', '927-10-8', '1376-11-7', '1');
INSERT INTO NOMINAS VALUES ('NOM0003', 3, '0', '4', '1556-7-23', '1-1-1', '2');
INSERT INTO NOMINAS VALUES ('NOM0004', 4, '1', '5', '448-7-4', '1571-7-11', '3');
INSERT INTO NOMINAS VALUES ('NOM0005', 5, '2', '6', '1945-8-8', '341-4-12', '4');
INSERT INTO NOMINAS VALUES ('NOM0006', 6, '3', '7', '1105-7-15', '613-10-29', '5');

INSERT INTO BONIFICACIONES VALUES ('B1010', 'Fondo de Reserva Mensualizado', 145);
INSERT INTO BONIFICACIONES VALUES ('B1020', 'Bono 20 anios de servicio', 200);
INSERT INTO BONIFICACIONES VALUES ('B1030', 'Bono 25 anios de servicio', 250);
INSERT INTO BONIFICACIONES VALUES ('B1040', 'Bono 30 anios de servicio', 300);
INSERT INTO BONIFICACIONES VALUES ('B1050', 'Bono publicación scopus', 500);
INSERT INTO BONIFICACIONES VALUES ('B1060', 'Bono horas extra', 100);

INSERT INTO DESCUENTOS VALUES ('D2010', 'Aporte Personal IESS', 333);
INSERT INTO DESCUENTOS VALUES ('D2020', 'Aporte Personal FIDEICOMISO', 555);
INSERT INTO DESCUENTOS VALUES ('D2030', 'Aporte Personal Seguro Cancer', 444);
INSERT INTO DESCUENTOS VALUES ('D2040', 'Aporte Personal Seguro Medico', 111);
INSERT INTO DESCUENTOS VALUES ('D2050', 'Aporte Personal Seguro de Vida', 10);
INSERT INTO DESCUENTOS VALUES ('D2060', 'Aporte APPUCE', 28);

INSERT INTO BXN VALUES ('B1010', 'NOM0001', 1, '4');
INSERT INTO BXN VALUES ('B1020', 'NOM0002', 5, ');
INSERT INTO BXN VALUES ('B1030', 'NOM0003', 2, '0');
INSERT INTO BXN VALUES ('B1040', 'NOM0004', 3, '1');
INSERT INTO BXN VALUES ('B1050', 'NOM0005', 4, '2');
INSERT INTO BXN VALUES ('B1060', 'NOM0006', 0, '3');

INSERT INTO DXN VALUES ('NOM0001', 'D2010', 2, ');
INSERT INTO DXN VALUES ('NOM0002', 'D2020', 4, '0');
INSERT INTO DXN VALUES ('NOM0003', 'D2030', 3, '1');
INSERT INTO DXN VALUES ('NOM0004', 'D2040', 1, '2');
INSERT INTO DXN VALUES ('NOM0005', 'D2050', 0, '3');
INSERT INTO DXN VALUES ('NOM0006', 'D2060', 5, '4');