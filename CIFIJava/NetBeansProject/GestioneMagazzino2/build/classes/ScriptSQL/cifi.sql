-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Apr 08, 2021 alle 21:36
-- Versione del server: 10.1.28-MariaDB
-- Versione PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cifi`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `categorie`
--

CREATE TABLE `categorie` (
  `Id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Descrizione` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `categorie`
--

INSERT INTO `categorie` (`Id`, `Nome`, `Descrizione`) VALUES
(1, 'Categoria1', 'Descrizione categoria 1'),
(2, 'Categoria2', NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `prodotti`
--

CREATE TABLE `prodotti` (
  `Codice` int(11) NOT NULL,
  `IdCategoria` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Descrizione` varchar(250) DEFAULT NULL,
  `Prezzo` double NOT NULL,
  `Giacenza` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `prodotti`
--

INSERT INTO `prodotti` (`Codice`, `IdCategoria`, `Nome`, `Descrizione`, `Prezzo`, `Giacenza`) VALUES
(1, 1, 'Prodotto1', 'Descrizione prodotto 1', 10.5, 150),
(2, 2, 'Prodotto2', 'Descrizione 2', 10.25, 78),
(3, 1, 'Prodotto3', 'Descrizone prodotto 3', 2.35, 100),
(9, 2, 'Prodotto 9', 'Descrzione del prodotto numero 9', 14.55, 125),
(10, 1, 'prodotto 10', 'descrizione dell\'otto', 12.5, 147);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`Id`);

--
-- Indici per le tabelle `prodotti`
--
ALTER TABLE `prodotti`
  ADD PRIMARY KEY (`Codice`),
  ADD KEY `IdCategoria` (`IdCategoria`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `categorie`
--
ALTER TABLE `categorie`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `prodotti`
--
ALTER TABLE `prodotti`
  ADD CONSTRAINT `fk_prodotti_categorie` FOREIGN KEY (`IdCategoria`) REFERENCES `categorie` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
