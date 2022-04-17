CREATE DATABASE  IF NOT EXISTS `colegio` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `colegio`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: colegio
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrativo`
--

DROP TABLE IF EXISTS `administrativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrativo` (
  `idAdministrativo` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fechaNac` date NOT NULL,
  `domicilio` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `contra` varchar(45) NOT NULL,
  PRIMARY KEY (`idAdministrativo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrativo`
--

LOCK TABLES `administrativo` WRITE;
/*!40000 ALTER TABLE `administrativo` DISABLE KEYS */;
INSERT INTO `administrativo` VALUES ('A1','Martinez Gonza','Jose','1971-01-11','Cercado de Lima - Manzana A','M','admin');
/*!40000 ALTER TABLE `administrativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agenda`
--

DROP TABLE IF EXISTS `agenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agenda` (
  `IdEvento` varchar(45) NOT NULL,
  `IdColegio` varchar(45) NOT NULL,
  `fechaEvento` date NOT NULL,
  `nombreEvento` varchar(45) NOT NULL,
  `detalleEvento` varchar(45) NOT NULL,
  PRIMARY KEY (`IdEvento`),
  KEY `IdColegio_idx` (`IdColegio`),
  CONSTRAINT `IdColegio2` FOREIGN KEY (`IdColegio`) REFERENCES `colegio` (`IdColegio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenda`
--

LOCK TABLES `agenda` WRITE;
/*!40000 ALTER TABLE `agenda` DISABLE KEYS */;
INSERT INTO `agenda` VALUES ('EVE01','Cole01','2022-05-08','Dia de la Madre','Ceremonia'),('EVE02','Cole01','2021-06-19','Dia del Padre','Misa'),('EVE03','Cole01','2021-06-24','Dia del Campesino','Compartir'),('EVE04','Cole01','2021-07-06','Día del Maestro','Bailatón'),('EVE05','Cole01','2021-06-14','Dia del Comedor Infantil','Almuerzo'),('EVE06','Cole01','2021-09-23','Aniversario','Ceremonia'),('EVE07','Cole01','2021-07-28','Fiestas Patrias','Ceremonia'),('EVE08','Cole01','2021-12-25','Navidad','Chocolatada'),('EVE09','Cole01','2022-08-12','Olimpiadas','Competencias'),('EVE10','Cole01','2021-05-01','Policías Escolares','Ceremonia');
/*!40000 ALTER TABLE `agenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `IdAlumno` varchar(45) NOT NULL,
  `IdAula` varchar(45) DEFAULT NULL,
  `IdColegio` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` varchar(45) NOT NULL,
  `fechaNac` date NOT NULL,
  `domicilio` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  PRIMARY KEY (`IdAlumno`),
  KEY `codAula_idx` (`IdAula`),
  KEY `codColegio_idx` (`IdColegio`),
  CONSTRAINT `IdAula` FOREIGN KEY (`IdAula`) REFERENCES `aula` (`IdAula`),
  CONSTRAINT `IdColegio` FOREIGN KEY (`IdColegio`) REFERENCES `colegio` (`IdColegio`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES ('E1','I1A','Cole01','Jhonatan Ysrael','Guevara Ames','70363877','2015-01-01','Rimac','M'),('E10','I1A','Cole01','Josefina','Suarez Vertiz','54282347','2018-02-04','Santa Anita - Jirón 3','F'),('E11','P2A','Cole01','Yessenia','Huarcaya Gonzales','47877778','2014-01-20','Huaycan - Zona I','F'),('E12','P2A','Cole01','Jhoselin','Huarcaya Gonzales','58665918','2014-03-23','Huaycan - Zona I','F'),('E13','P2A','Cole01','Erick','Alvarez Pimentel','45587438','2014-04-01','Villa Salvador - Manzana 14','M'),('E14','P2A','Cole01','Jimena','Ramos Conso','12655778','2014-01-04','Centro de Lima - Jirón La paz ','F'),('E15','P2A','Cole01','Aldo','Dominguez Luza','85743778','2014-02-14','Puente Nuevo','M'),('E16','P2A','Cole01','Veronica','Mendoza Merino','32123478','2014-02-17','Venezuela con Colial','F'),('E17','P2A','Cole01','Solange','Estrella Condor','42761239','2014-01-18','Limatambo','F'),('E18','P2A','Cole01','Luis','Koral Suarez','12455778','2014-04-19','Surco','M'),('E19','P2A','Cole01','Luisa','Abarre Guzman','51276578','2014-06-12','Pachacamac','F'),('E2','I1A','Cole01','Rodrigo','Chavez Casique','12735468','2018-03-21','San Borja - Zona I','M'),('E20','P2A','Cole01','Corayma','Fuertes Davalos','70946378','2014-01-25','Surquillo','F'),('E21','P2A','Cole01','Shirley','Velveder Zavala','09735778','2014-03-12','Barranco','F'),('E22','P2A','Cole01','Pablo','Pucaran Quispe','72709238','2014-05-17','Angamos','M'),('E23','P2A','Cole01','Esteban','Santo Dominguez','09769211','1971-04-12','La Molina','F'),('E24','P2A','Cole01','Larry','Puelles Ramos','11243876','2014-05-04','Miraflores','M'),('E25','P2A','Cole01','Armin','Sanchez Pachas','12568972','2014-01-11','Magdalena','M'),('E26','S3A','Cole01','Pietro','Leiba Suarez','22755278','2014-09-12','Lince','M'),('E27','S3A','Cole01','Erick','Saravia Mendo','32785798','2007-10-19','Miguel Grau','M'),('E28','S3A','Cole01','Maria','Chacaliaza Ricaldi','12648778','2007-11-22','Asia','F'),('E29','S3A','Cole01','Fernanda','Roca Silva','34256778','2007-07-18','La Victoria','F'),('E3','I1A','Cole01','Arnold','Ramos Chiclla','72235778','2018-02-16','Tranquera de Vipol - Zona I','M'),('E30','S3A','Cole01','Gabriel','Acosta Petra','54613897','2007-01-14','Callao','M'),('E31','S3A','Cole01','Javier','Pevez Aquise','64218758','2007-06-14','La Punta','M'),('E32','S3A','Cole01','Jose','Ponce Simon','24316597','2007-05-12','Chorrillos','M'),('E33','S3A','Cole01','Nina','Quispe Quispe','46725837','2007-02-10','Pachacamac','F'),('E34','S3A','Cole01','Fernando','Lupe Tucuy','54957486','2007-12-14','Barranco','M'),('E35','S3A','Cole01','Mario','Paredes Borja','24316557','2007-03-28','Lince','M'),('E36','S3A','Cole01','Estela','Zarate Ramos','36342165','2007-01-09','Chorrillos','F'),('E37','S3A','Cole01','Leoncio','Huancas zevallos','27215463','2007-05-12','Surco','M'),('E38','S3A','Cole01','Peter','Leiba Gutierrez','09341028','2007-08-13','Surquillo','M'),('E39','S3A','Cole01','Joel','Chavez Martinez','22345778','2007-03-12','La Victoria','M'),('E4','I1A','Cole01','Jhonatan','Guevara Ames','34765778','2018-03-19','Rimac - Flor de Amancaes','M'),('E40','S3A','Cole01','Jhonatan','Chavez Coronacion','72765778','2007-01-12','San Borja','M'),('E41',NULL,'Cole01','Nicole','Jimenez Zapata','12344321','2010-01-02','Avenida SiembreVia - Los Ositos','F'),('E5','I1A','Cole01','Maribel','Coronación Huamani','23465778','2018-03-18','El Agustino - Chikian','F'),('E6','I1A','Cole01','Alberto','Huaman Mendoza','16244578','2018-04-18','Santa Clara - Zona I','M'),('E7','I1A','Cole01','Prish','Dominguez Acosta','25865723','2018-05-17','Rimac - Universidad de Ingeniería','M'),('E8','I1A','Cole01','Carlos','Noriega Sandoval','45545678','2018-03-30','San Martín de Porres - Colegio del Rosario','M'),('E9','I1A','Cole01','Susan','Huarcaya Jimenez','15325527','2018-04-19','Chosica - Manzana B','F');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aula`
--

DROP TABLE IF EXISTS `aula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aula` (
  `IdAula` varchar(45) NOT NULL,
  `IdTutor` varchar(45) NOT NULL,
  `IdColegio` varchar(45) NOT NULL,
  `grado` varchar(45) NOT NULL,
  `seccion` varchar(45) NOT NULL,
  `nivel` varchar(45) NOT NULL,
  `aforo` int(11) NOT NULL,
  PRIMARY KEY (`IdAula`),
  KEY `IdColegio_idx` (`IdColegio`),
  KEY `IdTutor_idx` (`IdTutor`),
  CONSTRAINT `IdColegio4` FOREIGN KEY (`IdColegio`) REFERENCES `colegio` (`IdColegio`),
  CONSTRAINT `IdTutor` FOREIGN KEY (`IdTutor`) REFERENCES `profesor` (`IdProfesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aula`
--

LOCK TABLES `aula` WRITE;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` VALUES ('I1A','P1','Cole01','Primero','A','Inicial',14),('P2A','P2','Cole01','Segundo','A','Primaria',14),('S3A','P3','Cole01','Tercero','A','Secundaria',13);
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colegio`
--

DROP TABLE IF EXISTS `colegio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colegio` (
  `IdColegio` varchar(45) NOT NULL,
  `IdAdministrativo` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`IdColegio`),
  UNIQUE KEY `IdAdministrativo_UNIQUE` (`IdAdministrativo`),
  KEY `IdAdministrativo_idx` (`IdAdministrativo`),
  CONSTRAINT `IdAdministrativo` FOREIGN KEY (`IdAdministrativo`) REFERENCES `administrativo` (`idAdministrativo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colegio`
--

LOCK TABLES `colegio` WRITE;
/*!40000 ALTER TABLE `colegio` DISABLE KEYS */;
INSERT INTO `colegio` VALUES ('Cole01','A1','Nuestra Señora de Montserrat');
/*!40000 ALTER TABLE `colegio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `IdCurso` varchar(45) NOT NULL,
  `IdProfesor` varchar(45) NOT NULL,
  `IdAula` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `nHoras` int(11) NOT NULL,
  `creditos` int(11) NOT NULL,
  PRIMARY KEY (`IdCurso`),
  KEY `idProfesor2_idx` (`IdProfesor`),
  KEY `idAula3_idx` (`IdAula`),
  CONSTRAINT `idAula3` FOREIGN KEY (`IdAula`) REFERENCES `aula` (`IdAula`),
  CONSTRAINT `idProfesor2` FOREIGN KEY (`IdProfesor`) REFERENCES `profesor` (`IdProfesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES ('C1','P1','I1A','Matematica',8,5),('C10','P2','P2A','Religion',4,5),('C11','P2','P2A','Arte',4,5),('C12','P2','P2A','Educacion fisica',2,5),('C13','P1','S3A','Matematica',4,5),('C14','P1','S3A','Comunicacion',4,5),('C15','P1','S3A','Ciencias',3,5),('C16','P1','S3A','Personal social',3,5),('C17','P2','S3A','Ingles',3,5),('C18','P2','S3A','Religion',3,5),('C19','P2','S3A','Arte',3,5),('C2','P1','I1A','Comunicacion',8,5),('C20','P2','S3A','Educacion fisica',3,5),('C21','P3','S3A','FCC',3,5),('C22','P3','S3A','PFRH',3,5),('C23','P3','S3A','EPT',3,5),('C3','P1','I1A','Ciencias',5,5),('C4','P1','I1A','Personal social',4,5),('C5','P1','P2A','Matematica',4,5),('C6','P1','P2A','Comunicacion',4,5),('C7','P1','P2A','Ciencias',4,5),('C8','P1','P2A','Personal social',4,5),('C9','P2','P2A','Ingles',4,5);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallenotas`
--

DROP TABLE IF EXISTS `detallenotas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallenotas` (
  `idAlumno` varchar(45) NOT NULL,
  `idCurso` varchar(45) NOT NULL,
  `nota1` float NOT NULL,
  `nota2` float NOT NULL,
  `nota3` float NOT NULL,
  `nota4` float NOT NULL,
  PRIMARY KEY (`idAlumno`,`idCurso`),
  KEY `IdCurso3_idx` (`idCurso`),
  CONSTRAINT `IdAlumno2` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`IdAlumno`),
  CONSTRAINT `IdCurso3` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`IdCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallenotas`
--

LOCK TABLES `detallenotas` WRITE;
/*!40000 ALTER TABLE `detallenotas` DISABLE KEYS */;
INSERT INTO `detallenotas` VALUES ('E1','C1',15,20,14,10),('E10','C1',15,20,14,10),('E11','C5',15,20,14,13),('E12','C5',15,20,14,10),('E13','C5',15,15,14,10),('E14','C5',15,20,14,16),('E15','C5',15,20,14,12),('E16','C5',18,20,14,10),('E17','C5',15,20,14,10),('E18','C5',15,10,14,18),('E19','C5',15,14,14,13),('E2','C1',15,20,14,10),('E20','C5',15,11,14,10),('E21','C5',15,20,10,10),('E22','C5',15,20,14,10),('E23','C5',15,14,14,11),('E24','C5',15,10,14,15),('E25','C5',14,20,14,11),('E26','C13',15,20,14,10),('E27','C13',15,20,14,10),('E28','C13',15,20,14,11),('E29','C13',15,20,14,10),('E3','C1',15,20,14,10),('E30','C13',15,20,14,10),('E31','C13',15,20,14,10),('E32','C13',15,20,14,14),('E33','C13',15,20,14,10),('E34','C13',15,20,14,13),('E35','C13',15,20,14,10),('E36','C13',15,20,14,11),('E37','C13',15,10,14,15),('E38','C13',15,20,14,10),('E39','C13',11,11,11,10),('E4','C1',15,10,14,10),('E40','C13',15,20,14,18),('E5','C1',15,2,14,10),('E6','C1',15,20,11,11),('E7','C1',15,8,14,0),('E8','C1',15,12,14,5),('E9','C1',11,18,14,10);
/*!40000 ALTER TABLE `detallenotas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horario` (
  `IdHorario` varchar(45) NOT NULL,
  `IdCurso` varchar(45) NOT NULL,
  `nHorasDias` int(11) NOT NULL,
  `horaIni` int(11) NOT NULL,
  `dia` varchar(45) NOT NULL,
  PRIMARY KEY (`IdHorario`),
  KEY `IdCurso_idx` (`IdCurso`),
  CONSTRAINT `IdCurso` FOREIGN KEY (`IdCurso`) REFERENCES `curso` (`IdCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` VALUES ('H01','C1',5,1,'Lunes'),('H02','C1',3,1,'Martes'),('H03','C2',2,4,'Martes'),('H04','C2',5,4,'Miércoles'),('H05','C2',1,4,'Jueves'),('H06','C3',4,5,'Jueves'),('H07','C4',4,4,'Viernes'),('H08','C3',1,6,'Viernes');
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor` (
  `IdProfesor` varchar(45) NOT NULL,
  `IdColegio` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` varchar(45) NOT NULL,
  `fechaNac` date NOT NULL,
  `domicilio` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  PRIMARY KEY (`IdProfesor`),
  KEY `IdColegio_idx` (`IdColegio`),
  CONSTRAINT `IdColegio3` FOREIGN KEY (`IdColegio`) REFERENCES `colegio` (`IdColegio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES ('P1','Cole01','Martin','Perez','14525328','1962-08-18','San Borja','M'),('P2','Cole01','Liliana','Guzman','15526328','1969-01-15','San Martín','M'),('P3','Cole01','Manuel','Quintana','18725628','1975-12-11','San Felipe','M'),('P4','Cole01','Severus','Snape','06525628','1972-05-22','San German','M'),('P5','Cole01','Peter','Pettigrew','17725362','1980-06-30','San Borja','M'),('P6','Cole01','Sulema','Pimentel','12566521','1980-05-01','Jiron Zapallo - Lote 10','Femenino');
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-30  1:37:08
