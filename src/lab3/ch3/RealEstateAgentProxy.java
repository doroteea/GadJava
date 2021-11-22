package lab3.ch3;

import java.util.Arrays;

public class RealEstateAgentProxy {

        private Apartment[] apps = new Apartment[0];

        public void represent(Apartment apartment){
            int len = apps.length+1;
            apps = Arrays.copyOf(apps,len);
            apps[len-1] = apartment;
        }

        public Apartment rent(Student student){
            Apartment finalRentedApartment = null;
            Apartment[] appsRented = new Apartment[0];
            if(student.getName().charAt(0)!='P'){
                for(int i=0;i<apps.length;i++){
                    if(apps[i].getMonthlyRentCost() < student.getMoney() && !(Arrays.asList(appsRented).contains(apps[i]))){
                        finalRentedApartment = apps[i];
                        int len = appsRented.length+1;
                        appsRented = Arrays.copyOf(appsRented,len);
                        appsRented[len-1] = apps[i];
                    }
                }

            }
            return finalRentedApartment;
        }

}
