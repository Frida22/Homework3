package Homework3_2.task8;

public abstract class TVDevice implements Volume, Device {
    private String modelName;
    private boolean isOne;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isOne() {
        return isOne;
    }

    public void setOne(boolean one) {
        isOne = one;
    }
}
