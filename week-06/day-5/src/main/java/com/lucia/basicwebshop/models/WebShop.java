package com.lucia.basicwebshop.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {
    private List<ShopItem> shopItemList;

    public WebShop() {
    }

    public WebShop(List<ShopItem> shopItemList) {
        this.shopItemList = shopItemList;
    }

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public void setShopItemList(List<ShopItem> shopItemList) {
        this.shopItemList = shopItemList;
    }
    public List<ShopItem> getListOnlyAvailable() {
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }
    public List<ShopItem> getListFromCheapest() {
        return shopItemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
    }
    public List<ShopItem> getOnlyWithWord() {
        String content = "nike";
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(content) ||
                        shopItem.getDescription().toLowerCase().contains(content))
                .collect(Collectors.toList());
    }
    public double getAverageOfStock() {
        double average = shopItemList.stream()
                .map(shopItem -> shopItem.getQuantityOfStock())
                .collect(Collectors.averagingDouble(Integer::intValue));
        return average;
    }
    public String getMostExpensiveFromList() {
        String expensive = shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
                .limit(1)
                .map(shopItem -> shopItem.getName())
                .collect(Collectors.joining());

        return expensive;
    }
    public List<ShopItem> getListContainWord(String wanted) {
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(wanted) ||
                        shopItem.getDescription().toLowerCase().contains(wanted))
                .collect(Collectors.toList());
    }
}
