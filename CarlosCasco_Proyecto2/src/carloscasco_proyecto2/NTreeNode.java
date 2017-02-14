/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscasco_proyecto2;

/**
 *
 * @author k_k_r
 */
public class NTreeNode {

    private int pos_parent;
    private Object data;
    private int num_heriarchy;

    public NTreeNode(int pos_parent, Object data, int num_heriarchy) {
        this.pos_parent = pos_parent;
        this.data = data;
        this.num_heriarchy = num_heriarchy;
    }

    public NTreeNode() {
    }

    public int getPos_parent() {
        return pos_parent;
    }

    public void setPos_parent(int pos_parent) {
        this.pos_parent = pos_parent;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getNum_heriarchy() {
        return num_heriarchy;
    }

    public void setNum_heriarchy(int num_heriarchy) {
        this.num_heriarchy = num_heriarchy;
    }

    public String toString() {
        return "PADRE:" + pos_parent + "   |JERARQUÍA:" + num_heriarchy + "   |DATA:" + data;
    }
}
