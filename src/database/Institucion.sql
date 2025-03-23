CREATE DATABASE  IF NOT EXISTS `institucion` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `institucion`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: institucion
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `usuario_estudiante` varchar(50) DEFAULT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `DNI` bigint NOT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `telefono` bigint DEFAULT NULL,
  `curso_estudiante` varchar(20) DEFAULT NULL,
  `nTutor` varchar(30) NOT NULL,
  `aTutor` varchar(30) DEFAULT NULL,
  UNIQUE KEY `usuario_estudiante` (`usuario_estudiante`,`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES ('Estudiante','Javier','Martinez',30491301,'correojavier@gmail.com',4801010,'6º Año','Pablo','Ramirez'),('MBelenMedina','Maria Belen','Medina',37714264,'correobelen@gmail.com',88888888,'4º Año','Pedro','Mazzola'),('JoaCo','Joaquín','Copello',30914021,'joaquin@correo.com',4510930,'4º Año','Pedro','Mazzola'),('Marco','Marco','Di piace',20314561,'marco@correo.com',4501213,'4º Año','Pedro','Mazzola'),('Sense81','Matias','Sense',31405302,'matias@correo.com',4506611,'4º Año','Pedro','Mazzola');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `rol` varchar(30) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `usuario` (`usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'Estudiante','12345','Estudiante'),(2,'MBelenMedina','12345','Estudiante'),(3,'CuentaPrueba','12345','Profesor'),(4,'JoaCo','12345','Estudiante'),(5,'Marco','12345','Estudiante'),(6,'Sense81','12345','Estudiante'),(7,'Test','12345','Profesor'),(8,'Carlos71','12345','Profesor');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materia` (
  `nombre_materia` varchar(40) DEFAULT NULL,
  `curso` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES ('Cálculo','4º Año'),('Programación','4º Año'),('Robótica','6º Año');
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor` (
  `usuario_profesor` varchar(50) DEFAULT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `CUIL` bigint NOT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `telefono` bigint DEFAULT NULL,
  `tProfesor` varchar(50) DEFAULT NULL,
  `materia` varchar(20) DEFAULT NULL,
  `curso_profe` varchar(20) DEFAULT NULL,
  UNIQUE KEY `usuario_profesor` (`usuario_profesor`),
  UNIQUE KEY `usuario_profesor_2` (`usuario_profesor`,`CUIL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES ('CuentaPrueba','Gabriel','Rivera',2039812934,'gabriel.rivera@corre.com',4081923,'Profesor Titular','Cálculo','4º Año'),('Test','Matias','Martin',20314013332,'mati@correo.com',4503131,'Profesor Titular','Programación','4º Año'),('Carlos71','Carlos','Avalos',21205126149,'carlos@correo.com',4891023,'Profesor Titular','Robótica','6º Año');
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

-- Dump completed on 2023-10-04  8:06:55
