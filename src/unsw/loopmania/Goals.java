package unsw.loopmania;

public class Goals {
    private int experience = 2000;
    private int gold = 1000;
    private int cycles = 8;
    public Goals() {
    }

    public boolean goalComplete(int curGold, int curExp, int curCycles) {
        if (curGold >= this.gold && curExp >= this.experience && curCycles >= this.cycles) {
            return true;
        }
        else {
            return false;
        }
    }
}
