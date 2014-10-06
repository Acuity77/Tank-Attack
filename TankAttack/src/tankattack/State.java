package tankattack;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class State implements Entity {
	private float x ;
	private float y ;
	private Image BlockSide = null ;
	private Image BlockUnder = null ;
	private Image BlockSize ;
	private int Row = 10 ;
	private int colum = 10 ;
	
	public State (float x, float y) {
		this.setPosition(x,y) ;
		try {
			BlockSide = new Image("res/tank.png") ;
			BlockUnder = new Image("res/BlockUnder.png") ;
		} catch ( SlickException e) {
			e.printStackTrace();
		}
	}
	
	static private String[] State = {
	"__________",
	"|________|",
	"|________|",
	"|________|",
	"|________|",
	"|________|",
	"|________|",
	"|________|",
	"|________|",
	"__________"
	} ;
	
	@Override
	public void update( GameContainer container , int delta ) {
		
	}
	public void render(Graphics g) {
		BlockSide.draw(600,600) ;
		/*for ( int i = 0 ; i < Row ; i++ ) {
			for ( int j = 0 ; j < colum ; j++ ) {
				if ( State[i].charAt(j) == '_')
					BlockUnder.draw()
				else
					ฺBlockSide.draw();
			}
		}*/
	}
	public void setPosition( float x , float y){
		this.x = x ;
		this.y = y ;
	}
}