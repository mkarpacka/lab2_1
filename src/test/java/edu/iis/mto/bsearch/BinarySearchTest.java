package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void ifItemExistsInSequence() {
        int[] seq = {3};
        int itemToFind = 3;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(0, searchResult.getPosition());
    }

    @Test
    void ifItemNotExistsInSequence() {
        int[] seq = {3};
        int itemToFind = 4;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertFalse(searchResult.isFound());
        Assert.assertEquals(-1, searchResult.getPosition());
    }

    @Test
    void ifItemIsFirstInSequence() {
        int[] seq = {3, 4, 5};
        int itemToFind = 3;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(0, searchResult.getPosition());
    }

    @Test
    void ifItemIsLastInSequence() {
        int[] seq = {3, 4, 5};
        int itemToFind = 5;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(seq.length -1, searchResult.getPosition());
    }

    @Test
    void ifItemIsInTheMiddleOfSequence() {
        int[] seq = {3, 4, 5, 6, 7, 8, 9};
        int itemToFind = 6;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals((seq.length -1)/2, searchResult.getPosition());
    }




}
