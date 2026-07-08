package OOPS;

public class Box {
	int width;
    int height;
    int depth;

    // Parameterized Constructor
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    int volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Box b = new Box(5, 4, 3);

        System.out.println("Volume = " + b.volume());
    }
}
