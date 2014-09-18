package tankattack;

import java.util.LinkedList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class TankAttackGame extends BasicGame {
	
	public interface Entity {
		void render (Graphics g) ;
		void update (int delta ) ;
	}
	
	private LinkedList<Entity> entities ;

	public TankAttackGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		for ( Entity entity : entities) {
			entity.render(g) ;
		}		
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		for ( Entity entity : entities ) {
			entity.update(delta) ;
		}
	}

	public static void main(String[] args) {
		try {
			TankAttackGame game = new TankAttackGame("Tank Attack Game") ;
			AppGameContainer appgc = new AppGameContainer(game) ;
			appgc.setDisplayMode(640, 480, false) ;
			appgc.start() ;
		} catch ( SlickException e) {
			e.printStackTrace(); 
		}
	}
}
	