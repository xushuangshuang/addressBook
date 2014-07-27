CREATE TABLE `group` (
  `id` bigint(100) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `group` varchar(200) DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `memo` varchar(10000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 PACK_KEYS=0;
