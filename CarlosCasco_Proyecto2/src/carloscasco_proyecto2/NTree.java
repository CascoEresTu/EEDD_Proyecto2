/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscasco_proyecto2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author k_k_r
 */
public  class NTree implements ADTTree {
    private ArrayList<NTreeNode> tree ;
    private LinkedList<Object> asd = new LinkedList();
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

    /**
     *
     * @return
     */
    @Override
    public NTreeNode getRoot() {
        if (tree.size() > 0) {
            setRoot(this.tree.get(0));
            return root;
        }
        return root;
    }

    public void setRoot(NTreeNode root) {
        this.root = root;
    }

    @Override
    public NTreeNode LeftestSon(int position) {
    
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NTreeNode RightBrother(int position) {
         //NTreeNode temp = tree.get(position);
         if (tree.get(position).getNum_heriarchy() == tree.get(position+1).getNum_heriarchy()) {
            return tree.get(position+1);
        }
         return null;
    }

    @Override
    public NTreeNode addLeaf(int position) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NTreeNode parent(int posicion) {
        if (tree.isEmpty()) {
            return null;
        } else if (tree.size() > 0) {

            for (int i = tree.size(); i >= 0; i--) {
               
                if (tree.get(i-1).getNum_heriarchy()
                        < posicion ) {
                    return tree.get(i);
                }
            }
        }
        return null;
    }
}
        
    

