# springwebservice
create database shop inside your mysql database
and run products table creation script:

CREATE TABLE  `products` (
  `id` int(5) NOT NULL auto_increment,
  `name` varchar(200)   NOT NULL,
  `descr` varchar(555)  NOT NULL,
  `price` float NOT NULL,
  `picture` varchar(400)  NOT NULL,
  category_id int(4) NOT NULL,
  PRIMARY KEY  (`id`),
FOREIGN KEY (`category_id` )
    REFERENCES  shop.category(id)
) ;


INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'tosh','old but working toshiba laptop',400,'images/img1.jpg',1);
INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'toshi','old but working toshiba laptop',402,'images/img2.jpg',1);
INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'toshba','once again old but working toshiba laptop',404,'images/img3.jpg',1);
INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'toshiva','one more time working toshiba laptop',405,'images/img4.jpg',1);
INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'toshbaba','old but working toshiba laptop',417,'images/img5.jpg',1);
INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'samsung','old and somehow working mobile cell phone',400,'images/img6.jpg',3);
INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'samsunmb','somehow working mobile cell phone',400,'images/img7.jpg',3);
INSERT INTO `products` (`id`, `name`, `descr`, `price`, `picture`,category_id) VALUES(null,'proscantv','tili vision',254,'images/img8.jpg',2);

inside dao package in file productsdaoimpl change connection details 
con = DriverManager.getConnection (connectionURL,"root","nbuser");  
root and nbuser are my username and password , so change this to yours everywhere
change in webservices-servlet.xml  localhost:8083 , to your tomcat/or webserver/ port
I have localhost:8083 set , because I run tomcat on port 8083 .
to change tomcat running port from eclipse , just doubleclick tomcat server in servers view 
and click on timeout tab , there change 8080 to 8083 or whatever portnumber you like
