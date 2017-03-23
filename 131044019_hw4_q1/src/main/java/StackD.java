import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by GozdeDogan on 19.03.2017.
 */
public class StackD<E> implements StackInterface<E> {

    /** member, Queue */
    Queue<E> myStack;

    /**
     * No-parameter constructor
     * Queue'yu initialize eder
     */
    StackD(){
        myStack = new LinkedList<E>();
    }

    /**
     * Stack'e eleman ekler(sonuna)
     * @param obj
     * @return
     */
    public E push(E obj) {
        if(myStack.offer(obj))
            return obj;
        return null;
    }

    /**
     * stack'e eklenen son elemani return eder
     * @return
     */
    public E peek() {
        E item = null;
        for(int i=0; i<size(); i++){
           item = myStack.poll();
           myStack.offer(item);
        }
        return item;
    }

    /**
     * stack'e eklenen son elemani siler
     * @return
     */
    public E pop() {
        E item = null;
        for(int i=0; i<size()-1; i++){
            item = myStack.poll();
            myStack.offer(item);
        }
        item = myStack.poll();
        return item;
    }

    /**
     * Stack'in bos olup olmam durumunu kontrol eder
     * @return bos ise true, degilse false
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Stack'in eleman sayisini return eder
     * @return
     */
    public int size(){
        return myStack.size();
    }

    /**
     * Stack'i elemanlarini StringBuilder objesine ekler ve bu objeyi return eder.
     * Stack'i string'e cevirir
     * @return
     */
    public String toString(){
        StackA<E> temp = new StackA<E>();

        while(peek() != null){
            temp.push(pop());
        }

        StringBuilder sb = new StringBuilder();
        while(temp.peek() != null){
            sb.append(temp.pop());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);

        while(temp.peek() != null){
            push(temp.pop());
        }

        return sb.toString();
    }
}