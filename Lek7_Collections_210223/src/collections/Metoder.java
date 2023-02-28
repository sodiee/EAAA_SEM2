package collections;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Metoder {
    // Returnerer indeks hvis tekst findes som del string et sted i list
    public static int found(List<String> list, String tekst) {
        int result = -1;
        int i = 0;
        while (result == -1 && i < list.size()) {
            if (list.get(i).indexOf(tekst) > -1) {
                result = i;
            }
            else {
                i++;
            }
        }
        return result;
        
    }
    
    // Finder antal elementer i s der har længden len
    public static int count2(List<String> s, int len) {
        int antal = 0;
        for (String tekst : s) {
            if (tekst.length() == len) {
                antal++;
            }
        }
        return antal;
        
    }
    // Finder antal elementer i s der har længden len
    public static int count(Collection<String> s, int len) {
        int antal = 0;
        for (String tekst : s) {
            if (tekst.length() == len) {
                antal++;
            }
        }
        return antal;
        
    }
    
    public static int count2(Set<String> s, int len) {
        int antal = 0;
        for (String tekst : s) {
            if (tekst.length() == len) {
                antal++;
            }
        }
        return antal;
        
    }
    
}
