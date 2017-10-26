package part_11.generic_stack;

/*
created by PopoPenguin on 10/26/17
*/


import part_11.generic_queue.DataStructureEmpty;
import part_11.generic_queue.DataStructureFull;

public interface IGenStack <T> {

    public void push(T t) throws DataStructureFull;

    public void pop () throws DataStructureEmpty;


}
