/**
 * Represents the List Abstract Data type.
 *
 * @param <T> The type of elements in this list
 * @author Melanie
 * @version 1.0
 */
public interface List<T> {
    /**
     * Checks to see this List is empty.
     * If it is empty, throw an IllegalArgumentException
     *
     * @return true if List is empty, false if not
     */
    boolean isEmpty();

    /**
     * Returns the size of the List.
     * Must be implemented by iterating through the nodes.
     * Do not use a private size instance variable
     *
     * @return the number of items in this list
     */
    int size();

    /**
     * Adds data to the List at the specified index.
     * If the index is less than 0 or greater than size(), throw
     * an IllegalArgumentException. If the passed in data is null,
     * throw a NullPointerException
     *
     * @param index The index at which data will be added
     * @param data  the data to add
     */
    void add(int index, T data);

    /**
     * Adds data to the back of the List.
     * If the passed in data is null, throw a NullPointerException
     *
     * @param data the data to add
     */
    void addToBack(T data);

    /**
     * Removes the object at the specified index and returns the data that object holds.
     * If the List is empty, throw an IllegalArgumentException.
     *
     * @param index the index to remove from
     * @return the removed piece of data
     */
    T remove(int index);

    /**
     * Retrieves the data from the specified index and returns it.
     * If the List is empty or the index is less than 0 or greater than
     * or equal size(), throw an IllegalArgumentException.
     *
     * @param index the index to return from
     * @return the data at the specified index
     */
    T get(int index);

    /**
     * Adds data to the List at the specified index.
     * If the index is less than 0 or greater than size(), throw
     * an IllegalArgumentException. If the passed in data is null,
     * throw a NullPointerException
     *
     * @param index The index at which data will be added
     * @param data  the data to add
     * @return the data originally at the specified index
     */
    T set(int index, T data);

    /**
     * Checks to see if the List contains the passed in data.
     * If the passed in data is null, throw a NullPointerException
     *
     * @param data the data to look for
     * @return true if the List contains the passed in data, false if not
     */
    boolean contains(T data);

    /**
     * Removes all elements from the List.
     */
    void clear();

    /**
     * Returns a new List object containing every odd element in this List.
     * For example, if our List contains [“a”, “b”, “c”, “d”], then
     * subOddList() should return a new List containing [“b”, “d”]. This
     * method should not modify the original List in any way and the new
     * List should not have overlapping elements with the original List. If
     * the original List is empty, throw an IllegalArgumentException
     *
     * @return a new List object containing the odd elements in the current list, as described above
     */
    List<T> subOddList();
}
