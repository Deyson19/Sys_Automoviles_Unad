-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         5.1.72-community - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para db_sys_vehiclesjava
CREATE DATABASE IF NOT EXISTS `db_sys_vehiclesjava` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_sys_vehiclesjava`;

-- Volcando estructura para tabla db_sys_vehiclesjava.owners
CREATE TABLE IF NOT EXISTS `owners` (
  `idOwner` int(11) NOT NULL AUTO_INCREMENT,
  `Cedula` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Name` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Surname` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Ownership_letter` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Address` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `PhoneNumber` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Email` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `Document_type` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idOwner`),
  UNIQUE KEY `Cedula_UNIQUE` (`Cedula`),
  UNIQUE KEY `Ownership_letter_UNIQUE` (`Ownership_letter`),
  UNIQUE KEY `Email_UNIQUE` (`Email`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla db_sys_vehiclesjava.owners: ~4 rows (aproximadamente)
DELETE FROM `owners`;
/*!40000 ALTER TABLE `owners` DISABLE KEYS */;
INSERT INTO `owners` (`idOwner`, `Cedula`, `Name`, `Surname`, `Ownership_letter`, `Address`, `PhoneNumber`, `Email`, `Document_type`, `create_time`) VALUES
	(1, '1459876', 'Juan Esteban', 'Cardona Lopez', '4256666-782', 'Calle 58', '2548962', 'juan_est@mail.com', 'Cedula de Ciudadania', '2023-04-16 18:55:10'),
	(3, '1459875', 'Camila Helena', 'Lopez Castro', 'ca-4576', 'Carrera 45', '310000000', 'camihele@gmail.com', 'Cedula de Extranjeria', '2023-04-16 19:22:10'),
	(4, '475469666', 'Alonso', 'Martinez', '478-SA', 'Calle 78 #15-89 B', '59766', 'alonsom@fakemail.com', 'Cedula de Extranjeria', '2023-04-16 19:28:13'),
	(5, '78964231-U', 'Luisa', 'Herrera', 'g698652', 'Carrera 10 Barrio A lopez, Manizales', '312250000', 'luisa_h@fakemail.com', 'Pasaporte', '2023-04-16 19:29:26');
/*!40000 ALTER TABLE `owners` ENABLE KEYS */;

-- Volcando estructura para tabla db_sys_vehiclesjava.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `idRoles` int(11) NOT NULL AUTO_INCREMENT,
  `RolName` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idRoles`),
  UNIQUE KEY `RolName_UNIQUE` (`RolName`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla db_sys_vehiclesjava.roles: ~3 rows (aproximadamente)
DELETE FROM `roles`;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`idRoles`, `RolName`) VALUES
	(1, 'Administrador'),
	(3, 'Empleado'),
	(2, 'Propietario');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

-- Volcando estructura para tabla db_sys_vehiclesjava.systemerrors
CREATE TABLE IF NOT EXISTS `systemerrors` (
  `idSystemError` int(11) NOT NULL AUTO_INCREMENT,
  `messageCode` varchar(100) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `ClassProvider` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `messageDescription` text COLLATE utf8_spanish_ci NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idSystemError`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Tabla para guardar los logs y mensajes de error del programa';

-- Volcando datos para la tabla db_sys_vehiclesjava.systemerrors: ~33 rows (aproximadamente)
DELETE FROM `systemerrors`;
/*!40000 ALTER TABLE `systemerrors` DISABLE KEYS */;
INSERT INTO `systemerrors` (`idSystemError`, `messageCode`, `ClassProvider`, `messageDescription`, `create_time`) VALUES
	(1, '1136', 'Controller.UsuarioAdminController', 'Column count doesn\'t match value count at row 1', '2023-04-05 00:15:39'),
	(2, '1064', 'Controller.UsuarioAdminController', 'You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near \'?,?,?)\' at line 1', '2023-04-05 00:23:53'),
	(3, '0', 'Controller.UsuarioAdminController', 'No value specified for parameter 3', '2023-04-05 00:24:47'),
	(4, '1136', 'Controller.UsuarioAdminController', 'Column count doesn\'t match value count at row 1', '2023-04-05 00:25:48'),
	(5, '1136', 'Controller.UsuarioAdminController', 'Column count doesn\'t match value count at row 1', '2023-04-05 00:29:20'),
	(6, '0', 'Controller.UsuarioController', 'Can not issue data manipulation statements with executeQuery().', '2023-04-07 21:23:00'),
	(7, '0', 'Controller.UsuarioController', 'Can not issue data manipulation statements with executeQuery().', '2023-04-07 21:23:06'),
	(8, '1064', 'Controller.UsuarioController', 'You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near \'surname,username,password,rol_id) VALUES (\'Carlos Arturo\',\'Lopez Castro\',\'carlos\' at line 1', '2023-04-09 11:50:01'),
	(9, '1064', 'Controller.UsuarioController', 'You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near \'surname,username,password,rol_id) VALUES (\'Carlos Arturo\',\'Lopez Castro\',\'carlos\' at line 1', '2023-04-09 11:54:13'),
	(10, '1064', 'Controller.UsuarioController', 'You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near \'surname,username,password,rol_id) VALUES (\'Carlos Alfonso\',\'Lopez Castro\',\'carlo\' at line 1', '2023-04-09 11:57:30'),
	(11, '0', 'Controller.TiposVehiculosController', 'Column \'name\' not found.', '2023-04-10 17:34:14'),
	(12, '0', 'Controller.TiposVehiculosController', 'Column \'name\' not found.', '2023-04-10 17:35:27'),
	(13, '1048', 'Controller.VehiculosController', 'Column \'Status\' cannot be null', '2023-04-11 15:31:53'),
	(14, '1048', 'Controller.VehiculosController', 'Column \'Status\' cannot be null', '2023-04-11 15:40:51'),
	(15, '1452', 'Controller.VehiculosController', 'Cannot add or update a child row: a foreign key constraint fails (`db_sys_vehiclesjava`.`vehicles`, CONSTRAINT `FK_Owner_Id` FOREIGN KEY (`Owner_Id`) REFERENCES `owners` (`idOwner`) ON DELETE NO ACTION ON UPDATE NO ACTION)', '2023-04-11 15:45:53'),
	(16, '1452', 'Controller.VehiculosController', 'Cannot add or update a child row: a foreign key constraint fails (`db_sys_vehiclesjava`.`vehicles`, CONSTRAINT `FK_Owner_Id` FOREIGN KEY (`Owner_Id`) REFERENCES `owners` (`idOwner`) ON DELETE NO ACTION ON UPDATE NO ACTION)', '2023-04-11 15:56:48'),
	(17, '1054', 'Controller.VehiculosController', 'Unknown column \'Plate\' in \'field list\'', '2023-04-12 15:00:38'),
	(18, '1054', 'Controller.PropietarioController', 'Unknown column \'Cedula\' in \'field list\'', '2023-04-16 18:57:01'),
	(19, '1054', 'Controller.PropietarioController', 'Unknown column \'Cedula\' in \'field list\'', '2023-04-16 18:57:06'),
	(20, '1054', 'Controller.PropietarioController', 'Unknown column \'Cedula\' in \'field list\'', '2023-04-16 19:11:06'),
	(21, '1054', 'Controller.PropietarioController', 'Unknown column \'Cedula\' in \'field list\'', '2023-04-16 19:11:19'),
	(22, '1048', 'Controller.PropietarioController', 'Column \'Document_type\' cannot be null', '2023-04-16 19:17:52'),
	(23, '1064', 'Controller.PropietarioController', 'You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near \'=\'Alonso\',Surname=\'Martinez\',Address=\'Carrera 98-64\',PhoneNumber=\'5976698\' where\' at line 1', '2023-04-16 19:30:03'),
	(24, '1452', 'Controller.VehiculosController', 'Cannot add or update a child row: a foreign key constraint fails (`db_sys_vehiclesjava`.`vehicles`, CONSTRAINT `FK_Owner_Id` FOREIGN KEY (`Owner_Id`) REFERENCES `owners` (`idOwner`) ON DELETE NO ACTION ON UPDATE NO ACTION)', '2023-04-16 19:51:19'),
	(25, '1054', 'Controller.VehiculosController', 'Unknown column \'Plate\' in \'field list\'', '2023-04-16 20:54:42'),
	(26, '0', 'Controller.VehiculosController', 'No value specified for parameter 8', '2023-04-16 21:07:59'),
	(27, '1048', 'Controller.VehiculosController', 'Column \'VehicleType_Id\' cannot be null', '2023-04-16 21:10:32'),
	(28, '1048', 'Controller.VehiculosController', 'Column \'VehicleType_Id\' cannot be null', '2023-04-16 21:21:25'),
	(29, '1048', 'Controller.VehiculosController', 'Column \'Repairs_performed\' cannot be null', '2023-04-16 21:46:23'),
	(30, '1048', 'Controller.VehiculosController', 'Column \'Repairs_performed\' cannot be null', '2023-04-16 21:47:51'),
	(31, '1048', 'Controller.VehiculosController', 'Column \'Repairs_performed\' cannot be null', '2023-04-16 22:00:59'),
	(32, '1048', 'Controller.VehiculosController', 'Column \'Repairs_performed\' cannot be null', '2023-04-16 22:04:01'),
	(33, '1048', 'Controller.VehiculosController', 'Column \'Repairs_performed\' cannot be null', '2023-04-16 22:05:38');
/*!40000 ALTER TABLE `systemerrors` ENABLE KEYS */;

-- Volcando estructura para tabla db_sys_vehiclesjava.users
CREATE TABLE IF NOT EXISTS `users` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `SurName` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `UserName` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Password` varchar(300) COLLATE utf8_spanish_ci NOT NULL,
  `rol_id` int(11) NOT NULL DEFAULT '0',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUser`) USING BTREE,
  UNIQUE KEY `UserName_UNIQUE` (`UserName`),
  KEY `FK_rol_idx` (`rol_id`),
  CONSTRAINT `FK_roles_id` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`idRoles`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla db_sys_vehiclesjava.users: ~3 rows (aproximadamente)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`idUser`, `Name`, `SurName`, `UserName`, `Password`, `rol_id`, `create_time`) VALUES
	(1, 'Lorena', 'Zapata', 'lorena_zapata177', 'b6598e838f350a97cb734eca208ce0cdc602dd60afbf65a3b8b65195cbd1a7fe', 3, '2023-04-07 20:08:06'),
	(2, 'Marcos Fabian', 'Lopez Ariza', 'marcos_lopez101', '7dca44f1d48e69a40e15b02376b5358ce2823a9dda8d095e039be6d38e40340c', 3, '2023-04-07 20:11:33'),
	(3, 'Carlos Enrique', 'Lopez Castro', 'carlos_lopez158', '7fd09250a8d625f850e9981efb0aff6a97385645ce134ac9ed8ec9ee774816b4', 3, '2023-04-09 11:16:01');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Volcando estructura para tabla db_sys_vehiclesjava.usersadmin
CREATE TABLE IF NOT EXISTS `usersadmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(300) COLLATE utf8_spanish_ci NOT NULL,
  `password` text COLLATE utf8_spanish_ci NOT NULL,
  `rol_id` int(11) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_rol_id` (`rol_id`),
  CONSTRAINT `FK_rol_id` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`idRoles`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla db_sys_vehiclesjava.usersadmin: ~1 rows (aproximadamente)
DELETE FROM `usersadmin`;
/*!40000 ALTER TABLE `usersadmin` DISABLE KEYS */;
INSERT INTO `usersadmin` (`id`, `userName`, `password`, `rol_id`, `create_time`) VALUES
	(1, 'deyson', '0a92efb1b91ac02c858ab205fbb6baf44d67e8d1e625600a11020cfae50065da', 1, '2023-04-05 00:32:46');
/*!40000 ALTER TABLE `usersadmin` ENABLE KEYS */;

-- Volcando estructura para tabla db_sys_vehiclesjava.vehicles
CREATE TABLE IF NOT EXISTS `vehicles` (
  `idVehicle` int(11) NOT NULL AUTO_INCREMENT,
  `Plate` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Status` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `Reason_Ingress` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `Owner_Id` int(11) NOT NULL,
  `VehicleType_Id` int(11) NOT NULL DEFAULT '0',
  `Delivery_Date` date NOT NULL,
  `Service_cost` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Duration` char(4) COLLATE utf8_spanish_ci NOT NULL,
  `Service_Shift` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Date_entry` date NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idVehicle`),
  UNIQUE KEY `Plate_UNIQUE` (`Plate`),
  KEY `FK_Owner_Id_idx` (`Owner_Id`),
  KEY `FK_Vehicle_Type_Id` (`VehicleType_Id`),
  CONSTRAINT `FK_Owner_Id` FOREIGN KEY (`Owner_Id`) REFERENCES `owners` (`idOwner`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Vehicle_Type_Id` FOREIGN KEY (`VehicleType_Id`) REFERENCES `vehiclestype` (`idVehicleType`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla db_sys_vehiclesjava.vehicles: ~2 rows (aproximadamente)
DELETE FROM `vehicles`;
/*!40000 ALTER TABLE `vehicles` DISABLE KEYS */;
INSERT INTO `vehicles` (`idVehicle`, `Plate`, `Status`, `Reason_Ingress`, `Owner_Id`, `VehicleType_Id`, `Delivery_Date`, `Service_cost`, `Duration`, `Service_Shift`, `Date_entry`, `create_time`) VALUES
	(2, '4589-lo8', '3', 'Fallas en el aceite y motor.', 3, 3, '2023-04-14', '4800', 'A-4', '3', '2023-04-10', '2023-04-16 20:08:26'),
	(9, 'ASJ-78L', '1', 'Fallas en la bateria. No arranca, se agota rapido la gasolina.', 1, 2, '2023-04-16', '8700', '3', 'A-9', '2023-04-13', '2023-04-16 22:14:09');
/*!40000 ALTER TABLE `vehicles` ENABLE KEYS */;

-- Volcando estructura para tabla db_sys_vehiclesjava.vehicleshistories
CREATE TABLE IF NOT EXISTS `vehicleshistories` (
  `idVehicleHistory` int(11) NOT NULL AUTO_INCREMENT,
  `Maintenance_performed` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `Repairs_performed` int(11) NOT NULL,
  `Vehicle_Id` int(11) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idVehicleHistory`),
  KEY `FK_Vehicle_Id_idx` (`Vehicle_Id`),
  CONSTRAINT `FK_Vehicle_Id` FOREIGN KEY (`Vehicle_Id`) REFERENCES `vehicles` (`idVehicle`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla db_sys_vehiclesjava.vehicleshistories: ~1 rows (aproximadamente)
DELETE FROM `vehicleshistories`;
/*!40000 ALTER TABLE `vehicleshistories` DISABLE KEYS */;
INSERT INTO `vehicleshistories` (`idVehicleHistory`, `Maintenance_performed`, `Repairs_performed`, `Vehicle_Id`, `create_time`) VALUES
	(1, 'Fallas en la bateria. No arranca, se agota rapido la gasolina.', 2, 9, '2023-04-16 22:14:09');
/*!40000 ALTER TABLE `vehicleshistories` ENABLE KEYS */;

-- Volcando estructura para tabla db_sys_vehiclesjava.vehiclestype
CREATE TABLE IF NOT EXISTS `vehiclestype` (
  `idVehicleType` int(11) NOT NULL AUTO_INCREMENT,
  `nameVehicle` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idVehicleType`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla db_sys_vehiclesjava.vehiclestype: ~5 rows (aproximadamente)
DELETE FROM `vehiclestype`;
/*!40000 ALTER TABLE `vehiclestype` DISABLE KEYS */;
INSERT INTO `vehiclestype` (`idVehicleType`, `nameVehicle`) VALUES
	(1, 'Automóvil'),
	(2, 'Camioneta'),
	(3, 'Motocarro'),
	(4, 'Quads'),
	(5, 'Turismo');
/*!40000 ALTER TABLE `vehiclestype` ENABLE KEYS */;

-- Volcando estructura para vista db_sys_vehiclesjava.view_name
-- Creando tabla temporal para superar errores de dependencia de VIEW
CREATE TABLE `view_name` (
	`idRoles` INT(11) NOT NULL,
	`RolName` VARCHAR(45) NOT NULL COLLATE 'utf8_spanish_ci'
) ENGINE=MyISAM;

-- Volcando estructura para disparador db_sys_vehiclesjava.insert_vehicleshistory
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='';
DELIMITER //
CREATE TRIGGER `insert_vehicleshistory` AFTER INSERT ON `vehicles` FOR EACH ROW INSERT INTO vehicleshistories(Maintenance_performed, Repairs_performed, Vehicle_Id, create_time)
VALUES (NEW.Reason_Ingress, 1, NEW.idVehicle, NOW())//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador db_sys_vehiclesjava.update_vehicleshistory
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='';
DELIMITER //
CREATE TRIGGER `update_vehicleshistory` AFTER UPDATE ON `vehicles` FOR EACH ROW UPDATE vehicleshistories SET Maintenance_performed = NEW.Reason_Ingress, Repairs_performed = Repairs_performed + 1 WHERE Vehicle_Id = NEW.idVehicle//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para vista db_sys_vehiclesjava.view_name
-- Eliminando tabla temporal y crear estructura final de VIEW
DROP TABLE IF EXISTS `view_name`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `view_name` AS select `Roles`.`idRoles` AS `idRoles`,`Roles`.`RolName` AS `RolName` from `Roles` ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
