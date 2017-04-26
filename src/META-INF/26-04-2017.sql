-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mer 26 Avril 2017 à 08:49
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `biblio_v1`
--

-- --------------------------------------------------------

--
-- Structure de la table `adherent`
--

CREATE TABLE `adherent` (
  `ID` bigint(20) NOT NULL,
  `ADRESSE` varchar(255) DEFAULT NULL,
  `DATENAISSANCE` date DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `NUMTEL` varchar(255) DEFAULT NULL,
  `PRENOM` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `adherent`
--

INSERT INTO `adherent` (`ID`, `ADRESSE`, `DATENAISSANCE`, `NOM`, `NUMTEL`, `PRENOM`) VALUES
(1, NULL, '1990-11-02', 'farah', '0623228767', 'dalaha'),
(51, NULL, '1994-02-08', 'benmkaddem', '0693782904', 'imane'),
(101, 'Marrakech', '1988-03-12', 'zouani', '0987654321', 'youness'),
(151, 'Agadir', '1994-09-06', 'almotassim', '123456789', 'wafae');

-- --------------------------------------------------------

--
-- Structure de la table `auteur`
--

CREATE TABLE `auteur` (
  `ID` bigint(20) NOT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `PRENOM` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `auteur`
--

INSERT INTO `auteur` (`ID`, `NOM`, `PRENOM`) VALUES
(129, ' baotman', 'farah'),
(12134, ' baotman', 'farah');

-- --------------------------------------------------------

--
-- Structure de la table `emprunt`
--

CREATE TABLE `emprunt` (
  `ID` bigint(20) NOT NULL,
  `DATEEMPRUNT` date DEFAULT NULL,
  `NBROUVRAGE` int(11) DEFAULT NULL,
  `RESERVATION_ID` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `empruntitem`
--

CREATE TABLE `empruntitem` (
  `ID` bigint(20) NOT NULL,
  `DATEEMPRUNT` date DEFAULT NULL,
  `DATERETOUREFFECTIF` date DEFAULT NULL,
  `DATERETOURPREVU` date DEFAULT NULL,
  `EMPRUNT_ID` bigint(20) DEFAULT NULL,
  `OUVRAGE_ID` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `managerbiblio`
--

CREATE TABLE `managerbiblio` (
  `LOGIN` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `managerbiblio`
--

INSERT INTO `managerbiblio` (`LOGIN`, `PASSWORD`) VALUES
('ana_farah', 'farah'),
('ana_imane', 'imane'),
('ana_amine', 'amine'),
('ana_wafaa', 'wafaa');

-- --------------------------------------------------------

--
-- Structure de la table `ouvrage`
--

CREATE TABLE `ouvrage` (
  `ID` varchar(255) NOT NULL,
  `DATEEDITION` date DEFAULT NULL,
  `NBREXPLAIRE` int(11) DEFAULT NULL,
  `NBRPAGE` int(11) DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `AUTEUR_ID` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `ID` bigint(20) NOT NULL,
  `DATERESVATION` date DEFAULT NULL,
  `NBOUVRAGE` int(11) DEFAULT NULL,
  `ADHERENT_ID` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `reservationitem`
--

CREATE TABLE `reservationitem` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `OUVRAGE_ID` varchar(255) DEFAULT NULL,
  `RESERVATION_ID` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `sequence`
--

CREATE TABLE `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '200');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `adherent`
--
ALTER TABLE `adherent`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `auteur`
--
ALTER TABLE `auteur`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `emprunt`
--
ALTER TABLE `emprunt`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_EMPRUNT_RESERVATION_ID` (`RESERVATION_ID`);

--
-- Index pour la table `empruntitem`
--
ALTER TABLE `empruntitem`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_EMPRUNTITEM_OUVRAGE_ID` (`OUVRAGE_ID`),
  ADD KEY `FK_EMPRUNTITEM_EMPRUNT_ID` (`EMPRUNT_ID`);

--
-- Index pour la table `managerbiblio`
--
ALTER TABLE `managerbiblio`
  ADD PRIMARY KEY (`LOGIN`);

--
-- Index pour la table `ouvrage`
--
ALTER TABLE `ouvrage`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_OUVRAGE_AUTEUR_ID` (`AUTEUR_ID`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_RESERVATION_ADHERENT_ID` (`ADHERENT_ID`);

--
-- Index pour la table `reservationitem`
--
ALTER TABLE `reservationitem`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_RESERVATIONITEM_RESERVATION_ID` (`RESERVATION_ID`),
  ADD KEY `FK_RESERVATIONITEM_OUVRAGE_ID` (`OUVRAGE_ID`);

--
-- Index pour la table `sequence`
--
ALTER TABLE `sequence`
  ADD PRIMARY KEY (`SEQ_NAME`);
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
