package com.gildedrose;

public class ConjuredProduct extends BasicProduct {

    public ConjuredProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void decrementQuality(){
        //Product quality decrease 2x more quickly than other products !
        if(item.quality > 0) {
            item.quality = Math.max(0, (item.quality - 2)); //Quality floor is zero!
        }
    }

}
