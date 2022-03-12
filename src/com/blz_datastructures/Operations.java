package com.blz_datastructures;

public class Operations {
    public LinkedList addNodeInStart(){
        LinkedList list=new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
        return list;
    }
    public LinkedList addNodeATEnd(){
        LinkedList list=new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.display();
        return list;
    }
}
