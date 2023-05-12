package com.gildedrose;

public class BasicProduct implements Product {

    //Product implemented as an item
    protected Item item;

    public BasicProduct(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    @Override
    public String getName() {
        return this.item.name;
    }

    @Override
    public int getSellIn() {
        return this.item.sellIn;
    }

    @Override
    public int getQuality() {
        return this.item.quality;
    }

    @Override
    public void updateQuality() {

        decrementQuality(); //Quality decrease 1x

        decrementSellIn();

        if(item.sellIn < 0) {
            //When sellIn is over, quality decrease 2x more quickly!
            decrementQuality();
        }
    }

    protected void decrementSellIn(){
        item.sellIn = item.sellIn - 1;
    }

    protected void incrementQuality(){
        // Product quality can't never be more than 50 !
        if(item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void decrementQuality(){
        //Product quality can't never be negative !
        if(item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
