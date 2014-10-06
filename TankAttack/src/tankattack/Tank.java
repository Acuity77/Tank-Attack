package tankattack;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Tank implements Entity{
	private float dir ;
	private float velocity ;
	protected static float x ;
	protected static float y ;
	private Image TankImage ;
	protected static int rotate = 0 ;

	public Tank ( float x , float y) throws SlickException {
		this.setPosition(x,y) ; 
		TankImage = new Image("res/tank.png") ;
	}

	@Override
	public void render(Graphics g) {
		TankImage.draw(x,y);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer container , int delta) {
		Input input = container.getInput() ;
		if (input.isKeyDown(Input.KEY_UP)) { 
			x+= 3*Math.sin(rotate*Math.PI/180) ;
			y-= 3*Math.cos(rotate*Math.PI/180) ;
		}
		if (input.isKeyDown(Input.KEY_DOWN)) {
			x-= 3*Math.sin(rotate*Math.PI/180) ;
			y+= 3*Math.cos(rotate*Math.PI/180) ;      
		}
		if ( input.isKeyDown(Input.KEY_RIGHT)) {
			TankImage.setRotation(rotate+=5);
		}
		if ( input.isKeyDown(Input.KEY_LEFT)) {
			TankImage.setRotation(rotate-=5);
		}
		if ( rotate == 360 || rotate == -360 )
			rotate = 0 ;
		// TODO Auto-generated method stub		
	}
	
	public float getX() {
	  return x;
	}
	 
	public float getY() {
	  return y;
	}
	
	public void setPosition( float x , float y){
		this.x = x ;
		this.y = y ;
	}
	
	public float GetVelocity() {
		return velocity ;
	}
	
	public float getDir() {
		return dir ;
	}
}