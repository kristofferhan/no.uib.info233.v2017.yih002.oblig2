package no.uib.info233.v2017.yih002.oblig2;

import java.util.Arrays;

public class Bag<T> implements BagInterface<T> {


    private T[] bag;
    private Integer numOfEntries = 0, maxSize;



    /**
     * Increases the size of the Bag array by making a copy with 5 more spaces.
     */
    private void increaseSize() {
        maxSize += 5;
        bag = Arrays.copyOf(bag, maxSize);
    }

    /**
     * Creates an empty bag.
     * @param capacity Specified capacity to be set.
     */
    public Bag(Integer capacity) {
        maxSize = capacity;
        bag = (T[])new Object[maxSize];
    }

    @Override
    public boolean add(T newEntry) {
        if (numOfEntries == maxSize) {
            increaseSize();
        }
        bag[numOfEntries] = newEntry;
        numOfEntries++;
        return true;
    }

    /**
     * Remove a random entry from the bag.
     * @return The removed entry.
     */
    @Override
    public T remove() {
        Integer random = (int) Math.floor(Math.random() * numOfEntries);
        T removeEntry = bag[random];
        bag[random] = null;
        return removeEntry;
    }

    /**
     * Removes a specified entry from the bag.
     * @param anEntry The entry to be removed.
     * @return True if the entry was found and removed, false if not.
     */
    @Override
    public boolean remove(T anEntry) {
        Integer i = 0;
        while (i < maxSize) {
            if (bag[i] == anEntry) {
                bag[i] = null;
                bag[numOfEntries] = bag[i];
                numOfEntries--;
                return true;
            }
        }
        return false;
    }

    /**
     * Removes all the entries from the bag, creates a new bag.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void clear() throws UnsupportedOperationException {
        bag = (T[]) new Object[maxSize];
    }

    /**
     * Checks if an entry is in the bag.
     * @param anEntry The entry to be checked.
     * @return True if the entry was found, false if not.
     */
    @Override
    public boolean contains(T anEntry) {
        for (Integer i = 0; i < numOfEntries; i++) {
            if (bag[i] == anEntry) {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts anEntry in the bag.
     * @param anEntry The entry to be counted.
     * @return Frequency of the entry in the bag.
     */
    @Override
    public Integer getFrequencyOf(T anEntry) {
        Integer frequency = 0;
        for (Integer i = 0; i < numOfEntries; i++) {
            if (bag[i] == anEntry) {
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public T[] toArray() {
        T[] newBag = (T[]) new Object[maxSize];
        for (Integer i = 0; i < numOfEntries; i++) {
            newBag[i] = bag[i];
        }
        return newBag;
    }

    @Override
    public Integer getCurrentSize() {
        return numOfEntries;
    }

}
