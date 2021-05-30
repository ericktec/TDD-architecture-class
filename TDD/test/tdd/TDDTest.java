/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erick
 */
public class TDDTest {
    
    //Testing for size
    @Test
    public void getSizeOfList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        List<Integer> list = new ArrayList<>();

        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {

        List<Integer> list = null;

        list.size();
    }

    @Test
    public void getSizeOfListWhenRemovingElements() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
        list.remove(1);
        
        assertEquals(3, list.size());
    }

    // Unit testing for clearing the list
    @Test
    public void clearList() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        assertEquals(0, list.size());
    }
    
    @Test
    public void clearEmptyList(){
        List<Integer> list = new ArrayList<>();
        list.clear();
        
        assertEquals(0, list.size());
    }
    
    @Test(expected = NullPointerException.class)
    public void clearNullList(){
        List<Integer> list = null;
        
        list.clear(); 
    }
    
    // Add items to the list
    
    @Test
    public void addItems(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(2);
        Integer[] array =  list.toArray(new Integer[0]);
        Integer[] expected = {2,5,2};
        assertArrayEquals(expected, array);
    }
    
    @Test
    public void addItemsToAInitializedArray() {
        List <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        
        assertEquals(4, list.size());
    }
    
    @Test(expected = NullPointerException.class)
    public void addItemsToNullArray() {
        List <Integer> list = null;
        
        list.add(1);
    }
    
    //Check if item exists
    @Test
    public void getTrueIfItemExists(){
        List <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(32);
        
        assertTrue(list.contains(2));
    }
    
    @Test
    public void getFalseIfItemDoesNotExist(){
        List <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(32);
        
        assertFalse(list.contains(30));
    }
    
    @Test(expected = NullPointerException.class)
    public void checkIfItemExistOnNullList(){
        List <Integer> list = null;
        
        list.contains(3);
    }
    
    //Get element by index
    @Test
    public void getElementByIndex(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(new Integer(3), list.get(1));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void validateNegativeIndexes(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        
        list.get(-1);
    }
    
    @Test(expected = NullPointerException.class)
    public void getIndexFromNullArray(){
        List<Integer> list = null;
        
        list.get(1);
    }
    
    //Get index of an object stored in the array
    
    @Test
    public void getIndexOfObject(){
        List <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(32);
        list.add(20);
        
        assertEquals(2, list.indexOf(32));
    }
    
    @Test
    public void getIndexOfNonExistingObject(){
        List <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(32);
        list.add(20);
        
        assertEquals(-1, list.indexOf(6));
    }
    
    @Test(expected = NullPointerException.class)
    public void getIndexOfNullArray(){
        List<Integer> list = null;
        
        list.indexOf(2);
    }
    
    //Remove item by index
    
    @Test
    public void removeItemByIndex(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.remove(2);
        
        Integer[] expected = {2,3};
        Integer[] current =  list.toArray(new Integer[0]);
        
        assertArrayEquals(expected, current);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void removeItemByIndexOutOfBouds(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        list.remove(4);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void removeItemByNegativeIndex(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        list.remove(-1);
    }
    
}
