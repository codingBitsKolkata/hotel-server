-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2019 at 05:25 AM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ora_hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `master_area_data`
--

DROP TABLE IF EXISTS `master_area_data`;
CREATE TABLE IF NOT EXISTS `master_area_data` (
  `ad_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `AreaId` varchar(255) DEFAULT NULL,
  `AreaName` varchar(255) DEFAULT NULL,
  `CityName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `master_city_data`
--

DROP TABLE IF EXISTS `master_city_data`;
CREATE TABLE IF NOT EXISTS `master_city_data` (
  `cd_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `CityName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `master_hotel_data`
--

DROP TABLE IF EXISTS `master_hotel_data`;
CREATE TABLE IF NOT EXISTS `master_hotel_data` (
  `hotel_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `checkIn_time` varchar(255) DEFAULT NULL,
  `checkOut_time` varchar(255) DEFAULT NULL,
  `descriptive_text` text,
  `hotel_code` varchar(255) DEFAULT NULL,
  `hotel_name` varchar(255) DEFAULT NULL,
  `latitude` varchar(255) DEFAULT NULL,
  `longitude` varchar(255) DEFAULT NULL,
  `review_count` varchar(255) DEFAULT NULL,
  `review_rating` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `master_hotel_policy_data`
--

DROP TABLE IF EXISTS `master_hotel_policy_data`;
CREATE TABLE IF NOT EXISTS `master_hotel_policy_data` (
  `hpd_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `policy` text,
  PRIMARY KEY (`hpd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `master_poi_data`
--

DROP TABLE IF EXISTS `master_poi_data`;
CREATE TABLE IF NOT EXISTS `master_poi_data` (
  `poid_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `City_Id` varchar(255) DEFAULT NULL,
  `City_Name` varchar(255) DEFAULT NULL,
  `Latitude` varchar(255) DEFAULT NULL,
  `Longitude` varchar(255) DEFAULT NULL,
  `Poi_Id` varchar(255) DEFAULT NULL,
  `Poi_Name` varchar(255) DEFAULT NULL,
  `Poi_Seo_Id` varchar(255) DEFAULT NULL,
  `Seo_City_Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`poid_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
