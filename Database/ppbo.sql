-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.36-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for ppbo
CREATE DATABASE IF NOT EXISTS `ppbo` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ppbo`;

-- Dumping structure for table ppbo.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table ppbo.hibernate_sequence: 1 rows
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(9);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Dumping structure for table ppbo.siswa
CREATE TABLE IF NOT EXISTS `siswa` (
  `id_karyawan` int(11) NOT NULL,
  `nip` varchar(255) DEFAULT NULL,
  `nama_karyawan` varchar(255) DEFAULT NULL,
  `nik` varchar(255) DEFAULT NULL,
  `domisili` varchar(50) DEFAULT NULL,
  `opt_version` int(11) DEFAULT '0',
  `no_hp` varchar(255) DEFAULT NULL,
  `posisi` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_karyawan`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table ppbo.siswa: 3 rows
/*!40000 ALTER TABLE `siswa` DISABLE KEYS */;
INSERT INTO `siswa` (`id_karyawan`, `nip`, `nama_karyawan`, `nik`, `domisili`, `opt_version`, `no_hp`, `posisi`) VALUES
	(2, '1235678', 'ANJAS MARA', '333334445556', 'Bandung', 4, NULL, NULL),
	(5, '44444', 'Mufti', '123333', 'Bogor', 1, NULL, NULL),
	(8, '111111111', 'ROY KIYOSHI', '88888888888', 'JOGJA', 1, NULL, NULL);
/*!40000 ALTER TABLE `siswa` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
