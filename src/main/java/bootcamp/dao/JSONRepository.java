package bootcamp.dao;

import bootcamp.entity.StoreItem;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONRepository implements ItemRepository {


    @Override
    public StoreItem loadItem(String productName) {
        return null;
    }

    @Override
    public void saveItem(StoreItem item) {
    }
}
