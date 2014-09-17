
public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return (width * height);
	}
	
	public static void main(String[] args) {
		
		Rectangle recObj1 = new Rectangle(10, 10); 
		System.out.println("Rectangle's area = " + recObj1.getArea());
		Rectangle recObj2 = new Rectangle(420, 420);
		recObj2 = recObj1;
		
		if(recObj1.equals(recObj2)){
			System.out.println("Bravo");
		} else {
			for(int i=0;i<3;i++){ 
				System.out.println("ERROR!!!");
			}
		}
	}	

}
