CREATE TABLE `contact` (
  `contact_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `mobile` int(20) DEFAULT NULL,
  `vpmn` int(11) DEFAULT NULL,
  `email` varchar(20) NOT NULL,
  `home_address` varchar(20) DEFAULT NULL,
  `office_address` varchar(20) NOT NULL,
  `memo` varchar(20) DEFAULT NULL,
  `groups` varchar(20) DEFAULT NULL,
  `job` varchar(20) NOT NULL,
  `job_level` int(8) NOT NULL,
  PRIMARY KEY (`contact_id`),
  UNIQUE KEY `contact_id` (`contact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 PACK_KEYS=0;
