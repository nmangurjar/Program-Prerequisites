class VolumeOfEarth {
   public static void main(String[] args) {
   
   //Radius of the Earth
   double radius = 6378;
   
   //Calculate the volume of the Earth
   double volumeInKm = (4/3) * Math.PI * Math.pow(radius , 3);
   
   // To convert  volume of Earth in km^3 to miles^3 the change factor is
   double kmToMile = 0.239913;
   
   //Calculate the volume of the Earth in miles^3
   double volumeInMile = volumeInKm * kmToMile;
   
   //Print the volume of Earth in km^3 and miles^3
   System.out.println("The volume of earth in cubic kilometers is "+ volumeInKm + "and cubic miles is "+volumeInMile);

   }
}
