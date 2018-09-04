-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 15, 2015 at 03:06 
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `siap`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE IF NOT EXISTS `data` (
`Nomor` int(4) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Fakultas` varchar(15) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `id_jenis` int(2) NOT NULL,
  `NO_HP` varchar(12) NOT NULL,
  `id_event` int(3) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`Nomor`, `Nama`, `Fakultas`, `Alamat`, `id_jenis`, `NO_HP`, `id_event`) VALUES
(4, '', '', '', 1, '', 4),
(5, 'razak', '851', 'kjhgda', 2, '3750928', 4);

-- --------------------------------------------------------

--
-- Table structure for table `Event`
--

CREATE TABLE IF NOT EXISTS `Event` (
`id_event` int(3) NOT NULL,
  `nama_event` varchar(50) NOT NULL,
  `id_user` varchar(4) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Event`
--

INSERT INTO `Event` (`id_event`, `nama_event`, `id_user`) VALUES
(1, 'Release Party Ubuntu', 'U01'),
(2, 'Road Show LAOS', 'U01'),
(3, 'PSSI GO Open Source', 'U01'),
(4, 'Pelatihan Tari', 'U02'),
(5, 'SISFO CUP', 'U03'),
(6, 'Diklat BALWANA', 'U04'),
(7, 'Olimpiade TI BITS', 'U05'),
(8, 'Discovery BITS', 'U05'),
(9, 'Workshop Android BITS', 'U05'),
(10, 'Semnas BITS', 'U05');

-- --------------------------------------------------------

--
-- Table structure for table `jenis`
--

CREATE TABLE IF NOT EXISTS `jenis` (
  `id_jenis` int(2) NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis`
--

INSERT INTO `jenis` (`id_jenis`, `Status`) VALUES
(1, 'Lunas'),
(2, 'Booking');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id_user` varchar(4) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_user`, `username`, `password`) VALUES
('U01', 'LAOS', 'linuxadmin'),
('U02', 'ETALASE', 'ukmkadmin'),
('U03', 'UKMO', 'olahragaadmin'),
('U04', 'BALWANA', 'paadmin'),
('U05', 'BITS', 'himasifadmin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
 ADD PRIMARY KEY (`Nomor`), ADD KEY `id_jenis` (`id_jenis`), ADD KEY `id_event` (`id_event`), ADD KEY `id_event_2` (`id_event`);

--
-- Indexes for table `Event`
--
ALTER TABLE `Event`
 ADD PRIMARY KEY (`id_event`), ADD UNIQUE KEY `id_event` (`id_event`), ADD KEY `id_user` (`id_user`), ADD KEY `id_user_2` (`id_user`), ADD KEY `id_user_3` (`id_user`), ADD KEY `id_user_4` (`id_user`);

--
-- Indexes for table `jenis`
--
ALTER TABLE `jenis`
 ADD PRIMARY KEY (`id_jenis`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`id_user`), ADD UNIQUE KEY `id_user` (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data`
--
ALTER TABLE `data`
MODIFY `Nomor` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `Event`
--
ALTER TABLE `Event`
MODIFY `id_event` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `data`
--
ALTER TABLE `data`
ADD CONSTRAINT `data_ibfk_1` FOREIGN KEY (`id_jenis`) REFERENCES `jenis` (`id_jenis`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `data_ibfk_2` FOREIGN KEY (`id_event`) REFERENCES `Event` (`id_event`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `login`
--
ALTER TABLE `login`
ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `Event` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
