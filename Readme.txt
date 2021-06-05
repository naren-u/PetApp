This app provides web controller and rest controller to access the services
-  mycontroller.java provides web service access
	- This service provides two methods i.e. 
		- getPets - to retrieve information for all pets
 		- getPet - to retrieve information for specific pet based on pet id 
- restcontroller.java provides rest api based service access
	- This service provides three methods i.e.
		- getPets - to retrieve information for all pets
 		- getPet - to retrieve information for specific pet based on pet id 
		- postLocdata - to store pet location information

Two models are created for Pet service and petLocation services
- petdata model serves for Pet service
- locdata model serves petLocation service

MySql database DDL's:
==================
petData - stores pet and related owner id information
CREATE TABLE `petdata` (
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `address` varchar(100) NOT NULL,
  `accesstype` char(1) NOT NULL,
  `datapermission` char(1) NOT NULL,
  `owner` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
// Notes: Owner id to be stored in separate table in next iteration

location data stores pet travel location information
CREATE TABLE `locdata` (
  `time` char(25) DEFAULT NULL,
  `id` int NOT NULL,
  `longitude` decimal(20,15) NOT NULL,
  `latitude` decimal(20,15) NOT NULL,
  UNIQUE KEY `time_UNIQUE` (`time`),
  KEY `id_idx` (`id`),
  CONSTRAINT `id` FOREIGN KEY (`id`) REFERENCES `petdata` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

