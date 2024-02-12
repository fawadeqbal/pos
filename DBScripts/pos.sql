CREATE DATABASE  IF NOT EXISTS `pos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `pos`;
-- MySQL dump 10.13  Distrib 8.0.35, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: pos
-- ------------------------------------------------------
-- Server version	8.0.35-0ubuntu0.23.04.1

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
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `cartid` int NOT NULL AUTO_INCREMENT,
  `INID` int NOT NULL,
  `Product_Name` varchar(50) NOT NULL,
  `Bar_code` varchar(50) NOT NULL,
  `qty` varchar(20) NOT NULL,
  `Unit_Price` varchar(20) NOT NULL,
  `Total_Price` varchar(20) NOT NULL,
  PRIMARY KEY (`cartid`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (1,1,'pen','100200','3','10','30.0'),(2,1,'pen','100200','3','10','30.0'),(3,1,'box','100500','3','50','150.0'),(4,1,'box','100500','3','50','150.0'),(5,1,'pen','100200','3','10','30.0'),(6,1,'mini book ','100100','3','200','600.0'),(7,1,'mini book ','100100','3','200','600.0'),(8,1,'pen','100200','5','10','50.0'),(9,1,'pen','100200','5','10','50.0'),(10,1,'pen','100200','5','10','50.0'),(11,1,'pen','100200','5','10','50.0'),(12,1,'pen','100200','5','10','50.0'),(13,1,'box','100500','5','50','250.0'),(14,1,'box','100500','5','50','250.0'),(15,1,'box','100500','5','50','250.0'),(16,1,'box','100500','5','50','250.0'),(17,1,'pen','100200','3','10','30.0'),(18,1,'pen','100200','3','10','30.0'),(19,1,'pen','100200','3','10','30.0'),(20,1,'box','100500','3','50','150.0'),(21,1,'box','100500','3','50','150.0'),(22,1,'box','100500','3','50','150.0'),(23,1,'pen','100200','2','10','20.0'),(24,1,'pen','100200','2','10','20.0'),(25,1,'mini book ','100100','2','200','400.0'),(26,1,'mini book ','100100','2','200','400.0'),(27,1,'mini book ','100100','2','200','400.0'),(28,1,'mini book ','100100','2','200','400.0'),(29,2,'pen','100200','45','10','450.0'),(30,2,'pen','100200','45','10','450.0'),(31,2,'pen','100200','45','10','450.0'),(32,3,'pen','100200','2','10','20.0'),(33,3,'pen','100200','2','10','20.0'),(34,3,'pen','100200','2','10','20.0'),(35,4,'box','100500','4','50','200.0'),(36,5,'pen','100200','3','10','30.0'),(37,5,'pen','100200','3','10','30.0'),(38,5,'pen','100200','3','10','30.0'),(39,5,'mini book ','100100','3','200','600.0'),(40,5,'mini book ','100100','3','200','600.0'),(41,5,'mini book ','100100','3','200','600.0'),(42,6,'pen','100200','4','10','40.0'),(43,6,'pen','100200','4','10','40.0'),(44,6,'pen','100200','4','10','40.0'),(45,7,'pen','100200','3','10','30.0'),(46,7,'pen','100200','3','10','30.0'),(47,7,'box','100500','3','50','150.0'),(48,7,'box','100500','3','50','150.0'),(49,7,'mini book ','100100','3','200','600.0'),(50,7,'mini book ','100100','3','200','600.0'),(51,8,'pen','100200','3','10','30.0'),(52,8,'mini book ','100100','3','200','600.0'),(53,8,'box','100500','5','50','250.0'),(54,8,'mini book ','100100','2','200','400.0'),(55,9,'mini book ','100100','3','200','600.0'),(56,9,'pen','100200','4','10','40.0'),(57,9,'box','100500','8','50','400.0'),(58,9,'Mouse','12354','9','13','117.0'),(59,9,'keyboard','123546','4','18','72.0'),(60,9,'keyboard','123546','4','18','72.0'),(61,9,'keyboard','123546','4','18','72.0'),(62,9,'keyboard','123546','4','18','72.0'),(63,9,'keyboard','123546','4','18','72.0'),(64,9,'keyboard','123546','4','18','72.0'),(65,9,'keyboard','123546','4','18','72.0');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'fawad','12345'),(3,'fawad iqbal ','1234568'),(6,'saman','77-88-9'),(9,'sam','9999988'),(10,'fawad','03149972883'),(27,'saman','77-88-9'),(29,'werty','wertyu'),(38,'fawad Iqbal','03149972883'),(39,'wertyq','1234567890'),(40,'wertyq','1234567890'),(41,'fawad iqbal ','1234568133'),(42,'fawad Iqbal','03149972883'),(43,'fawad Iqbal','03149972883'),(44,'fawad iqbal ','1234568133'),(45,'fawad Iqbal','03149972883'),(46,'fawad Iqbal','03149972883'),(47,'fawad Iqbal','03149972883'),(48,'fawad iqbal ','1234568133'),(49,'fawad Iqbal','03149972883'),(50,'fawad Iqbal','03149972883'),(51,'fawad Iqbal','03149972883'),(52,'fawad Iqbal','03149972883'),(53,'fawad Iqbal','03149972883'),(54,'fawad Iqbal','03149972883'),(55,'wertyq','1234567890');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `phoneNumber` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'emp test','111-222'),(2,'andy gray','978-45'),(3,'chelcy','45-56'),(5,'Fawad Iqbal','1234567890'),(6,'','');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `extra`
--

DROP TABLE IF EXISTS `extra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `extra` (
  `exid` int NOT NULL AUTO_INCREMENT,
  `val` varchar(10) NOT NULL,
  PRIMARY KEY (`exid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extra`
--

LOCK TABLES `extra` WRITE;
/*!40000 ALTER TABLE `extra` DISABLE KEYS */;
INSERT INTO `extra` VALUES (1,'10');
/*!40000 ALTER TABLE `extra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(50) NOT NULL,
  `Bar_code` varchar(20) NOT NULL,
  `Price` varchar(10) NOT NULL,
  `Qty` varchar(10) NOT NULL,
  `Sid` int NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'mini book ','100100','200','10',2),(2,'pen','100200','100','8',1),(3,'box','100500','50','12',3),(4,'Mouse','12354','13','3',2),(5,'keyboard','123546','18','30',3);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sales` (
  `saleid` int NOT NULL AUTO_INCREMENT,
  `INID` int NOT NULL,
  `Cid` int NOT NULL,
  `Customer_Name` varchar(50) NOT NULL,
  `Total_Qty` varchar(10) NOT NULL,
  `Total_Bill` varchar(10) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Balance` varchar(10) NOT NULL,
  PRIMARY KEY (`saleid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (1,1,3,'smith','25.0','250.0','UnPaid','-1050.0'),(2,1,6,'saman','9.0','30.0','Partial','-40.0'),(3,1,8,'jack','9.0','150.0','null','0.0'),(4,1,8,'jack','8.0','400.0','Paid','0.0'),(5,1,2,'baby boy','4.0','400.0','Paid','0.0'),(6,2,6,'saman','135.0','450.0','Paid','0.0'),(7,3,2,'baby boy','6.0','20.0','Partial','-10.0'),(8,4,3,'smith','4.0','200.0','UnPaid','-200.0'),(9,5,2,'baby boy','18.0','600.0','UnPaid','-1890.0'),(10,6,6,'saman','12.0','40.0','UnPaid','-120.0'),(11,7,3,'smith','18.0','1560.0','UnPaid','-1560.0'),(12,8,3,'smith','13.0','1280.0','Partial','-280.0'),(13,9,8,'jack','52.0','1661.0','Partial','-1611.0'),(14,10,0,'test','00','00.00','UnPaid','00.00');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppliers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `phoneNumber` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` VALUES (1,'sup test','1100'),(2,'mike','`456-7854'),(3,'albert','789-88'),(4,'baby','222-3'),(6,'mike','`456-7854'),(7,'ubaidq','1100'),(9,'fawad','123456');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('Faizan','root','customer'),('fawadeqbal','root','admin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-12 14:20:49
