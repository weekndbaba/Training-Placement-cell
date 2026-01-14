abstract class Shape{
    abstract void draw();
    void show(){
        System.out.println("thisis a shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("drawing a cicrcle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing a recctanle");
    }
}

