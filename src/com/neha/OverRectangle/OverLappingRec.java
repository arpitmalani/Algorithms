package com.neha.OverRectangle;

public class OverLappingRec {
	public static void main(String[] args) {
		Rectangle first = new Rectangle(new Point(0, 10), new Point(10, 0));
		Rectangle second = new Rectangle(new Point(5, 5), new Point(15, 0));
		isOverlapping(first, second);
	}

	public static void isOverlapping(Rectangle one, Rectangle two) {
		if(isUp(one,two) || isDown(one, two) || isLeft(one, two) || isRight(one, two)){
			System.out.println("Do not overlap");
		}else{
			System.out.println("Overlapping rec");
		}
		
	}
	
	public static boolean isUp(Rectangle one, Rectangle two){
		if(one.bottomRight.y>two.topLeft.y){
			return true;
		}
		return false;
	}
	
	public static boolean isDown(Rectangle one, Rectangle two){
		if(one.topLeft.y<two.bottomRight.y){
			return true;
		}
		return false;
	}
	
	public static boolean isLeft(Rectangle one, Rectangle two){
		if(one.bottomRight.x<two.topLeft.x){
			return true;
		}
		return false;
	}
	
	public static boolean isRight(Rectangle one, Rectangle two){
		if(one.topLeft.x>two.bottomRight.x){
			return true;
		}
		return false;
	}
}

class Point {
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Rectangle {
	Point topLeft;

	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	Point bottomRight;

	public Point getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(Point bottomRight) {
		this.bottomRight = bottomRight;
	}

	public Rectangle(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

}
