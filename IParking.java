package gitͣ���ӿ�;

import java.util.ArrayList;
import java.util.Scanner;

public interface IParking {
	//��ӡ������
	void printParkingAvailabilitySequentialy();
	//����Ƿ���carType��Ӧ��ͣ��λ
	//���û��ͣ��λ������false�����򷵻�true
	boolean parkCar(int carType);
	//�����������������
	 static IParams inputParams() {
		int small_car,medium_car,big_car;//��������
		ArrayList<Integer> parkingPlan = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("����ϵͳ�д�ͣ��λ������:");
		big_car = sc.nextInt();
		System.out.println("����ϵͳ���еȳ�ͣ��λ������:");
		medium_car = sc.nextInt();
		System.out.println("����ϵͳ��С��ͣ��λ������:");
		small_car = sc.nextInt();
		System.out.println("����������ͣ�ĳ���1/2/3������������0");
		while(true) {
			int add_car=sc.nextInt();
			if(add_car==1 ||add_car==2 ||add_car==3 ) {
				parkingPlan.add(add_car);
			}
			else if (add_car==0) {
				break;
			}
		}
	  return new IParams() {
          @Override
          public int getBig_car() {
              return big_car;
          }
          @Override
          public int getMedium_car() {
              return medium_car;
          }
          @Override
          public int getSmall_car() {
              return small_car;
          }
          @Override
          public ArrayList<Integer> getParkingPlan() {
              return parkingPlan;
          }
	  };
  }
}
