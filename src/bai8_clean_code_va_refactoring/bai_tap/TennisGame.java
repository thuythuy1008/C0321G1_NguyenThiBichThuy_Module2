package bai8_clean_code_va_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String firstPlayerName, String SecondPlayerName, int firstPersonScore, int secondPersonScore) {
        String string = "";
        int tempScore = 0;
        if (firstPersonScore == secondPersonScore) {
            switch (firstPersonScore) {
                case 0:
                    string = "Love-All";
                    break;
                case 1:
                    string = "Fifteen-All";
                    break;
                case 2:
                    string = "Thirty-All";
                    break;
                case 3:
                    string = "Forty-All";
                    break;
                default:
                    string = "Deuce";
                    break;

            }
        } else if (firstPersonScore >= 4 || secondPersonScore >= 4) {
            int minusResult = firstPersonScore - secondPersonScore;
            if (minusResult == 1) string = "Advantage player1";
            else if (minusResult == -1) string = "Advantage player2";
            else if (minusResult >= 2) string = "Win for player1";
            else string = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPersonScore;
                else {
                    string += "-";
                    tempScore = secondPersonScore;
                }
                switch (tempScore) {
                    case 0:
                        string += "Love";
                        break;
                    case 1:
                        string += "Fifteen";
                        break;
                    case 2:
                        string += "Thirty";
                        break;
                    case 3:
                        string += "Forty";
                        break;
                }
            }
        }
        return string;
    }
}
