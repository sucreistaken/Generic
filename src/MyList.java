import java.util.Arrays;
import java.util.Date;

public class MyList<T> {
    T[] array;
    T[] temparray;
    private int capacity;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
// default


    public MyList() {
        setCapacity(10);
        this.array = (T[]) new Object[getCapacity()];

    }

    public MyList(int capacity) {
        setCapacity(capacity);
        this.array = (T[]) new Object[getCapacity()];
    }

    public int size() {
        return array.length;
    }

    public void add(T data) {
        if (getSize() < getCapacity() ) {
            array[getSize()] = data;
            setSize(getSize() + 1);
        }else{


            this.temparray = (T[]) new Object[getCapacity()];
            for(int i = 0 ; i< array.length; i++){
                temparray[i] = array[i];
            }
            this.array = (T[]) new Object[getCapacity()*2];
            setCapacity(getCapacity()*2);
            for(int i = 0; i< temparray.length ; i++){
                array[i]=temparray[i];
            }
            array[getSize()] = data;
            setSize(getSize() +1);
        }
    }
    public T get(int index){
        if(index <= size()-1){
            return array[index];
        }else
            return null;
    }
    public boolean remove(int index){
        array[index]= null;
        if(index <= size-1){
            for(int i = index ; index< array.length; index++){
                array[i] = array[i+1];
                array[i+1] = null;
                return true;
            }
        }else System.out.println("Identify index"); return false;

    }
    public T set(int index, T data){
        if(index <= getSize()){
           return   array[index] = data;
        }
        else return  null;
    }
    public String toString(){
        System.out.print("[");
        for(int i = 0 ; i< array.length; i++){
            if(array[i]!=null){
                System.out.print(array[i]);
                if(array[i+1] != null){
                    System.out.print(",");
                }

            }
        }
        System.out.print("]");
        return "";
    }
    public int indexOf(T data){
        for(int i = 0 ; i < size() ; i++){
            if (get(i) == data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for(int i = getSize()-1 ; i<0; i-- ){
            if(array[i] == data){
                return i;
            }else break;
        }
        return -1;
    }
    public boolean isEmpty(){
        for(T empty : array){
            if (empty != null){
                return false;
            }else break;
        }
        return true;
    }
    public T[] toArray(){
      T[] toarray = (T[]) new Object[getSize()];
      for(int i = 0 ; i<getSize(); i++){
          toarray[i]= array[i];
      }
      return toarray;
    }
    public void clear(){
        for(int i = 0; i<getSize(); i++){
            array[i]= null;
        }
    }
    public boolean containts(T data){
        for(T con : array){
            if(con == data){
                return true;
            }else break;
        }
        return false;
    }
    public MyList<T> sublist(int start,int finish){
        MyList<T> liste = new MyList<>();
        for(int i = start ; i<finish ; i++){
            liste.add(array[i]);
        }
        return liste;
    }

}
