/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscasco_proyecto2;

/**
 *
 * @author carlos
 */
public interface ADTTree {
    NTreeNode getRoot();
    NTreeNode parent(int posicion);
    NTreeNode LeftestSon(int posicion);
    NTreeNode RightBrother(int posicion);
    NTreeNode addLeaf(int posicion);
}
