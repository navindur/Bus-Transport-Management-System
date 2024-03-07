DROP DATABASE `BusManagement`;
CREATE DATABASE `BusManagement`;
USE `BusManagement`;

CREATE TABLE Bus (
  Bus_No VARCHAR(10) NOT NULL PRIMARY KEY,
  Chassis_No VARCHAR(15) NOT NULL UNIQUE,
  RegistrationDate DATE NOT NULL,
  Model VARCHAR(20) NOT NULL,
  AddingMileage INT NOT NULL,
  NextServiceMileage INT NOT NULL,
  LastServiceDate DATE NOT NULL,
  NextServiceDate DATE NOT NULL
);

INSERT INTO Bus (Bus_No, Chassis_No, RegistrationDate, Model, AddingMileage, NextServiceMileage, LastServiceDate, NextServiceDate)
VALUES
  ('WB-1234', 1234567890, '2023-01-01', 'Ashok Leyland', 10000, 20000, '2023-12-31', '2024-03-31'),
  ('NC-2345', 9876543210, '2022-05-15', 'TATA Motors', 20000, 30000, '2024-01-31', '2024-04-30'),
  ('SB-3456', 0123456789, '2021-11-23', 'Ashok Leyland', 30000, 40000, '2024-02-29', '2024-05-29'),
  ('EP-4567', 8765432109, '2023-07-01', 'TATA Motors', 40000, 50000, '2024-02-15', '2024-06-15'),
  ('CP-5678', 7654321098, '2022-03-12', 'Mitsubishi Fuso', 50000, 60000, '2024-01-20', '2024-07-20'),
  ('NP-6789', 6543210987, '2021-09-24', 'TATA Motors', 60000, 70000, '2024-02-05', '2024-08-05'),
  ('WP-7890', 5432109876, '2023-04-07', 'Ashok Leyland', 70000, 80000, '2024-01-25', '2024-09-25'),
  ('CP-8901', 4321098765, '2022-10-19', 'TATA Motors', 80000, 90000, '2024-02-10', '2024-10-10'),
  ('SP-9012', 3210987654, '2021-02-02', 'Ashok Leyland', 90000, 100000, '2024-01-30', '2024-11-30'),
  ('NP-0123', 2109876543, '2023-08-15', 'SML Isuzu', 0, 10000, '2024-02-25', '2024-12-25');


CREATE TABLE Customer (
  CustomerID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  fName VARCHAR(50) NOT NULL,
  lName VARCHAR(50) NOT NULL,
  MobileNumber VARCHAR(10) NOT NULL,
  EMail VARCHAR(255) NOT NULL,
  Username VARCHAR(50) NOT NULL UNIQUE,
  `Password` VARCHAR(50) NOT NULL
);

INSERT INTO Customer (fName, lName, MobileNumber, EMail, Username, Password)
VALUES
  ('Saman', 'Perera', 7712345678, 'saman.perera@gmail.com', 'saman1', 'password1'),
  ('Kumari', 'Silva', 7654321098, 'kumari.silva@gmail.com', 'kumari7', 'password2'),
  ('Kamal', 'Gunawardana', 7078965432, 'Kamal.gunawardana@gmail.com', 'kamal9', 'password3'),
  ('Nirmala', 'Wijesekara', 7890123456, 'nirmala.wijesekara@gmail.com', 'nirmala0', 'password4'),
  ('Priya', 'Rajaratne', 7987654321, 'priya.rajatne@gmail.com', 'priya4', 'password5'),
  ('Chaminda', 'Fernando', 7123456789, 'chamindra.fernando@gmail.com', 'chaminda8', 'password6'),
  ('Yashoda', 'Abeysinghe', 7234567890, 'yashoda.abeysinghe@gmail.com', 'yashoda3', 'password7'),
  ('Malith', 'Herath', 7345678901, 'malith.herath@gmail.com', 'malith2', 'password8'),
  ('Sudesh', 'Kumara', 7456789012, 'sudesh.kumara@gmail.com', 'sudesh6', 'password9'),
  ('Malinga', 'Bandara', 7567890123, 'malinga.bandara@gmail.com', 'malinga5', 'password10');


CREATE TABLE Employee (
  EmployeeID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  FullName VARCHAR(100) NOT NULL,
  NIC VARCHAR(20) NOT NULL UNIQUE,
  License_No VARCHAR(20) NOT NULL UNIQUE,
  Registration_No VARCHAR(20) NOT NULL UNIQUE,
  DOB DATE NOT NULL,
  Mobile_No VARCHAR(10) NOT NULL,
  Landline_No VARCHAR(10) DEFAULT NULL,
  `Work as a` VARCHAR(10) NOT NULL,
  Username VARCHAR(50) NOT NULL UNIQUE,
  `Password` VARCHAR(255) NOT NULL
);

INSERT INTO Employee (FullName, NIC, License_No, Registration_No, DOB, Mobile_No, Landline_No, `Work as a`, Username, Password)
VALUES
  ('Asela Gunawardana', '950423123V', 'B123456', 'SL-NTC-1234', '1985-05-12', '777321456', NULL, 'Driver', 'asela0', 'password1'),
  ('Kasun Perera', '980714567V', 'C234567', 'SL-NTC-2345', '1990-02-21', '765123987', '0367123456', 'Driver', 'kasun5', 'password2'),
  ('Dhammika Kumara', '991125789V', 'D345678', 'SL-NTC-3456', '1995-09-09', '710456789', NULL, 'Conductor', 'dhammika8', 'password3'),
  ('Sampath Jayasinghe', '960201357V', 'E456789', 'SL-NTC-4567', '1988-07-17', '701567890', NULL, 'Driver', 'sampath3', 'password4'),
  ('Dhananjaya Mendis', '970818426V', 'F567890', 'SL-NTC-5678', '1992-04-25', '789213456', '0368234567', 'Conductor', 'dhananjaya7', 'password5'),
  ('Prasanna Bandara', '940529654V', 'G678901', 'SL-NTC-6789', '1987-11-04', '723456789', NULL, 'Driver', 'prasanna2', 'password6'),
  ('Sanjaya Fernando', '930316875V', 'H789012', 'SL-NTC-7890', '1991-06-23', '745678901', NULL, 'Driver', 'sanjaya6', 'password7'),
  ('Chaminda Silva', '920127986V', 'I890123', 'SL-NTC-8901', '1989-12-15', '767890123', '0367345678', 'Conductor', 'chaminda9', 'password8'),
  ('Nalaka Herath', '910630125V', 'J901234', 'SL-NTC-9012', '1993-08-08', '719234567', NULL, 'Driver', 'nalaka4', 'password9'),
  ('Rumesh Wijesinghe', '900419346V', 'K012345', 'SL-NTC-0123', '1990-01-31', '731456789', '0367456789', 'Conductor', 'rumesh1', 'password10');


CREATE TABLE FinancialStatus (
  Bus_No VARCHAR(10) NOT NULL,
  `Date` DATE NOT NULL,
  `Income(Rs.)` INT NOT NULL,
  CONSTRAINT CHK_Negative CHECK (`Income(Rs.)` >= 0),
  CONSTRAINT PK_FinancialStatus PRIMARY KEY (Bus_No, `Date`),
  FOREIGN KEY (Bus_No) REFERENCES Bus(Bus_No) ON DELETE CASCADE  -- CASCADE is used to update or remove an entry from both the parent and child tables at the same time.
);

INSERT INTO FinancialStatus (Bus_No, Date, `Income(Rs.)`)
VALUES 
('WB-1234', '2024-03-01', 60000), ('NC-2345', '2024-03-10', 35900), ('SB-3456', '2024-03-25', 60400), ('WB-1234', '2024-04-01', 89100), ('NC-2345', '2024-03-11', 21400),
('SB-3456', '2024-04-02', 47500), ('WB-1234', '2024-04-02', 65800), ('NC-2345', '2024-03-12', 97500), ('WB-1234', '2024-03-12', 97500), ('SB-3456', '2024-03-14', 97500),
('SB-3456', '2024-03-10', 75000), ('WB-1234', '2024-03-02', 48000), ('NC-2345', '2024-02-20', 37200), ('SB-3456', '2024-03-11', 82100), ('WB-1234', '2024-03-03', 53900),
('NC-2345', '2024-02-21', 29500), ('SB-3456', '2024-03-12', 65300), ('WB-1234', '2024-03-04', 71400), ('NC-2345', '2024-02-22', 42800), ('SB-3456', '2024-03-13', 98700),
('WB-1234', '2024-03-15', 34500), ('NC-2345', '2024-02-29', 56200), ('SB-3456', '2024-03-16', 71000), ('WB-1234', '2024-03-16', 83200), ('NC-2345', '2024-03-01', 29800),
('SB-3456', '2024-03-17', 47900), ('WB-1234', '2024-03-17', 61400), ('NC-2345', '2024-03-02', 52300), ('SB-3456', '2024-03-18', 95100), ('WB-1234', '2024-03-18', 78500),
('WB-1234', '2024-03-19', 31200), ('NC-2345', '2024-03-03', 40600), ('SB-3456', '2024-03-19', 63800), ('WB-1234', '2024-03-20', 58900), ('NC-2345', '2024-03-04', 76200),
('SB-3456', '2024-03-20', 81500), ('WB-1234', '2024-03-21', 94600), ('NC-2345', '2024-03-05', 27100), ('SB-3456', '2024-03-21', 39300), ('WB-1234', '2024-03-22', 62000), 
('NC-2345', '2024-03-06', 54700), ('SB-3456', '2024-03-22', 87000), ('WB-1234', '2024-03-23', 49700), ('NC-2345', '2024-03-07', 61000), ('SB-3456', '2024-03-23', 72700), 
('WB-1234', '2024-03-24', 77400), ('NC-2345', '2024-03-08', 93100), ('SB-3456', '2024-03-24', 25400), ('WB-1234', '2024-03-25', 50100), ('NC-2345', '2024-03-09', 48800), 
('SB-3456', '2024-04-03', 52100), ('WB-1234', '2024-04-03', 38400), ('SB-3456', '2024-04-29', 34500), ('NC-2345', '2024-04-29', 34500), ('WB-1234', '2024-04-30', 34500),
('NC-2345', '2024-03-13', 74200), ('NC-2345', '2024-02-15', 45000), ('SB-3456', '2024-04-04', 81700), ('WB-1234', '2024-04-05', 29000), ('NC-2345', '2024-03-26', 51900),
('SB-3456', '2024-04-06', 69300), ('WB-1234', '2024-04-07', 45600), ('NC-2345', '2024-03-27', 38600), ('SB-3456', '2024-04-08', 92800), ('WB-1234', '2024-04-09', 71000),
('NC-2345', '2024-03-28', 12500), ('SB-3456', '2024-04-10', 34500), ('NC-2345', '2024-04-10', 34500), ('WB-1234', '2024-04-10', 34500), ('SB-3456', '2024-04-19', 34500);
-- 2024-03-01 to 2024-04-30
-- ('SB-3456', '2024-03-12', 97500) duplicate record ekak thibba. Primary key eka wenas una nisa date eka 2024-3-14 kara. EntryID eka primary key eka nan thani date ekaka
-- thani bus ekkata incomes 2k danna puluwan


CREATE TABLE Shift (
  ShiftID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `Date` DATE NOT NULL,
  Bus_No VARCHAR(10) NOT NULL,
  DriverReg_No VARCHAR(20) NOT NULL,
  DriverName VARCHAR(50) NOT NULL,
  ConductorReg_No VARCHAR(20) NOT NULL,
  ConductorName VARCHAR(50) NOT NULL,
  FOREIGN KEY (Bus_No) REFERENCES Bus(Bus_No) ON DELETE CASCADE
);

INSERT INTO Shift (Date, Bus_No, DriverReg_No, DriverName, ConductorReg_No, ConductorName)
VALUES
  ('2024-03-26', 'WB-1234', 'SL-NTC-1234', 'Asela Gunawardana', 'SL-NTC-3456', 'Dhammika Kumara'),
  ('2024-03-27', 'NC-2345', 'SL-NTC-2345', 'Kasun Perera', 'SL-NTC-5678', 'Dhananjaya Mendis'),
  ('2024-03-28', 'SB-3456', 'SL-NTC-6789', 'Prasanna Bandara', 'SL-NTC-8901', 'Chaminda Silva'),
  ('2024-03-29', 'WB-1234', 'SL-NTC-4567', 'Sampath Jayasinghe', 'SL-NTC-3456', 'Dhammika Kumara'),
  ('2024-03-30', 'NC-2345', 'SL-NTC-7890', 'Sanjaya Fernando', 'SL-NTC-0123', 'Rumesh Wijesinghe'),
  ('2024-03-31', 'SB-3456', 'SL-NTC-9012', 'Nalaka Herath', 'SL-NTC-8901', 'Chaminda Silva'),
  ('2024-04-01', 'WB-1234', 'SL-NTC-6789', 'Prasanna Bandara', 'SL-NTC-5678', 'Dhananjaya Mendis'),
  ('2024-04-02', 'NC-2345', 'SL-NTC-2345', 'Kasun Perera', 'SL-NTC-8901', 'Chaminda Silva'),
  ('2024-04-03', 'SB-3456', 'SL-NTC-4567', 'Sampath Jayasinghe', 'SL-NTC-0123', 'Rumesh Wijesinghe'),
  ('2024-04-04', 'WB-1234', 'SL-NTC-2345', 'Kasun Perera', 'SL-NTC-3456', 'Dhammika Kumara');


CREATE TABLE SpecialHire (
  Reference_No INT NOT NULL PRIMARY KEY,
  `Name` VARCHAR(50) NOT NULL,
  `Date` DATE NOT NULL,
  Bus_No VARCHAR(10) NOT NULL,
  Driver VARCHAR(50) NOT NULL,
  Conductor VARCHAR(50) NOT NULL,
  FOREIGN KEY (Bus_No) REFERENCES Bus(Bus_No) ON DELETE CASCADE
  );
  
INSERT INTO SpecialHire (Reference_No, `Name`, `Date`, Bus_No, Driver, Conductor)
VALUES
  (1001, 'Lakshan Fernando', '2024-04-15', 'WB-1234', 'Asela Gunawardana', 'Dhammika Kumara'),
  (1002, 'Dinithi Perera', '2024-04-16', 'NC-2345', 'Kasun Perera', 'Dhananjaya Mendis'),
  (1003, 'Malkanthi Jayasinghe', '2024-04-17', 'SB-3456', 'Prasanna Bandara', 'Rumesh Wijesinghe'),
  (1004, 'Chamara Herath', '2024-04-18', 'WB-1234', 'Nalaka Herath', 'Chaminda Silva'),
  (1005, 'Nirmala Wijesekara', '2024-04-19', 'NC-2345', 'Asela Gunawardana', 'Rumesh Wijesinghe'),
  (1006, 'Priya Rajapaksha', '2024-04-20', 'SB-3456', 'Kasun Perera', 'Dhammika Kumara'),
  (1007, 'Yashoda Rathnayaka', '2024-04-21', 'WB-1234', 'Prasanna Bandara', 'Chaminda Silva'),
  (1008, 'Nalin Mendis', '2024-04-22', 'NC-2345', 'Sanjaya Fernando', 'Rumesh Wijesinghe'),
  (1009, 'Sanjaya Mendis', '2024-04-23', 'SB-3456', 'Nalaka Herath', 'Dhananjaya Mendis'),
  (1010, 'Subhashini Silva', '2024-04-24', 'WB-1234', 'Asela Gunawardana', 'Dhammika Kumara');


CREATE TABLE `Schedule` (
  ScheduleId INT NOT NULL AUTO_INCREMENT,
  Schedule_date DATE NOT NULL,
  Depature VARCHAR(30) NOT NULL,
  Arrival VARCHAR(30) NOT NULL,
  Depature_Time TIME NOT NULL,
  Arrival_Time TIME NOT NULL,
  Fare DECIMAL(5,2) NOT NULL,
  Bus_No VARCHAR(10) NOT NULL,
  PRIMARY KEY (Schedule_date, Depature_Time, Bus_No),
  UNIQUE KEY scheduleId_UNIQUE (scheduleId),
  FOREIGN KEY (Bus_No) REFERENCES Bus(Bus_No) ON DELETE CASCADE
);

INSERT INTO Schedule (schedule_date, Depature, Arrival, depature_Time, arrival_Time, Fare, Bus_No)
VALUES
-- Colombo - Kandy
('2024-04-01', 'Colombo', 'Kandy', '06:00:00', '09:00:00', 250.00, 'WB-1234'),
('2024-04-01', 'Colombo', 'Kandy', '07:00:00', '10:00:00', 230.00, 'NC-2345'),
('2024-04-03', 'Colombo', 'Kandy', '08:00:00', '11:00:00', 220.00, 'SB-3456'),
('2024-04-04', 'Colombo', 'Kandy', '09:00:00', '12:00:00', 210.00, 'WB-1234'),
('2024-04-05', 'Colombo', 'Kandy', '10:00:00', '13:00:00', 200.00, 'NC-2345'),

-- Kandy - Galle
('2024-04-06', 'Kandy', 'Galle', '11:00:00', '15:00:00', 300.00, 'WB-1234'),
('2024-04-07', 'Kandy', 'Galle', '12:00:00', '16:00:00', 290.00, 'NC-2345'),
('2024-04-08', 'Kandy', 'Galle', '13:00:00', '17:00:00', 280.00, 'SB-3456'),
('2024-04-09', 'Kandy', 'Galle', '14:00:00', '18:00:00', 270.00, 'WB-1234'),
('2024-04-10', 'Kandy', 'Galle', '15:00:00', '19:00:00', 260.00, 'NC-2345'),

-- Galle - Matara
('2024-04-11', 'Galle', 'Matara', '16:00:00', '18:00:00', 150.00, 'WB-1234'),
('2024-04-12', 'Galle', 'Matara', '17:00:00', '19:00:00', 140.00, 'NC-2345'),
('2024-04-13', 'Galle', 'Matara', '18:00:00', '20:00:00', 130.00, 'SB-3456'),
('2024-04-14', 'Galle', 'Matara', '19:00:00', '21:00:00', 120.00, 'WB-1234'),
('2024-04-15', 'Galle', 'Matara', '20:00:00', '22:00:00', 110.00, 'NC-2345'),

-- Matara - Colombo
('2024-04-16', 'Matara', 'Colombo', '08:00:00', '12:00:00', 200.00, 'WB-1234'),
('2024-04-17', 'Matara', 'Colombo', '09:00:00', '13:00:00', 195.00, 'NC-2345'),
('2024-04-18', 'Matara', 'Colombo', '10:00:00', '14:00:00', 190.00, 'NC-2345'),
('2024-04-19', 'Matara', 'Colombo', '11:00:00', '15:00:00', 180.00, 'SB-3456'),
('2024-04-20', 'Matara', 'Colombo', '12:00:00', '16:00:00', 170.00, 'WB-1234');


CREATE TABLE Seat (
  Bus_No VARCHAR(10) NOT NULL,
  SeatNo INT NOT NULL,
  `Status` VARCHAR(10) DEFAULT 'Unbooked' NOT NULL,
  PRIMARY KEY (Bus_No,SeatNo),
  FOREIGN KEY (Bus_No) REFERENCES Bus(Bus_No) ON DELETE CASCADE
);

INSERT INTO Seat (Bus_No, SeatNo, Status)
VALUES
('NC-2345', 1, 'Unbooked'), ('NC-2345', 2, 'Unbooked'), ('NC-2345', 3, 'Unbooked'), ('NC-2345', 4, 'Unbooked'), ('NC-2345', 5, 'Unbooked'),
('NC-2345', 6, 'Unbooked'), ('NC-2345', 7, 'Unbooked'), ('NC-2345', 8, 'Unbooked'), ('NC-2345', 9, 'Unbooked'), ('NC-2345', 10, 'Unbooked'),
('NC-2345', 11, 'Unbooked'), ('NC-2345', 12, 'Unbooked'), ('NC-2345', 13, 'Unbooked'), ('NC-2345', 14, 'Unbooked'), ('NC-2345', 15, 'Unbooked'),
('NC-2345', 16, 'Unbooked'), ('NC-2345', 17, 'Unbooked'), ('NC-2345', 18, 'Unbooked'), ('NC-2345', 19, 'Unbooked'), ('NC-2345', 20, 'Unbooked'),
('NC-2345', 21, 'Unbooked'), ('NC-2345', 22, 'Unbooked'), ('NC-2345', 23, 'Unbooked'), ('NC-2345', 24, 'Unbooked'), ('NC-2345', 25, 'Unbooked'),
('NC-2345', 26, 'Unbooked'), ('NC-2345', 27, 'Unbooked'), ('NC-2345', 28, 'Unbooked'), ('NC-2345', 29, 'Unbooked'), ('NC-2345', 30, 'Unbooked'),
('NC-2345', 31, 'Unbooked'), ('NC-2345', 32, 'Unbooked'), ('NC-2345', 33, 'Unbooked'), ('NC-2345', 34, 'Unbooked'), ('NC-2345', 35, 'Unbooked'),
('NC-2345', 36, 'Unbooked'), ('NC-2345', 37, 'Unbooked'), ('NC-2345', 38, 'Unbooked'), ('NC-2345', 39, 'Unbooked'), ('NC-2345', 40, 'Unbooked'),
('NC-2345', 41, 'Unbooked'), ('NC-2345', 42, 'Unbooked'),
('WB-1234', 1, 'Unbooked'), ('WB-1234', 2, 'Unbooked'), ('WB-1234', 3, 'Unbooked'), ('WB-1234', 4, 'Unbooked'), ('WB-1234', 5, 'Unbooked'),
('WB-1234', 6, 'Unbooked'), ('WB-1234', 7, 'Unbooked'), ('WB-1234', 8, 'Unbooked'), ('WB-1234', 9, 'Unbooked'), ('WB-1234', 10, 'Unbooked'),
('WB-1234', 11, 'Unbooked'), ('WB-1234', 12, 'Unbooked'), ('WB-1234', 13, 'Unbooked'), ('WB-1234', 14, 'Unbooked'), ('WB-1234', 15, 'Unbooked'),
('WB-1234', 16, 'Unbooked'), ('WB-1234', 17, 'Unbooked'), ('WB-1234', 18, 'Unbooked'), ('WB-1234', 19, 'Unbooked'), ('WB-1234', 20, 'Unbooked'),
('WB-1234', 21, 'Unbooked'), ('WB-1234', 22, 'Unbooked'), ('WB-1234', 23, 'Unbooked'), ('WB-1234', 24, 'Unbooked'), ('WB-1234', 25, 'Unbooked'),
('WB-1234', 26, 'Unbooked'), ('WB-1234', 27, 'Unbooked'), ('WB-1234', 28, 'Unbooked'), ('WB-1234', 29, 'Unbooked'), ('WB-1234', 30, 'Unbooked'),
('WB-1234', 31, 'Unbooked'), ('WB-1234', 32, 'Unbooked'), ('WB-1234', 33, 'Unbooked'), ('WB-1234', 34, 'Unbooked'), ('WB-1234', 35, 'Unbooked'),
('WB-1234', 36, 'Unbooked'),
('SB-3456', 1, 'Unbooked'), ('SB-3456', 2, 'Unbooked'), ('SB-3456', 3, 'Unbooked'), ('SB-3456', 4, 'Unbooked'), ('SB-3456', 5, 'Unbooked'),
('SB-3456', 6, 'Unbooked'), ('SB-3456', 7, 'Unbooked'), ('SB-3456', 8, 'Unbooked'), ('SB-3456', 9, 'Unbooked'), ('SB-3456', 10, 'Unbooked'),
('SB-3456', 11, 'Unbooked'), ('SB-3456', 12, 'Unbooked'), ('SB-3456', 13, 'Unbooked'), ('SB-3456', 14, 'Unbooked'), ('SB-3456', 15, 'Unbooked'),
('SB-3456', 16, 'Unbooked'), ('SB-3456', 17, 'Unbooked'), ('SB-3456', 18, 'Unbooked'), ('SB-3456', 19, 'Unbooked'), ('SB-3456', 20, 'Unbooked'),
('SB-3456', 21, 'Unbooked'), ('SB-3456', 22, 'Unbooked'), ('SB-3456', 23, 'Unbooked'), ('SB-3456', 24, 'Unbooked'), ('SB-3456', 25, 'Unbooked'),
('SB-3456', 26, 'Unbooked'), ('SB-3456', 27, 'Unbooked'), ('SB-3456', 28, 'Unbooked'), ('SB-3456', 29, 'Unbooked'), ('SB-3456', 30, 'Unbooked'),
('SB-3456', 31, 'Unbooked'), ('SB-3456', 32, 'Unbooked'), ('SB-3456', 33, 'Unbooked'), ('SB-3456', 34, 'Unbooked'), ('SB-3456', 35, 'Unbooked'),
('SB-3456', 36, 'Unbooked'), ('SB-3456', 37, 'Unbooked'), ('SB-3456', 38, 'Unbooked'), ('SB-3456', 39, 'Unbooked'), ('SB-3456', 40, 'Unbooked'),
('SB-3456', 41, 'Unbooked'), ('SB-3456', 42, 'Unbooked');


# by hirun
CREATE TABLE booking (
  bookingId int NOT NULL AUTO_INCREMENT,
  bookingDate date NOT NULL,
  ScheduleId int NOT NULL,
  seatNo int NOT NULL,
  Username VARCHAR(50) NOT NULL,
  PRIMARY KEY (bookingId),
  UNIQUE KEY bookingId_UNIQUE (bookingId),
  FOREIGN KEY (Username) REFERENCES customer(Username) ON DELETE CASCADE
);


CREATE TABLE cancellation (
  cancellationId int NOT NULL AUTO_INCREMENT,
  cancelledDate date DEFAULT NULL,
  bookingId int DEFAULT NULL,
  PRIMARY KEY (cancellationId),
  CONSTRAINT cancelBooking FOREIGN KEY (bookingId) REFERENCES booking (bookingid)
);