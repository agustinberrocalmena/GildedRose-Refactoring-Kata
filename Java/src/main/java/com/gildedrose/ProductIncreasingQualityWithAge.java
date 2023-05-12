package com.gildedrose;

public class ProductIncreasingQualityWithAge extends BasicProduct {

    public ProductIncreasingQualityWithAge(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    @Override
    public void updateQuality() {

        incrementQuality();

        decrementSellIn();
    }

}
