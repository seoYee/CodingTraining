import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	public static final int PLACES = 3;
	public static final int MAXNUMBER = 9;

	private List<String> initNumbers = new ArrayList<>();
	private List<String> inputNumbers = new ArrayList<>();

	private int ballCount;
	private int strikeCount;
	private int guessCount = 0;

	private Scanner scan = new Scanner(System.in);

	///////////////////////////////////////////////////////////
	public void initializeGame() {

		initNumbers.add(String.valueOf((int) (Math.random() * MAXNUMBER) + 1));

		for (int i = 1; i < PLACES; i++) {

			initNumbers.add(String.valueOf((int) (Math.random() * MAXNUMBER) + 1));
			List<String> gn = initNumbers.subList(0, i);

			while (gn.contains(initNumbers.get(i)) == true) {
				initNumbers.set(i, String.valueOf((int) (Math.random() * MAXNUMBER) + 1));
			}
		}
	}

	public List<String> getInitNumbers() {
		System.out.println("게임이 초기화되었습니다.");
		return this.initNumbers;
	}
	////////////////////////////////////////////////////////////////////////////

	public void setInputNumbers() {

		for (int i = 0; i < PLACES; i++) {
			System.out.println(i + 1 + "번째 숫자를 입력하세요.");
			String inputNum = scan.nextLine();
			inputNumbers.add(i, inputNum);
		}
		guessCount++;
	}

	public List<String> getInputNumbers() {
		return this.inputNumbers;
	}

	//////////////////////////////////////////////////////////////////////
	public void setCount() {

		for (int i = 0; i < PLACES; i++) {
			if (initNumbers.contains(inputNumbers.get(i))) {
				if (initNumbers.indexOf(inputNumbers.get(i)) == i) {
					strikeCount++;
				} else {
					this.ballCount++;
				}
			}
		}
	}

	public int getBallCount() {
		return this.ballCount;
	}

	public int getStrikeCount() {
		return this.strikeCount;
	}

	public void countReset() {
		this.ballCount = 0;
		this.strikeCount = 0;
	}

	public boolean gameResult(boolean gameIsNotFinished) {
		if (getStrikeCount() < PLACES) {
			System.out.println(getBallCount() + "볼," + getStrikeCount() + "스트라이크 입니다.");
			System.out.println("숫자를 다시 입력하세요~");
			return gameIsNotFinished = true;
		} else {
			System.out.println(guessCount + "번만에 성공했습니다!");
			return gameIsNotFinished = false;
		}
	}
}
