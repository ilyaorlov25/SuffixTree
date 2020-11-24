// Source: https://www.youtube.com/watch?v=kxqlaynGgEA & https://habr.com/ru/post/258121/

import java.util.Map;

public class SuffixTree {
    private class Node {
        int edgeStart;
        int edgeLength;
        Map<Character, Node> children;
        Node parent;
        Map<Character, Node> prefixLink;

        // for usual nodes
        public Node(int edgeStart, int edgeLength, Node parent) {
            this.edgeStart = edgeStart;
            this.edgeLength = edgeLength;
            this.parent = parent;
        }

        // for root & fictive
        public Node() {
        }
    }

    private final Node fictive = new Node();
    private final Node root;
    private int size;
    private int stringLength;

    public SuffixTree(String string) {
        /*
        '$' (не встречающийся больше символ) показывает, где заканчивается суффикс. Благодаря ему становится верным
        утверждение, что каждый суффикс - это лист, а каждый лист - это суффикс
         */

        String in = string + "$";
        stringLength = in.length();
        size = 0;


        root = new Node();
        root.parent = fictive;
    }

    private void extend() {

    }

    private boolean insert(Character symbol) {
        boolean inserted = false;
        // TODO
        size++;
        return inserted;
    }
}
