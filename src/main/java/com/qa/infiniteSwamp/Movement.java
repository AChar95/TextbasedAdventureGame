package com.qa.infiniteSwamp;

public class Movement {
private int x = 0;
private int y = 0;
public int goNorth() {
	this.x=x+1;
	return x;
}
public int goEast() {
	this.y=y+1;
	return y;
}
public int goWest() {
	this.y=y-1;
	return y;
}
public int goSouth() {
	this.x=x-1;
	return x;
}
public int curLocalX() {
	return this.x;
}
public int curLocalY() {
	return this.y;
}
public int setXOrigin() {
	return x =0;
}
public int setYOrigin() {
	return y =0;
}
}
