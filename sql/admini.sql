CREATE TABLE `admini` (
  `id` bigint(255) NOT NULL,
  `account` varchar(1000) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(1000) DEFAULT NULL,
  `group` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 PACK_KEYS=0;
