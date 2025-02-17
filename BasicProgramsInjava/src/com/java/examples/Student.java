package com.java.examples;

public class Student {
	
		private String name;
		private String address;
		private double marks;
		
		Student(String name,String address,double  marks){
			this.name=name;
			this.address=address;
			this.marks=marks;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getMarks() {
			return marks;
		}

		public void setMarks(double marks) {
			this.marks = marks;
		}
		
		public static void main(String[] args) {
			Student[] std = new Student[10];
			std[0] = new Student("ram","pune",90);
			std[1] = new Student("shyam", "nanded",89);
			std[2] = new Student("sai" ,"Nashik",80);
			std[3] = new Student("onkar" ,"karegao",50);
			std[4] = new Student("rachita" ,"mudkhed",70);
		    std[5]   = new Student("pooja" ,"jalna",87);
	      for(Student student:std) {
	    	  if(student.getMarks()>85) {
	    		  System.out.println(" greater than 70 :" + student.getName() + "-" + student.getMarks());
	    	  }else {
	    		  System.out.println(" less than 80 :"+student.getName() + "-" + student.getMarks());
	    	  }
	       }
		}
		


}
