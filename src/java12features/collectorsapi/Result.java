package java12features.collectorsapi;

class Result {
    private final long count;
    private final int sum;

    public Result(long count, int sum) {
        this.count = count;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Result { " +
                "count=" + count +
                ", sum=" + sum +
                " }";
    }
}

