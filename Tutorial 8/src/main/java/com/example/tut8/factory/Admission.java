package com.example.tut8.factory;

// Create the Admission class to generate object of sub-classes
class Admission {
	// use admittingCourse method to get object of type Course
	public Course admittingCourse(String courseName) {
		//TO-DO: if courseName is null => return null
		 if (courseName == null) {
			 return null;
		 }
		//TO-DO: if courseName is similar to 1 of 3 sub-class's name => return corresponding objects
		switch(courseName) {
			case "CivilService":
				return new CivilService();
			case "Computer":
				return new Computer();
			case "Health":
				return new Health();
			default:
				return null;
		}
	}
} 