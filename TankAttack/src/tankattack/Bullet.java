package tankattack;

import org.newdawn.slick.GameContainer ;
import org.newdawn.slick.Graphics;

public class Bullet implements Entity {
	private static final float BULLET_SIZE = 5 ;
	private float dir ;
	private float velocity ;
	private float x ;
	private float y ;
	private float dirbullet ;
	
	public Bullet( float x , float y , float dirbullet ) {
		this.setXY(x,y) ;
		this.dirbullet = dirbullet ;
		//this.velocity = velocity ;
	}
	
	@Override
	public void render(Graphics g) {
	  g.fillOval(getX(), getY(), BULLET_SIZE, BULLET_SIZE);
	}
	 
	@Override
	public void update(GameContainer container , int delta) {
		x+= 6*Math.sin(dirbullet*Math.PI/180) ;
		y-= 6*Math.cos(dirbullet*Math.PI/180) ;
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
