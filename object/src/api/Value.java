package api;

// extends Object 기본
public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        Value other = (Value) obj;
        if (value != other.value)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

}
