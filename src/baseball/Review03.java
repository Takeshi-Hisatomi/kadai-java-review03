package baseball;

public class Review03 {

    public static void main(String[] args) {
                                        // (チーム名、勝ち、負け、引き分け）
       BaseBallTeam Yakuruto = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
       BaseBallTeam Baystars = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
       BaseBallTeam Tigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
       BaseBallTeam Giants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
       BaseBallTeam Carp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
       BaseBallTeam Dragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

       Yakuruto.report(); // ヤクルトのreportメソッドを呼び出し
       Baystars.report(); // ベイスターズのreportメソッドを呼び出し
       Tigers.report(); // タイガースのreportメソッドを呼び出し
       Giants.report(); // ジャイアンツのreportメソッドを呼び出し
       Carp.report(); // カープのreportメソッドを呼び出し
       Dragons.report(); // ドラゴンズのreportメソッドを呼び出し
    }

}
