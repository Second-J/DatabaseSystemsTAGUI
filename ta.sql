-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2020 at 11:08 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ta`
--

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `title` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`title`) VALUES
('Die Hard'),
('movie1'),
('movie2'),
('movie3');

-- --------------------------------------------------------

--
-- Table structure for table `reviews`
--

CREATE TABLE `reviews` (
  `movie` varchar(50) NOT NULL,
  `rating` double NOT NULL,
  `description` text DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reviews`
--

INSERT INTO `reviews` (`movie`, `rating`, `description`, `username`) VALUES
('movie1', 4.2, 'WOW!!!', 'blanc'),
('movie2', 5, 'Amazing!', 'blanc'),
('movie3', 1, 'Movie 2 was better...', 'blanc'),
('movie1', 4.4, 'shAA!', 'GawrGura'),
('movie2', 5, 'SHAAAAA!!!', 'GawrGura'),
('Die Hard', 5, 'Best Christmas Movie EVER!!!', 'blanc'),
('Die Hard', 4, 'SHAAAARK', 'GawrGura');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `fName` varchar(50) NOT NULL,
  `lName` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`fName`, `lName`, `username`, `password`) VALUES
('Mada', 'Putra', 'Almada', 'back'),
('blanc', 'shiro', 'blanc', 'gagaga'),
('Gawr', 'Gura', 'GawrGura', 'shark'),
('Jerry', 'Tobing', 'JTxyz', 'hello'),
('Ryushen', 'Midori', 'ryushen', 'panda');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`title`);

--
-- Indexes for table `reviews`
--
ALTER TABLE `reviews`
  ADD KEY `username` (`username`),
  ADD KEY `movie` (`movie`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reviews`
--
ALTER TABLE `reviews`
  ADD CONSTRAINT `reviews_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`),
  ADD CONSTRAINT `reviews_ibfk_2` FOREIGN KEY (`movie`) REFERENCES `movies` (`title`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
