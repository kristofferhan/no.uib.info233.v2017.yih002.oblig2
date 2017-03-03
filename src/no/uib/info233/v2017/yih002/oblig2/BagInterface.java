package no.uib.info233.v2017.yih002.oblig2;

/**
 * 
 * @author kristofferh
 * @version 0.1
 * @param <T>
 */

public interface BagInterface <T> {
	
	/**
	 * Adds a new entry to the bag.
	 * @param newEntry The object to be added as a new entry.
	 * @return True if the addition is successful, false if not.
	 */
	boolean add(T newEntry);

	/**
	 * Removes one unspecified entry from the bag, if possible.
	 * @return The entry that was removed, or null if nothing was removed.
	 */
	T remove();

	/**
	 * Removes one occurrence of a given entry from the bag, if possible.
	 * @param anEntry The entry to be removed.
	 * @return True if the removal was successful, false if not.
	 */
	boolean remove(T anEntry);

	/**
	 * Removes all entries from the bag.
	 */
	void clear();

    /**
     * Gets the size of the bag.
     * @return The size of the bag.
     */
	Integer getCurrentSize();

	/**
	 * Checks if a given entry exists.
	 * @param anEntry The entry to be checked.
	 * @return True if the entry exists, false if not.
	 */
	boolean contains (T anEntry);

    Integer getFrequencyOf(T anEntry);

    /**
	 *
	 * @return
	 */
	T[] toArray();


}
