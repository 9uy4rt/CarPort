package cpp;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exer {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		long time1=System.currentTimeMillis();
		Menu mu=new Menu();		
		boolean run=true;
		System.out.println("자동차가 출발합니다, 안전운전하세요.");
		
		while(run) {
			try {
			System.out.println();
			System.out.println("1.기어변속 2.현재속도 3.타이어교체 4.창문 5.와이퍼선택 6.깜빡이선택 "
					+ "7.자동차의 현재상태 8.급브레이크 9.종료");
			System.out.println();
			Scanner scanner=new Scanner(System.in);
			int num=scanner.nextInt();		
			if(num==1) {
				System.out.println("기어를 입력하세요.\n1. 1단 2. 2단 3. 3단 4. 4단 5. 5단 6. 6단 7. R");
				String r=scanner.next();
				if(r.equals("1")) {
					System.out.println("1단");
					mu.gear("1단");
				}else if(r.equals("2")) {
					System.out.println("2단");
					mu.gear("2단");
				}else if(r.equals("3")) {
					System.out.println("3단");
					mu.gear("3단");
				}else if(r.equals("4")) {
					System.out.println("4단");
					mu.gear("4단");
				}else if(r.equals("5")) {
					System.out.println("5단");
					mu.gear("5단");
				}else if(r.equals("6")) {
					System.out.println("6단");
					mu.gear("6단");
				}else if(r.equals("R")) {
					System.out.println("R");
					mu.gear("R");
				}else {
					System.out.println("잘못된 값 입력");				
				}					
				
			}
			if (num==2) {
				System.out.print("현재속도:");
				mu.speed();
			}						
			if (num==3) {
				System.out.println("타이어를 선택하세요.\n1. 미쉐린타이어 2. 금호타이어 3. 한국타이어 4. 컨티넨탈타이어");
				num=scanner.nextInt();				
				if(num==1) {
					System.out.println("차량에 미쉐린타이어 장착");
					mu.tire("미쉐린타이어");
				}else if(num==2) {
					System.out.println("차량에 금호타이어 장착");
					mu.tire("금호타이어");
				}else if(num==3) {
					System.out.println("차량에 한국타이어 장착");
					mu.tire("한국타이어");
				}else if(num==4) {
					System.out.println("차량에 컨티넨탈타이어 장착");
					mu.tire("컨티넨탈타이어");
				}else {
					System.out.println("잘못된 값 입력");
				}
			}
			if (num==4) {
				System.out.println("1. 창문열기 2. 창문닫기");
				num=scanner.nextInt();				
				if(num==1) {
					System.out.println("창문열기\n1. 운전석 창문개방 2. 조수석 창문개방 3. 오른쪽 뒷창문개방 4. 왼쪽 뒷창문개방");
					num=scanner.nextInt();
					if(num==1) {
						System.out.println("운전석 창문개방");
						mu.win("운전석 창문개방");
					}else if(num==2) {
						System.out.println("조수석 창문개방");
						mu.winF("조수석 창문개방");
					}else if(num==3) {
						System.out.println("오른쪽 뒷창문개방");
						mu.winR("오른쪽 뒷창문개방");
					}else if(num==4) {
						System.out.println("왼쪽 뒷창문개방");
						mu.winL("왼쪽 뒷창문개방");
					}else {
						System.out.println("잘못된 값 입력");
					}
				}else if(num==2) {
					System.out.println("창문닫기\n1. 운전석 창문닫음 2. 조수석 창문닫음 3. 오른쪽 뒷창문닫음 4. 왼쪽 뒷창문닫음");
					num=scanner.nextInt();
					if(num==1) {
						System.out.println("운전석 창문닫음");
						mu.win("운전석 창문닫음");
					}else if(num==2) {
						System.out.println("조수석 창문닫음");
						mu.winF("조수석 창문닫음");
					}else if(num==3) {
						System.out.println("오른쪽 뒷창문닫음");
						mu.winR("오른쪽 뒷창문닫음");
					}else if(num==4) {
						System.out.println("왼쪽 뒷창문닫음");
						mu.winL("왼쪽 뒷창문닫음");
					}else {
						System.out.println("잘못된 값 입력");
					}
				}
			}
			if(num==5) {
				System.out.println("와이퍼선택\n1. 와이퍼켜기 2. 와이펴끄기");
				num=scanner.nextInt();
				if(num==1) {
					System.out.println("와이퍼작동");
					mu.wiper("와이퍼작동");
				}else if(num==2) {
					System.out.println("와이퍼멈춤");
					mu.wiper("와이퍼작동안함");
				}else {
					System.out.println("잘못된 값 입력");
				}
			}
			if(num==6) {
				System.out.println("깜빡이선택\n1. 왼쪽 2. 오른쪽 3. 비상깜빡이 4. 끄기");
				num=scanner.nextInt();
				if(num==1) {
					System.out.println("왼쪽 깜빡이");
					mu.light("왼쪽깜빡이");
				}else if(num==2) {
					System.out.println("오른쪽 깜빡이");
					mu.light("오른쪽 깜빡이");
				}else if(num==3) {
					System.out.println("비상 깜빡이");
					mu.light("비상 깜빡이");
				}else if(num==4) {
					System.out.println("깜빡이 끄기");
					mu.light("깜빡이작동안함");
				}else {
					System.out.println("잘못된 값 입력");
				}
			}
			if (num==7) {
				System.out.println("자동차의 현재상태:");
				mu.display();
			}
			if (num==8) {
				System.out.println("기어상태, 현재속도 초기화");
				mu.qBreak();
			}
			if (num==9) {
				run = false;				
			}
			else {
				System.out.println("잘못된 값 입력");
			}			
		}catch(InputMismatchException e){
			System.out.println("잘못된 값 입력");
		}
	}
		long time2=System.currentTimeMillis();
		System.out.println("운행시간: "+(time1+time2)/1000%60+"초"+"\n안녕히계세요.");
	}
}
