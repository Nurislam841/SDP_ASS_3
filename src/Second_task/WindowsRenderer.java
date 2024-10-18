package Second_task;

public class WindowsRenderer implements Renderer{
    @Override
    public void renderShape(String shape) {
        System.out.println("Rendering" + shape + "on Windows.");
    }
}