import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by GozdeDogan on 20.03.2017.
 */
public class myQueue<E>  extends KWLinkedList<E>{
    /**
     * No-parameter constructur.
     * KWLinkedList class'inin no-parameter constructur'unu cagirir
     */
    public myQueue() {
        super();
    }

    /**
     * ilk elemani siler
     * @return silinen elemani return eder
     */
    public E poll(){
        if(size() > 0){
            return super.removeFirst();
        }
        return null;
    }

    /**
     * ilk elemani return eder
     * @return
     */
    public E peek(){
        if(size() == 0)
            return null;
        else
            return super.get(0);
    }

    /**
     * gelen parametreyi listeye ekler
     * @param item
     */
    public void offer(E item){
        super.add(size(), item);
    }

    /**
     * listenin eleman sayisini return eder
     * @return
     */
    public int size(){
        return super.size();
    }

    /**
     * listenin bos olup olmama durumuna bakar
     * @return bos ise true, degilse false
     */
    public boolean isEmpty(){
        if(size() > 0)
            return false;
        else
            return true;
    }

    /**
     * myQueue'yu ters cevirir
     * @return ters cevirdigi myQueue'yu return eder
     */
    public myQueue<E> reverse(){
        myQueue<E> temp = new myQueue<E>();
        reversingMyQueue(temp, size(), 0);
        return temp;
    }

    /**
     * ters cevirmek icin kullandigim helper metot, recursive olarak implement edildi
     * @param temp cevirilecek myQueue
     * @param size cevirilecek myQueue'nu eleman sayisi
     * @param index kacinci elemanda bulundugumu belirten integer deger
     */
    private void reversingMyQueue(myQueue<E> temp, int size, int index){
        if(index < size){
            E item = poll();
            reversingMyQueue(temp, size, index + 1);
            temp.offer(item);
            offer(item);
        }
    }


    /**
     * Queue elemani alir ve aldigi bu Queue elemanini ters cevirip return eder
     * @param rQ
     * @return
     */
    public Queue<E> reverseQueue(Queue<E> rQ){
        Queue<E> temp = new LinkedList<E>();
        reversing(rQ, temp, rQ.size(), 0);
        return temp;
    }

    /**
     * reverse etme isleminde kullandigim helper metot
     * recursive oalrak calisir
     * @param rQ
     * @param temp
     * @param size
     * @param index
     */
    private void reversing(Queue<E> rQ, Queue<E> temp, int size, int index){
        if(index < size){
            E item = rQ.poll();
            reversing(rQ, temp, size, index + 1);
            temp.offer(item);
            rQ.offer(item);
        }
    }

    /**
     * myQueue'yu sirasi yazdirir.
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int tempSize = size();
        for(int i=0; i<tempSize; i++){
            E item = poll();
            sb.append(item);
            if(i < size())
                sb.append(",");
            offer(item);
        }
        return sb.toString();
    }

    /**
     * myQueue yapisini ters cevirir ve bunu return eder
     * @return
     */
    public String reverseToString(){
        myQueue<E> temp = new myQueue<E>();
        temp = reverse();
        return temp.toString();
    }

    /**
     * Queue yapisini sirali bir sekilde String halinde return eder
     * @param rQ
     * @return
     */
    public String toStringQueue(Queue<E> rQ){
        StringBuilder sb = new StringBuilder();
        int tempSize = rQ.size();
        for(int i=0; i<tempSize; i++){
            E item = rQ.poll();
            sb.append(item);
            if(i < tempSize-1)
                sb.append(",");
            rQ.offer(item);
        }
        return sb.toString();
    }

    /**
     * Queue yapisinin ters sirali halini String halinde return eder
     * @param rQ ters cevrilecek Queue
     * @return ters cevrilmis hali
     */
    public String toStringReverseQueue(Queue<E> rQ){
        Queue<E> temp = new LinkedList<E>();
        temp = reverseQueue(rQ);
        return toStringQueue(temp);
    }
}
