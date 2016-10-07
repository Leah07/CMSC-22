public class Rectangle extends Shape{
	protected double width;
	protected double length;

	public Rectangle(){
		super();
	}

	public Rectangle(double width, double length){
		super();
		this.width = length;
		this.length = width;

	}

	public Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth(){
		return width;
	}

	public double getLength(){
		return length;
	}

	public void setWidth(double width){
		this.width = width;	
	}

	public void setLength(double length){
		this.length = length;
	}

	@Override
	public double getArea(){
		return width * length;
	}

	@Override
	public double getPerimeter(){
		return ((width * 2) + (length * 2));
	}

	@Override
	public String toString(){
		return String.format("A Rectangle with width = "+ getWidth() + " and length = "+ getLength() + " , which is a subclass of "+ super.toString());
	}

	
}