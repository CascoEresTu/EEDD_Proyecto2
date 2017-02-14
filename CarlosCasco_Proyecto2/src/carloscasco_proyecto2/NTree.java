/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscasco_proyecto2;

import java.util.ArrayList;

/**
 *
 * @author k_k_r
 */
public class NTree {
    private ArrayList<NTreeNode> tree ;
    private NTreeNode root ;

    public NTree() {
        this.tree = new ArrayList();
       // this.setRoot(tree.get(0));
    }

    public ArrayList<NTreeNode> getTree() {
        return tree;
    }

    public void setTree(ArrayList<NTreeNode> tree) {
        this.tree = tree;
    }

    public NTreeNode getRoot() {
        return root;
    }

    public void setRoot(NTreeNode root) {
        this.root = root;
    }
        
    
}
