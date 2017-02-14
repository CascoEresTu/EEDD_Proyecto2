/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscasco_proyecto2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author k_k_r
 */
public class CarlosCasco_Proyecto2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        NTree tree = null;
        ReadFile(tree);

    }

    static int FindNearestParent(NTree tree, int actual_heriarchy_level) {
        if (tree.getTree().isEmpty()) {
            return -1;
        } else if (tree.getTree().size() > 0) {

            for (int i = tree.getTree().size(); i >= 0; i--) {
               
                if (tree.getTree().get(i-1).getNum_heriarchy()
                        < actual_heriarchy_level ) {
                    return i-1;
                }
            }
        }

        return 0;
    }

    static Person Load(String line) {
        Scanner sc = null;
        String replace = line.replace(" ", "");
        Person temp = null;
        sc = new Scanner(replace);
        sc.useDelimiter("[|]");

        while (sc.hasNext()) {
            temp = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }
        return temp;
    }

    static void ReadFile(NTree tree) throws IOException {

        tree = new NTree();
        FileReader fr;
        fr = new FileReader("./data.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int cont_espacios = 0;

        while ((line = br.readLine()) != null) {
            cont_espacios = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    cont_espacios++;
                }
            }
            tree.getTree().add(
                    new NTreeNode(
                            FindNearestParent(tree, cont_espacios / 4), Load(line), cont_espacios / 4));
        }

        for (int i = 0; i < tree.getTree().size(); i++) {
            System.out.println(tree.getTree().get(i).toString());
        }

    }

}
