interface Operators<T> {
    void insert(T value);
    T firstElement();
    T lastElement();
    T middleElement();
    void insertRandomElements(int num);
    String getName();
    default void insertRandomElementsWithExludeValue(int size, int exclude) {}
    default void insertAtFirst(int num) {}
    default void insertAtIndex(int position, int num) {}
}