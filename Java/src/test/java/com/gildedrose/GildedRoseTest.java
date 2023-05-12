package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Product[] products = new Product[] { new BasicProduct("foo", 0, 0) };
        GildedRose app = new GildedRose(products);
        app.updateQuality();
        assertEquals("foo", app.products[0].getName());
    }

    @Test
    void ProductQuality_floor() {
        Product[] products = new Product[] { new BasicProduct("foo", 0, 0) };
        GildedRose app = new GildedRose(products);
        app.updateQuality();
        assertEquals(0, app.products[0].getQuality());
    }

    @Test
    void ProductQuality_ceil() {
        Product[] products = new Product[] { new ProductIncreasingQualityWithAge("foo", 0, 50) };
        GildedRose app = new GildedRose(products);
        app.updateQuality();
        assertEquals(50, app.products[0].getQuality());
    }

    @Test
    void ConjuredProductQuality_decreaseTwoTimesQuickly() {
        Product[] products = new Product[] { new ConjuredProduct("foo", 1, 10) };
        GildedRose app = new GildedRose(products);
        app.updateQuality();
        assertEquals(8, app.products[0].getQuality());
    }

    @Test
    void ConjuredProductQuality_decreaseTwoTimesQuickly_2() {
        Product[] products = new Product[] { new ConjuredProduct("foo", 0, 10) };
        GildedRose app = new GildedRose(products);
        app.updateQuality();
        assertEquals(6, app.products[0].getQuality());
    }
}
