class PenDistribution{
   public static void main(String[] args){
   
   int totalPen = 14;
   int totalStudents = 3;
   
   // Calculating the remaining pens after distributing
   int remainingPen = totalPen % totalStudents;
   
    // Calculating the number of pens per student
   int penPerStudent = (totalPen-remainingPen)/3;
   
   //Printing the resutlts
   System.out.println("The Pen Per Student is "+ penPerStudent + " and the remaining pen not distributed is " +remainingPen);
	 
	}
	}