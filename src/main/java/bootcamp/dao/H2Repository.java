package bootcamp.dao;

import bootcamp.entity.StoreItem;

public class H2Repository implements ItemRepository{
    @Override
    public StoreItem loadItem(String productName) {
        return null;
    }

    @Override
    public void saveItem(StoreItem item) {

    }
}
