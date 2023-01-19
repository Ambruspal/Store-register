package bootcamp;

public interface StoreRegister {
    void setPersistanceType(StorePesristenceType type);

    int sellProductItem(String productName, int i);

    void buyProductItem(String productName, int i);

    void createProduct(String productName);
}
