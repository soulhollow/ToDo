-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Erstellungszeit: 10. Dez 2022 um 16:09
-- Server-Version: 10.4.21-MariaDB
-- PHP-Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `todo`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `PasswaortTabelle`
--

CREATE TABLE `PasswaortTabelle` (
  `ID` int(11) NOT NULL,
  `ID_Worker` int(11) NOT NULL,
  `Passwort` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `TaskTabelle`
--

CREATE TABLE `TaskTabelle` (
  `ID_Task` int(11) NOT NULL,
  `Status` tinyint(1) NOT NULL,
  `estimatedTime` text NOT NULL,
  `taskTag` text NOT NULL,
  `taskSubject` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `WorkerTabelle`
--

CREATE TABLE `WorkerTabelle` (
  `ID_Worker` int(11) NOT NULL,
  `Salary` double NOT NULL,
  `Position` int(11) NOT NULL,
  `WorkerStatus` tinyint(1) NOT NULL,
  `Name` text NOT NULL,
  `FirstName` text NOT NULL,
  `Email` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `WorkerTaskTabelle`
--

CREATE TABLE `WorkerTaskTabelle` (
  `ID` int(11) NOT NULL,
  `ID_Worker` int(11) NOT NULL,
  `ID_Task` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `PasswaortTabelle`
--
ALTER TABLE `PasswaortTabelle`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indizes für die Tabelle `TaskTabelle`
--
ALTER TABLE `TaskTabelle`
  ADD PRIMARY KEY (`ID_Task`),
  ADD UNIQUE KEY `ID_Task` (`ID_Task`);

--
-- Indizes für die Tabelle `WorkerTabelle`
--
ALTER TABLE `WorkerTabelle`
  ADD PRIMARY KEY (`ID_Worker`),
  ADD UNIQUE KEY `ID_Worker` (`ID_Worker`);

--
-- Indizes für die Tabelle `WorkerTaskTabelle`
--
ALTER TABLE `WorkerTaskTabelle`
  ADD UNIQUE KEY `ID` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
