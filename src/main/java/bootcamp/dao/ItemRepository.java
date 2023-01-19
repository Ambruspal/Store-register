package bootcamp.dao;

import bootcamp.entity.StoreItem;

import java.io.IOException;

public interface ItemRepository {
    StoreItem loadItem(String productName);
    void saveItem(StoreItem item);

}
