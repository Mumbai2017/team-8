-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2017 at 05:40 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cfg`
--

-- --------------------------------------------------------

--
-- Table structure for table `wishtable`
--

CREATE TABLE `wishtable` (
  `wish_id` int(20) NOT NULL,
  `wish1` varchar(500) NOT NULL,
  `wish2` varchar(500) NOT NULL,
  `wish3` varchar(500) NOT NULL,
  `rush` tinyint(1) DEFAULT NULL,
  `selected_wish` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wishtable`
--

INSERT INTO `wishtable` (`wish_id`, `wish1`, `wish2`, `wish3`, `rush`, `selected_wish`) VALUES
(1, 'meet srk', 'fly', 'mobile', NULL, ''),
(2, 'swim', 'meet kareena', 'go paris', NULL, ''),
(4, 'play cricket', 'visit USA', 'be pilot', NULL, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `wishtable`
--
ALTER TABLE `wishtable`
  ADD PRIMARY KEY (`wish_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `wishtable`
--
ALTER TABLE `wishtable`
  MODIFY `wish_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
