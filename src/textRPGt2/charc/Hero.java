package textRPGt2.charc;


public class Hero extends Character {
	private int a_distance = 6;
	private int s_distance = 3;
	private int a_attackP ;
	private int s_attackP ;
	
	public Hero(String name) {
		super(name, 50, 1, 7, 15, 4);
		// TODO Auto-generated constructor stub
		
		a_attackP = super.getAttack_p();
		s_attackP = super.getAttack_p() * 2;
	}
	
	
	
	//원거리공격
	public int attack(Character real) {
		// TODO Auto-generated method stub
		//real : 공력을 당하는 객체
		
		int result = 0;
		int dist = distance(this, real);
		
		if(dist <= a_distance) {
			int hp = real.getHp();
			hp = hp - this.getA_attackP();
			
			if(hp <= 0) hp = 0;
			
			real.setHp(hp);
			
			result = 1;
		}
		
		return result;
		
	}
	
	
	public int attack2(Character real) {
		// TODO Auto-generated method stub
		
		int result = 0;
		int dist = distance(this, real);
		
		if(dist <= s_distance) {
			int hp = real.getHp();
			//System.out.println("this.getS_attackP()::" + this.getS_attackP());
			hp = hp - this.getS_attackP();	
			if(hp <= 0) hp = 0;
			real.setHp(hp);
			
			result = 1;
		}
		
		return result;
	}
	
	
public String move(int direction) {
		
		String dir="";
		
		if(direction == 37 && this.getX() != 1) {
			this.setX(this.getX() - 1);
			dir = "좌측";
		}else if(direction == 39 && this.getX() != 30) {
			this.setX(this.getX() + 1);
			dir = "우측";
		}else if(direction == 38 && this.getY() != 1) {
			this.setY(this.getY() - 1);
			dir = "상측";
		}else if(direction == 40 && this.getY() != 10) {
			this.setY(this.getY() + 1);
			dir = "하측";
		}
		
		return dir;
	}
	
	
	public int getA_distance() {
		return a_distance;
	}

	public void setA_distance(int a_distance) {
		this.a_distance = a_distance;
	}

	public int getS_distance() {
		return s_distance;
	}

	public void setS_distance(int s_distance) {
		this.s_distance = s_distance;
	}

	public int getA_attackP() {
		return a_attackP;
	}

	public void setA_attackP(int a_attackP) {
		this.a_attackP = a_attackP;
	}

	public int getS_attackP() {
		return s_attackP;
	}

	public void setS_attackP(int s_attackP) {
		this.s_attackP = s_attackP;
	}




}
