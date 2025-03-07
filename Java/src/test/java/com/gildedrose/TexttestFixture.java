package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Product[] products = new Product[] {
            new BasicProduct("+5 Dexterity Vest", 10, 20),
            new BasicProduct("Elixir of the Mongoose", 5, 7),
            new ProductIncreasingQualityWithAge("Aged Brie", 2, 0),
            new LegendaryProduct("Sulfuras, Hand of Ragnaros"),
            new LegendaryProduct("Sulfuras, Hand of Ragnaros"),
            new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new ConjuredProduct("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(products);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Product product : products) {
                System.out.println(product);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
