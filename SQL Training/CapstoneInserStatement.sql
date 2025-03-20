-- NSERT STATEMENTS

-- Inserting into Users table
INSERT INTO Users (mobile_number, email, first_name, last_name, password_hash, security_question, security_answer, address, alternate_mobile_number, account_status)
VALUES 
(9999999999, 'alice@example.com', 'Alice', 'Johnson', 'passwordhash1', 'What is your favorite color?', 'Blue', '123 Main St, City A', '9123456789', 'Active'),
(8888888888, 'bob@example.com', 'Bob', 'Smith', 'passwordhash2', 'What is your pet’s name?', 'Buddy', '456 Elm St, City B', '9123456788', 'Inactive'),
(7777777777, 'charlie@example.com', 'Charlie', 'Brown', 'passwordhash3', 'What is your mother’s maiden name?', 'Clark', '789 Pine St, City C', '9123456787', 'Active');

-- Inserting into Plans table 
INSERT INTO Plans (plan_name, plan_type, details, price, validity)
VALUES 
('Basic Plan', 'Prepaid', '500MB data per day, 100 SMS, 30 minutes talktime', 199.99, 30),
('Standard Plan', 'Postpaid', '2GB data per day, 500 SMS, Unlimited calls', 599.99, 30),
('Premium Plan', 'Prepaid', '5GB data per day, Unlimited SMS, Unlimited calls', 999.99, 60);

-- Inserting into User_Plan table
INSERT INTO User_Plan (user_id, plan_id, plan_start_date, plan_end_date, remaining_data_in_gb, remaining_sms, remaining_talktime)
VALUES 
(1, 1, '2024-01-01', '2024-01-31', 15.00, 50, 20.00),
(2, 2, '2024-02-01', '2024-02-28', 50.00, 300, 100.00),
(3, 3, '2024-03-01', '2024-04-30', 100.00, 500, 200.00);

-- Inserting into Data_Usage table
INSERT INTO Data_Usage (user_plan_id, user_id, data_used, sms_used, calls_used, recorded_date)
VALUES 
(1, 1, 2.00, 10, 5, '2024-01-02'),
(2, 2, 1.50, 15, 10, '2024-02-10'),
(3, 3, 3.00, 20, 15, '2024-03-15');

-- Inserting into Employ table
INSERT INTO Employ (first_name, last_name, date_of_joining, address, employ_user_name, password_hash, employ_desig)
VALUES 
('David', 'Williams', '2023-01-15', '100 Tech St, City X', 'david.w', 'passwordhash4', 'Staff'),
('Emily', 'Davis', '2022-05-20', '200 IT Park, City Y', 'emily.d', 'passwordhash5', 'Technical'),
('Frank', 'Miller', '2021-11-10', '300 Service Ln, City Z', 'frank.m', 'passwordhash6', 'Admin');

-- Inserting into Transactions table
INSERT INTO Transactions (user_id, plan_id, transaction_status, payment_mode, transaction_timestamp)
VALUES 
(1, 1, 'Completed', 'Credit Card', '2024-01-01 10:15:30'),
(2, 2, 'Pending', 'UPI', '2024-02-05 12:45:00'),
(3, 3, 'Failed', 'Debit Card', '2024-03-10 14:30:20');

-- Inserting into Billing table
INSERT INTO Billing (user_id, billing_cycle, charges, payments, due_date)
VALUES 
(1, 'January 2024', 199.99, 199.99, '2024-01-10'),
(2, 'February 2024', 599.99, 300.00, '2024-02-15'),
(3, 'March-April 2024', 999.99, 500.00, '2024-04-10');

-- Inserting into Support_Tickets table
INSERT INTO Support_Tickets (user_id, employ_id, issue, status, created_at, updated_at)
VALUES 
(1, 1, 'Network issue in my area', 'Open', '2024-01-05 09:00:00', NULL),
(2, 2, 'Billing discrepancy in my last bill', 'In Progress', '2024-02-10 11:30:00', '2024-02-12 13:00:00'),
(3, 3, 'Unable to recharge my plan', 'Resolved', '2024-03-15 14:45:00', '2024-03-16 10:00:00');
