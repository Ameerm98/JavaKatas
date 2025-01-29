package katas.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class KthSmallestElementInBSTTest {

    static class TreeNode {
        int val;
        KthSmallestElementInBST.TreeNode left;
        KthSmallestElementInBST.TreeNode right;
        TreeNode(int x) { val = x; }
    }


    @Test
    public void test(){
        KthSmallestElementInBST.TreeNode root = new KthSmallestElementInBST.TreeNode(5);
        root.left = new KthSmallestElementInBST.TreeNode(3);
        root.right = new KthSmallestElementInBST.TreeNode(6);
        root.left.left = new KthSmallestElementInBST.TreeNode(2);
        root.left.right = new KthSmallestElementInBST.TreeNode(4);

        int k = 3;
        int kthSmallestValue = KthSmallestElementInBST.kthSmallest(root, k);
        assertEquals(4,kthSmallestValue);
        k=1;
        kthSmallestValue = KthSmallestElementInBST.kthSmallest(root, k);
        assertEquals(2,kthSmallestValue);






    }
}
