
CREATE DATABASE PetCare;
GO
Use PetCare;
GO

Create Table Users( 
	UserID INT NOT NULL,
	UserName varchar(50) NOT NULL UNIQUE,
	PhoneNumber INT NOT NULL UNIQUE,
	Email varchar NOT NULL UNIQUE,
	AdminStatus BIT NOT NULL,
);
GO 

 Create Table Pets(
	PetID INT NOT NULL,
	PetName varchar(50) NOT NULL,
	Gender BIT NOT NULL,
	PetType varchar(50) NOT NULL,
	Breed varchar(50) NOT NULL,
	BirthDate Text NULL,
	PetHeight FLOAT NOT NULL,
	PetWeight FLOAT NOT NULL,
	Color varchar(50),
	Intact BIT NOT NULL,
	Notes TEXT NULL,
	UserID INT NOT NULL,
);
GO

 Create Table Categoris(
	CateID INT NOT NULL,
	CateName varchar(50) NOT NULL,
);
GO

 Create Table Services(
	ServiceID INT NOT NULL,
	SerName varchar(50) NOT NULL,
	CateID INT NOT NULL,
 );
GO

 Create Table Bookings(
	BookingID INT NOT NULL,
	PetID INT NOT NULL,
	Price FLOAT NOT NULL,
	BookDate DATETIME NOT NULL,
	BookAddress varchar(200) NOT NULL,
	Notes varchar(200) NULL,
);
GO

 Create Table BookingService(
	ServiceID INT NOT NULL,
	BookingID INT NOT NULL,
);
GO

 Create Table Img(
	ImgID INT NOT NULL,
	Img BINARY NULL,
	ImgUrl TEXT NULL,
	PetID INT NOT NULL,
);
GO
--Loi o phan duoi nay
--PK
 ALTER TABLE Users 
	ADD CONSTRAINT PK_Users PRIMARY KEY(UserId);
	go
 ALTER TABLE Pets 
	ADD CONSTRAINT PK_Pets PRIMARY KEY(PetId);
	go
 ALTER TABLE Categoris 
	ADD CONSTRAINT PK_Categoris PRIMARY KEY(CateId); 
	go
 ALTER TABLE Services ADD CONSTRAINT 
	PK_Services PRIMARY KEY(ServiceId); 
	go
 ALTER TABLE Bookings ADD CONSTRAINT 
	PK_Bookings PRIMARY KEY(BookingId); 
	go
--FK
 ALTER TABLE Pets
	ADD CONSTRAINT FK_Pet_User
	FOREIGN KEY (UserID) REFERENCES Users(UserID);
	go
 ALTER TABLE Services
	ADD CONSTRAINT FK_Service_Category
	FOREIGN KEY (CateID) REFERENCES Categoris(CateID);
	go
 ALTER TABLE Bookings
	ADD CONSTRAINT FK_Pet_Booking
	FOREIGN KEY (PetID) REFERENCES Pets(PetID);
	go
 ALTER TABLE BookingService
	ADD CONSTRAINT FK_BookingService_Booking
	FOREIGN KEY (BookingID) REFERENCES Bookings(BookingID);
	go
 ALTER TABLE BookingService
	ADD CONSTRAINT FK_BookingService_Service
	FOREIGN KEY (ServiceID) REFERENCES Services(ServiceID);
	go
 ALTER TABLE Img
	ADD CONSTRAINT FK_Img_Pet
	FOREIGN KEY (PetID) REFERENCES Pets(PetID);
	GO