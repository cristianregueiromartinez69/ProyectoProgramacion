
drop table if exists Pokemon  cascade;
drop table if exists Atacks cascade ;
drop table if exists Jugador cascade ;

create table Pokemon (
Name varchar(11),
Type1 varchar(20),
Level integer,
Life integer,
Sex varchar(7),
Speed int,
Syze float,
Weight float,
Atacks varchar(20),
primary key (Name));

create table Atacks(
id int,
Namea varchar(22),
Name varchar(11),
Typea varchar(11),
Power int,
PP int,
Precission int,
primary key (id),
foreign key (Name) references Pokemon(Name));


create table Jugador(
Alias varchar(21),
primary key (Alias));


INSERT INTO Pokemon VALUES('Garchomp','Tierra-Dragon',100,357,'Female',240,1.9,95,'Garchomp');
INSERT INTO Pokemon VALUES('Drampa','Normal-Dragon',100,297,'Male',108,3,185,'Drampa');
INSERT INTO Pokemon VALUES('Empoleon','Agua-Acero',100,309,'Male',156,1.7,84.5,'Empoleon');
INSERT INTO Pokemon VALUES('Gengar','Fantasma-Veneno',100,261,'Male',256,1.5,40.5,'Gengar');
INSERT INTO Pokemon VALUES('Infernape','Fuego-Lucha',100,293,'Male',252,1.2,55,'Infernape');
INSERT INTO Pokemon VALUES('Lucario','Lucha-Acero',100,281,'Female',216,1.2,54,'Lucario');
INSERT INTO Pokemon VALUES('Luxray','Electrico',100,301,'Male',176,1.4,42,'Luxray');
INSERT INTO Pokemon VALUES('Marshadow','Fantasma-Lucha',100,321,'',286,0.7,22.2,'Marshadow');
INSERT INTO Pokemon VALUES('Milotic','Agua',100,331,'Female',198,6.2,162,'Milotic');
INSERT INTO Pokemon VALUES('Snorlax','Normal',100,461,'Male',96,2.1,460,'Snorlax');
INSERT INTO Pokemon VALUES('Tinkaton','Hada-Acero',100,311,'Female',224, 0.7,112.8,'Tinkaton');
INSERT INTO Pokemon VALUES('Tyranitar','Roca-Siniestro',100,341,'Male',158,2,202,'Tyranitar');

INSERT INTO Atacks VALUES(1,'Ultrapuño','Infernape','Lucha',40,30,100);
INSERT INTO Atacks VALUES(2,'A Bocajarro','Infernape','Lucha',120,5,100);
INSERT INTO Atacks VALUES(3,'Envite Ígneo','Infernape','Fuego',120,15,100);
INSERT INTO Atacks VALUES(4,'Acróbata','Infernape','Volador',55,15,100);

INSERT INTO Atacks VALUES(5,'Ataque Oseo','Lucario','Tierra',25,10,90);
INSERT INTO Atacks VALUES(6,'A bocajarro','Lucario','Tierra',25,10,90);
INSERT INTO Atacks VALUES(7,'Esfera Aural','Lucario','Tierra',25,10,90);
INSERT INTO Atacks VALUES(8,'Onda Vacío','Lucario','Tierra',25,10,90);

INSERT INTO Atacks  VALUES (9,'Mordisco','Luxray', 'Siniestro', 60, 25, 100.0);
INSERT INTO Atacks  VALUES (11,'Voltio Cruel','Luxray', 'Electrico', 90, 15, 100.0);
INSERT INTO Atacks  VALUES (12,'Colmillo Rayo','Luxray', 'Electrico', 65, 15, 95.0);
INSERT INTO Atacks  VALUES (13,'Psicocolmillo','Luxray', 'Psiquico', 85, 10, 100.0);

INSERT INTO Atacks  VALUES (14,'Rayo Hielo','Milotic', 'Hielo', 90, 10, 100.0);
INSERT INTO Atacks  VALUES (15,'Surf','Milotic', 'Agua', 90, 15, 100.0);
INSERT INTO Atacks  VALUES (16,'Hidrobomba','Milotic', 'Agua', 110, 5, 80.0);
INSERT INTO Atacks  VALUES (17,'Cola Dragon','Milotic', 'Dragon', 60, 10, 90.0);

INSERT INTO Atacks VALUES (18,'Fuerza Equina','Snorlax', 'Tierra', 95, 10, 95.0);
INSERT INTO Atacks VALUES (19,'Machada','Snorlax', 'Lucha', 100, 10, 90.0);
INSERT INTO Atacks VALUES (20,'Gigaimpacto','Snorlax', 'Normal', 150, 5, 90.0);
INSERT INTO Atacks VALUES (21,'Golpe Cuerpo','Snorlax', 'Normal', 85, 15, 100.0);

INSERT INTO Atacks VALUES (22,'Martillo Colosal','Tinkaton', 'Acero', 160, 5, 100.0);
INSERT INTO Atacks VALUES (23,'Desarme','Tinkaton', 'Siniestro', 65, 20, 100.0);
INSERT INTO Atacks VALUES (24,'Martillo de Hielo','Tinkaton', 'Hielo', 100, 10, 90.0);
INSERT INTO Atacks VALUES (25,'Sorpresa','Tinkaton', 'Normal', 40, 15, 100.0);

INSERT INTO Atacks VALUES (26,'Enfado','Garchomp', 'Dragon', 120, 10, 100.0);
INSERT INTO Atacks VALUES (27,'Terremoto','Garchomp', 'Tierra', 100, 10, 100.0);
INSERT INTO Atacks VALUES (28,'Pataleta','Garchomp', 'Tierra', 75, 10, 100.0);
INSERT INTO Atacks VALUES (29,'Garra Dragon','Garchomp', 'Dragon', 80, 15, 100.0);

INSERT INTO Atacks VALUES (30,'Roca Afilada','Tyranitar', 'Roca', 100, 5, 80.0);
INSERT INTO Atacks VALUES (31,'Avalancha','Tyranitar', 'Roca', 75, 10, 90.0);
INSERT INTO Atacks VALUES (32,'Triturar','Tyranitar', 'Siniestro', 80, 15, 100.0);
INSERT INTO Atacks VALUES (33,'Pataleta','Tyranitar', 'Tierra', 75, 10, 100.0);

INSERT INTO Atacks VALUES (34,'Puño Sombra','Marshadow', 'Fantasma', 60, 20, 100.0);
INSERT INTO Atacks VALUES (35,'A Bocajarro','Marshadow', 'Lucha', 120, 5, 100.0);
INSERT INTO Atacks VALUES (36,'Golpe Bajo','Marshadow', 'Fantasma', 70, 5, 100.0);
INSERT INTO Atacks VALUES (37,'Puño Trueno','Marshadow', 'Electrico', 75, 15, 100.0);

INSERT INTO Atacks VALUES (38,'Bola Sombra','Gengar', 'Fantasma', 80, 15, 100.0);
INSERT INTO Atacks VALUES (39,'Pulso Umbrío','Gengar', 'Siniestro', 80, 15, 100.0);
INSERT INTO Atacks VALUES (40,'Bomba Ácida','Gengar', 'Veneno', 40, 20, 100.0);
INSERT INTO Atacks VALUES (41,'Carga Tóxica','Gengar', 'Veneno', 65, 10, 100.0);

INSERT INTO Atacks VALUES (42,'Pulso Dragon','Drampa', 'Dragon', 85, 10, 100.0);
INSERT INTO Atacks VALUES (43,'Hiperrayo','Drampa', 'Normal', 150, 5, 90.0);
INSERT INTO Atacks VALUES (44,'Viento Hielo','Drampa', 'Hielo', 55, 15, 95.0);
INSERT INTO Atacks VALUES (45,'Rayo','Drampa', 'Eléctrico', 90, 15, 100.0);

INSERT INTO Atacks VALUES (46,'Envite Acuático','Empoleon', 'Agua', 120, 10, 100.0);
INSERT INTO Atacks VALUES (47,'Garra Metal','Empoleon', 'Acero', 50, 35, 95.0);
INSERT INTO Atacks VALUES (48,'Acua Jet','Empoleon', 'Agua', 40, 20, 100.0);
INSERT INTO Atacks VALUES (49,'Salmuera','Empoleon', 'Agua', 65, 10, 100.0);
