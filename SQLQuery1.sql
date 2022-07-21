CREATE DATABASE GigaPet; --nó b?o l?i ko t?o ?c database
Use GigaPet;

Create Table User( --Tên b?ng b? l?i
	UserID INT NOT NULL,
	Name varchar(50) NOT NULL UNIQUE,
	PhoneNumber INT NOT NULL UNIQUE,
	Email varchar NOT NULL UNIQUE,
	AdminStatus BIT NOT NULL,
);
 
 Create Table Pet(
	PetID INT NOT NULL,
	Name varchar(50) NOT NULL,
	Gender BIT NOT NULL,
	Type varchar(50) NOT NULL,
	Breed varchar(50) NOT NULL,
	BirthDate Text NULL,
	Height FLOAT NOT NULL,
	Weight FLOAT NOT NULL,
	Color varchar(50),
	Intact BIT NOT NULL,
	Notes TEXT NULL,
	UserID INT NOT NULL,
);

 Create Table Category(
	CateID INT NOT NULL,
	Name varchar(50) NOT NULL,
);
 
 Create Table Service(
	ServiceID INT NOT NULL,
	Name varchar(50) NOT NULL,
	CateID INT NOT NULL,
 );

 Create Table Booking(
	BookingID INT NOT NULL,
	PetID INT NOT NULL,
	Price FLOAT NOT NULL,
	Date DATETIME NOT NULL,
	Address varchar(200) NOT NULL,
	Notes varchar(200) NULL,
);

 Create Table BookingService(
	ServiceID INT NOT NULL,
	BookingID INT NOT NULL,
);

 Create Table Img(
	ImgID INT NOT NULL,
	Img BINARY NULL,
	Url TEXT NULL,
	PetID INT NOT NULL,
);

 ALTER TABLE User ADD CONSTRAINT PK_User PRIMARY KEY(UserId);
 
 ALTER TABLE Pet ADD CONSTRAINT PK_Pet PRIMARY KEY(PetId);
 
 ALTER TABLE Category ADD CONSTRAINT PK_Category PRIMARY KEY(CateId); 

 ALTER TABLE Service ADD CONSTRAINT PK_Service PRIMARY KEY(ServiceId); 

 ALTER TABLE Booking ADD CONSTRAINT PK_Booking PRIMARY KEY(BookingId); 

 ALTER TABLE Pet
ADD CONSTRAINT FK_Pet_User
FOREIGN KEY (UserID) REFERENCES User(UserID);

ALTER TABLE Service
ADD CONSTRAINT FK_Service_Category
FOREIGN KEY (CateID) REFERENCES Category(CateID);

ALTER TABLE Booking
ADD CONSTRAINT FK_Pet_Booking
FOREIGN KEY (PetID) REFERENCES Pet(PetID);

ALTER TABLE BookingService
ADD CONSTRAINT FK_BookingService_Booking
FOREIGN KEY (BookingID) REFERENCES Booking(BookingID);

ALTER TABLE BookingService
ADD CONSTRAINT FK_BookingService_Service
FOREIGN KEY (ServiceID) REFERENCES Service(ServiceID);

ALTER TABLE Img
ADD CONSTRAINT FK_Img_Pet
FOREIGN KEY (PetID) REFERENCES Pet(PetID);