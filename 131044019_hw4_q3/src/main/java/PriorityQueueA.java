import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by GozdeDogan on 21.03.2017.
 */
public class PriorityQueueA<E extends Comparable<E>> extends LinkedList<E> implements PriorityQueueInterface<E>{

    /**
     * No-parameter constructur.
     * LinkedList classinin no-parameter construcur'unu cagirir.
     * LinkedList objesi olusturur!
     */
    PriorityQueueA(){
        super();
    }

    /**
     * PriorityQueue'nun size'ini return eder.
     * @return Eleman sayisi
     */
    public int size() {
        return super.size();
    }

    /**
     * PriorityQueue'unun ilk elemanini siler
     * @return sildigi elemani return eder
     */
    public E poll() {
        return super.removeFirst();
    }

    /**
     * PriorityQueue'nun ilk elemanini retrun eder
     * @return ilk eleman
     */
    public E peek() {
        if(size() <=0)
            return null;
        else
            return super.get(0);
    }

    /**
     * Oncelik sirasini kontrol ederek PriorityQueue'ya gelen elemani ekler
     * @param item eklenecek eleman
     * @return ekleme islemi gerceklesirse true return eder
     */
    public boolean offer(E item) {
        int index = -1;
        for(int i=0; i<size(); i++){
            if(super.get(i).compareTo(item) >= 0) {
                index = i;
                i= size();
            }
        }
        if(index != -1)
            super.add(index, item);
        else
            super.add(item);
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
        return super.toString();
    }

}
