package tankattack;

public class BulletFactory {
	public Bullet build ( float x, float y, float dir , float velocity){
		return new Bullet(x,y,dir,velocity) ;
	}
}
