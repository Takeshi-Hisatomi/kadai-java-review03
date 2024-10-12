package baseball;

public class BaseBallTeam {

    private String name; // チーム名
    private int win; // 勝ち
    private int lose; // 負け
    private int draw; // 引き分け

    public BaseBallTeam() {
    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        double winingRate = ((double)this.win /(this.win + this.lose));
        return winingRate;
    }

    public void report() {
        System.out.println(this.name + " の2022年の戦績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + this.getRate() + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
