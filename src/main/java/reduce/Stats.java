package reduce;

public class Stats {

    private int countOfPositiveOrZeroNumbers;

    private int countOfNegativeNumbers;

    public Stats increment(int number) {
        var stats = new Stats();
        stats.countOfNegativeNumbers = countOfNegativeNumbers;
        stats.countOfPositiveOrZeroNumbers = countOfPositiveOrZeroNumbers;
        if (number >= 0) {
            stats.countOfPositiveOrZeroNumbers ++;
        }
        else {
            stats.countOfNegativeNumbers ++;
        }
        return stats;
    }

    public Stats add(Stats other) {
        var stats = new Stats();
        stats.countOfPositiveOrZeroNumbers =
                this.countOfPositiveOrZeroNumbers +
                        other.countOfPositiveOrZeroNumbers;

        stats.countOfNegativeNumbers =
                this.countOfNegativeNumbers +
                        other.countOfNegativeNumbers;
        return stats;
    }

    public int getCountOfPositiveOrZeroNumbers() {
        return countOfPositiveOrZeroNumbers;
    }

    public int getCountOfNegativeNumbers() {
        return countOfNegativeNumbers;
    }
}
