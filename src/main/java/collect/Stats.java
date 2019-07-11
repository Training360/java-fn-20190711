package collect;

public class Stats {

    private int countOfPositiveOrZeroNumbers;

    private int countOfNegativeNumbers;

    public void increment(int number) {
        if (number >= 0) {
            this.countOfPositiveOrZeroNumbers ++;
        }
        else {
            this.countOfNegativeNumbers ++;
        }
    }

    public void add(Stats other) {
        this.countOfPositiveOrZeroNumbers +=
                        other.countOfPositiveOrZeroNumbers;

        this.countOfNegativeNumbers +=
                        other.countOfNegativeNumbers;
    }

    public int getCountOfPositiveOrZeroNumbers() {
        return countOfPositiveOrZeroNumbers;
    }

    public int getCountOfNegativeNumbers() {
        return countOfNegativeNumbers;
    }
}
