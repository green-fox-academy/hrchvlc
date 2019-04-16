package Counter;

public class Counter {
    int fieldNumber;
    int initNumber;

    public Counter(int fieldNumber){
        this.fieldNumber = fieldNumber;
        this.initNumber = fieldNumber;
    }
    public Counter(){
        this.fieldNumber = 0;
        this.initNumber = 0;
    }

    public void add(int newNumber){
        fieldNumber = fieldNumber + newNumber;
    }
    public void add(){
        fieldNumber++;
    }
    public int get(){
        return fieldNumber;
    }
    public void reset(){
        fieldNumber = initNumber;
    }
}
