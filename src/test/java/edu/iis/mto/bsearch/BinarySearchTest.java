package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void ifItemExistsInEmptySequence(){
        int[] seq = new int[0];
        int itemToFind = 9;

        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertThat(-1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    void ifItemExistsInSequence() {
        int[] seq = {3};
        int itemToFind = 3;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertThat(0, is(equalTo(searchResult.getPosition())));
    }

    @Test
    void ifItemNotExistsInSequence() {
        int[] seq = {3};
        int itemToFind = 4;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertFalse(searchResult.isFound());
        Assert.assertThat(-1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    void ifItemIsFirstInSequence() {
        int[] seq = {3, 4, 5};
        int itemToFind = 3;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertThat(0, is(equalTo(searchResult.getPosition())));
    }

    @Test
    void ifItemIsLastInSequence() {
        int[] seq = {3, 4, 5};
        int itemToFind = 5;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertThat(seq.length -1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    void ifItemIsInTheMiddleOfSequence() {
        int[] seq = {3, 4, 5, 6, 7, 8, 9};
        int itemToFind = 6;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertThat((seq.length -1)/2, is(equalTo(searchResult.getPosition())));
    }

    @Test
    void ifItemNotExistsInLongSequence() {
        int[] seq = {3, 4, 5, 6, 7, 8, 9};
        int itemToFind = 1;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertFalse(searchResult.isFound());
        Assert.assertThat(-1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    void ifNegativeNumberExistsInSequence(){
        int[] seq = {-5, -1, 0, 8};
        int itemToFind = -5;

        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertThat(1, is(equalTo(searchResult.getPosition())));
    }






}
