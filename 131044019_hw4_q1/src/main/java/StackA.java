import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by GozdeDogan on 19.03.2017.
 */
public class StackA<E> extends ArrayList<E> implements StackInterface<E> {
    /**
     * No-parameter constructor
     * ArrayList'in no-parameter contructur'ini cagirir
     */
    public StackA() {
        super();
    }

    /**
     * Stack'in eleman sayisini return eder
     * @return
     */
    public int size() {
        //System.out.println("sizeA:" + super.size());
        return super.size();
    }

    /**
     * Stack'e eleman ekler(sonuna)
     * @param obj
     * @return
     */
    public E push(E obj) { //add
        if(super.add(obj))
            return obj;
        return null;
    }

    /**
     * stack'e eklenen son elemani return eder
     * @return
     */
    public E peek() { // element
        if(isEmpty())
            return null;
        else
            return super.get(size() - 1);
    }

    /**
     * stack'e eklenen son elemani siler
     * @return
     */
    public E pop() { //remove
        if(isEmpty())
            throw new EmptyStackException();
        return super.remove(size() - 1);
    }

    /**
     * Stack'in bos olup olmam durumunu kontrol eder
     * @return bos ise true, degilse false
     */
    public boolean isEmpty() { //size
        if(super.isEmpty())
            return true;
        return false;
    }

    /**
     * Stack'i elemanlarini StringBuilder objesine ekler ve bu objeyi return eder.
     * Stack'i string'e cevirir
     * @return
     */
    public String toString() {
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
/*
    public boolean equals(StackA<E> o){
        return super.equals(o);
    }
*/

    /**
     * Burdan sonraki metotlar ArrayList'in metotlari ve Stack icin bu metotlarin olmamasi gerekiyor
     * Bu nedenle hepsine UnsupportedOperationException denildi.
     */

    @Override
    public void trimToSize() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object clone() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(Comparator<? super E> c) {
        throw new UnsupportedOperationException();
    }
}
