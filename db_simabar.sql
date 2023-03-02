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

-- Dumping data for table db_simabar.data_barang: ~9 rows (approximately)
INSERT INTO `data_barang` (`id`, `nama`, `jumlah`, `kategori`) VALUES
	('BR0001', 'Rompi', 25, 'Armor'),
	('BR0002', 'Sepatu Boots', 5, 'Atribut'),
	('BR1002', 'Baliho', 2, 'Alat'),
	('BR7093', 'Mesin Air', 5, 'Perlengkapan'),
	('GF2032', 'Mobil Balap', 4, 'Item 1'),
	('JP1153', 'Jeep', 2, 'Kendaraan'),
	('RF9991', 'Robot Beko', 5, 'Kendaraan'),
	('SW3005', 'Pedang', 10, 'Senjata'),
	('VC2403', 'Vape', 6, 'Medis'),
	('ZF2011', 'Papan', 4, 'Perlengkapan');

-- Dumping structure for table db_simabar.data_keluar
CREATE TABLE IF NOT EXISTS `data_keluar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `kode_barang` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `nama_barang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '',
  `jumlah` int NOT NULL DEFAULT '0',
  `kategori` varchar(50) DEFAULT '',
  `status` char(50) DEFAULT NULL,
  `keterangan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_at` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_simabar.data_keluar: ~5 rows (approximately)
INSERT INTO `data_keluar` (`id`, `kode_barang`, `nama_barang`, `jumlah`, `kategori`, `status`, `keterangan`, `created_at`) VALUES
	(1, 'BR0002', 'Sepatu pantofel', 10, 'Atribut', 'waiting', 'vfvfv', '2023-02-27'),
	(2, 'BR0001', 'Rompi Lapangan', 10, 'Atribut', 'approved', 'rtryry', '2023-02-27'),
	(3, 'MR0023', 'Motor', 5, 'Kendaraan', 'declined', 'gggf', '2023-02-27'),
	(4, 'BR0001', 'Rompi', 5, 'Atribut', 'approved', 'abcee', 'Wed Mar 01 00:00:00 ICT 2023'),
	(5, 'JP1153', 'Jeep', 1, 'Kendaraan', 'approved', 'www', 'Wed Feb 01 21:32:49 ICT 2023'),
	(6, 'BR0001', 'Rompi', 5, 'Atribut', 'waiting', 'test', 'Sat Mar 04 19:33:31 ICT 2023');

-- Dumping structure for table db_simabar.data_masuk
CREATE TABLE IF NOT EXISTS `data_masuk` (
  `id` int NOT NULL AUTO_INCREMENT,
  `kode_barang` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `nama_barang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `jumlah` int NOT NULL DEFAULT '0',
  `kategori` varchar(50) DEFAULT NULL,
  `status` char(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `keterangan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_at` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_simabar.data_masuk: ~9 rows (approximately)
INSERT INTO `data_masuk` (`id`, `kode_barang`, `nama_barang`, `jumlah`, `kategori`, `status`, `keterangan`, `created_at`) VALUES
	(1, 'BR1002', 'Baliho', 2, 'Alat', 'approved', 'Spanduk Iklan', '2023-02-25 10:40:57'),
	(2, 'BR3001', 'Helmet Baja', 23, 'Atribut', 'waiting', 'afafafa afasd', '2023-02-25 00:00:00'),
	(3, 'JP1153', 'Jeep', 1, 'Kendaraan', 'approved', 'abcdef', '2023-02-25 00:00:00'),
	(4, 'RM2903', 'Rompi', 15, 'Atribut', 'declined', 'abdddcd', 'Tue Feb 21'),
	(5, 'BR0001', 'Rompi', 10, 'Atribut', 'waiting', 'afafaf', 'Mon Feb 27'),
	(6, 'MR0026', 'Motor Aerox', 10, 'Kendaraan', 'waiting', 'eer rr r r', 'Tue Feb 28'),
	(7, 'MB2401', 'Mobil Fuso', 5, 'Kendaraan', 'waiting', 'wewe ttr', 'Tue Feb 28'),
	(8, 'SE0213', 'Sekop', 5, 'Atribut', 'waiting', 'fff', 'Wed Feb 01'),
	(9, 'PK2201', 'Kotak PPPK', 4, 'Kesehatan', 'waiting', 'fafaf', 'Thu Feb 02'),
	(10, 'BR0001', 'Rompi', 25, 'Armor', 'waiting', 'test', 'Fri Mar 03 19:32:14 ICT 2023'),
	(11, 'BT2204', 'Motor Beat', 5, 'Armor', 'waiting', 'test', 'Fri Mar 03 19:32:52 ICT 2023');

-- Dumping structure for table db_simabar.kategori
CREATE TABLE IF NOT EXISTS `kategori` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nama` varchar(125) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_simabar.kategori: ~7 rows (approximately)
INSERT INTO `kategori` (`id`, `nama`) VALUES
	(1, 'Atribut'),
	(2, 'Medis'),
	(3, 'Berkas'),
	(5, 'Kesehatan'),
	(6, 'Armor'),
	(7, 'Senjata'),
	(13, 'Kebutuhan'),
	(14, 'Kendaraan'),
	(15, 'Makanan');

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
