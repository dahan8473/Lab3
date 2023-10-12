package LA3Q1;

public class DavidArray {
    private Pair[] initialArray;// Declare a Pair array named initialArray

    public DavidArray(){// Default constructor initializes initialArray with zero length
        initialArray = new Pair[0];
    }
    public int getSize(){ // Return the size/length of initialArray
        return initialArray.length;
    }
    public Pair removeFromLastIndex(){    // Remove and return the last element from initialArray
        if(initialArray.length == 0){
            throw new IllegalStateException("The array is empty.");
        }
        Pair removedElement = initialArray[initialArray.length - 1];
        Pair[] newArray = new Pair[initialArray.length - 1];
        System.arraycopy(initialArray, 0, newArray, 0, newArray.length);
        initialArray = newArray;
        return removedElement;
    }
    // Remove and return the first element from initialArray
    public Pair removeFromFirstIndex(){
        if(initialArray.length == 0){
            throw new IllegalStateException("The array is empty.");
        }
        Pair removedElement = initialArray[0];
        Pair[] newArray = new Pair[initialArray.length - 1];
        System.arraycopy(initialArray, 1, newArray, 0, newArray.length);
        initialArray = newArray;
        return removedElement;
    }
    // Add a Pair element to the end of initialArray
    public void addAtLastIndex(Pair element){
        Pair[] newArray = new Pair[initialArray.length + 1];
        System.arraycopy(initialArray, 0, newArray, 0, initialArray.length);
        newArray[initialArray.length] = element;
        initialArray=newArray;
    }
    // Provide a string representation of the initialArray
    @Override
    public String toString(){
        String result = "[";
        for(int i = 0; i < initialArray.length; i++){
            result += initialArray[i].toString();
            if(i < initialArray.length - 1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

}
