-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2017 at 04:35 AM
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
-- Table structure for table `child`
--

CREATE TABLE `child` (
  `parent_id` int(20) NOT NULL,
  `child_name` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `parent_name` varchar(50) NOT NULL,
  `illness` varchar(50) NOT NULL,
  `doctor_name` varchar(50) NOT NULL,
  `doctor_id` int(20) NOT NULL,
  `volunteer_id` int(20) NOT NULL,
  `wish_id` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `child`
--

INSERT INTO `child` (`parent_id`, `child_name`, `dob`, `parent_name`, `illness`, `doctor_name`, `doctor_id`, `volunteer_id`, `wish_id`) VALUES
(1, 'raj shukla', '2000-07-04', 'mit shukla', 'cancer', 'dr. amit desai', 3, 2, 1),
(2, 'nihal', '2017-05-02', 'ankit', 'cancer', 'Dr Rohit rane', 12, 1, 2),
(5, 'karan k', '2000-07-10', 'sam', 'tuberculosis', 'dr. reema', 4, 3, 4);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `doctor_name` varchar(500) NOT NULL,
  `email` varchar(500) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `hospital` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doctor_name`, `email`, `doctor_id`, `hospital`) VALUES
('Rohan kale', 'rohankale@gmail.com', 1, 'J.J. Hospital'),
('Ishant Varma', 'ishantverma@gmail.com', 2, 'tata hospital'),
('dr. reema', 'reema@jj.com', 3, 'Hinduja'),
('Dr. amit', 'amit@tata.com', 4, 'tata');

-- --------------------------------------------------------

--
-- Table structure for table `doner`
--

CREATE TABLE `doner` (
  `name` varchar(500) NOT NULL,
  `id` int(11) NOT NULL,
  `bank details` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doner`
--

INSERT INTO `doner` (`name`, `id`, `bank details`) VALUES
('donor1', 1, '1425365'),
('donor2', 2, '4684654');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` int(11) NOT NULL,
  `staff_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `staff_name`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `volunteer`
--

CREATE TABLE `volunteer` (
  `Volunteer_id` int(20) NOT NULL,
  `Fname` varchar(10) NOT NULL,
  `lname` varchar(10) NOT NULL,
  `DOB` date NOT NULL,
  `email` varchar(20) NOT NULL,
  `DOJ` date NOT NULL,
  `credits` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `volunteer`
--

INSERT INTO `volunteer` (`Volunteer_id`, `Fname`, `lname`, `DOB`, `email`, `DOJ`, `credits`) VALUES
(1, 'sameer', 'vyas', '1990-07-03', 'abc@aba', '2017-07-04', 0),
(2, 'raju', 'kumar', '1990-07-04', 'raju@g.com', '2017-07-02', 2),
(3, 'suresh', 'khanna', '1993-07-17', 'sur@g.com', '2017-07-05', 1);

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
-- Indexes for table `child`
--
ALTER TABLE `child`
  ADD PRIMARY KEY (`parent_id`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`doctor_id`);

--
-- Indexes for table `doner`
--
ALTER TABLE `doner`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `volunteer`
--
ALTER TABLE `volunteer`
  ADD PRIMARY KEY (`Volunteer_id`);

--
-- Indexes for table `wishtable`
--
ALTER TABLE `wishtable`
  ADD PRIMARY KEY (`wish_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `child`
--
ALTER TABLE `child`
  MODIFY `parent_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `doctor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `doner`
--
ALTER TABLE `doner`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `staff_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `volunteer`
--
ALTER TABLE `volunteer`
  MODIFY `Volunteer_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `wishtable`
--
ALTER TABLE `wishtable`
  MODIFY `wish_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
