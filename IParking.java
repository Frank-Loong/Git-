package git停车接口;

import java.util.ArrayList;
import java.util.Scanner;
                                     
public interface IParking {
	//打印输出结果
	void printParkingAvailabilitySequentialy();
	//检查是否有carType对应的停车位
	//如果没有停车位，返回false，否则返回true
	boolean parkCar(int carType);
	//解析命令行输入参数
	 static IParams inputParams() {
		int small_car,medium_car,big_car;//车的数量
		ArrayList<Integer> parkingPlan = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入系统中大车停车位的数量:");
		big_car = sc.nextInt();
		System.out.println("输入系统中中等车停车位的数量:");
		medium_car = sc.nextInt();
		System.out.println("输入系统中小车停车位的数量:");
		small_car = sc.nextInt();
		System.out.println("依次输入想停的车（1/2/3）结束请输入0");
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
