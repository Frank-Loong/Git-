package git停车接口;

import java.util.ArrayList;

public class ParkingSystem implements IParking {
	int small_car,medium_car,big_car;//车的数量
	 ArrayList<Boolean> availability = new ArrayList<>();
	ParkingSystem(int small_car,int medium_car,int big_car){
		this.small_car=small_car;
		this.medium_car=small_car;
		this.big_car=small_car;
	}
	 @Override
	    public void printParkingAvailabilitySequentialy() {
	        System.out.println(availability);
	    }
	 @Override
	    public boolean parkCar(int carType) {
	        if(carType == 1 && big_car > 0) {
	            big_car--;
	            return availability.add(true);
	        }
	        else if(carType == 2 && medium_car > 0) {
	            medium_car--;
	            return availability.add(true);
	        }
	        else if(carType == 3 && small_car > 0) {
	            small_car--;
	            return availability.add(true);
	        }
	        else {
	            availability.add(false);
	            return false;
	        }
	    }
	  public static void main(String[] args) {
	        IParams iParams = IParking.inputParams();
	        ParkingSystem parkingSystem = new ParkingSystem(iParams.getBig_car(), iParams.getMedium_car(), iParams.getSmall_car());
	        ArrayList<Integer> plan = iParams.getParkingPlan();
	        for(int i = 0; i < plan.size(); i++) {
	            parkingSystem.parkCar(plan.get(i));
	        }
	        parkingSystem.printParkingAvailabilitySequentialy();
	    }
	}