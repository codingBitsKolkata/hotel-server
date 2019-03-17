-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2019 at 06:53 AM
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_hotel_data`
--

INSERT INTO `master_hotel_data` (`hotel_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `checkIn_time`, `checkOut_time`, `descriptive_text`, `hotel_code`, `hotel_name`, `latitude`, `longitude`, `review_count`, `review_rating`) VALUES
(1, 1, '2019-03-17 12:22:34', NULL, NULL, '12:00:00', '12:00:00', 'Situated at a proximity of 1 km from Rajokari Xing Bus Stand, Ashok Country Resort houses a business center with internet access. This resort in New Delhi maintains 82 air-conditioned rooms. In room amenities available include television, mini-bar, television, telephone and an attached bathroom. ', '00000001', 'Ashok Country Resort', '28.526241', '77.09259', '20   ', '3.7  '),
(2, 1, '2019-03-17 12:22:34', NULL, NULL, '10:00:00', '11:00:00', 'Offering quality and value, Gulshah Motel hotel is an ideal option for travelers. \n\nSituated at a close proximity from Ashutosh Shiv Mandir, Gulshah Motel is a budget accommodation in Jalandhar offering free breakfast and internet access to its guests.\n\nA total of 17 well-kept and spacious rooms are available for accommodation. Some of the in-room amenities offered are television, wakeup-calls, minibar, telephone, desk, air-conditioner, room heater, wardrobe and bathroom with hot/cold running water.\n\n24-hour front desk, business center, luggage storage, elevator, banquet facilities, parking, security guard and backup generator are a few of the facilities available at Gulshah Motel. This hotel in Jalandhar offers room service, express check-in/check-out, currency exchange, medical assistance, laundry and concierge for the convenience of the guests.\n\nThe property is accessible via travel hubs such as Jalandhar City Railway Station (5 km) and Sri Guru Ram Dass Jee International Airport (90 km). Places worth a visit include Mandir Shri Siddh Baba Sodal (4 km) and Devi Talab Temple (6 km).\n\nThe property also has a restaurant and bar.\n\n<B> What people love the most about this property is its great location and classy ambience.\nBook now and enjoy world class services at Gulshah Motel. </B>', '00136816', 'Gulshah Motel', '31.364723', '75.5961', '', '10');

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
-- Table structure for table `master_hotel_review`
--

DROP TABLE IF EXISTS `master_hotel_review`;
CREATE TABLE IF NOT EXISTS `master_hotel_review` (
  `hotel_review_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `avgGuestRating` varchar(255) DEFAULT NULL,
  `cleanliness` varchar(255) DEFAULT NULL,
  `comments` text,
  `diningQuality` varchar(255) DEFAULT NULL,
  `overallRating` varchar(255) DEFAULT NULL,
  `postDate` varchar(255) DEFAULT NULL,
  `roomQuality` varchar(255) DEFAULT NULL,
  `serviceQuality` varchar(255) DEFAULT NULL,
  `hotel_id` bigint(20) NOT NULL,
  PRIMARY KEY (`hotel_review_id`),
  KEY `FKhgjwvf5lsnd9jcxov7trar00y` (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_hotel_review`
--

INSERT INTO `master_hotel_review` (`hotel_review_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `avgGuestRating`, `cleanliness`, `comments`, `diningQuality`, `overallRating`, `postDate`, `roomQuality`, `serviceQuality`, `hotel_id`) VALUES
(1, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '2', 'It is close to the international airport which is a plus point. I enjoyed the lovely butter nans with reshmi kebabs.', '5', '4', '2006-07-27 00:00:00.0', '5', '5', 1),
(2, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'The hotel is located in an isolated place in the countryside but not far from the airport. It is quiet and peaceful. A good place for one night transit. ', '3', '4', '2007-10-16 00:00:00.0', '4', '3', 1),
(3, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'I think this is a rather comfortable, clean and safe place keeping in mind that one stays near to the airport, more often for a early morning flight and the like.  Would recommend this property as a option to have.', '4', '4', '2007-10-30 00:00:00.0', '4', '4', 1),
(4, 1, '2019-03-17 12:22:34', NULL, NULL, 'Good', '3', '', '2', '3', '2007-12-08 00:00:00.0', '2', '3', 1),
(5, 1, '2019-03-17 12:22:34', NULL, NULL, 'Superb', '5', 'It was a fantastic stay in this hotel. Rooms were well furnished with beautiful interiors. Staffs were very prompt and quick in their work. I had my food in the restaurant it was lovely in taste. I would definitely stay in this hotel again.', '5', '5', '2008-01-14 00:00:00.0', '4', '5', 1),
(6, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'The staffs were very kind and polite in their work. Rooms were decently maintained with all the facilities. The food was good of the restaurant. I would definitely recommend this hotel to my friends.\n', '4', '4', '2008-01-15 00:00:00.0', '4', '4', 1),
(7, 1, '2019-03-17 12:22:34', NULL, NULL, 'Below Average', '1', 'Its a worst property. They are running illegal bar and charging very high. Service was pathetic. Food was pathetic. Room was below average. I will never recommend any one in future. \n', '1', '1', '2008-02-07 00:00:00.0', '1', '1', 1),
(8, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'Great property, everything was perfect. No complaints and suggestion. Would highly recommend this hotel.', '4', '4', '2008-01-17 00:00:00.0', '4', '4', 1),
(9, 1, '2019-03-17 12:22:34', NULL, NULL, 'Good', '4', 'Our stay was average considering the price i have paid. Club Room was average with basic facilities and the interior of the hotel was old, when asked the staff members say they have no time for renovation as it will be always occupied by guests. Food was below average as you dont get much options to choose and also not tasty, we ordered paneer masala they gave us 4 days old paneer, no much choices in Indian food as they well be having more foreign guests. Overall it was just average stay. Not recommendable for price conscious travelers.  ', '2', '3', '2008-01-16 00:00:00.0', '3', '3', 1),
(10, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '5', 'For the money we paid it was not upto our expectation. No gym. Food was ok in taste. Room was spacious and clean. Overall the stay was just average.', '3', '4', '2008-02-05 00:00:00.0', '5', '3', 1),
(11, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'The hotel was definately better than most hotels in India.  It was clean, staff was very courteous and helpful.  Transport to and from the airport was included, which was much appreciated, especially since I did not want to use a taxi after having heard all horrible stories.  The room was clean, but missed a few things like alarm clock, the remote for the wall mounted plasma tv (it was nice) didn''t work most of the time.  The dinning options weren''t that good and the pool was closed when I was there.', '3', '4', '2007-12-30 00:00:00.0', '4', '5', 1),
(12, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'Friendly staff makes our stay enjoyable. According to our experience we didn''t find any problem in hotel. Complimentary breakfast and airport transfer was nice.', '4', '4', '2008-02-21 00:00:00.0', '4', '4', 1),
(13, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'The Club Room was comfortable as well as neat and clean. Staff was prompt and quick in their service. Hotel has restaurant which serves great food.', '4', '4', '2008-03-06 00:00:00.0', '4', '4', 1),
(14, 1, '2019-03-17 12:22:34', NULL, NULL, 'Good', '3', 'Room was small but comfortable. The staff was courteous, its definatly a value for money.', '3', '3', '2008-02-25 00:00:00.0', '3', '3', 1),
(15, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '5', 'It was my business trip and i have stayed here for 2 nights. Only problem i had was the Wi-Fi cut off which was not working property. Otherwise it was an excellent stay. Food was good in the restaurant.', '4', '4', '2008-01-21 00:00:00.0', '5', '3', 1),
(16, 1, '2019-03-17 12:22:34', NULL, NULL, 'Good', '3', 'Overall cleanliness was good with all modern facilities. Location was great in the city. Would like stay on my next visit also recommend for others.', '3', '3', '2008-03-31 01:17:02.857', '3', '3', 1),
(17, 1, '2019-03-17 12:22:34', NULL, NULL, 'Excellent', '4', 'Club Room was very comfortable. All services and the amenities were very decent. The celanliness was good and the food was delicious but expensive. Overall slightly above average stay.', '3', '4', '2008-07-06 05:24:25.473', '4', '3', 1);

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

--
-- Constraints for dumped tables
--

--
-- Constraints for table `master_hotel_review`
--
ALTER TABLE `master_hotel_review`
  ADD CONSTRAINT `FKhgjwvf5lsnd9jcxov7trar00y` FOREIGN KEY (`hotel_id`) REFERENCES `master_hotel_data` (`hotel_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
