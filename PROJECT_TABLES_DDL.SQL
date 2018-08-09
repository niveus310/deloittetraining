


create table Customer
(
 userName varchar(20) primary key,
 password varchar(20) not null,
 customerName varchar(30),
 customerContact varchar(10),
 customerLocation varchar(20)
);
 
 

create table Restaurant
(
 restaurantName varchar(30),
 restaurantLocation varchar(30),
 restaurantContact varchar(10), 
 restaurantCuisine varchar(30),
 restaurantType varchar(1),
 constraint restaurantPk primary key(restaurantName)
);

create table Bill
(
 billId number(5),
 userName varchar(20),
 totalAmount number(5),
 billdate date,
 restaurantName varchar(20),
 constraint billPk primary key(billId),
 constraint billFk1 foreign key(userName) references Customer(userName),
 constraint billFk2 foreign key(restaurantName) references Restaurant(restaurantName) 
);

create table Menu
(
 menuId number(5) primary key,
 restaurantName varchar(20),
 itemName varchar(20),
 itemPrice number(5),
 constraint menuFk foreign key(restaurantName) references Restaurant(restaurantName)
);

create table Orders
(
 orderId number(5) primary key,
 billId number(5), 
 itemName varchar(20),
 quantity number(5),
 constraint orderFk foreign key(billId) references Bill(billId)
);