package huongdoituong.Bai3;

class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectange() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void chuanHoaMau() {
        String[] arr = this.color.split("\\s++");
        String newColor = "";
        for (String x : arr) {
            newColor += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) {
                newColor += Character.toLowerCase(x.charAt(i));
            }
            newColor += " ";
        }
        this.color = newColor.trim();
    }

    public double findArea() {
        double height = this.height;
        double width = this.width;
        return height * width;
    }

    public double findPerimeter() {
        double height = this.height;
        double width = this.width;
        return (height + width) * 2;
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.findPerimeter()) + " " + String.format("%.2f", this.findArea()) + " " + this.getColor() + " ";
    }
}
