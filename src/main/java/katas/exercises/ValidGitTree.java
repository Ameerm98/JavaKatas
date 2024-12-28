package katas.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ValidGitTree {

    /**
     * Determines if a given tree structure represents a valid Git tree.
     * <p>
     * A valid Git tree should:
     * 1. Have exactly one root (no parent).
     * 2. Contain no cycles.
     *
     * @param treeMap a map representing the Git tree (commit ID to list of child commit IDs)
     * @return true if the tree is a valid Git tree, false otherwise
     */
    public static boolean isValidGitTree(Map<String, List<String>> treeMap) {
        Map<String,Integer> inDegree = new HashMap<>();
        for (String key:treeMap.keySet()){
            if (!inDegree.containsKey(key)){
                inDegree.put(key,0);
                }
            if (!treeMap.get(key).isEmpty()){
                for (String child:treeMap.get(key)){
                    if (!inDegree.containsKey(child)){
                        inDegree.put(child,1);
                    } else{
                        inDegree.put(child,inDegree.get(child)+1);
                    }

                }
            }
        }

        int rootscount =0;
        String root = new String();
        for (String key:inDegree.keySet()){
            if (inDegree.get(key)==0){
                root =key;
                rootscount+=1;
            }
        }
        if(rootscount!=1){
            return false;
        }

        List<String> queue = new ArrayList<>();
        queue.add(root);
        List<String> seen = new ArrayList<>();

        while (!queue.isEmpty()){
            String node = queue.removeFirst();
            if (seen.contains(node)){
                return false;
            }
            seen.add(node);
            for (String child:treeMap.get(node)){
                queue.addLast(child);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, List<String>> validTree = new HashMap<>();
        validTree.put("A", List.of("B", "C"));
        validTree.put("B", List.of("D"));
        validTree.put("C", List.of());
        validTree.put("D", List.of());

        Map<String, List<String>> invalidTree = new HashMap<>();
        invalidTree.put("A", List.of("B"));
        invalidTree.put("B", List.of("C"));
        invalidTree.put("C", List.of("A")); // cycle

        System.out.println("Is valid tree: " + isValidGitTree(validTree));
        System.out.println("Is valid tree: " + isValidGitTree(invalidTree));
    }
}

