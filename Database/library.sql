-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  sam. 19 sep. 2020 à 21:45
-- Version du serveur :  10.3.16-MariaDB
-- Version de PHP :  7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `library`
--

-- --------------------------------------------------------

--
-- Structure de la table `add_emprunt`
--

CREATE TABLE `add_emprunt` (
  `id` int(11) NOT NULL,
  `std_name` varchar(20) NOT NULL,
  `stdtasjil` varchar(200) NOT NULL,
  `std_class` varchar(20) NOT NULL,
  `book` varchar(20) NOT NULL,
  `book_no` varchar(20) NOT NULL,
  `date_of_stiring` date NOT NULL,
  `date_of_return` date DEFAULT NULL,
  `std_img` longblob NOT NULL,
  `img_path` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `add_std`
--

CREATE TABLE `add_std` (
  `id` int(11) NOT NULL,
  `std_name` varchar(20) NOT NULL,
  `std_tasjil` varchar(20) NOT NULL,
  `std_birth` date DEFAULT NULL,
  `std_birth_place` varchar(50) NOT NULL,
  `std_class` varchar(50) NOT NULL,
  `std_level` varchar(50) NOT NULL,
  `std_phone` varchar(50) NOT NULL,
  `std_email` varchar(50) NOT NULL,
  `std_img` longblob NOT NULL,
  `img_path` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `book`
--

CREATE TABLE `book` (
  `book_id` int(11) NOT NULL,
  `bookname` varchar(100) NOT NULL,
  `bookno` int(20) NOT NULL,
  `cr_date` date DEFAULT NULL,
  `creator` varchar(20) NOT NULL,
  `house` varchar(20) NOT NULL,
  `book_spc` varchar(20) NOT NULL,
  `book_img` longblob NOT NULL,
  `img_path` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `book_not_returned`
--

CREATE TABLE `book_not_returned` (
  `bookname` varchar(100) NOT NULL,
  `bookno` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `name_and_password`
--

CREATE TABLE `name_and_password` (
  `username` varchar(100) DEFAULT NULL,
  `mypassword` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `std_image`
--

CREATE TABLE `std_image` (
  `std_no` int(11) NOT NULL,
  `std_img` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `student`
--

CREATE TABLE `student` (
  `studentname` varchar(100) NOT NULL,
  `studentno` int(100) DEFAULT NULL,
  `bookname` varchar(100) NOT NULL,
  `bookno` int(100) NOT NULL,
  `DateOfStiring` date DEFAULT NULL,
  `DateOfReturn` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `add_emprunt`
--
ALTER TABLE `add_emprunt`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `book_no` (`book_no`),
  ADD KEY `book_no_2` (`book_no`);

--
-- Index pour la table `add_std`
--
ALTER TABLE `add_std`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `std_phone` (`std_phone`),
  ADD UNIQUE KEY `std_email` (`std_email`),
  ADD UNIQUE KEY `std_name_6` (`std_name`),
  ADD UNIQUE KEY `std_tasjil` (`std_tasjil`),
  ADD KEY `std_birth_place` (`std_birth_place`),
  ADD KEY `std_name` (`std_name`),
  ADD KEY `std_name_2` (`std_name`),
  ADD KEY `std_name_3` (`std_name`),
  ADD KEY `std_name_4` (`std_name`),
  ADD KEY `std_name_5` (`std_name`);

--
-- Index pour la table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`book_id`),
  ADD UNIQUE KEY `bookno` (`bookno`),
  ADD KEY `bookname` (`bookname`),
  ADD KEY `bookno_2` (`bookno`);

--
-- Index pour la table `book_not_returned`
--
ALTER TABLE `book_not_returned`
  ADD PRIMARY KEY (`bookno`);

--
-- Index pour la table `std_image`
--
ALTER TABLE `std_image`
  ADD UNIQUE KEY `std_no` (`std_no`);

--
-- Index pour la table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`bookno`),
  ADD UNIQUE KEY `studentno` (`studentno`),
  ADD KEY `stiringBook` (`bookno`),
  ADD KEY `stiringBook_2` (`bookno`),
  ADD KEY `stiringBook_3` (`bookno`),
  ADD KEY `bookname` (`bookname`),
  ADD KEY `bookname_2` (`bookname`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `add_emprunt`
--
ALTER TABLE `add_emprunt`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `add_std`
--
ALTER TABLE `add_std`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `book`
--
ALTER TABLE `book`
  MODIFY `book_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
