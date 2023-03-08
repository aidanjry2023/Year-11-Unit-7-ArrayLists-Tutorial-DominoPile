public class Domino {

    int top;
    int bottom;

    public Domino() {
        top = 0;
        bottom = 0;
    }

    @Override
    public String toString() {
        return "Domino{" +
                (top/bottom) +
                '}';
    }

    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle() {
        int temp = bottom;

        if (top < bottom) {
            bottom = top;
            top = temp;
        }
    }

    public int compareTo(Domino other) {
        settle();
        other.settle();
        int value = 0;
        if (bottom < other.getBottom()) {
            value = -1;
        }
        if (bottom > other.getBottom()) {
            value = 1;
        }
        if (bottom == other.getBottom()) {
            if (top < other.getTop()) {
                value = -1;
            }
            if (top > other.getTop()) {
                value = 1;
            }
            else {
                value = 0;
            }
        }
        return value;
    }

    public int compareToWeight(Domino other) {
        int weight = (top + bottom) / 2;
        int otherWeight = (other.getTop() + other.getBottom()) / 2;
        int value = 0;

        if (weight < otherWeight) {
            value = -1;
        }
        if (weight > otherWeight) {
            value = 1;
        }
        if (weight == otherWeight) {
            value = 0;
        }
        return value;
    }

    public boolean canConnect(Domino other) {
        if (top == other.getTop()) {
            return true;
        }
        if (top == other.getBottom()) {
            return true;
        }
        if (bottom == other.getBottom()) {
            return true;
        }
        if (bottom == other.getTop()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }
}
