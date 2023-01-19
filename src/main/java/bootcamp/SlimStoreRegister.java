package bootcamp;

import bootcamp.dao.H2Repository;
import bootcamp.dao.ItemRepository;
import bootcamp.dao.JSONRepository;
import bootcamp.entity.StoreItem;

import java.io.IOException;

public class SlimStoreRegister implements StoreRegister {

    ItemRepository itemRepository = null;

    @Override
    public void setPersistanceType(StorePesristenceType type) {
        if (type.equals(StorePesristenceType.File))
        {
            itemRepository = new JSONRepository();
        }
        if (type.equals(StorePesristenceType.InMemory))
        {
            itemRepository = new H2Repository();
        }
    }

    @Override
    public int sellProductItem(String productName, int i) {
        StoreItem storeItem = itemRepository.loadItem(productName);
        int quantity = storeItem.getQuantity();
        int soldQuantity;

        if (quantity>i)
        {
            storeItem.setQuantity(quantity-i);
            soldQuantity = i;
        }
        else
        {
            storeItem.setQuantity(0);
            soldQuantity = quantity;
        }

        itemRepository.saveItem(storeItem);

        return soldQuantity;
    }

    @Override
    public void buyProductItem(String productName, int i) {
        StoreItem storeItem = itemRepository.loadItem(productName);
        storeItem.setQuantity(storeItem.getQuantity()+i);
        itemRepository.saveItem(storeItem);
    }

    @Override
    public void createProduct(String productName) {
        StoreItem storeItem = new StoreItem(productName,0);
        itemRepository.saveItem(storeItem);
    }
}
