public class GuitarSpec {
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() { return numStrings; }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.getBuilder())
            return false;
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel())))
            return false;
        if (type != otherSpec.getType())
            return false;
        if (backWood != otherSpec.getBackWood())
            return false;
        if (topWood != otherSpec.getTopWood())
            return false;
        return true;
    }
}
