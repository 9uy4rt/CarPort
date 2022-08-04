package cpp;
public class Menu implements Car{
	public String s = "중립";
	public String sp="0km";
	public String t="순정 타이어";
	public String w="운전석 창문닫음";
	public String wF="조수석 창문닫음";
	public String wR="오른쪽 뒷창문닫음";
	public String wL="왼쪽 뒷창문닫음";
	public String wi="와이퍼멈춤";
	public String l="끄기";
	@Override
	public void gear(String gear) {
		// TODO Auto-generated method stub	
		this.s = gear;
	}
	@Override
	public void speed() {
		if(s.equals("1단")) {
			System.out.println("10km");
			this.sp = "10km";
		}else if(s.equals("2단")) {
			System.out.println("20km");
			this.sp = "20km";
		}else if(s.equals("3단")) {
			System.out.println("30km");
			this.sp = "30km";
		}else if(s.equals("4단")) {
			System.out.println("40km");
			this.sp = "40km";
		}else if(s.equals("5단")) {
			System.out.println("50km");
			this.sp = "50km";
		}else if(s.equals("6단")) {
			System.out.println("100km 이상");
			this.sp = "100km 이상";
		}else if(s.equals("R")) {
			System.out.println("후진");
			this.sp = "후진";
		}else {
			System.out.println("잘못된 값 입력");
		}	
	}
	@Override
	public void tire(String tire) {
		this.t=tire;
		
	}
	@Override
	public void win(String win) {
		// TODO Auto-generated method stub
		this.w=win;
	}
	@Override
	public void winF(String winF) {
		// TODO Auto-generated method stub
		this.wF=winF;
	}
	@Override
	public void winR(String winR) {
		// TODO Auto-generated method stub
		this.wR=winR;
	}
	@Override
	public void winL(String winL) {
		// TODO Auto-generated method stub
		this.wL=winL;
	}
	@Override
	public void wiper(String wiper) {
		// TODO Auto-generated method stub
		this.wi=wiper;
	}
	@Override
	public void light(String light) {
		// TODO Auto-generated method stub
		this.l=light;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("기어: "+s);
		System.out.println("현재속도: "+sp);
		System.out.println("타이어: "+t);
		System.out.println("창문: "+w+", "+wF+", "+wR+", "+wL);
		System.out.println("와이퍼: "+wi);
		System.out.println("깜빡이: "+l);
	}
	@Override
	public void qBreak() {
		// TODO Auto-generated method stub
		s="중립";
		sp="0km";
	}
	
}