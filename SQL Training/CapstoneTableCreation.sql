drop database if exists capstone;
create database capstone;
use capstone;

CREATE TABLE Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    mobile_number VARCHAR(15) UNIQUE NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    security_question VARCHAR(255) NOT NULL,
    security_answer VARCHAR(255) NOT NULL,
    address TEXT,
    alternate_mobile_number VARCHAR(15),
    account_status VARCHAR(50) NOT NULL
);

CREATE TABLE Plans (
    plan_id INT AUTO_INCREMENT PRIMARY KEY,
    plan_name VARCHAR(255) NOT NULL,
    plan_type ENUM('Prepaid', 'Postpaid') NOT NULL,
    details TEXT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    validity INT NOT NULL
);

CREATE TABLE User_Plan (
    user_plan_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    plan_id INT NOT NULL,
    plan_start_date DATE NOT NULL,
    plan_end_date DATE NOT NULL,
    remaining_data_in_gb DECIMAL(10,2) NOT NULL,
    remaining_sms INT NOT NULL,
    remaining_talktime DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (plan_id) REFERENCES Plans(plan_id)
);

CREATE TABLE Data_Usage (
    usage_id INT AUTO_INCREMENT PRIMARY KEY,
    user_plan_id INT NOT NULL,
    user_id INT NOT NULL,
    data_used DECIMAL(10,2) NOT NULL,
    sms_used INT NOT NULL,
    calls_used INT NOT NULL,
    recorded_date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (user_plan_id) REFERENCES User_Plan(user_plan_id)
);

Create table Employ(
employ_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL, 
    date_of_joining DATE NOT NULL, 
    address TEXT, 
    employ_user_name VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    employ_desig ENUM('Staff', 'Technical','Admin') NOT NULL

);
-- Creating Transactions Table
CREATE TABLE Transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    plan_id INT NOT NULL,
    transaction_status ENUM('Pending', 'Completed', 'Failed') NOT NULL,
    payment_mode ENUM('Credit Card', 'Debit Card', 'UPI') NOT NULL,
    transaction_timestamp DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (plan_id) REFERENCES Plans(plan_id)
);




-- Creating Billing _Table
CREATE TABLE Billing (
    bill_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    billing_cycle VARCHAR(50) NOT NULL,
    charges DECIMAL(10,2) NOT NULL,
    payments DECIMAL(10,2) NOT NULL,
    due_date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Creating Support_Tickets Table
CREATE TABLE Support_Tickets (
    ticket_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    employ_id INT NOT NULL,
    issue TEXT NOT NULL,
    status ENUM('Open', 'In Progress', 'Resolved', 'Closed') NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (employ_id) REFERENCES Employ(employ_id)
);
