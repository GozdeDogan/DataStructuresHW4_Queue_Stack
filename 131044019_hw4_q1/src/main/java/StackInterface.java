import java.util.EmptyStackException;

/**
 * Created by GozdeDogan on 19.03.2017.
 */
public interface StackInterface<E> {

    /**
     * stack'e gelen parametreyi ekler
     * @param obj
     * @return
     */
    E push(E obj);


    /**
     * stack'e son eklenen elemani return eder
     * @return
     */
    E peek();


    /**
     * stack!e son eklenen elemani siler
     * @return
     */
    E pop();


    /**
     * stack'in bos olup olmamasina bakar
     * @return bos ise true, degilse false return eder
     */
    boolean isEmpty();

    /**
     * stack'in eleman sayisini return eder
     * @return
     */
	int size();
}
