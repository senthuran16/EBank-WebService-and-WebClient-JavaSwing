-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2017 at 06:27 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ebank`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `name` varchar(100) NOT NULL,
  `birthDate` date DEFAULT NULL,
  `address` varchar(100) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `accountType` varchar(50) NOT NULL,
  `accountNumber` varchar(50) NOT NULL,
  `sortCode` varchar(50) DEFAULT NULL,
  `balance` double NOT NULL,
  `card` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`name`, `birthDate`, `address`, `mobile`, `email`, `accountType`, `accountNumber`, `sortCode`, `balance`, `card`) VALUES
('Senthuran Ambalavanar', '1996-01-16', '32, 4/2, Madangahawatte Lane, Colombo 06', '0757875887', 'senthuranrc16@yahoo.com', 'Fixed', 'ACC123456', '12345678', 100000, '23456723'),
('Ajay Ghale', '1990-10-10', '9916 West Rocky River Street \r\nPewaukee, WI 53072', '0714568997', 'ajay@gmail.com', 'Fixed', 'ACC1236457', '12133163', 50000, '12456784'),
('Gareth Evans', '1980-03-15', '4 Goldfield Rd. \r\nHonolulu, HI 96815', '0723219348', 'gareth@gmail.com', 'Fixed', 'ACC184929', '84293492', 12000, '32923945'),
('Tresh Wayne', '1995-01-12', '42A- Repstu Victoria, FL32032', '0774396554', 'thresh@gmail.com', 'Savings', 'ACC294628', '28174635', 8000, '23456747'),
('Katerian Reynolds', '1992-09-19', '17B- Restur Appartments, Melbourne, FL38294', '0713847362', 'katerian@gmail.com', 'Savings', 'ACC372847', '10475935', 5000, '19374627'),
('Thomas Serns', '1993-06-21', '10- Filla Towers, Melbourne, FL32413', '07742947324', 'Serns@gmail.com', 'Fixed', 'ACC472637', '17362540', 2000, '39573610'),
('Aaron Simons', '1970-02-17', '15- Davidson, Melbourne, FL32904', '0724957385', 'aaron@gmail.com', 'Fixed', 'ACC482650', '10674305', 400, '49103748'),
('Vidura Amarasinghe', '1998-07-13', '123 6th St. \n Melbourne, FL 32904', '0727658342', 'vidura@gmail.com', 'Savings', 'ACC829384', '84753859', 12000, '32245642'),
('Eddie Van Der Meer', '1990-08-14', '4 Piper Road \r\nKalamazoo, MI 49009', '0773465862', 'eddie@gmail.com', 'Savings', 'ACC839458', '74289328', 7000, '92839203'),
('Tommy Emmanuel', '1960-08-24', '739 Brewery Street \r\nBedford, OH 44146', '0725849388', 'tommy@gmail.com', 'Fixed', 'ACC849267', '18275692', 14300, '27548629'),
('Cardinal Adams', '1993-04-25', '21- Davidson Melbourne, FL32904', '0782195623', 'cardinal@gmail.com', 'Fixed', 'ACC905213', '20472493', 4000, '32957348'),
('Peter Gergely', '1986-07-05', '493 Walnutwood St. \r\nDes Plaines, IL 60016', '0718372584', 'peter@gmail.com', 'Savings', 'ACC926283', '82734659', 1350, '82946032');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `name` varchar(100) NOT NULL,
  `position` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`name`, `position`, `username`, `password`) VALUES
('Chaminda Vaas', 'Credit Manager', 'chamindaVass', 'cham123Vass'),
('Colby Hoff', 'Collection Centre Manager', 'colbyHoffman', 'Colby1821'),
('Ishira Grande', 'Accounts Manager', 'ishiragrande', 'ishira132'),
('John Williams', 'Manager', 'john', 'Will1234'),
('Mayuran Selveraja', 'Area Manager', 'mayuranSelve', 'mayo283'),
('Sanduni Perera', 'Assistant Credit Manager', 'sanduniP', 'sand123uni'),
('Senthuran Ambalavanar', 'Manager', 'senthu', '1234Osd'),
('Shehaan Johar', 'Branch Manager', 'shehaanjoh', 'johar742'),
('Tuan Shakil', 'Bank Director', 'tuanShak', 'shakilo287'),
('Vidura Amarasinghe', 'Financial Analyst', 'vidura', '123promate');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`accountNumber`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
