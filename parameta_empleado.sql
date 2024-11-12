-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: parameta
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `id_empleado` varchar(45) NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `tipo_documento` varchar(45) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `fecha_vinculacion` date NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `salario` double NOT NULL,
  PRIMARY KEY (`id_empleado`),
  UNIQUE KEY `idEmpleado_UNIQUE` (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES ('0EDy1w_W','FHo4RhF4','64jRbzk6','yjNeccOo','2000-09-18','2020-07-24','fxQc9Xxj',1000000),('1000646709','John','Doe','CC','2000-09-18','2020-07-24','Developer',1000000),('101564','John','Doe','CC','2000-09-18','2020-07-24','Developer',1000000),('1111111','John','Doe','CC','2000-09-18','2020-07-24','Developer',1000000),('1222222','John','Doe','CC','2000-09-18','2020-07-24','Developer',1000000),('12345678','John','Doe','CC','2000-09-18','2020-07-24','Developer',1000000),('123456789','John','Doe','Passport','1990-01-01','2023-01-01','Developer',50000),('5463653','Joselin','Doe','Passport','1990-01-01','2023-01-01','Developer',50000),('999999','Joselin','Doe','Passport','1990-01-01','2023-01-01','Developer',50000),('DthQ_srL','Ynb5WymZ','MYbrc04o','JwGmodmf','2000-09-18','2020-07-24','2us1mQuP',1000000),('FcXhsikw','9RI4VAOh','NSTVcwIy','MU3oSWQM','2000-09-18','2020-07-24','TvohlGGA',1000000),('gDQx9wOJ','Lv0PUgiU','PVhXVRtN','PKtr5v7s','2000-09-18','2020-07-24','9gL9lKWs',1000000);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-12 15:12:25
