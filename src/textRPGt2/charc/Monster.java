package textRPGt2.charc;


public class Monster extends Character{
	
	private int attackDistance;
	
	public Monster(String name, int level) {
		
		super(name, (int)(30 * 1.6 * level), level, (int)(6 * 1.6 * level), 15, 2);
		// TODO Auto-generated constructor stub
		this.setAttackDistance(2);
		
	}
	
	
	public int attack(Character real) {
		// TODO Auto-generated method stub
		System.out.println("몬공");
		int result = 0;
		int dist = distance(this, real);
		
		if(dist <= attackDistance) {
			System.out.println("몬공성공");
			int hp = real.getHp();
			hp = hp - this.getAttack_p();	
			if(hp <= 0) hp = 0;
			real.setHp(hp);
			
			result = 1;
		}
		
		return result;
		
	}

	
	public void autoMoving() {
		
		int xy = (int)(Math.random() * 2) + 1;
		int sign = (int)(Math.random() * 2) + 1;
		int moving = (int)(Math.random() * 2) + 1;
		
		int x = getX();
		int y = getY();
		
		//x축이동
		if(xy == 1) {
			
			//플러스 이동
			if((sign == 1 && x == 30) || (sign == 1 && x == 29 && moving == 2)) ;
			else if((sign == 2 && x == 1) || (sign == 2 && x == 2 && moving == 2)) ;
			else if(sign == 1) setX(x + moving);
			else setX(x - moving);	
			
		//y축이동
		}else {
			
			//플러스 이동
			if((sign == 1 && y == 10) || (sign == 1 && y == 9 && moving == 2)) {
			}else if((sign == 2 && y == 1) || (sign == 2 && y == 2 && moving == 2)) {
			}else if(sign == 1) {
				setY(y + moving);
			}else {
				setY(y - moving);
			}
			
		}
		
		
	}


	public int getAttackDistance() {
		return attackDistance;
	}

	public void setAttackDistance(int attackDistance) {
		this.attackDistance = attackDistance;
	}
}
