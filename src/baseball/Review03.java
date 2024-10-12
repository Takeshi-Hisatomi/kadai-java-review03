package baseball;

public class Review03 {

    public static void main(String[] args) {
                                        // (チーム名、勝ち、負け、引き分け）
       BaseballTeam Yakuruto = new BaseballTeam("東京ヤクルトスワローズ", 80, 59, 4);
       BaseballTeam Baystars = new BaseballTeam("横浜DeNAベイスターズ", 73, 68, 2);
       BaseballTeam Tigers = new BaseballTeam("阪神タイガース", 68, 71, 4);
       BaseballTeam Giants = new BaseballTeam("読売ジャイアンツ", 68, 72, 3);
       BaseballTeam Carp = new BaseballTeam("広島東洋カープ", 66, 74, 3);
       BaseballTeam Dragons = new BaseballTeam("中日ドラゴンズ", 66, 75, 2);

       Yakuruto.report();
       Baystars.report();
       Tigers.report();
       Giants.report();
       Carp.report();
       Dragons.report();
    }

}
