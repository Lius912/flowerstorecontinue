package apps.flowerstore.flower;

public enum FlowerType {
    CHAMOMILE("chamomile"), ROSE("rose"), TULIP("tulip"), ROMASHKA("romashka"), CACTUS("cactus");
    private final String type;

    FlowerType(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
