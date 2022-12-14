package sef.module6.activity;

public class Point2DImpl implements Point2D {

	/**
	 * Creates a Point2D object at a default location (0,0)
	 */

	private double x;
	private double y;

	public Point2DImpl() {

		this(0, 0);

	}

	/**
	 * Create a Point2D object that represents a 2D coordinate specified by the
	 * constructor parameters
	 * 
	 * @param x coordinate of the point along the x-axis
	 * @param y coordinate of the point along the y-axis
	 */
	public Point2DImpl(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#move(double, double)
	 */
	public final void move(double x, double y) {

		this.x = x;
		this.y = y;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#setX(double)
	 */
	public void setX(double x) {
		this.x = x;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#setY(double)
	 */
	public void setY(double y) {
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#getX()
	 */
	public double getX() {

		return this.x;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#getY()
	 */
	public double getY() {

		return this.y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#translate(double, double)
	 */
	public final void translate(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object p) {

		if (p instanceof Point2D) {

			Point2D point = (Point2D) p;

			return ((this.x == point.getX()) && (this.y == point.getY()));
			
		} else {
			
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#equals(double, double)
	 */
	public boolean equals(double x2, double y2) {

		return ((this.getX() == x2) && (this.getY() == y2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#getDistance(sef.module5.activity.Point2D)
	 */
	public final double getDistance(Point2D p) {
		
		double xDist = this.x - p.getX();
		double yDist = this.y - p.getY();
		return Math.sqrt(xDist * xDist + yDist * yDist);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#getDistance(double, double)
	 */
	public final double getDistance(double x2, double y2) {

		double xDist = this.x - x2;
		double yDist = this.y - y2;
		return Math.sqrt(xDist * xDist + yDist * yDist);
	}

}
