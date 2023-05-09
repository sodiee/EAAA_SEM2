package Opg3;

import Opg1.ArrayStack;
import Opg2.NodeStack;

import java.util.ArrayList;

public class Parantesopgave {
    public static void main(String[] args) {
        NodeStack nodeStack = new NodeStack();
        System.out.println(paranthesisCheck("(h)")); //true
        System.out.println(paranthesisCheck("((()))")); //true

    }

    public static boolean paranthesisCheck(String word) {


        ArrayStack nodeStack = new ArrayStack();
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));

        }

        for (int i = 0; i < letters.size(); i++) {
            if (letters.get(i).equals('(') || letters.get(i).equals('[') || letters.get(i).equals('{')) {
                nodeStack.push(letters.get(i));
            } else {
                if (letters.get(i).equals(')')) {
                    if (nodeStack.peek().equals('(')) {
                        nodeStack.pop();
                    } else {
                        return false;
                    }
                } else if (letters.get(i).equals(']')) {
                    if (nodeStack.peek().equals('[')) {
                        nodeStack.pop();
                    } else {
                        return false;
                    }
            } else if (letters.get(i).equals('}')) {
                        if (nodeStack.peek().equals('{')) {
                            nodeStack.pop();
                        } else {
                            return false;
                        }
                }
            }
        }
        if (nodeStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    }
