CREATE TABLE `contact` (
  `contact_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `mobile` int(11) DEFAULT NULL,
  `vpmn` int(11) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `home_address` varchar(20) DEFAULT NULL,
  `office_address` varchar(20) DEFAULT NULL,
  `groups` varchar(20) DEFAULT NULL,
  `job` varchar(20) DEFAULT NULL,
  `job_level` int(11) DEFAULT NULL,
  `memo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`contact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 PACK_KEYS=0;
