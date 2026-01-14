package TPC5;
import java.util.*;

public class Assignment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = scan.nextInt();
        scan.nextLine();

        Map<Character, List<String>> groupMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            char key = s.charAt(0);

            if (!groupMap.containsKey(key)) {
                groupMap.put(key, new ArrayList<String>());
            }
            groupMap.get(key).add(s);
        }

        for (Map.Entry<Character, List<String>> entry : groupMap.entrySet()) {

            List<String> list = entry.getValue();

            Map<String, Integer> freqMap = new HashMap<>();
            for (String str : list) {
                freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
            }

            Collections.sort(list, new Comparator<String>() {
                public int compare(String a, String b) {

                    int fa = freqMap.get(a);
                    int fb = freqMap.get(b);
                    if (fa != fb) {
                        return fb - fa;
                    }
                    if (a.length() != b.length()) {
                        return a.length() - b.length();
                    }
                    return a.compareTo(b);
                }
            });

            System.out.println(entry.getKey() + " -> " + list);
        }

        scan.close();
    }
}
