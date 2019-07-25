-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 25, 2019 at 08:46 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `knewton`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignment`
--

CREATE TABLE `assignment` (
  `assignmentId` int(4) NOT NULL,
  `batchId` varchar(3) NOT NULL,
  `description` varchar(25) NOT NULL,
  `totalMarks` int(3) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `classDeliveredId` int(5) NOT NULL,
  `studentId` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `attendancecount`
--

CREATE TABLE `attendancecount` (
  `studentId` varchar(7) NOT NULL,
  `batchId` varchar(3) NOT NULL,
  `totalCount` int(3) NOT NULL,
  `presentCount` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `batchcoursemapping`
--

CREATE TABLE `batchcoursemapping` (
  `batchId` varchar(3) NOT NULL,
  `courseId` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE `branch` (
  `name` varchar(20) NOT NULL,
  `branchId` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`name`, `branchId`) VALUES
('Madangir', 1),
('Chirag Delhi', 2),
('Malviya Nagar', 3);

-- --------------------------------------------------------

--
-- Table structure for table `classdelivered`
--

CREATE TABLE `classdelivered` (
  `classDeliveredId` int(5) NOT NULL,
  `batchId` varchar(3) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `courseId` int(3) NOT NULL,
  `details` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employeetable`
--

CREATE TABLE `employeetable` (
  `employeeId` varchar(7) NOT NULL,
  `name` varchar(25) NOT NULL,
  `emailId` varchar(25) NOT NULL,
  `address` varchar(30) NOT NULL,
  `contactDetails` bigint(10) NOT NULL,
  `salary` int(7) NOT NULL,
  `userTypeId` int(2) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeetable`
--

INSERT INTO `employeetable` (`employeeId`, `name`, `emailId`, `address`, `contactDetails`, `salary`, `userTypeId`, `status`) VALUES
('E100000', 'kalolll', 'dettol@gmail.com', '6/90 saket', 1256327890, 74000, 1, 1),
('E100001', 'Anotherdedf', 'Lelo@yahoo.com', '2/36 knewton academy kharbanda', 2065247891, 50000, 2, 0),
('E100002', 'something', 'lol@gmaol.cmo', '5/76 madangir', 1256327890, 74000, 1, 1),
('E100003', 'yalla habibi', 'yb@lelo.com', '24/44 khin to hai', 2015635894, 5555, 2, 0),
('E100004', 'azithrom', 'jnjk@gj.com', '24/44 khin to hai', 2015635894, 4555, 2, 0),
('E100005', 'Akshay', 'jnjk@gj.com', 'ae', 1714771469, 22, 2, 0),
('E100006', 'Gurkirat Singh', 'gurkiratloves69@gmail.com', 'jeete the jiske liye', 1714771469, 65000, 5, 0),
('E100007', 'Gurkirat Singh', 'fo@gmail.com', 'pta nhi', 1714771469, 5, 4, 0);

-- --------------------------------------------------------

--
-- Table structure for table `fees`
--

CREATE TABLE `fees` (
  `studentId` varchar(7) NOT NULL,
  `totalFees` varchar(10) NOT NULL,
  `installment1` varchar(10) NOT NULL,
  `installment2` varchar(10) NOT NULL,
  `installment3` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fees`
--

INSERT INTO `fees` (`studentId`, `totalFees`, `installment1`, `installment2`, `installment3`) VALUES
('S100000', '45000', 'paid', 'paid', '24/07/2019'),
('S100001', '6000', 'paid', 'paid', 'paid'),
('S100003', '45000', '15000', '24', '15000'),
('S100005', '555', 'paid', 'paid', 'paid'),
('S100006', '555', '555', 'paid', 'paid'),
('S100007', '555', 'paid', 'paid', 'paid'),
('S100008', '55500', 'paid', 'paid', 'paid');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(8);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` varchar(7) NOT NULL,
  `password` varchar(15) NOT NULL,
  `userTypeId` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `multiple_solution_question`
--

CREATE TABLE `multiple_solution_question` (
  `serialNo` int(5) NOT NULL,
  `question` varchar(200) NOT NULL,
  `option1` varchar(50) NOT NULL,
  `option2` varchar(50) NOT NULL,
  `option3` varchar(50) NOT NULL,
  `option4` varchar(50) NOT NULL,
  `class` int(2) NOT NULL,
  `subject` varchar(25) NOT NULL,
  `topic` varchar(25) NOT NULL,
  `subTopic` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

CREATE TABLE `notice` (
  `serialNo` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` varchar(150) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`serialNo`, `title`, `content`, `date`) VALUES
(1, 'ffffff', 'fffff', '2019-07-18'),
(2, 'Good Evening Part 3', 'hey there!', '2019-07-17'),
(3, 'Good Evening Part 3', 'hey there!', '2019-07-17'),
(4, 'Good Evening Part 3', 'hey there!', '2019-07-17'),
(5, 'Good Evening Part 3', 'hey there!', '2019-07-17'),
(6, 'xxx', 'dfff', '2019-07-19'),
(7, 'asdas', 'dghdgfhgjk', '2019-07-20');

-- --------------------------------------------------------

--
-- Table structure for table `result_assignment`
--

CREATE TABLE `result_assignment` (
  `studentId` varchar(7) NOT NULL,
  `assignmentId` int(4) NOT NULL,
  `obtainedMarks` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `result_test`
--

CREATE TABLE `result_test` (
  `studentId` varchar(7) NOT NULL,
  `testId` int(3) NOT NULL,
  `obtainedMarks` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `name` varchar(25) NOT NULL,
  `emailID` varchar(25) NOT NULL,
  `password` varchar(15) NOT NULL,
  `contactDetails` int(10) NOT NULL,
  `class` int(2) NOT NULL,
  `course` varchar(15) NOT NULL,
  `parentsName` varchar(25) NOT NULL,
  `address` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`name`, `emailID`, `password`, `contactDetails`, `class`, `course`, `parentsName`, `address`) VALUES
('something', 'something@gmail.com', 'password', 1203654741, 12, 'jee', 'dont have any', 'chhatarpur');

-- --------------------------------------------------------

--
-- Table structure for table `single_solution_question`
--

CREATE TABLE `single_solution_question` (
  `serialNo` int(5) NOT NULL,
  `question` varchar(200) NOT NULL,
  `option1` varchar(50) NOT NULL,
  `option2` varchar(50) NOT NULL,
  `option3` varchar(50) NOT NULL,
  `option4` varchar(50) NOT NULL,
  `class` int(2) NOT NULL,
  `subject` varchar(25) NOT NULL,
  `topic` varchar(25) NOT NULL,
  `subTopic` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `studentbatchmapping`
--

CREATE TABLE `studentbatchmapping` (
  `studentId` varchar(7) NOT NULL,
  `batchId` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `studenttable`
--

CREATE TABLE `studenttable` (
  `studentId` varchar(7) NOT NULL COMMENT 'Pattern:(S000001)',
  `name` varchar(25) NOT NULL,
  `class` int(2) NOT NULL,
  `fatherName` varchar(25) NOT NULL,
  `motherName` varchar(25) NOT NULL,
  `contactDetails` int(10) NOT NULL,
  `emailId` varchar(25) NOT NULL,
  `address` varchar(30) NOT NULL,
  `branchId` int(2) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenttable`
--

INSERT INTO `studenttable` (`studentId`, `name`, `class`, `fatherName`, `motherName`, `contactDetails`, `emailId`, `address`, `branchId`, `status`) VALUES
('S100000', 'something', 12, 'stramp', 'exxampler', 1203654741, 'info@example.com', '6/90 saket', 1, 1),
('S100001', 'Store', 10, 'Damad', 'samechange', 2003214562, 'Lelo@yahoo.com', '56b malviya nagar', 3, 1),
('S100003', 'kal', 2, 'asdjkjll', 'lkaskd', 2015635894, 'dettol@gmail.com', '24/44 khin to hai', 1, 0),
('S100004', 'kal', 1, 'asdjkjll', 'lkaskd', 2015635894, 'gurkiratloves69@gmail.com', '24/44 khin to hai', 2, 0),
('S100005', 'Akshay Manchanda', 1, 'asdjkjll', 'lkaskd', 1714771469, 'akshay@lelo.com', '24/44 khin to hai', 1, 0),
('S100006', 'kal', 11, 'asdjkjll', 'lkaskd', 2015635894, 'gur@lelo.com', '24/44 khin to hai', 3, 1),
('S100007', 'kal', 9, 'asdjkjll', 'lkaskd', 2015635894, 'akshay@lelo.com', '24/44 khin to hai', 3, 1),
('S100008', 'Akshay Manchanda', 2, 'asdjkjll', 'lkaskd', 1714771469, 'akshay@lelo.com', '6/90 saket', 3, 0);

-- --------------------------------------------------------

--
-- Table structure for table `teacherbatchmapping`
--

CREATE TABLE `teacherbatchmapping` (
  `employeeId` varchar(7) NOT NULL,
  `batchId` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `testId` int(3) NOT NULL,
  `courseId` int(3) NOT NULL,
  `startTime` time NOT NULL,
  `endTime` time NOT NULL,
  `startDate` date NOT NULL,
  `totalMarks` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `testserieslogin`
--

CREATE TABLE `testserieslogin` (
  `testId` varchar(7) NOT NULL,
  `testpassword` varchar(20) DEFAULT NULL,
  `studentId` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `testserieslogin`
--

INSERT INTO `testserieslogin` (`testId`, `testpassword`, `studentId`) VALUES
('TS10001', 'fgggg', 'S100001'),
('TS10000', 'forsomething', 'S100008');

-- --------------------------------------------------------

--
-- Table structure for table `usertype`
--

CREATE TABLE `usertype` (
  `userTypeId` int(2) NOT NULL,
  `userType` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usertype`
--

INSERT INTO `usertype` (`userTypeId`, `userType`) VALUES
(1, 'Admin'),
(5, 'Employee'),
(3, 'HR'),
(7, 'NewUser'),
(6, 'Parent'),
(2, 'Sub Admin'),
(4, 'Teacher');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assignment`
--
ALTER TABLE `assignment`
  ADD PRIMARY KEY (`assignmentId`),
  ADD KEY `Branch_id` (`batchId`),
  ADD KEY `Batch_id` (`batchId`),
  ADD KEY `Batch_id_2` (`batchId`),
  ADD KEY `Batch_id_3` (`batchId`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`classDeliveredId`,`studentId`),
  ADD KEY `Class_delivered_id` (`classDeliveredId`),
  ADD KEY `Student_id` (`studentId`);

--
-- Indexes for table `attendancecount`
--
ALTER TABLE `attendancecount`
  ADD PRIMARY KEY (`studentId`,`batchId`),
  ADD KEY `Batch_id` (`batchId`),
  ADD KEY `Batch_id_2` (`batchId`),
  ADD KEY `Student_id` (`studentId`);

--
-- Indexes for table `batchcoursemapping`
--
ALTER TABLE `batchcoursemapping`
  ADD PRIMARY KEY (`batchId`),
  ADD KEY `Course_id` (`courseId`);

--
-- Indexes for table `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`branchId`);

--
-- Indexes for table `classdelivered`
--
ALTER TABLE `classdelivered`
  ADD PRIMARY KEY (`classDeliveredId`),
  ADD KEY `Batch_id` (`batchId`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`courseId`);

--
-- Indexes for table `employeetable`
--
ALTER TABLE `employeetable`
  ADD PRIMARY KEY (`employeeId`),
  ADD KEY `userTypeId` (`userTypeId`);

--
-- Indexes for table `fees`
--
ALTER TABLE `fees`
  ADD PRIMARY KEY (`studentId`),
  ADD KEY `Student_id` (`studentId`),
  ADD KEY `Student_id_2` (`studentId`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD KEY `User_type_id` (`userTypeId`);

--
-- Indexes for table `multiple_solution_question`
--
ALTER TABLE `multiple_solution_question`
  ADD PRIMARY KEY (`serialNo`);

--
-- Indexes for table `notice`
--
ALTER TABLE `notice`
  ADD PRIMARY KEY (`serialNo`);

--
-- Indexes for table `result_assignment`
--
ALTER TABLE `result_assignment`
  ADD PRIMARY KEY (`studentId`,`assignmentId`),
  ADD KEY `Student_id` (`studentId`),
  ADD KEY `Assignment_id` (`assignmentId`);

--
-- Indexes for table `result_test`
--
ALTER TABLE `result_test`
  ADD PRIMARY KEY (`studentId`,`testId`),
  ADD KEY `Student_id` (`studentId`),
  ADD KEY `Test_id` (`testId`);

--
-- Indexes for table `single_solution_question`
--
ALTER TABLE `single_solution_question`
  ADD PRIMARY KEY (`serialNo`);

--
-- Indexes for table `studentbatchmapping`
--
ALTER TABLE `studentbatchmapping`
  ADD PRIMARY KEY (`studentId`,`batchId`),
  ADD KEY `Student_id` (`studentId`,`batchId`),
  ADD KEY `Batch_id` (`batchId`);

--
-- Indexes for table `studenttable`
--
ALTER TABLE `studenttable`
  ADD PRIMARY KEY (`studentId`) USING BTREE,
  ADD KEY `Branch_id` (`branchId`);

--
-- Indexes for table `teacherbatchmapping`
--
ALTER TABLE `teacherbatchmapping`
  ADD PRIMARY KEY (`employeeId`,`batchId`),
  ADD KEY `Employee_id` (`employeeId`,`batchId`),
  ADD KEY `Batch_id` (`batchId`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`testId`),
  ADD KEY `Course_id` (`courseId`);

--
-- Indexes for table `testserieslogin`
--
ALTER TABLE `testserieslogin`
  ADD PRIMARY KEY (`studentId`),
  ADD UNIQUE KEY `testId` (`testId`),
  ADD KEY `studentId` (`studentId`);

--
-- Indexes for table `usertype`
--
ALTER TABLE `usertype`
  ADD PRIMARY KEY (`userTypeId`),
  ADD UNIQUE KEY `UK_8rad2w350l1eyqxp0w3aqk8eg` (`userType`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `multiple_solution_question`
--
ALTER TABLE `multiple_solution_question`
  MODIFY `serialNo` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `notice`
--
ALTER TABLE `notice`
  MODIFY `serialNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `single_solution_question`
--
ALTER TABLE `single_solution_question`
  MODIFY `serialNo` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
  MODIFY `testId` int(3) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `assignment`
--
ALTER TABLE `assignment`
  ADD CONSTRAINT `assignment_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batchcoursemapping` (`batchId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`classDeliveredId`) REFERENCES `classdelivered` (`classDeliveredId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `attendance_ibfk_2` FOREIGN KEY (`studentId`) REFERENCES `studenttable` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `attendancecount`
--
ALTER TABLE `attendancecount`
  ADD CONSTRAINT `attendancecount_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batchcoursemapping` (`batchId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `attendancecount_ibfk_2` FOREIGN KEY (`studentId`) REFERENCES `studenttable` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `batchcoursemapping`
--
ALTER TABLE `batchcoursemapping`
  ADD CONSTRAINT `batchcoursemapping_ibfk_1` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `classdelivered`
--
ALTER TABLE `classdelivered`
  ADD CONSTRAINT `classdelivered_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batchcoursemapping` (`batchId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `employeetable`
--
ALTER TABLE `employeetable`
  ADD CONSTRAINT `employeetable_ibfk_1` FOREIGN KEY (`userTypeId`) REFERENCES `usertype` (`userTypeId`);

--
-- Constraints for table `fees`
--
ALTER TABLE `fees`
  ADD CONSTRAINT `fees_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `studenttable` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`userTypeId`) REFERENCES `usertype` (`userTypeId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `result_assignment`
--
ALTER TABLE `result_assignment`
  ADD CONSTRAINT `result_assignment_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `studenttable` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `result_assignment_ibfk_2` FOREIGN KEY (`assignmentId`) REFERENCES `assignment` (`assignmentId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `result_test`
--
ALTER TABLE `result_test`
  ADD CONSTRAINT `result_test_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `studenttable` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `result_test_ibfk_2` FOREIGN KEY (`testId`) REFERENCES `test` (`testId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `studentbatchmapping`
--
ALTER TABLE `studentbatchmapping`
  ADD CONSTRAINT `studentbatchmapping_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `studenttable` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `studentbatchmapping_ibfk_2` FOREIGN KEY (`batchId`) REFERENCES `batchcoursemapping` (`batchId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `studenttable`
--
ALTER TABLE `studenttable`
  ADD CONSTRAINT `studenttable_ibfk_2` FOREIGN KEY (`branchId`) REFERENCES `branch` (`branchId`);

--
-- Constraints for table `teacherbatchmapping`
--
ALTER TABLE `teacherbatchmapping`
  ADD CONSTRAINT `teacherbatchmapping_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batchcoursemapping` (`batchId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `teacherbatchmapping_ibfk_2` FOREIGN KEY (`employeeId`) REFERENCES `employeetable` (`employeeId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `test_ibfk_1` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `testserieslogin`
--
ALTER TABLE `testserieslogin`
  ADD CONSTRAINT `testserieslogin_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `studenttable` (`studentId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
