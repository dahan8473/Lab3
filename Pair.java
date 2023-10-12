package LA3Q1;

public class Pair<Y, N> {

        private Y key;
        private N value;
        //constructor
        public Pair() {

        }
        public Pair(Y key, N value) {
            this.key = key;
            this.value = value;
        }
        //setter and getter for key and value
        public void setKey(Y key) {
            this.key = key;
        }

        public void setValue(N value) {

            this.value = value;
        }
        public Y getKey() {

            return key;
        }
        public N getValue() {

            return value;
        }

    // override default toString method
    @Override
    public String toString() {
        return "[YR: " + key + ", NM: " + value + "]";
    }
}
