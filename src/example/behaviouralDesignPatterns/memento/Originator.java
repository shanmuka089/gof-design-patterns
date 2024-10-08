package example.behaviouralDesignPatterns.memento;

public class Originator
{
    int height;
    int width;
    public Originator(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(this.height, this.width);
    }
    public void restoreMemento(ConfigurationMemento restoreMemento) {
        this.height = restoreMemento.getHeight();
        this.width = restoreMemento.getWidth();
    }
    public int getHeight()
    {
        return height;
    }
    public int getWidth()
    {
        return width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}
