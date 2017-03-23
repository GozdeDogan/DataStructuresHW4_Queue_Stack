import java.util.LinkedList;

/**
 * Created by GozdeDogan on 21.03.2017.
 */
public class PriorityQueueB<E extends Comparable<E>> implements PriorityQueueInterface<E>{
    /** member, elemanlari tutar */
    private LinkedList<E> myPQ;

    /**
     * No-parameter constructur.
     * LinkedList objesi olusturur!
     */
    PriorityQueueB(){
        myPQ = new LinkedList<E>();
    }

    /**
     * PriorityQueue'nun size'ini return eder.
     * @return Eleman sayisi
     */
    public int size() {
        return myPQ.size();
    }

    /**
     * PriorityQueue'unun ilk elemanini siler
     * @return sildigi elemani return eder
     */
    public E poll() {
        return myPQ.removeFirst();
    }

    /**
     * PriorityQueue'nun ilk elemanini retrun eder
     * @return ilk eleman
     */
    public E peek() {
        if(size() <=0)
            return null;
        else
            return myPQ.get(0);
    }

    /**
     * Oncelik sirasini kontrol ederek PriorityQueue'ya gelen elemani ekler
     * @param item eklenecek eleman
     * @return ekleme islemi gerceklesirse true return eder
     */
    public boolean offer(E item) {
        int index = -1;
        for(int i=0; i<size(); i++){
            if(myPQ.get(i).compareTo(item) >= 0) {;
                index = i;
                i= size();
            }
        }
        if(index != -1)
            myPQ.add(index, item);
        else
            myPQ.add(item);

        return true;
    }

    /**
     * PriorityQueue'nun bos olup olmamasina bakar
     * bos ise true
     * dolu ise false
     * @return
     */
    public boolean isEmpty() {
        if(size() == 0)
            return true;
        return false;
    }

    /**
     * PriorityQueue'unun en kucuk elemanini siler
     * @return silebilirse true, silemezse false return eder.
     */
    public boolean deleteMin(){
        if(poll() != null)
            return true;
        return false;
    }

    /**
     * PriorityQueue elemanlarini String seklinde return eder.
     * @return
     */
    public String toString(){
        return myPQ.toString();
    }
}
