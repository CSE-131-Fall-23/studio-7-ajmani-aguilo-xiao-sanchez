package studio7;

public class Rectangle {
	
	private int width;
	private int length;
	int area;
	int perimeter;
	
	public Rectangle(int initwidth,int initlength) {
		width = initwidth;
		length = initlength;
				
	}
	public int Area() {
		this.area=width*length;
		return this.area;
		
	}
	public int Perimeter() {
		this.perimeter = (2*width)+(2*length);
		return this.perimeter;
	}
	public String squareCheck() {
		if (width==length){
			return(" is a square");
		}
		else {
			return("This is a not square");
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle tangy = new Rectangle(4,4);
		System.out.println(tangy.length);
		Rectangle sweet = new Rectangle(7,12);
		System.out.println(sweet.width);
		System.out.println(tangy.Area());
		System.out.println(tangy.Perimeter());
		
		if (tangy.Perimeter()>sweet.Perimeter()){
			System.out.println("Tangy is bigger");
		}
		else {
			System.out.println("Sweet is bigger");
		}
		System.out.println("Tangy"+ tangy.squareCheck());
		
		
	
	
		
		
		
			
		

	}

}
