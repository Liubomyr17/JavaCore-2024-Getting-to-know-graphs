package com.company;

/*

2024 Getting to know graphs
Read more about graph serialization in additional materials.
An oriented flat Solution graph containing loops and loops is given.
For example, http://edu.nstu.ru/courses/saod/images/graph1.gif
Serialize Solution.
All data must be kept in order.

Requirements:
1. There must be an edges field in the Solution class.
2. The Solution class must have a node field.
3. The node field type must be int.
4. The Solution class must support the Serializable interface.



 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;



public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("fileName"));
        obj.defaultWriteObject();
        obj.close();
    }
}
