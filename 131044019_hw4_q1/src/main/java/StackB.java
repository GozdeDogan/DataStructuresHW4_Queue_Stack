import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by GozdeDogan on 19.03.2017.
 */
public class StackB<E> implements StackInterface<E> {

    /** member, ArrayList*/
    ArrayList<E> myStack;

    /**
     * No-parameter constructor
     * ArrayList member'ini initialize eder
     */
    public StackB() {
        myStack = new ArrayList<E>();
    }

    /**
     * Stack'in eleman sayisini return eder
     * @return
     */
    public int size() {
        return myStack.size();
    }

    /**
     * Stack'e eleman ekler(sonuna)
     * @param obj
     * @return
     */
    public E push(E obj) { //add
        if(myStack.add(obj))
            return obj;
        return null;
    }

    /**
     * stack'e eklenen son elemani return eder
     * @return
     */
    public E peek() { // element
        if(isEmpty())
            throw new EmptyStackException();
        return myStack.get(size()-1);
    }

    /**
     * stack'e eklenen son elemani siler
     * @return
     */
    public E pop() { //remove
        if(isEmpty())
            throw new EmptyStackException();
        return myStack.remove(size() - 1);
    }

    /**
     * Stack'in bos olup olmam durumunu kontrol eder
     * @return bos ise true, degilse false
     */
    public boolean isEmpty() { //size
        if(size() <= 0)
            return true;
        return false;
    }

    /**
     * member'i return eder
     * @return
     */
    public ArrayList<E> getMyStack() {
        return myStack;
    }

    /**
     * member'i set eder
     * @param myStack
     */
    public void setMyStack(ArrayList<E> myStack) {
        if(myStack == null)
            throw new NullPointerException();
        this.myStack = myStack;
    }

    /*
    public boolean equals(StackB<E> o) {
        if (o == null)
            return false;
        return (myStack.equals(o.getMyStack()));

    }
*/
    /**
     * Stack'i elemanlarini StringBuilder objesine ekler ve bu objeyi return eder.
     * Stack'i string'e cevirir
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size(); i++){
            sb.append(myStack.get(i));
            if(i != size()-1)
                sb.append(",");
        }
        return sb.toString();
    }
}
