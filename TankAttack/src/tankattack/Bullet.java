package tankattack;

import org.newdawn.slick.Graphics;

import tankattack.TankAttackGame.Entity;

public class Bullet implements Entity {
	private static final float BULLET_SIZE = 5 ;
	private float dir ;
	private float velocity ;
	private float x ;
	private float y ;
	
	public Bullet( float x , float y , float dir , float velocity) {
		this.setXY(x,y) ;
		this.dir = dir ;
		this.velocity = velocity ;
	}
	
	@Override
	public void render(Graphics g) {
	  g.fillOval(getX(), getY(), BULLET_SIZE, BULLET_SIZE);
	}
	 
	@Override
	public void update(int delta) {
		
	}
	 
	public float getX() {
	  return x;
	}
	 
	public float getY() {
	  return y;
	}
	 
	protected void setXY(float x, float y) {
	  this.x = x;
	  this.y = y;
	}
	
	public float GetVelocity() {
		return velocity ;
	}
	
	public float getDir() {
		return dir ;
	}
}
