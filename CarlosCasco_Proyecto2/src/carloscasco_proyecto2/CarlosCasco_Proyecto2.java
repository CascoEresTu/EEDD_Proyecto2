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
        Scanner sc = new Scanner(System.in);
        NTree tree = new NTree();
        
        int op = 0;
        System.out.println("EEDD: Proyecto # 2");
        
        while (op != 2) {
            System.out.println("1._Iniciar Ejercicio");
            System.out.println("2._salir");
            op = sc.nextInt();

            if (op == 1) {
                ReadFile(tree);
            }

        }
        System.out.println("Adiós :)");
    }

    static void print(NTree tree) {
        String print = "";
        System.out.println(tree.getTree().size());
        for (int i = 0; i < tree.getTree().size(); i++) {
            
            for (int j = 0; j < tree.getTree().get(i).getNum_heriarchy(); j++) {
                print += "\t";
            }
            print += tree.getTree().get(i).getData().toString();
            System.out.println(print);
            print = "";

        }

    }

    static int FindNearestParent(NTree tree, int actual_heriarchy_level) {
        /*
        En esta función, nos aprovechamos de nuestro mutador
        de nivel de jerarquía. se encuentra el primer valor menor
        a nuestra jerarquía actual en la lista, y así se encuentra el padre
        de nuestro NTreeNode;
        
        */
        if (tree.getTree().isEmpty()) {
            return -1;
        } else if (tree.getTree().size() > 0) {

            for (int i = tree.getTree().size(); i >= 0; i--) {

                if (tree.getTree().get(i - 1).getNum_heriarchy()
                        < actual_heriarchy_level) {
                    return i - 1;
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
            temp = new Person(sc.next(), sc.nextInt(), sc.nextInt(),sc.next());
        }
        return temp;
    }

    static void ReadFile(NTree tree) throws IOException {
        Scanner sc = new Scanner(System.in);
        
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

        
        System.out.println("Se imprimen los datos de la lista,");
        System.out.println("Aquí se ve todo lo que contiene cada nodo.");
        for (int i = 0; i < tree.getTree().size(); i++) {
            System.out.println(tree.getTree().get(i).toString());
        }
        
        int c = 0 ;
        System.out.println("Desea imprimir? [1|0]");
        
        c = sc.nextInt();
        if (c== 1) {
            print(tree);
        }
    }

}
