-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 09 Mai 2017 à 20:27
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `biblio_v1`
--

-- --------------------------------------------------------

--
-- Structure de la table `adherent`
--

CREATE TABLE IF NOT EXISTS `adherent` (
  `ID` bigint(20) NOT NULL,
  `ADRESSE` varchar(255) DEFAULT NULL,
  `DATENAISSANCE` date DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `NUMTEL` varchar(255) DEFAULT NULL,
  `PRENOM` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `adherent`
--

INSERT INTO `adherent` (`ID`, `ADRESSE`, `DATENAISSANCE`, `NOM`, `NUMTEL`, `PRENOM`) VALUES
(1, 'agadir', '1995-09-13', 'almoatassim', '0645789632', 'wafa'),
(51, 'marrakech', '1994-08-02', 'benmkaddem', '0693782904', 'imane'),
(151, 'kenitra', '1993-11-04', 'baotmane', '0660558742', 'farah'),
(401, 'marakech', '1988-03-02', 'zouani', '0612478956', 'youness'),
(651, 'agadir', '1995-01-01', 'dabar', '0658921478', 'amine'),
(1301, 'casablanca', '1988-10-12', 'asmaa', '0644377472', 'benmkaddem');

-- --------------------------------------------------------

--
-- Structure de la table `auteur`
--

CREATE TABLE IF NOT EXISTS `auteur` (
  `ID` bigint(20) NOT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `PRENOM` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `auteur`
--

INSERT INTO `auteur` (`ID`, `NOM`, `PRENOM`) VALUES
(602, 'el moatassim', 'wafa'),
(752, 'akharaz', 'soumia'),
(802, 'phedre', 'jean4'),
(851, 'ben mkaddem', 'imane'),
(1247, 'ahmed', 'tawfik'),
(2134, ' baotman', 'abir');

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE IF NOT EXISTS `categorie` (
  `ID` bigint(20) NOT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `categorie`
--

INSERT INTO `categorie` (`ID`, `NOM`) VALUES
(1, 'SCIENCE FICTION'),
(2, 'MATH'),
(3, 'PHYSIQUE'),
(4, 'PHILO');

-- --------------------------------------------------------

--
-- Structure de la table `emprunt`
--

CREATE TABLE IF NOT EXISTS `emprunt` (
  `ID` bigint(20) NOT NULL,
  `DATEEMPRUNT` date DEFAULT NULL,
  `NBROUVRAGE` int(11) DEFAULT NULL,
  `RESERVATION_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_EMPRUNT_RESERVATION_ID` (`RESERVATION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `empruntitem`
--

CREATE TABLE IF NOT EXISTS `empruntitem` (
  `ID` bigint(20) NOT NULL,
  `DATEEMPRUNT` date DEFAULT NULL,
  `DATERETOUREFFECTIF` date DEFAULT NULL,
  `DATERETOURPREVU` date DEFAULT NULL,
  `EMPRUNT_ID` bigint(20) DEFAULT NULL,
  `OUVRAGE_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_EMPRUNTITEM_OUVRAGE_ID` (`OUVRAGE_ID`),
  KEY `FK_EMPRUNTITEM_EMPRUNT_ID` (`EMPRUNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `managerbiblio`
--

CREATE TABLE IF NOT EXISTS `managerbiblio` (
  `LOGIN` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`LOGIN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `managerbiblio`
--

INSERT INTO `managerbiblio` (`LOGIN`, `PASSWORD`) VALUES
('ana_amine', 'amine'),
('ana_farah', 'farah'),
('ana_imane', 'imane'),
('ana_wafaa', 'wafaa');

-- --------------------------------------------------------

--
-- Structure de la table `ouvrage`
--

CREATE TABLE IF NOT EXISTS `ouvrage` (
  `ID` varchar(255) NOT NULL,
  `DATEEDITION` date DEFAULT NULL,
  `NBREXPLAIRE` int(11) DEFAULT NULL,
  `NBRPAGE` int(11) DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `AUTEUR_ID` bigint(20) DEFAULT NULL,
  `CATEGORIE_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_OUVRAGE_AUTEUR_ID` (`AUTEUR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ouvrage`
--

INSERT INTO `ouvrage` (`ID`, `DATEEDITION`, `NBREXPLAIRE`, `NBRPAGE`, `NOM`, `AUTEUR_ID`, `CATEGORIE_ID`) VALUES
('1478', '2016-10-05', 3, 250, 'la vie', 802, 1),
('14789', '2018-05-01', 5, 450, 'mimi and kiki', 851, 2),
('201', '1996-02-12', 120, 120, 'la boite a merveille', NULL, 3),
('451', '2010-02-10', 180, 120, 'le dernier jour', NULL, 2),
('47', '1987-02-05', 1, 123, 'dfghjk', 602, 1),
('589', '1998-05-01', 5, 455, 'dfghjk', 602, 4),
('751', '2017-09-22', 4, 82, 'kil', NULL, 2);

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `ID` bigint(20) NOT NULL,
  `DATERESVATION` date DEFAULT NULL,
  `NBOUVRAGE` int(11) DEFAULT NULL,
  `ADHERENT_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_RESERVATION_ADHERENT_ID` (`ADHERENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `reservation`
--

INSERT INTO `reservation` (`ID`, `DATERESVATION`, `NBOUVRAGE`, `ADHERENT_ID`) VALUES
(1351, '2016-04-02', 0, 151),
(1401, '1993-11-04', 0, 651),
(1451, '2017-01-22', 3, 1);

-- --------------------------------------------------------

--
-- Structure de la table `reservationitem`
--

CREATE TABLE IF NOT EXISTS `reservationitem` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `OUVRAGE_ID` varchar(255) DEFAULT NULL,
  `RESERVATION_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_RESERVATIONITEM_RESERVATION_ID` (`RESERVATION_ID`),
  KEY `FK_RESERVATIONITEM_OUVRAGE_ID` (`OUVRAGE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `reservationitem`
--

INSERT INTO `reservationitem` (`ID`, `DESCRIPTION`, `OUVRAGE_ID`, `RESERVATION_ID`) VALUES
(1352, 'bon etat', '1478', 1351),
(1353, 'bon etat', '201', 1351),
(1354, 'pas mal', '47', 1351),
(1402, 'bon etat', '1478', 1401),
(1403, 'bon etat', '751', 1401),
(1452, 'waloooo', '14789', 1451),
(1453, 'batmaneeee', '451', 1451),
(1454, 'kiffff', '751', 1451);

-- --------------------------------------------------------

--
-- Structure de la table `sequence`
--

CREATE TABLE IF NOT EXISTS `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '1500');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `emprunt`
--
ALTER TABLE `emprunt`
  ADD CONSTRAINT `FK_EMPRUNT_RESERVATION_ID` FOREIGN KEY (`RESERVATION_ID`) REFERENCES `reservation` (`ID`);

--
-- Contraintes pour la table `empruntitem`
--
ALTER TABLE `empruntitem`
  ADD CONSTRAINT `FK_EMPRUNTITEM_EMPRUNT_ID` FOREIGN KEY (`EMPRUNT_ID`) REFERENCES `emprunt` (`ID`),
  ADD CONSTRAINT `FK_EMPRUNTITEM_OUVRAGE_ID` FOREIGN KEY (`OUVRAGE_ID`) REFERENCES `ouvrage` (`ID`);

--
-- Contraintes pour la table `ouvrage`
--
ALTER TABLE `ouvrage`
  ADD CONSTRAINT `FK_OUVRAGE_AUTEUR_ID` FOREIGN KEY (`AUTEUR_ID`) REFERENCES `auteur` (`ID`);

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FK_RESERVATION_ADHERENT_ID` FOREIGN KEY (`ADHERENT_ID`) REFERENCES `adherent` (`ID`);

--
-- Contraintes pour la table `reservationitem`
--
ALTER TABLE `reservationitem`
  ADD CONSTRAINT `FK_RESERVATIONITEM_OUVRAGE_ID` FOREIGN KEY (`OUVRAGE_ID`) REFERENCES `ouvrage` (`ID`),
  ADD CONSTRAINT `FK_RESERVATIONITEM_RESERVATION_ID` FOREIGN KEY (`RESERVATION_ID`) REFERENCES `reservation` (`ID`);
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
