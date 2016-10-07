public class TestShape{

	public static void main(String [] args){

		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Square s1 = new Square();

		System.out.println(c1);
		System.out.println("Circle's area is " + c1.getArea() + "\n Circle's perimeter is " + c1.getPerimeter());
		System.out.println("\n");
		System.out.println(r1);
		System.out.println("Rectangle's area is " + r1.getArea() + "\n Rectangle's perimeter is " + r1.getPerimeter());
		System.out.println("\n");
		System.out.println(s1);
		System.out.println("Square's area is " + s1.getArea() + "\n Square's perimeter is " + s1.getPerimeter());


		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");

		Circle c2 = new Circle(10);
		Rectangle r2 = new Rectangle(5, 7);
		Square s2 = new Square(11);


		System.out.println(c2);
		System.out.println("Circle's area is " + c2.getArea() + "\n Circle's perimeter is " + c2.getPerimeter());
		System.out.println("\n");
		System.out.println(r2);
		System.out.println("Rectangle's area is " + r2.getArea() + "\n Rectangle's perimeter is " + r2.getPerimeter());
		System.out.println("\n");
		System.out.println(s2);
		System.out.println("Square's area is " + s2.getArea() + "\n Square's perimeter is " + s2.getPerimeter());

		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");

		Circle c3 = new Circle(15, "Blue", false);
		Rectangle r3 = new Rectangle(5, 7, "Gray", true);
		Square s3 = new Square(11, "Neon Green", true);


		System.out.println(c3);
		System.out.println("Circle's area is " + c3.getArea() + "\n Circle's perimeter is " + c3.getPerimeter());
		System.out.println("\n");
		System.out.println(r3);
		System.out.println("Rectangle's area is " + r3.getArea() + "\n Rectangle's perimeter is " + r3.getPerimeter());
		System.out.println("\n");
		System.out.println(s3);
		System.out.println("Square's area is " + s3.getArea() + "\n Square's perimeter is " + s3.getPerimeter());
	}
}