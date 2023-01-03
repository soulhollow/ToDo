-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Erstellungszeit: 03. Jan 2023 um 13:59
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
-- Datenbank: `todo1`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tasktable`
--

CREATE TABLE `tasktable` (
  `ID_Task` int(11) NOT NULL,
  `estimatedTime` int(11) NOT NULL,
  `description` text NOT NULL,
  `taskSubject` text NOT NULL,
  `Creator` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `workertable`
--

CREATE TABLE `workertable` (
  `ID_Worker` int(11) NOT NULL,
  `Salary` double NOT NULL,
  `Position` int(11) NOT NULL,
  `WorkerStatus` tinyint(1) NOT NULL,
  `Name` text NOT NULL,
  `FirstName` text NOT NULL,
  `Email` text NOT NULL,
  `password` text NOT NULL,
  `username` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `workertable`
--

INSERT INTO `workertable` (`ID_Worker`, `Salary`, `Position`, `WorkerStatus`, `Name`, `FirstName`, `Email`, `password`, `username`) VALUES
(0, 20000, 0, 0, 'admin', 'admin', 'nixmoritzosu@gmail.com', 'admin', 'admin'),
(1, 18000, 1, 1, 'Rothert', 'Moritz', 'moritz.rothert@gmail.com', '123', 'moritz.rothert'),
(2, 16000, 2, 1, 'Gorshoefer', 'Florian', 'florian.gorsheofer@mail.de', '123', 'florian.g'),
(3, 20000, 1, 0, 'Ruffner', 'Florian', 'florian.ruffner@mail.de', '123', 'florian.r'),
(4, 30, 3, 0, 'Ruffner', 'Alexander', 'ar@ruffner-beratung.de', '123', 'Alexander.Ruffner.4');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `workertasktable`
--

CREATE TABLE `workertasktable` (
  `ID` int(11) NOT NULL,
  `ID_Worker` int(11) NOT NULL,
  `ID_Task` int(11) NOT NULL,
  `Status` int(11) NOT NULL,
  `UsedTime` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `tasktable`
--
ALTER TABLE `tasktable`
  ADD PRIMARY KEY (`ID_Task`),
  ADD UNIQUE KEY `ID_Task` (`ID_Task`),
  ADD KEY `Weist derCreator` (`Creator`);

--
-- Indizes für die Tabelle `workertable`
--
ALTER TABLE `workertable`
  ADD PRIMARY KEY (`ID_Worker`) USING BTREE,
  ADD UNIQUE KEY `ID_Worker` (`ID_Worker`);

--
-- Indizes für die Tabelle `workertasktable`
--
ALTER TABLE `workertasktable`
  ADD UNIQUE KEY `ID` (`ID`),
  ADD KEY `strarkebeziehung` (`ID_Task`),
  ADD KEY `schwachebeziehung` (`ID_Worker`);

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `tasktable`
--
ALTER TABLE `tasktable`
  ADD CONSTRAINT `Weist derCreator` FOREIGN KEY (`Creator`) REFERENCES `workertable` (`ID_Worker`);

--
-- Constraints der Tabelle `workertasktable`
--
ALTER TABLE `workertasktable`
  ADD CONSTRAINT `schwachebeziehung` FOREIGN KEY (`ID_Worker`) REFERENCES `workertable` (`ID_Worker`),
  ADD CONSTRAINT `strarkebeziehung` FOREIGN KEY (`ID_Task`) REFERENCES `tasktable` (`ID_Task`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
