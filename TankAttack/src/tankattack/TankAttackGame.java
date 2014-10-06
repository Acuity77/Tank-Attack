package tankattack;

import java.util.ArrayList;
import java.util.LinkedList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class TankAttackGame extends BasicGame {
	
	private final static int Game_Width = 1280 ;
	private final static int Game_Heigth = 960 ;
	
	private Tank tank ;
	private TankEnemy tankenemy ;
	private Bullet bullet1 ;
	private Bullet bullet2 ;
	private ArrayList<Entity> entities ;
	
	private boolean isGameStarted = true ;
	private boolean isGameOver = false ;
	

	public TankAttackGame(String title) {
		super(title);
		entities = new ArrayList<Entity>() ;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		RenderEntity(g);		
	}

	private void RenderEntity(Graphics g) {
		for ( Entity entity : entities) {
			entity.render(g) ;
		}
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		tank = new Tank(Game_Width-50,Game_Heigth-50) ;
		entities.add(tank) ;
		tankenemy = new TankEnemy(0,0);
		entities.add(tankenemy) ;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		if ( isGameStarted && (!isGameOver)) {
			UpdateEntities(container, delta);
			updatefire(container , delta ) ;
		}
	}

	private void UpdateEntities(GameContainer container, int delta) {
		for ( Entity entity : entities ) {
			entity.update(container , delta) ;
		}
	}
	
	public void updatefire(GameContainer container, int delta ) throws SlickException {
		Input input2 = container.getInput() ;
		if ( input2.isKeyPressed(Input.KEY_M)){
			bullet1 = new Bullet(Tank.x,Tank.y ,Tank.rotate) ;
			entities.add(bullet1) ;
		}
		if ( input2.isKeyPressed(Input.KEY_Q)) {
			bullet2 = new Bullet(TankEnemy.x, TankEnemy.y, TankEnemy.rotate) ;
			entities.add(bullet2) ;
		}			
	}

	public static void main(String[] args) {
		try {
			TankAttackGame game = new TankAttackGame("Tank Attack Game") ;
			AppGameContainer appgc = new AppGameContainer(game) ;
			appgc.setDisplayMode(Game_Width,Game_Heigth, false) ;
			appgc.start() ;
		} catch ( SlickException e) {
			e.printStackTrace(); 
		}
	}
}
	