package com.gildedrose;

import java.util.Arrays;
import java.util.stream.Stream;

class GildedRose {
    Product[] products;

    public GildedRose(Product[] products) {
        this.products = products;
    }

    public void updateQuality() {
        Stream<Product> productStream = Arrays.stream(products);
        productStream.forEach(p -> p.updateQuality());
    }
}
