package com.gildedrose;

public class BackstagePass extends BasicProduct {

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        incrementQuality(); //Quality increase 1x

        if (item.sellIn < 11) {
            incrementQuality(); //Quality increase 2x
        }
        if (item.sellIn < 6) {
            incrementQuality(); //Quality increase 3x
        }

        decrementSellIn();

        if(item.sellIn < 0) {
            item.quality = 0; //After concert quality is zéro !
        }
    }

}
