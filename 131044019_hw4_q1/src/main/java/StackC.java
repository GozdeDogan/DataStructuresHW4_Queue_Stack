import java.util.EmptyStackException;
import java.util.StringTokenizer;

/**
 * Created by GozdeDogan on 19.03.2017.
 */
public class StackC<E> implements StackInterface<E> {

    /**
     * inner class, node yapisi kullanarak yapisi implement edildi
     * @param <E>
     */
    private static class Node<E> {

        private E data;
        private Node<E> next;


        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }


        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    /** Stack'in ilk elemaninin referansi*/
    private Node<E> topOfStackRef = null;
    /** Stack'in eleman sayisi */
    int size = 0;

    /**
     * next'i null olan son node'un bu parametreyi gostermesi saglanir.
     * Yani eleman eklenir
     * @param obj
     * @return
     */
    public E push(E obj) {
        topOfStackRef = new Node<E>(obj, topOfStackRef);
        size++;
        return obj;
    }

    /**
     * stack'e eklenen son elemani siler
     * @return
     */
    public E pop() {
        if (isEmpty()) {
            return null;
        } else {
            E result = topOfStackRef.data;
            topOfStackRef = topOfStackRef.next;
            size--;
            return result;
        }
    }

    /**
     * stack'e eklenen son elemani return eder
     * @return
     */
    public E peek() {
        if (isEmpty()) {
            return null;
        } else {
            return topOfStackRef.data;
        }
    }

    /**
     * Stack'in bos olup olmam durumunu kontrol eder
     * @return bos ise true, degilse false
     */
    public boolean isEmpty() {
        return topOfStackRef == null;
    }

    /**
     * Stack'in eleman sayisini return eder
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * Stack'i elemanlarini StringBuilder objesine ekler ve bu objeyi return eder.
     * Stack'i string'e cevirir
     * @return
     */
    public String toString(){
        boolean yesString = false;
        StringBuilder sb = new StringBuilder();
        Node p = topOfStackRef;
        if (p != null) {
            while (p.next != null) {
                sb.append(p.data.toString());
                sb.append(",");
                p = p.next;
            }
            sb.append(p.data.toString());
        }
        return reverseString(sb);
    }

    /**
     * Stack'i yazdirabilmek icin kullanilan helper metot
     * @param sb
     * @return
     */
    private String reverseString(StringBuilder sb){
        String[] myStr = new String[8000];
        StringBuilder newSb = new StringBuilder();
        StringTokenizer tok = new StringTokenizer(sb.toString(), ",");
        int i=0, size=0;
        while(tok.hasMoreElements()){
            myStr[i] = (String)tok.nextElement();
            i++;
        }
        size = i;

        for(i = size-1; i>=0; i--){
            newSb.append(myStr[i]);
            if(i != 0)
                newSb.append(",");
        }
        return newSb.toString();
    }
}
