package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int some_quantity) {
        if (some_quantity < 1) {
            this.quantity = 1;
        } else {
            this.quantity = some_quantity;
        }
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
