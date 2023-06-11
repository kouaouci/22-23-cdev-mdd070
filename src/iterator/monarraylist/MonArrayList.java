package iterator.monarraylist;

public class MonArrayList  implements Iterable {

    private String[] array = new String[10];
    private int index = 0;

    public String get(int index) {
        return array[index];
    }

    public void add(String elem) {
        if (index >= array.length) {
            doubleTaille ();
        }
        array[index] = elem;
        index++;
    }

    private void doubleTaille() {
        String[] array2 = new String[array.length * 2];
        copie ( array, array2 );
        array = array2;
    }

    private void copie(String[] array, String[] array2) {
        int i = 0;
        for (String s : array) {
            array2[i++] = s;
        }
    }

    public int size() {
        return index;
    }

    @Override
    public MonArrayListIterator getIterator() {
        return new MonArrayListIterator ( this );
    }


    private class MonArrayListIterator implements Iterator {
        private final MonArrayList monArrayList;
        private int currentIndex = 0;

        public MonArrayListIterator(MonArrayList monArrayList) {

            this.monArrayList = monArrayList;

        }

        @Override
        public boolean hasNext() {

            return currentIndex < monArrayList.size ();
        }

        @Override
        public String next() {
            if (!hasNext ()) {
                throw new IllegalStateException ( "No more elements" );
            }
            return monArrayList.get ( currentIndex++ );
        }



    }
}
