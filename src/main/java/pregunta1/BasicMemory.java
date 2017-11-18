package pregunta1;

public class BasicMemory extends Memory implements basicComputer {
    private String description;
    
    public BasicMemory()
    {
        this.type = MemoryType.DDR3;
        this.size = MemorySize.Basic;
        this.frequency = MemorySpeed.Fast;
        this.price = 200;
        this.description = String.format("Memory: %s %s %s", this.type.toString(), this.size.toString(), this.frequency.toString());
    }
    
    public String getDescription() {
        return description;
    }
}
