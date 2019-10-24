
public class IntroTOMETHODS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getTheBestCoder());
System.out.println(add(3,2));
System.out.println(whichPresent("asdsdasdn"));
System.out.println(doPigsEat("rsdsd"));
System.out.println(getMyLuckyNumber());
int totaleggs=eggsMomWants()+eggsDadWants()+eggsBabyWants();
System.out.println(totaleggs);
System.out.println(getAverageHeight(113));
	}


 public static String getTheBestCoder(){
	String name="Daniel";
	 return name;
}
 
 public static int add(int number, int othernumber) {
int sum=number+othernumber;
	 return sum;
 }
 
 public static String whichPresent(String friendName) {
	 String gift;
	 if(friendName.equals("Joaquin")) {
		 gift="Lump of coal";
	 }
	 else{
		gift="An Audi R8";
	 }
	 return gift;
 }
 public static boolean doPigsEat(String food) {
	 if(food.equals("roots")) {
		 return true;
	 }
	 else {return false;}
 }
 public static int getMyLuckyNumber() {
	 int number=3;
	 return number;
 }
 public static int eggsMomWants() {
	 int mom=12;
	 return mom;
 }
 public static int eggsDadWants() {
	 int dad=10;
	 return dad;
 }
 public static int eggsBabyWants() {
	 int baby=0;
	 return baby;
 }
public static int getAverageHeight(int age) {
	 if(age>100) {
		 return 34;
	 }
	 if(age>50) {
		 return 30;
	 }
	 if(age<10) {
		 return 20;
	 }
	return 10000;
 }
 }