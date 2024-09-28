public class Concat{
	public static void main(String[] args){
		String name1 = "Crimson ";
		String name2 = "Oni";
		int age1 = 8;
		int age2 = 4;
		System.out.println(name1 + name2);
		System.out.println(name1.concat(name2));
		System.out.println(age1 + age2);
		System.out.println(String.valueOf(age1) + age2);
	}
}
