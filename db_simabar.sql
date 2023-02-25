-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for db_simabar
CREATE DATABASE IF NOT EXISTS `db_simabar` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_simabar`;

-- Dumping structure for table db_simabar.data_barang
CREATE TABLE IF NOT EXISTS `data_barang` (
  `id` varchar(50) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `jumlah` bigint DEFAULT NULL,
  `kategori` varchar(125) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_simabar.data_barang: ~0 rows (approximately)
INSERT INTO `data_barang` (`id`, `nama`, `jumlah`, `kategori`) VALUES
	('BR0001', 'Helmet', 35, 'Atribut'),
	('BR0002', 'Sepatu Boots', 22, 'Atribut'),
	('BR0003', 'Tronton', 5, 'Kendaraan');

-- Dumping structure for table db_simabar.data_keluar
CREATE TABLE IF NOT EXISTS `data_keluar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `kode_barang` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `nama_barang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '',
  `jumlah` int NOT NULL DEFAULT '0',
  `kategori` varchar(50) DEFAULT '',
  `status` char(50) DEFAULT NULL,
  `keterangan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_simabar.data_keluar: ~0 rows (approximately)

-- Dumping structure for table db_simabar.data_masuk
CREATE TABLE IF NOT EXISTS `data_masuk` (
  `id` int NOT NULL AUTO_INCREMENT,
  `kode_barang` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `nama_barang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `jumlah` int NOT NULL DEFAULT '0',
  `kategori` varchar(50) DEFAULT NULL,
  `status` char(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `keterangan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_simabar.data_masuk: ~3 rows (approximately)
INSERT INTO `data_masuk` (`id`, `kode_barang`, `nama_barang`, `jumlah`, `kategori`, `status`, `keterangan`, `created_at`) VALUES
	(1, 'BR1002', 'Baliho', 2, 'Alat', 'waiting', 'Spanduk Iklan', '2023-02-25 03:40:57'),
	(2, 'BR3001', 'Helmet Baja', 23, 'Atribut', 'waiting', 'afafafa afasd', '2023-02-24 17:00:00'),
	(3, 'JP1153', 'Jeep', 1, 'Kendaraan', 'waiting', 'abcdef', '2023-02-24 17:00:00');

-- Dumping structure for table db_simabar.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `level` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_simabar.users: ~2 rows (approximately)
INSERT INTO `users` (`id`, `username`, `nama`, `password`, `level`) VALUES
	(1, 'admin', 'Admin', 'admin123', 'Admin'),
	(2, 'gudang', 'Petugas', 'gudang123', 'Gudang');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
