/**
 * Created by GozdeDogan on 21.03.2017.
 */
public interface PriorityQueueInterface<E> {
    /**
     * PriorityQueue'nin eleman sayisini return eder
     * @return
     */
    int size();

    /**
     * PriorityQueue'nun ilk elemanýný siler.
     * PriorityQueue oncelikli bir siralama yapisina sahip oldugu icin
     * ilk eleman her zaman en kucuk degerdir
     * @return
     */
    E poll();

    /**
     * PriorityQueue'nun ilk elemaninin return eder.
     * Oncelik siralamasindan kaynakli return ettigi eleman PriorityQueue'nun en kucuk elemanidir
     * @return
     */
    E peek();

    /**
     * gelen parametreyi PriorityQueue'ya ekler.
     * Oncelik siralamasini kontrol ederek ekleme islemini gerceklestirir.
     * @param item
     * @return
     */
    boolean offer(E item);

    /**
     * PriorityQueue'nun bos olup olmama durumuna bakar.
     * Bos ise true,
     * degilse false return eder.
     * @return
     */
    boolean isEmpty();

    /**
     * PriorityQueue'nun sahip oldugu en kucuk elemani siler
     * silerse true, silemezse false return eder.
     * @return
     */
    boolean deleteMin();
}
