public class ITIStringBuffer {

    SinglyLinkedList<String> l;
    int length;

    public ITIStringBuffer() {
        l = new SinglyLinkedList<String>();
    }

    public ITIStringBuffer(String  firstString){
        l = new SinglyLinkedList<String>();
        l.add(firstString);
        length += firstString.length();
    }

    public void append(String nextString){
        l.add(nextString);
        length += nextString.length();
    }

    public String toString(){
        
        char[] result = new char[length];
        int index = 0;
        for(String currentString : l) {
            char[] c = currentString.toCharArray();
            System.arraycopy(c, 0, result, index, c.length);
            index += c.length;
        }

        return new String(result);

    }

}
