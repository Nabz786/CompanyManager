SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS Nurse;
DROP TABLE IF EXISTS Doctor;
DROP TABLE IF EXISTS Patient;
SET FOREIGN_KEY_CHECKS = 1;


CREATE TABLE Nurse(
	NurseId int(6),
    fName VARCHAR(15) NOT NULL,
	lName VARCHAR(15) NOT NULL,
    --
    -- IC_N1: Nurses are identified by their unique nurse ids
    CONSTRAINT IC_N1 PRIMARY KEY(NurseId)
);

CREATE TABLE Doctor(
	DoctorId int(6),
    fName VARCHAR(15) NOT NULL,
	lName VARCHAR(15) NOT NULL,
	--
    -- IC_D1: Doctors are identified by their unique Doctor ids
    CONSTRAINT IC_D1 PRIMARY KEY(DoctorId)
);

CREATE TABLE Patient(
	patientID INT(6),
	fName VARCHAR(15) NOT NULL,
    lName VARCHAR(15) NOT NULL,
	pAddress VARCHAR(45) NOT NULL,
	pSymptoms VARCHAR(45) NOT NULL,
	dateOfBirth DATE NOT NULL,
	hospitalDepartment VARCHAR(25) NOT NULL,
    nurseId INT(6),
    doctorId INT(6),
    --
    -- IC_P1: Patients are identified by their unique Patient ID
    CONSTRAINT IC_P1 PRIMARY KEY (patientID),
    -- IC_P2: Patients are assigned to an on duty nurse
    CONSTRAINT IC_P2 FOREIGN KEY (nurseId) REFERENCES Nurse(NurseId), 
    -- IC_P3: Patients are assigned to an on duty doctor
    CONSTRAINT IC_P3 FOREIGN KEY (doctorId) REFERENCeS Doctor(DoctorId) 
);

INSERT INTO Nurse VALUES (012345, "Jim", "Jones");
INSERT INTO Doctor VALUES (432432, "Deb", "Smith");
INSERT INTO Patient VALUES (384743, "Jon", "Aquino", "123 Texas Rd", "Vomiting", '1999-09-24', "Reception", 012345, 432432);

SELECT * FROM Nurse;
SELECT * FROM Doctor;
SELECT * FROM Patient;


