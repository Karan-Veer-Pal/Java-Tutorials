// Day : 94 Hashing Technique

public class Java94
{
    public static void main(String[] args)
    {
        // Hashing is a technique to convert range of key value into range of indices.


        // Hashing in Java (Short Overview):

        // Hashing is a technique used in Java to map data to a fixed-size value, called a hash code, using a hash function. It is primarily used for
        // efficient data retrieval in data structures like hash tables.

        // Hash Function: Converts an input (key) into a numerical value (hash code). Ideally, it should minimize collisions (different keys producing
        // the same hash code).

        // Hash Code: Java's Object class provides a hashCode() method, which can be overridden to generate custom hash codes for objects.

        // Applications:
        // HashMap: A key-value data structure using hashing for O(1) average-time complexity for insertions and lookups.
        // HashSet: Uses hashing to ensure uniqueness of elements.
        // Hashtable: Legacy synchronized data structure for key-value pairs.
        // Collision Handling: Java uses techniques like chaining (linked lists) or open addressing (probing) to resolve collisions in hash tables.

        // Best Practices:
        // Ensure hashCode() is consistent with equals().
        // Use prime numbers in custom hash functions to distribute keys uniformly.
        // Hashing is essential for improving the efficiency of various operations, especially in large datasets.
    }
}
