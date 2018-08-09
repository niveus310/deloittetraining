create table Login(
userName varchar(20) primary key,
password varchar(20) not null,
customerId number(5),
constraint loginfk1 foreign key(customerId) references Customer(customerId)
);



create table Customer
(
 customerId number(5),
 customerName varchar(30),
 customerContact varchar(10),
 customerLocation varchar(20),
 constraint customerPk1 primary key(customerId));
 

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
 customerId number(5),
 totalAmount number(5),
 billdate date,
 restaurantName varchar(20),
 constraint billPk primary key(billId),
 constraint billFk1 foreign key(customerId) references Customer(customerId),
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