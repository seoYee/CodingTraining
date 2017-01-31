
public class Play {
	public static void main(String[] args) {

		Game start = new Game();
		boolean gameIsNotFinished = true;
		start.initializeGame();

		while (gameIsNotFinished) {

			System.out.println(start.getInitNumbers().get(0));
			System.out.println(start.getInitNumbers().get(1));
			System.out.println(start.getInitNumbers().get(2));

			start.setInputNumbers();
			System.out.println(start.getInputNumbers().get(0));
			System.out.println(start.getInputNumbers().get(1));
			System.out.println(start.getInputNumbers().get(2));

			start.setCount();
			System.out.println(start.getBallCount());
			System.out.println(start.getStrikeCount());
			
			gameIsNotFinished = start.gameResult(gameIsNotFinished);
			start.countReset();
		}
	}
}