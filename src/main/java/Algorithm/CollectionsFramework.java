package Algorithm;

/**
 * Created by Meng on 2015/10/28.
 * Java Collections Framework (https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html)
 * Guava Collections Extensions (https://github.com/google/guava/wiki)
 */
public class CollectionsFramework {
    /**
     *               Collection (Interfaces)
     *             /            |            \
     *        List            Queue            Set
     *                          |                  \
     *               (BlockingQueue, Deque)      SortedSet
     *                          |                    |
     *           (BlockingDeque, TransferQueue)   NavigableSet
     *
     * Main implementations:
     * List: ArrayList, LinkedList, CopyOnWriteArrayList, (Vector, Stack)
     *
     * Queue: PriorityQueue, ConcurrentLinkedQueue
     * BlockingQueue: LinkedBlockingQueue, ArrayBlockingQueue, PriorityBlockingQueue, DelayQueue, SynchronousQueue
     * TransferQueue: LinkedTransferQueue
     *
     * Deque: ArrayDeque, ConcurrentLinkedDeque, LinkedList
     * BlockingDeque: LinkedBlockingDeque
     *
     * Set: HashSet, LinkedHashSet, EnumSet, CopyOnWriteArraySet
     * NavigableSet: TreeSet, ConcurrentSkipListSet
     *
     *                Map (Interfaces)
     *                 /            \
     *             SortedMap     ConcurrentMap
     *                |                |
     *           NavigableMap          |
     *                       \         |
     *                   ConcurrentNavigableMap
     *
     * Main implementations:
     * Map: HashMap, LinkedHashMap, EnumMap
     * NavigableMap: TreeMap, ConcurrentSkipListMap
     * ConcurrentMap: ConcurrentHashMap
     *
     * Points:
     * 1. primitive types 的 Arrays.sort 使用quick sort
     * 2. Object 的 Arrays.sort 在JDK6里使用merge sort, 在JDK7里使用Timsort
     * PS: 原因是Object的sort需要stable特性，Timsort有更好的效率(Python里用的即Timsort，最好情况下可以达到O(n))
     *
     * ////////////////////////////////////////////////////////////////////////////////////////////
     * ////////////////////////////////////////////////////////////////////////////////////////////
     * ////////////////////////////////////////////////////////////////////////////////////////////
     * New collection types:
     * Multiset: supports adding multiples of elements
     * Multimap: substitution of Map<K, Set<V>>
     * BiMap: 
     * Table
     * ClassToInstanceMap
     * RangeSet
     *
     */

    public static void main(String[] args) {

    }
}
