package com.bridgelab.gamblingstimulator;

public class GamblingStimulator {

	public static int dailyStake = 100;
	public static int betInDollar = 1;
	public static final int win = 1;
	public static int totalAmountWonFor20days = 0;
	public static int totalAmountLostFor20days = 0;
	public static int winCount = 0;
	public static int lossCount = 0;
	public static int dayLostCount = 0;
	public static int dayWonCount = 0;

	public static void main(String[] args) {
		System.out.println("************Welcome To Gambling Simulator***************");

		for (int day = 1; day <= 20; day++) {
			dailyStake = 100;
			 System.out.println("DAY Number " + day);
			while (dailyStake >= 51 && dailyStake <= 149) {
				int result = (int) ((Math.random() * 10 % 2) + 1);
				if (result == win) {
					dailyStake++;
					winCount++;
				} else {
					dailyStake--;
					lossCount++;
				}

				if (dailyStake == 150) {
					totalAmountWonFor20days += 50;
					dayWonCount++;
				}else if(dailyStake == 50) {
                    totalAmountLostFor20days -= 50;
                    dayLostCount++;
                }
			}
		}

		System.out.println("Won times " + winCount);
        System.out.println("Lost count " + lossCount);
        System.out.println("Total amount won for 20 Days " + totalAmountWonFor20days);
        System.out.println("Total amount lost for 20 Days " + totalAmountLostFor20days);
        System.out.println("Number of days lost " + dayLostCount + " by $50.");
        System.out.println("Number of days won " + dayWonCount + " by $50.");
	}
}
