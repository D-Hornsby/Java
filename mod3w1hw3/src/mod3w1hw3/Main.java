package mod3w1hw3;

public class Main {

	public static void main(String[] args) {
		
		//making a new instance
		
		//Rectangle rect = new Rectangle  (4.0, 2.0);
		
//		Cuboid cube = new Cuboid (2.0, 2.0, 2.0);
//		
//		System.out.println(cube);
//		System.out.println(cube.getVolume());
		
//		System.out.println(rect);
//		System.out.println(rect.getArea());
		
		
		// this was taken from the homework assignment 
		Rectangle rectangle = new Rectangle(5,10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());

		
		
	}

}
