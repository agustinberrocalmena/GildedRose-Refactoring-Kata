package com.gildedrose;

public class LegendaryProduct extends BasicProduct {

    public LegendaryProduct(String name) {
        //Legendary's products haven't sellIn and quality is fixed to 80 !
        super(name, 0, 80);
    }
    @Override
    public void updateQuality(){
        //do_nothing...
        //because there is no sellIn and Legendary quality is always 80 !
    }
}
